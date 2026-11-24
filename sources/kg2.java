// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kg2 extends sc3 {
    public final po F = new po(null);
    public final /* synthetic */ wg2 G;

    public kg2(wg2 wg2Var) {
        this.G = wg2Var;
    }

    @Override // sc3
    public final void N() {
        this.F.e();
    }

    @Override // sc3
    public final void O() {
        this.G.c.invalidate();
    }

    @Override // sc3
    public final void P(u69 u69Var) {
        this.G.c.invalidate();
    }

    @Override // sc3, d69
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
