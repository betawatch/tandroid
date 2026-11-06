package bi;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Wallet.v1 b;

    public /* synthetic */ b8(org.telegram.ui.Wallet.v1 v1Var, int i7) {
        this.a = i7;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                org.telegram.messenger.g0.h3(new b8(this.b, 3));
                break;
            default:
                this.b.a(Boolean.FALSE, null);
                break;
        }
    }
}
