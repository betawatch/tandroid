package com.google.android.gms.internal.play_billing;

import g7.y5;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l0 extends x0 implements t0 {
    public static final Object d = new Object();
    public static final s0 e = new s0(w0.class);
    public static final boolean f;
    public static final y5 h;
    public volatile Object a;
    public volatile f0 b;
    public volatile k0 c;

    static {
        boolean z10;
        y5 i0Var;
        Throwable th;
        Throwable th2;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                i0Var = new j0();
            } catch (Error | Exception e9) {
                try {
                    i0Var = new h0();
                } catch (Error | Exception e10) {
                    th3 = e10;
                    i0Var = new i0();
                }
                th = th3;
                th2 = e9;
            }
        } else {
            try {
                i0Var = new h0();
            } catch (NoClassDefFoundError unused2) {
                i0Var = new i0();
            }
        }
        th = null;
        th2 = null;
        h = i0Var;
        if (th != null) {
            s0 s0Var = e;
            Logger a2 = s0Var.a();
            Level level = Level.SEVERE;
            a2.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            s0Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
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
