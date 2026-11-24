// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class io3 extends rq9 {
    public static final /* synthetic */ long f = ex.a.objectFieldOffset(io3.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // rq9, pt5
    public final void f(Object obj) {
        g(obj);
    }

    @Override // rq9, pt5
    public final void g(Object obj) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    r3c.c(dle.a(this.e), zsd.a(obj));
                    return;
                } else {
                    sc8.j("Already resumed");
                    return;
                }
            }
            io3 io3Var = this;
            if (unsafe.compareAndSwapInt(io3Var, j, 0, 2)) {
                return;
            } else {
                this = io3Var;
            }
        }
    }
}
