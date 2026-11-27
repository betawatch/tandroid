// default package

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ cn8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            case 1:
                privacyControlActivity.G0();
                break;
            case 2:
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
        }
    }
}
