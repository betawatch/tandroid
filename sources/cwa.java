// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cwa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe2 b;

    public /* synthetic */ cwa(qe2 qe2Var, byte b) {
        this.a = b;
        this.b = qe2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qe2 qe2Var = this.b;
        switch (b) {
            case 0:
                qe2Var.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                qe2Var.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                qe2Var.a(Boolean.FALSE, null);
                break;
            default:
                hl.c3(new cwa(qe2Var, (byte) 2));
                break;
        }
    }
}
