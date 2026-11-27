// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class on8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ on8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 0:
                privacySettingsActivity.a.f();
                privacySettingsActivity.S = true;
                break;
            case 1:
                privacySettingsActivity.c.dismiss();
                break;
            default:
                privacySettingsActivity.getClass();
                c21 c21Var = new c21(privacySettingsActivity.getParentActivity(), null);
                c21Var.h(R.raw.email_check_inbox, new String[0]);
                c21Var.b.setText(ob6.M0(2131742442, null));
                v21.g(privacySettingsActivity, c21Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
