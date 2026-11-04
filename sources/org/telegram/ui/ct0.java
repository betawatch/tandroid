package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ ct0(PrivacySettingsActivity privacySettingsActivity, int i3) {
        this.a = i3;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (i3) {
            case 0:
                privacySettingsActivity.a.f();
                privacySettingsActivity.S = true;
                break;
            case 1:
                privacySettingsActivity.c.dismiss();
                break;
            default:
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(privacySettingsActivity.getParentActivity(), null);
                ibVar.d(R.raw.email_check_inbox, new String[0]);
                ibVar.b.setText(org.telegram.messenger.bd.M0(2131742821, null));
                org.telegram.ui.Components.ac.g(privacySettingsActivity, ibVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
