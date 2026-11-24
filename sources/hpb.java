// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hpb extends ev5 {
    public static final /* synthetic */ long h = fy.a.objectFieldOffset(hpb.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public xp3 f;

    public static void n(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // ev5
    public final boolean k() {
        return true;
    }

    @Override // ev5
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            hpb hpbVar = this;
            if (unsafe.compareAndSwapInt(hpbVar, h, intVolatile, 2)) {
                hpbVar.e.interrupt();
                unsafe.putIntVolatile(hpbVar, j, 3);
                return;
            }
            this = hpbVar;
        }
    }

    public final void m() {
        hpb hpbVar;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = h;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                hpbVar = this;
                if (unsafe.compareAndSwapInt(hpbVar, j, intVolatile, 1)) {
                    xp3 xp3Var = hpbVar.f;
                    if (xp3Var != null) {
                        xp3Var.dispose();
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
                hpbVar = this;
            }
            this = hpbVar;
        }
    }
}
