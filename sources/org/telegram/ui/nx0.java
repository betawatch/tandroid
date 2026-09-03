package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ nx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.a = i10;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.b;
                privacySettingsActivity.a.l();
                privacySettingsActivity.O = true;
                break;
            case 1:
                this.b.c.dismiss();
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.b;
                org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(privacySettingsActivity2.getParentActivity(), null);
                qbVar.d(R.raw.email_check_inbox, new String[0]);
                qbVar.b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.ic.g(privacySettingsActivity2, qbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                break;
        }
    }
}
