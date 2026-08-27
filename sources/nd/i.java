package nd;

import id.a0;
import id.f2;
import id.h0;
import id.k0;
import id.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // id.k0
    public final void a(long j10, id.m mVar) {
        this.e.a(j10, mVar);
    }

    @Override // id.k0
    public final p0 b(long j10, f2 f2Var, rc.h hVar) {
        return this.e.b(j10, f2Var, hVar);
    }

    @Override // id.a0
    public final void c(rc.h hVar, Runnable runnable) {
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
                this.c.c(this, new a9.o(28, this, f10));
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
