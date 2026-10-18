package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Wallet.s1 b;

    public /* synthetic */ d8(org.telegram.ui.Wallet.s1 s1Var, int i10) {
        this.a = i10;
        this.b = s1Var;
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
                AndroidUtilities.runOnUIThread(new d8(this.b, 3));
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
