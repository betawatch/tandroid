// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fv5 extends vb1 {
    public final ov5 r;

    public fv5(px2 px2Var, ov5 ov5Var) {
        super(1, px2Var);
        this.r = ov5Var;
    }

    @Override // vb1
    public final Throwable p(ov5 ov5Var) {
        Throwable c;
        Object v = this.r.v();
        return (!(v instanceof hv5) || (c = ((hv5) v).c()) == null) ? v instanceof qq2 ? ((qq2) v).a : ov5Var.getCancellationException() : c;
    }

    @Override // vb1
    public final String y() {
        return "AwaitContinuation";
    }
}
