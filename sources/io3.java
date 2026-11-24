// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
