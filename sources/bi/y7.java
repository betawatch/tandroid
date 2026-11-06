package bi;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;

    public /* synthetic */ y7(v10 v10Var, int i7) {
        this.a = i7;
        this.b = v10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, null);
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.h3(new y7(this.b, 0));
                break;
        }
    }
}
