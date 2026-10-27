package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Wallet.r1 b;

    public /* synthetic */ a8(org.telegram.ui.Wallet.r1 r1Var, int i10) {
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
                AndroidUtilities.runOnUIThread(new a8(this.b, 3));
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
