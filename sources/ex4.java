// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ex4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yx4 b;
    public final /* synthetic */ pcc c;

    public /* synthetic */ ex4(yx4 yx4Var, pcc pccVar, byte b) {
        this.a = b;
        this.b = yx4Var;
        this.c = pccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pcc pccVar = this.c;
        yx4 yx4Var = this.b;
        switch (b) {
            case 0:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                break;
            case 1:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                break;
            default:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                }
                yx4Var.dismiss();
                break;
        }
    }
}
