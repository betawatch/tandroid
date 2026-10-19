package be;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
