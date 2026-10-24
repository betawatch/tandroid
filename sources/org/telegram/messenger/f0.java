package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] b;

    public /* synthetic */ f0(org.telegram.ui.ActionBar.c2[] c2VarArr, int i10) {
        this.a = i10;
        this.b = c2VarArr;
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
