package he;

import ce.a0;
import ce.f2;
import ce.h0;
import ce.k0;
import ce.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends a0 implements k0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final a0 c;
    public final int d;
    public final /* synthetic */ k0 e;
    public final l f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(a0 a0Var, int i10) {
        this.c = a0Var;
        this.d = i10;
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.e = k0Var == null ? h0.a : k0Var;
        this.f = new l();
        this.h = new Object();
    }

    @Override // ce.k0
    public final void a(long j10, ce.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override // ce.k0
    public final p0 b(long j10, f2 f2Var, ld.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override // ce.a0
    public final void c(ld.h hVar, Runnable runnable) {
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
                this.c.c(this, new k9.u(this, f7, false, 16));
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
