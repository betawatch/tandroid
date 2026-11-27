// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
