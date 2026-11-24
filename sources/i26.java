// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i26 extends vw2 implements dd3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i26.class, "runningWorkers$volatile");
    public static final /* synthetic */ long r = ex.a.objectFieldOffset(i26.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ dd3 c;
    public final vw2 d;
    public final int e;
    public final rb6 f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i26(vw2 vw2Var, int i) {
        dd3 dd3Var = vw2Var instanceof dd3 ? (dd3) vw2Var : null;
        this.c = dd3Var == null ? ia3.a : dd3Var;
        this.d = vw2Var;
        this.e = i;
        this.f = new rb6();
        this.h = new Object();
    }

    @Override // dd3
    public final no3 a(long j, nob nobVar, sw2 sw2Var) {
        return this.c.a(j, nobVar, sw2Var);
    }

    @Override // dd3
    public final void b(long j, na1 na1Var) {
        this.c.b(j, na1Var);
    }

    @Override // vw2
    public final void c(sw2 sw2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = ex.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new rld((Object) this, (Object) f, false, (byte) 6));
                }
            }
        }
    }

    public final Runnable f() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // vw2
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
