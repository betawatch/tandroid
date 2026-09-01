package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bk0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ NotificationsCustomSettingsActivity f;

    public bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
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
