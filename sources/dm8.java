// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ dm8(PrivacySettingsActivity privacySettingsActivity, byte b) {
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
                b31 b31Var = new b31(privacySettingsActivity.getParentActivity(), null);
                b31Var.d(R.raw.email_check_inbox, new String[0]);
                b31Var.b.setText(jb6.M0(2131742474, null));
                u31.g(privacySettingsActivity, b31Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
