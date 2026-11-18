package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mh0 implements org.telegram.ui.Components.oo {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ th0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public mh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, th0 th0Var, boolean z11, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z10;
        this.c = th0Var;
        this.d = z11;
        this.e = i7;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.oo
    public final void B(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().u2(this.a, 0, null)) {
                s();
            }
            if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.lc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i7, 0);
            if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.lc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.a5 a5Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        th0 th0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(th0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(th0Var.d));
        }
        arrayList2.remove(th0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        a5Var = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).simpleActionBar;
        a5Var.o(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.a5 a5Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().u2(this.a, 0, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        th0 th0Var = this.c;
        sb2.append(th0Var.d);
        th0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + th0Var.d, 0);
        th0Var.c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + th0Var.d, -1);
            if (i10 != -1) {
                th0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(th0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(th0Var.d), th0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        a5Var = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).simpleActionBar;
        a5Var.o(true);
    }

    @Override // org.telegram.ui.Components.oo
    public final void s() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j3, !notificationsCustomSettingsActivity.getMessagesController().u2(this.a, j3, null));
        org.telegram.ui.Components.lc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().u2(this.a, j3, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.oo
    public final void u() {
        long j3 = this.a;
        if (j3 != 0) {
            jx0 jx0Var = new jx0(a8.p0.j(j3, "dialog_id"), null);
            jx0Var.s = new f(this, 26);
            this.h.presentFragment(jx0Var);
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final void w() {
        int i7;
        String v = org.telegram.messenger.xs.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.h2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.lc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.lc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.oo
    public final /* synthetic */ void p() {
    }
}
