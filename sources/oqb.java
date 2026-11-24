// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oqb extends ss9 implements Runnable {
    public final long f;

    public oqb(long j, px2 px2Var) {
        super(px2Var, px2Var.getContext());
        this.f = j;
    }

    @Override // b2, ov5
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        kfe.b(this.d);
        i(new nqb("Timed out waiting for " + this.f + " ms", this));
    }
}
