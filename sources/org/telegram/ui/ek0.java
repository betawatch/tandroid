package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ek0 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.b);
        notificationsCustomSettingsActivity.b.l();
        notificationsCustomSettingsActivity.a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.c.setShowAtCenter(false);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.f = true;
        notificationsCustomSettingsActivity.c.setShowAtCenter(true);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.a != null) {
                notificationsCustomSettingsActivity.c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.c.b();
                notificationsCustomSettingsActivity.a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
