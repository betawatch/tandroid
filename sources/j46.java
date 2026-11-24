// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j46 extends fy2 implements pe3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(j46.class, "runningWorkers$volatile");
    public static final /* synthetic */ long r = fy.a.objectFieldOffset(j46.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ pe3 c;
    public final fy2 d;
    public final int e;
    public final qd6 f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public j46(fy2 fy2Var, int i) {
        pe3 pe3Var = fy2Var instanceof pe3 ? (pe3) fy2Var : null;
        this.c = pe3Var == null ? ub3.a : pe3Var;
        this.d = fy2Var;
        this.e = i;
        this.f = new qd6();
        this.h = new Object();
    }

    @Override // pe3
    public final xp3 a(long j, oqb oqbVar, cy2 cy2Var) {
        return this.c.a(j, oqbVar, cy2Var);
    }

    @Override // pe3
    public final void b(long j, vb1 vb1Var) {
        this.c.b(j, vb1Var);
    }

    @Override // fy2
    public final void c(cy2 cy2Var, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        Unsafe unsafe = fy.a;
        long j = r;
        if (unsafe.getIntVolatile(this, j) < this.e) {
            synchronized (this.h) {
                if (unsafe.getIntVolatile(this, j) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f = f();
                if (f != null) {
                    this.d.c(this, new tnd((Object) this, (Object) f, false, (byte) 6));
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

    @Override // fy2
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
