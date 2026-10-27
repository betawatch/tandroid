package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hk0 implements org.telegram.ui.Components.ap {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qk0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public hk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, qk0 qk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = qk0Var;
        this.d = z11;
        this.e = i10;
        this.f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.r5 r5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.w;
        qk0 qk0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(qk0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(qk0Var.d));
        }
        arrayList2.remove(qk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.m0(true);
            notificationsCustomSettingsActivity.e0();
        } else {
            notificationsCustomSettingsActivity.m0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        r5Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).simpleActionBar;
        r5Var.f(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.r5 r5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_CUSTOM);
        qk0 qk0Var = this.c;
        sb2.append(qk0Var.d);
        qk0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + qk0Var.d, 0);
        qk0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + qk0Var.d, -1);
            if (i11 != -1) {
                qk0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(qk0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(qk0Var.d), qk0Var);
            notificationsCustomSettingsActivity.m0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        r5Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).simpleActionBar;
        r5Var.f(true);
    }

    @Override // org.telegram.ui.Components.ap
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.wc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.ap
    public final void o() {
        long j10 = this.a;
        if (j10 != 0) {
            j11 j11Var = new j11(a1.g.h(j10, "dialog_id"), null);
            j11Var.s = new f(this, 28);
            this.h.presentFragment(j11Var);
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void s() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final void w(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i10);
            if (org.telegram.ui.Components.wc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.wc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void m() {
    }
}
