// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn1 implements ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ cn1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // ef7
    public final void a(int i) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                if (zu1Var.getParentActivity() != null && zu1Var.fragmentView != null && i > 0) {
                    d31.b0(zu1Var).m(c31.r, i, 0, 0, zu1Var.Ba).j();
                    break;
                }
                break;
            case 1:
                zu1 zu1Var2 = this.b;
                if (i != 0) {
                    zu1Var2.J(i, 0, 0, 0, false, true);
                    break;
                } else {
                    zu1Var2.E6 = false;
                    zu1Var2.X9();
                    break;
                }
            default:
                if (i != 0) {
                    zu1Var.finishFragment();
                    break;
                } else {
                    zu1Var.zd(true);
                    break;
                }
        }
    }
}
