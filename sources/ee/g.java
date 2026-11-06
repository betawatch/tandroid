package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.d0;
import zd.g0;
import zd.l0;
import zd.x;
import zd.y1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public g(x xVar, int i7) {
        g0 g0Var = xVar instanceof g0 ? (g0) xVar : null;
        this.c = g0Var == null ? d0.a : g0Var;
        this.d = xVar;
        this.e = i7;
        this.f = new k();
        this.h = new Object();
    }

    @Override // zd.g0
    public final l0 a(long j3, y1 y1Var, id.h hVar) {
        return this.c.a(j3, y1Var, hVar);
    }

    @Override // zd.g0
    public final void b(long j3, zd.m mVar) {
        this.c.b(j3, mVar);
    }

    @Override // zd.x
    public final void c(id.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable g10 = g();
                if (g10 == null) {
                    return;
                }
                this.d.c(this, new m9.u(this, g10, false, 12));
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

    @Override // zd.x
    public final String toString() {
        return this.d + ".limitedParallelism(" + this.e + ')';
    }
}
