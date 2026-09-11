package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;
import v7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class l0 extends x0 implements t0 {
    public static final Object d = new Object();
    public static final s0 e = new s0(w0.class, 0);
    public static final boolean f;
    public static final x5 h;
    public volatile Object a;
    public volatile f0 b;
    public volatile k0 c;

    static {
        boolean z10;
        x5 i0Var;
        Throwable th2;
        Throwable th3;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                i0Var = new j0();
            } catch (Error | Exception e7) {
                try {
                    i0Var = new h0();
                } catch (Error | Exception e10) {
                    th4 = e10;
                    i0Var = new i0();
                }
                th2 = th4;
                th3 = e7;
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
            Logger b10 = s0Var.b();
            Level level = Level.SEVERE;
            b10.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            s0Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(k0 k0Var) {
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
