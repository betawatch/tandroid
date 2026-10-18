package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
