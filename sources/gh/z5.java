package gh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg.y0 b;

    public /* synthetic */ z5(bg.y0 y0Var, int i9) {
        this.a = i9;
        this.b = y0Var;
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
                AndroidUtilities.runOnUIThread(new z5(this.b, 3));
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
