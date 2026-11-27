// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d38 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h48 b;

    public /* synthetic */ d38(h48 h48Var, byte b) {
        this.a = b;
        this.b = h48Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        h48 h48Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                ir1 ir1Var = h48Var.J;
                if (ir1Var != null) {
                    ir1Var.F(num.intValue());
                    break;
                }
                break;
            default:
                h48Var.r = false;
                h48Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    h48Var.A0();
                    h48Var.finishFragment();
                    h48Var.I0();
                    break;
                }
                break;
        }
    }
}
