// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class nv9 extends uq2 implements tj7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(nv9.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = ex.a.objectFieldOffset(nv9.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public nv9(long j, nv9 nv9Var, int i) {
        super(nv9Var);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // uq2
    public final boolean d() {
        return ex.a.getIntVolatile(this, f) == g() && c() != null;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, sw2 sw2Var);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            nv9 nv9Var = this;
            if (unsafe.compareAndSwapInt(nv9Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = nv9Var;
        }
    }
}
