// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
