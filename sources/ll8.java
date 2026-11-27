// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ll8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PremiumPreviewFragment b;

    public /* synthetic */ ll8(PremiumPreviewFragment premiumPreviewFragment, byte b) {
        this.a = b;
        this.b = premiumPreviewFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PremiumPreviewFragment premiumPreviewFragment = this.b;
        switch (b) {
            case 0:
                premiumPreviewFragment.a.postOnAnimation(new ll8(premiumPreviewFragment, (byte) 2));
                break;
            case 1:
                premiumPreviewFragment.getMediaDataController().T0(false);
                break;
            default:
                premiumPreviewFragment.m0();
                break;
        }
    }
}
