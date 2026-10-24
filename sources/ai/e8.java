package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Wallet.r1 b;

    public /* synthetic */ e8(org.telegram.ui.Wallet.r1 r1Var, int i10) {
        this.a = i10;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new e8(this.b, 3));
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
