package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ ot0(PrivacySettingsActivity privacySettingsActivity, int i7) {
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
                privacySettingsActivity.R = true;
                break;
            case 1:
                privacySettingsActivity.c.dismiss();
                break;
            default:
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(privacySettingsActivity.getParentActivity(), null);
                jbVar.d(R.raw.email_check_inbox, new String[0]);
                jbVar.b.setText(org.telegram.messenger.id.M0(2131742811, null));
                org.telegram.ui.Components.bc.g(privacySettingsActivity, jbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
