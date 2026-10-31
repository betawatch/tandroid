package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ni0 implements org.telegram.ui.Components.fo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ui0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public ni0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ui0 ui0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j10;
        this.b = z10;
        this.c = ui0Var;
        this.d = z11;
        this.e = i10;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.fo
    public final void E(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().q2(this.a, 0, null)) {
                v();
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

    public final void a() {
        org.telegram.ui.ActionBar.i5 i5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        ui0 ui0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ui0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(ui0Var.d));
        }
        arrayList2.remove(ui0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.h0();
        } else {
            notificationsCustomSettingsActivity.p0(true);
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
        ui0 ui0Var = this.c;
        sb2.append(ui0Var.d);
        ui0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + ui0Var.d, 0);
        ui0Var.c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + ui0Var.d, -1);
            if (i11 != -1) {
                ui0Var.a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(ui0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(ui0Var.d), ui0Var);
            notificationsCustomSettingsActivity.p0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        i5Var = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).simpleActionBar;
        i5Var.j(true);
    }

    @Override // org.telegram.ui.Components.fo
    public final void v() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j10 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j10, !notificationsCustomSettingsActivity.getMessagesController().q2(this.a, j10, null));
        org.telegram.ui.Components.cc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().q2(this.a, j10, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.fo
    public final void x() {
        long j10 = this.a;
        if (j10 != 0) {
            uy0 uy0Var = new uy0(org.telegram.ui.Cells.f1.k(j10, "dialog_id"), null);
            uy0Var.s = new e(this, 25);
            this.h.presentFragment(uy0Var);
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final void y() {
        int i10;
        String v = org.telegram.messenger.ot.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.k2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.cc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.cc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.fo
    public final /* synthetic */ void n() {
    }
}
