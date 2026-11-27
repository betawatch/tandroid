// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
