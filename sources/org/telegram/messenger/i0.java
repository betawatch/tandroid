package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] b;

    public /* synthetic */ i0(org.telegram.ui.ActionBar.e2[] e2VarArr, int i10) {
        this.a = i10;
        this.b = e2VarArr;
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
