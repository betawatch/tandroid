package be;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
