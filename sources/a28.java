// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a28 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d38 b;

    public /* synthetic */ a28(d38 d38Var, byte b) {
        this.a = b;
        this.b = d38Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        d38 d38Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                hs1 hs1Var = d38Var.J;
                if (hs1Var != null) {
                    hs1Var.E(num.intValue());
                    break;
                }
                break;
            default:
                d38Var.r = false;
                d38Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    d38Var.A0();
                    d38Var.finishFragment();
                    d38Var.I0();
                    break;
                }
                break;
        }
    }
}
