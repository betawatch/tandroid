package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] b;

    public /* synthetic */ e0(org.telegram.ui.ActionBar.a2[] a2VarArr, int i10) {
        this.a = i10;
        this.b = a2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BillingController.lambda$onPurchasesUpdatedInternal$6(this.b);
                break;
            default:
                BillingController.lambda$onPurchasesUpdatedInternal$5(this.b);
                break;
        }
    }
}
