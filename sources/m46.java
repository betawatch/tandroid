// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m46 extends px2 implements vd3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(m46.class, "runningWorkers$volatile");
    public static final /* synthetic */ long r = fx.a.objectFieldOffset(m46.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ vd3 c;
    public final px2 d;
    public final int e;
    public final vd6 f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public m46(px2 px2Var, int i) {
        vd3 vd3Var = px2Var instanceof vd3 ? (vd3) px2Var : null;
        this.c = vd3Var == null ? bb3.a : vd3Var;
        this.d = px2Var;
        this.e = i;
        this.f = new vd6();
        this.h = new Object();
    }

    @Override // vd3
    public final ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        return this.c.a(j, nsbVar, mx2Var);
    }

    @Override // vd3
    public final void b(long j, va1 va1Var) {
        this.c.b(j, va1Var);
    }

    @Override // px2
    public final void c(mx2 mx2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = fx.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new iqd((Object) this, (Object) f, false, (byte) 6));
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

    @Override // px2
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
