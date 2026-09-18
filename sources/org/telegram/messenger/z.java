package org.telegram.messenger;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
