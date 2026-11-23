package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lh0 implements org.telegram.ui.Components.no {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sh0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public lh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z10, sh0 sh0Var, boolean z11, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z10;
        this.c = sh0Var;
        this.d = z11;
        this.e = i7;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.no
    public final void J() {
        int i7;
        String v = org.telegram.messenger.xs.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i7).g7;
        boolean z10 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z11).apply();
        if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.kc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public final void Q(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().u2(this.a, 0, null)) {
                v();
            }
            if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.kc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i7, 0);
            if (org.telegram.ui.Components.kc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.kc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.z4 z4Var;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        sh0 sh0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(sh0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(sh0Var.d));
        }
        arrayList2.remove(sh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        z4Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.o(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.z4 z4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().u2(this.a, 0, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        sh0 sh0Var = this.c;
        sb2.append(sh0Var.d);
        sh0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + sh0Var.d, 0);
        sh0Var.c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + sh0Var.d, -1);
            if (i10 != -1) {
                sh0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(sh0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(sh0Var.d), sh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        z4Var = ((org.telegram.ui.ActionBar.g2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.o(true);
    }

    @Override // org.telegram.ui.Components.no
    public final void v() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j3, !notificationsCustomSettingsActivity.getMessagesController().u2(this.a, j3, null));
        org.telegram.ui.Components.kc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().u2(this.a, j3, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.no
    public final void y() {
        long j3 = this.a;
        if (j3 != 0) {
            hx0 hx0Var = new hx0(a8.p0.j(j3, "dialog_id"), null);
            hx0Var.s = new f(this, 26);
            this.h.presentFragment(hx0Var);
        }
    }

    @Override // org.telegram.ui.Components.no
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.no
    public final /* synthetic */ void u() {
    }
}
