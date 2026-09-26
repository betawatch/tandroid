package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ek0 implements org.telegram.ui.Components.po {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nk0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, nk0 nk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z10;
        this.c = nk0Var;
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
        nk0 nk0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(nk0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(nk0Var.d));
        }
        arrayList2.remove(nk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
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
        nk0 nk0Var = this.c;
        sb2.append(nk0Var.d);
        nk0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + nk0Var.d, 0);
        nk0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + nk0Var.d, -1);
            if (i11 != -1) {
                nk0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(nk0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(nk0Var.d), nk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override // org.telegram.ui.Components.po
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j3 = 0;
        long j10 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j3, !messagesController.isDialogMuted(j10, j3));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j10, j3), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.po
    public final void o() {
        long j3 = this.a;
        if (j3 != 0) {
            n11 n11Var = new n11(v7.j.e(j3, "dialog_id"), null);
            n11Var.r = new g(this, 28);
            this.h.presentFragment(n11Var);
        }
    }

    @Override // org.telegram.ui.Components.po
    public final void r() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.m2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.po
    public final void u(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i10);
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.po
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.po
    public final /* synthetic */ void m() {
    }
}
