package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 extends i1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final e1 e;

    public f1(e1 e1Var) {
        this.e = e1Var;
    }

    @Override // hd.e1
    public final void a(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.a(th);
        }
    }
}
