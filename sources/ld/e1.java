package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e1 extends h1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final d1 e;

    public e1(d1 d1Var) {
        this.e = d1Var;
    }

    @Override // ld.d1
    public final void a(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
