package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class hh0 implements org.telegram.ui.Components.xn {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ oh0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z9, oh0 oh0Var, boolean z10, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z9;
        this.c = oh0Var;
        this.d = z10;
        this.e = i7;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.xn
    public final void L() {
        int i7;
        String v = org.telegram.messenger.dt.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z10).apply();
        if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.hc.S(z9 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final void R(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.a, 0, null)) {
                p();
            }
            if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.hc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i7, 0);
            if (org.telegram.ui.Components.hc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.hc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.y4 y4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        oh0 oh0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(oh0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(oh0Var.d));
        }
        arrayList2.remove(oh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
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
        oh0 oh0Var = this.c;
        sb2.append(oh0Var.d);
        oh0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + oh0Var.d, 0);
        oh0Var.c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + oh0Var.d, -1);
            if (i10 != -1) {
                oh0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(oh0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(oh0Var.d), oh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        y4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        y4Var.j(true);
    }

    @Override // org.telegram.ui.Components.xn
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j3, null));
        org.telegram.ui.Components.hc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j3, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.xn
    public final void y() {
        long j3 = this.a;
        if (j3 != 0) {
            gx0 gx0Var = new gx0(a8.p0.j(j3, "dialog_id"), null);
            gx0Var.s = new f(this, 26);
            this.h.presentFragment(gx0Var);
        }
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.xn
    public final /* synthetic */ void n() {
    }
}
