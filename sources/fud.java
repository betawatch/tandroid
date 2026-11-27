// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class fud {
    public static sd3 a(ux2 ux2Var, is4 is4Var) {
        sd3 sd3Var = new sd3(g4e.b(ux2Var, u24.a), true);
        sd3Var.R(xx2.a, sd3Var, is4Var);
        return sd3Var;
    }

    public static uqa b(ux2 ux2Var, is4 is4Var) {
        uqa uqaVar = new uqa(g4e.b(ux2Var, u24.a), true);
        uqaVar.R(xx2.a, uqaVar, is4Var);
        return uqaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(mx2 mx2Var, is4 is4Var, zw2 zw2Var) {
        Unsafe unsafe;
        long j;
        mx2 context = zw2Var.getContext();
        mx2 plus = !((Boolean) mx2Var.fold(Boolean.FALSE, new xm2((byte) 2))).booleanValue() ? context.plus(mx2Var) : g4e.a(context, mx2Var, false);
        gqe.a(plus);
        if (plus == context) {
            ju9 ju9Var = new ju9(zw2Var, plus);
            return x1f.a(ju9Var, ju9Var, is4Var);
        }
        rj2 rj2Var = rj2.b;
        if (ur5.a(plus.get(rj2Var), context.get(rj2Var))) {
            x8c x8cVar = new x8c(zw2Var, plus);
            mx2 mx2Var2 = x8cVar.d;
            Object c = xhd.c(mx2Var2, null);
            try {
                return x1f.a(x8cVar, x8cVar, is4Var);
            } finally {
                xhd.a(mx2Var2, c);
            }
        }
        zo3 zo3Var = new zo3(zw2Var, plus);
        try {
            q7c.c(xpe.a(((qf0) is4Var).create(zo3Var, zo3Var)), g9c.a);
            do {
                unsafe = fx.a;
                j = zo3.f;
                int intVolatile = unsafe.getIntVolatile(zo3Var, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        grb.i("Already suspended");
                        return null;
                    }
                    Object a = yed.a(zo3Var.v());
                    if (a instanceof yp2) {
                        throw ((yp2) a).a;
                    }
                    return a;
                }
            } while (!unsafe.compareAndSwapInt(zo3Var, j, 0, 1));
            return vx2.a;
        } catch (Throwable th) {
            zo3Var.resumeWith(new ge9(th));
            throw th;
        }
    }
}
