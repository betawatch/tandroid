package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jd.a0;
import jd.e2;
import jd.g0;
import jd.j0;
import jd.o0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends a0 implements j0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers$volatile");
    public final a0 c;
    public final int d;
    public final /* synthetic */ j0 e;
    public final m f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public j(a0 a0Var, int i10) {
        this.c = a0Var;
        this.d = i10;
        j0 j0Var = a0Var instanceof j0 ? (j0) a0Var : null;
        this.e = j0Var == null ? g0.a : j0Var;
        this.f = new m();
        this.h = new Object();
    }

    @Override // jd.j0
    public final o0 a(long j10, e2 e2Var, sc.h hVar) {
        return this.e.a(j10, e2Var, hVar);
    }

    @Override // jd.j0
    public final void b(long j10, jd.m mVar) {
        this.e.b(j10, mVar);
    }

    @Override // jd.a0
    public final void c(sc.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f9 = f();
                if (f9 == null) {
                    return;
                }
                this.c.c(this, new i(0, this, f9));
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
}
