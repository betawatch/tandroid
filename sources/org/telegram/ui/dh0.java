package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dh0 implements org.telegram.ui.Components.wn {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lh0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public dh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, lh0 lh0Var, boolean z11, int i3, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = lh0Var;
        this.d = z11;
        this.e = i3;
        this.f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.y4 y4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        lh0 lh0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(lh0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(lh0Var.d));
        }
        arrayList2.remove(lh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        y4Var = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.y4 y4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.a, 0, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        lh0 lh0Var = this.c;
        sb2.append(lh0Var.d);
        lh0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i3 = notificationsSettings.getInt("notify2_" + lh0Var.d, 0);
        lh0Var.c = i3;
        if (i3 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + lh0Var.d, -1);
            if (i10 != -1) {
                lh0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(lh0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(lh0Var.d), lh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        y4Var = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    @Override // org.telegram.ui.Components.wn
    public final void q() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j10, !notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j10, null));
        org.telegram.ui.Components.fc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j10, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.wn
    public final void t() {
        long j10 = this.a;
        if (j10 != 0) {
            yw0 yw0Var = new yw0(a1.g.j(j10, "dialog_id"), null);
            yw0Var.s = new f(this, 26);
            this.h.presentFragment(yw0Var);
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void v() {
        int i3;
        String v = org.telegram.messenger.us.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i3 = ((org.telegram.ui.ActionBar.d2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).d7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void z(int i3) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i3 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.a, 0, null)) {
                q();
            }
            if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.fc.z(notificationsCustomSettingsActivity, 4, i3, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i3, 0);
            if (org.telegram.ui.Components.fc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.fc.z(notificationsCustomSettingsActivity, 5, i3, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void p() {
    }
}
