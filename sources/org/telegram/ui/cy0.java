package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ cy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.a = i10;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                privacySettingsActivity.a.l();
                privacySettingsActivity.R = true;
                break;
            case 1:
                this.b.c.dismiss();
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.b;
                org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(privacySettingsActivity2.getParentActivity(), null);
                wbVar.d(R.raw.email_check_inbox, new String[0]);
                wbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.oc.g(privacySettingsActivity2, wbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                break;
        }
    }
}
