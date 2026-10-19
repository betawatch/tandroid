package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
