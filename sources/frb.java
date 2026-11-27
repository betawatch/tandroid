// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class frb extends iv5 {
    public static final /* synthetic */ long h = fx.a.objectFieldOffset(frb.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public ep3 f;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // iv5
    public final boolean k() {
        return true;
    }

    @Override // iv5
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            frb frbVar = this;
            if (unsafe.compareAndSwapInt(frbVar, h, intVolatile, 2)) {
                frbVar.e.interrupt();
                unsafe.putIntVolatile(frbVar, j, 3);
                return;
            }
            this = frbVar;
        }
    }

    public final void m() {
        frb frbVar;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                frbVar = this;
                if (unsafe.compareAndSwapInt(frbVar, j, intVolatile, 1)) {
                    ep3 ep3Var = frbVar.f;
                    if (ep3Var != null) {
                        ep3Var.dispose();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                frbVar = this;
            }
            this = frbVar;
        }
    }
}
