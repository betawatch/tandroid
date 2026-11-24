// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ipd {
    public static Object a(eq4 eq4Var) {
        Thread currentThread = Thread.currentThread();
        vi2 vi2Var = vi2.b;
        d44 a = dnb.a();
        sw2 a2 = qzd.a(z14.a, a, true);
        xb3 xb3Var = ko3.a;
        if (a2 != xb3Var && a2.get(vi2Var) == null) {
            a2 = a2.plus(xb3Var);
        }
        ok0 ok0Var = new ok0(a2, currentThread, a);
        ok0Var.R(dx2.a, ok0Var, eq4Var);
        d44 d44Var = ok0Var.f;
        if (d44Var != null) {
            int i = d44.f;
            d44Var.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                long h = d44Var != null ? d44Var.h() : Long.MAX_VALUE;
                if (!(ok0Var.v() instanceof en5)) {
                    Object a3 = fad.a(ok0Var.v());
                    fp2 fp2Var = a3 instanceof fp2 ? (fp2) a3 : null;
                    if (fp2Var == null) {
                        return a3;
                    }
                    throw fp2Var.a;
                }
                LockSupport.parkNanos(ok0Var, h);
            } finally {
                if (d44Var != null) {
                    int i2 = d44.f;
                    d44Var.f(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        ok0Var.i(interruptedException);
        throw interruptedException;
    }
}
