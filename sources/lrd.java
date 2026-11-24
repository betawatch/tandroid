// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class lrd {
    public static Object a(fs4 fs4Var) {
        Thread currentThread = Thread.currentThread();
        jk2 jk2Var = jk2.b;
        o54 a = epb.a();
        cy2 a2 = t1e.a(k34.a, a, true);
        jd3 jd3Var = up3.a;
        if (a2 != jd3Var && a2.get(jk2Var) == null) {
            a2 = a2.plus(jd3Var);
        }
        ol0 ol0Var = new ol0(a2, currentThread, a);
        ol0Var.R(ny2.a, ol0Var, fs4Var);
        o54 o54Var = ol0Var.f;
        if (o54Var != null) {
            int i = o54.f;
            o54Var.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                long h = o54Var != null ? o54Var.h() : Long.MAX_VALUE;
                if (!(ol0Var.v() instanceof ep5)) {
                    Object a3 = hcd.a(ol0Var.v());
                    qq2 qq2Var = a3 instanceof qq2 ? (qq2) a3 : null;
                    if (qq2Var == null) {
                        return a3;
                    }
                    throw qq2Var.a;
                }
                LockSupport.parkNanos(ol0Var, h);
            } finally {
                if (o54Var != null) {
                    int i2 = o54.f;
                    o54Var.f(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        ol0Var.i(interruptedException);
        throw interruptedException;
    }
}
