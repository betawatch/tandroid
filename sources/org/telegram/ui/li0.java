package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class li0 implements org.telegram.ui.Components.fo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ si0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public li0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, si0 si0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = si0Var;
        this.d = z11;
        this.e = i10;
        this.f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.i5 i5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        si0 si0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(si0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(si0Var.d));
        }
        arrayList2.remove(si0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.i5 i5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().q2(this.a, 0, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        si0 si0Var = this.c;
        sb2.append(si0Var.d);
        si0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + si0Var.d, 0);
        si0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + si0Var.d, -1);
            if (i11 != -1) {
                si0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(si0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(si0Var.d), si0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    @Override // org.telegram.ui.Components.fo
    public final void s() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j10, !notificationsCustomSettingsActivity.getMessagesController().q2(this.a, j10, null));
        org.telegram.ui.Components.cc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().q2(this.a, j10, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.fo
    public final void v() {
        long j10 = this.a;
        if (j10 != 0) {
            ty0 ty0Var = new ty0(org.telegram.ui.Cells.f1.k(j10, "dialog_id"), null);
            ty0Var.s = new e(this, 26);
            this.h.presentFragment(ty0Var);
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void x() {
        int i10;
        String v = org.telegram.messenger.pt.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void y(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().q2(this.a, 0, null)) {
                s();
            }
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i10, 0);
            if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.cc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void n() {
    }
}
