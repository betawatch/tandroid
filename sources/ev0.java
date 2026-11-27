// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
