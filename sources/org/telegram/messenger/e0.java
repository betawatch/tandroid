package org.telegram.messenger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
