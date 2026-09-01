package com.google.android.gms.internal.play_billing;

import j7.o6;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class l0 extends x0 implements t0 {
    public static final Object d = new Object();
    public static final s0 e = new s0(w0.class);
    public static final boolean f;
    public static final o6 h;
    public volatile Object a;
    public volatile f0 b;
    public volatile k0 c;

    static {
        boolean z4;
        o6 i0Var;
        Throwable th2;
        Throwable th3;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f = z4;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                i0Var = new j0();
            } catch (Error | Exception e6) {
                try {
                    i0Var = new h0();
                } catch (Error | Exception e10) {
                    th4 = e10;
                    i0Var = new i0();
                }
                th2 = th4;
                th3 = e6;
            }
        } else {
            try {
                i0Var = new h0();
            } catch (NoClassDefFoundError unused2) {
                i0Var = new i0();
            }
        }
        th2 = null;
        th3 = null;
        h = i0Var;
        if (th2 != null) {
            s0 s0Var = e;
            Logger a2 = s0Var.a();
            Level level = Level.SEVERE;
            a2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            s0Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void c(k0 k0Var) {
        k0Var.a = null;
        while (true) {
            k0 k0Var2 = this.c;
            if (k0Var2 != k0.c) {
                k0 k0Var3 = null;
                while (k0Var2 != null) {
                    k0 k0Var4 = k0Var2.b;
                    if (k0Var2.a != null) {
                        k0Var3 = k0Var2;
                    } else if (k0Var3 != null) {
                        k0Var3.b = k0Var4;
                        if (k0Var3.a == null) {
                            break;
                        }
                    } else if (!h.g(this, k0Var2, k0Var4)) {
                        break;
                    }
                    k0Var2 = k0Var4;
                }
                return;
            }
            return;
        }
    }
}
