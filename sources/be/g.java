package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wd.d0;
import wd.g0;
import wd.l0;
import wd.x;
import wd.y1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends x implements g0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final /* synthetic */ g0 c;
    public final x d;
    public final int e;
    public final k f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(x xVar, int i3) {
        g0 g0Var = xVar instanceof g0 ? (g0) xVar : null;
        this.c = g0Var == null ? d0.a : g0Var;
        this.d = xVar;
        this.e = i3;
        this.f = new k();
        this.h = new Object();
    }

    @Override // wd.g0
    public final void a(long j10, wd.m mVar) {
        this.c.a(j10, mVar);
    }

    @Override // wd.g0
    public final l0 b(long j10, y1 y1Var, fd.h hVar) {
        return this.c.b(j10, y1Var, hVar);
    }

    @Override // wd.x
    public final void c(fd.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable g7 = g();
                if (g7 == null) {
                    return;
                }
                this.d.c(this, new l9.u(this, g7, false, 2));
            }
        }
    }

    public final Runnable g() {
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

    @Override // wd.x
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
