package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc b;

    public /* synthetic */ g8(sc scVar, int i10) {
        this.a = i10;
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g8(this.b, 3));
                break;
            case 1:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
