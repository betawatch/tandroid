package md;

import hd.a0;
import hd.f2;
import hd.h0;
import hd.k0;
import hd.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public i(a0 a0Var, int i9) {
        this.c = a0Var;
        this.d = i9;
        k0 k0Var = a0Var instanceof k0 ? (k0) a0Var : null;
        this.e = k0Var == null ? h0.a : k0Var;
        this.f = new l();
        this.h = new Object();
    }

    @Override // hd.k0
    public final p0 a(long j10, f2 f2Var, qc.h hVar) {
        return this.e.a(j10, f2Var, hVar);
    }

    @Override // hd.k0
    public final void b(long j10, hd.m mVar) {
        this.e.b(j10, mVar);
    }

    @Override // hd.a0
    public final void c(qc.h hVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
        if (atomicIntegerFieldUpdater.get(this) < this.d) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable f10 = f();
                if (f10 == null) {
                    return;
                }
                this.c.c(this, new androidx.biometric.j(23, this, f10));
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
