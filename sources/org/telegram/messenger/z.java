package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
