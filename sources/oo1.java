// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo1 implements we7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ oo1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // we7
    public final void a(int i) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                if (yv1Var.getParentActivity() != null && yv1Var.fragmentView != null && i > 0) {
                    c41.b0(yv1Var).m(b41.r, i, 0, 0, yv1Var.Ba).j();
                    break;
                }
                break;
            case 1:
                yv1 yv1Var2 = this.b;
                if (i != 0) {
                    yv1Var2.J(i, 0, 0, 0, false, true);
                    break;
                } else {
                    yv1Var2.E6 = false;
                    yv1Var2.W9();
                    break;
                }
            default:
                if (i != 0) {
                    yv1Var.finishFragment();
                    break;
                } else {
                    yv1Var.zd(true);
                    break;
                }
        }
    }
}
