// default package

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mj8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacyControlActivity b;

    public /* synthetic */ mj8(PrivacyControlActivity privacyControlActivity, byte b) {
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
                privacyControlActivity.F0();
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
