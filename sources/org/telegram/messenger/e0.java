package org.telegram.messenger;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] b;

    public /* synthetic */ e0(org.telegram.ui.ActionBar.b2[] b2VarArr, int i10) {
        this.a = i10;
        this.b = b2VarArr;
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
