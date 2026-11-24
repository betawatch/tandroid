// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class an1 implements uc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ an1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // uc7
    public final void a(int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                if (mu1Var.getParentActivity() != null && mu1Var.fragmentView != null && i > 0) {
                    u21.b0(mu1Var).m(t21.r, i, 0, 0, mu1Var.Ba).j();
                    break;
                }
                break;
            case 1:
                mu1 mu1Var2 = this.b;
                if (i != 0) {
                    mu1Var2.J(i, 0, 0, 0, false, true);
                    break;
                } else {
                    mu1Var2.E6 = false;
                    mu1Var2.M9();
                    break;
                }
            default:
                if (i != 0) {
                    mu1Var.finishFragment();
                    break;
                } else {
                    mu1Var.nd(true);
                    break;
                }
        }
    }
}
