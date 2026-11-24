// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ak8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ ak8(PrivacySettingsActivity privacySettingsActivity, byte b) {
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
                t11 t11Var = new t11(privacySettingsActivity.getParentActivity(), null);
                t11Var.d(R.raw.email_check_inbox, new String[0]);
                t11Var.b.setText(k96.M0(2131742548, null));
                m21.g(privacySettingsActivity, t11Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.D0();
                break;
        }
    }
}
