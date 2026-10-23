package org.telegram.messenger;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BillingController b;

    public /* synthetic */ z(BillingController billingController, int i10) {
        this.a = i10;
        this.b = billingController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onQueriedPremiumProductDetails$14();
                break;
            default:
                this.b.lambda$onBillingServiceDisconnected$13();
                break;
        }
    }
}
