package be;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t0 extends u0 {
    public final f2 c;

    public t0(long j10, f2 f2Var) {
        super(j10);
        this.c = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // be.u0
    public final String toString() {
        return super.toString() + this.c;
    }
}
