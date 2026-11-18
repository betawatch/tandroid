package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ mt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.a = i7;
        this.b = privacySettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (i7) {
            case 0:
                privacySettingsActivity.a.f();
                privacySettingsActivity.S = true;
                break;
            case 1:
                privacySettingsActivity.c.dismiss();
                break;
            default:
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity.getParentActivity(), null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.b.setText(org.telegram.messenger.gd.M0(2131742553, null));
                org.telegram.ui.Components.gc.g(privacySettingsActivity, obVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
