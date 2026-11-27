// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xt3 b;

    public /* synthetic */ ev0(xt3 xt3Var, byte b) {
        this.a = b;
        this.b = xt3Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        xt3 xt3Var = this.b;
        switch (b) {
            case 0:
                hl.t1(xt3Var);
                hl.d3((Runnable) obj, 80L);
                break;
            default:
                xt3Var.H(((Integer) obj).intValue());
                break;
        }
    }
}
