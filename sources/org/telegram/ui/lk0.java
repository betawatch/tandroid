package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lk0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ NotificationsCustomSettingsActivity f;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f;
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

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f;
        notificationsCustomSettingsActivity.f = true;
        notificationsCustomSettingsActivity.c.setShowAtCenter(true);
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f;
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
