// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ge6 implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mh6 b;

    public /* synthetic */ ge6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                mh6Var.b[mh6Var.a].e();
                mh6Var.y1(true, true);
                break;
            default:
                mh6Var.m0 = true;
                if (mh6Var.a != 0) {
                    mh6Var.J1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
