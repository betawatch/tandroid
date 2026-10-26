package ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f1 extends i1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final e1 e;

    public f1(e1 e1Var) {
        this.e = e1Var;
    }

    @Override // ce.e1
    public final void a(Throwable th2) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
