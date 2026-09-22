package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kk0 implements org.telegram.ui.Components.oo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tk0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public kk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, tk0 tk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z10;
        this.c = tk0Var;
        this.d = z11;
        this.e = i10;
        this.f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.w;
        tk0 tk0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(tk0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(tk0Var.d));
        }
        arrayList2.remove(tk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder(NotificationsSettingsFacade.PROPERTY_CUSTOM);
        tk0 tk0Var = this.c;
        sb2.append(tk0Var.d);
        tk0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + tk0Var.d, 0);
        tk0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + tk0Var.d, -1);
            if (i11 != -1) {
                tk0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(tk0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(tk0Var.d), tk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override // org.telegram.ui.Components.oo
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.vc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.oo
    public final void o() {
        long j3 = this.a;
        if (j3 != 0) {
            x11 x11Var = new x11(w.c.e(j3, "dialog_id"), null);
            x11Var.r = new g(this, 28);
            this.h.presentFragment(x11Var);
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void t(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i10);
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void l() {
    }
}
