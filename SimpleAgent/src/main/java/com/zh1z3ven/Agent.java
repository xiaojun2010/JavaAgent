package com.zh1z3ven;

import java.lang.instrument.Instrumentation;

public class Agent {

    /**
     * JVM参数形式启动，运行此方法
     * @param agentArgs
     * @param instrumentation
     */
    public static void premain(String agentArgs , Instrumentation instrumentation){
        System.out.println("premain");
        //调用addTransformer添加一个Transformer
        instrumentation.addTransformer(new DefineTransformer(),true);
    }

    /**
     * 动态 attach 方式启动，运行此方法
     * @param agentArgs
     * @param instrumentation
     */
    public static void agentmain(String agentArgs , Instrumentation instrumentation){
        System.out.println("agentmain");
    }
}
