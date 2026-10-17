package org.telegram.messenger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BillingController b;

    public /* synthetic */ a0(BillingController billingController, int i10) {
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
