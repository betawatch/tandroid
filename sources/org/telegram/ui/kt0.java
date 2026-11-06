package org.telegram.ui;

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrivacySettingsActivity b;

    public /* synthetic */ kt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
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
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(privacySettingsActivity.getParentActivity(), null);
                kbVar.d(R.raw.email_check_inbox, new String[0]);
                kbVar.b.setText(org.telegram.messenger.hd.M0(2131742812, null));
                org.telegram.ui.Components.cc.g(privacySettingsActivity, kbVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                break;
        }
    }
}
