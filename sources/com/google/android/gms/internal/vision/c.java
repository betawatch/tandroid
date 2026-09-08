package com.google.android.gms.internal.vision;

import java.io.PrintStream;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class c {
    public static final e1 a;

    static {
        e1 bVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e7) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e7.printStackTrace(System.err);
            }
            bVar = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new e() : new b(0) : new b(1);
        } catch (Throwable th2) {
            PrintStream printStream = System.err;
            String name = b.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th2.printStackTrace(System.err);
            bVar = new b(0);
        }
        a = bVar;
    }
}
