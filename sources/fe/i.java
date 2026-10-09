package fe;

import ae.b0;
import ae.g2;
import ae.i0;
import ae.l0;
import ae.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i extends b0 implements l0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final b0 c;
    public final int d;
    public final /* synthetic */ l0 e;
    public final l f;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(b0 b0Var, int i10) {
        this.c = b0Var;
        this.d = i10;
        l0 l0Var = b0Var instanceof l0 ? (l0) b0Var : null;
        this.e = l0Var == null ? i0.a : l0Var;
        this.f = new l();
        this.h = new Object();
    }

    @Override // ae.l0
    public final q0 a(long j3, g2 g2Var, jd.h hVar) {
        return this.e.a(j3, g2Var, hVar);
    }

    @Override // ae.l0
    public final void b(long j3, ae.m mVar) {
        this.e.b(j3, mVar);
    }

    @Override // ae.b0
    public final void c(jd.h hVar, Runnable runnable) {
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
                this.c.c(this, new i9.s(this, f7, false, 14));
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
