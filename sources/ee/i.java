package ee;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zd.a0;
import zd.e2;
import zd.g0;
import zd.j0;
import zd.o0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i extends a0 implements j0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 c;
    public final int d;
    public final /* synthetic */ j0 e;
    public final l f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(a0 a0Var, int i10) {
        this.c = a0Var;
        this.d = i10;
        j0 j0Var = a0Var instanceof j0 ? (j0) a0Var : null;
        this.e = j0Var == null ? g0.a : j0Var;
        this.f = new l();
        this.h = new Object();
    }

    @Override // zd.j0
    public final o0 a(long j3, e2 e2Var, id.h hVar) {
        return this.e.a(j3, e2Var, hVar);
    }

    @Override // zd.j0
    public final void b(long j3, zd.m mVar) {
        this.e.b(j3, mVar);
    }

    @Override // zd.a0
    public final void c(id.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f7 = f();
                if (f7 == null) {
                    return;
                }
                this.c.c(this, new i9.s(this, f7, false, 13));
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
