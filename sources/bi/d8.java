package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ d8(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d8(this.b, 3));
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
