package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f1 extends i1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final e1 e;

    public f1(e1 e1Var) {
        this.e = e1Var;
    }

    @Override // be.e1
    public final void a(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
