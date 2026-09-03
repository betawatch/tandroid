package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ck0 implements org.telegram.ui.Components.jo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lk0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public ck0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z4, lk0 lk0Var, boolean z10, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z4;
        this.c = lk0Var;
        this.d = z10;
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
        lk0 lk0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(lk0Var)) >= 0) {
            notificationsCustomSettingsActivity.w.remove(indexOf);
            notificationsCustomSettingsActivity.x.remove(Long.valueOf(lk0Var.d));
        }
        arrayList2.remove(lk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
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
        StringBuilder sb = new StringBuilder(NotificationsSettingsFacade.PROPERTY_CUSTOM);
        lk0 lk0Var = this.c;
        sb.append(lk0Var.d);
        lk0Var.b = notificationsSettings.getBoolean(sb.toString(), false);
        int i10 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + lk0Var.d, 0);
        lk0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + lk0Var.d, -1);
            if (i11 != -1) {
                lk0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.w.add(lk0Var);
            notificationsCustomSettingsActivity.x.put(Long.valueOf(lk0Var.d), lk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override // org.telegram.ui.Components.jo
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.qc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.jo
    public final void l() {
        long j10 = this.a;
        if (j10 != 0) {
            l11 l11Var = new l11(kf.k0.g(j10, "dialog_id"), null);
            l11Var.r = new h(this, 28);
            this.h.presentFragment(l11Var);
        }
    }

    @Override // org.telegram.ui.Components.jo
    public final void o() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z10 = !z4;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z10).apply();
        if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.jo
    public final void s(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.qc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.a, 0, i10);
            if (org.telegram.ui.Components.qc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.qc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.jo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.jo
    public final /* synthetic */ void j() {
    }
}
