// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
