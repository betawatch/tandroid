package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kh0 implements org.telegram.ui.Components.wn {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rh0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j3, boolean z9, rh0 rh0Var, boolean z10, int i7, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j3;
        this.b = z9;
        this.c = rh0Var;
        this.d = z10;
        this.e = i7;
        this.f = arrayList;
    }

    @Override // org.telegram.ui.Components.wn
    public final void L() {
        int i7;
        String v = org.telegram.messenger.dt.v(this.a, 0, false);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i7 = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i7).d7;
        boolean z9 = sharedPreferences.getBoolean("sound_enabled_" + v, true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + v, z10).apply();
        if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.gc.S(z9 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final void R(int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i7 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().r2(this.a, 0, null)) {
                p();
            }
            if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.gc.z(notificationsCustomSettingsActivity, 4, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i7, 0);
            if (org.telegram.ui.Components.gc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.gc.z(notificationsCustomSettingsActivity, 5, i7, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
        rh0 rh0Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(rh0Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(rh0Var.d));
        }
        arrayList2.remove(rh0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.i0();
        } else {
            notificationsCustomSettingsActivity.q0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        z4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.l(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.z4 z4Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().r2(this.a, 0, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        rh0 rh0Var = this.c;
        sb2.append(rh0Var.d);
        rh0Var.b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i7 = notificationsSettings.getInt("notify2_" + rh0Var.d, 0);
        rh0Var.c = i7;
        if (i7 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + rh0Var.d, -1);
            if (i10 != -1) {
                rh0Var.a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(rh0Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(rh0Var.d), rh0Var);
            notificationsCustomSettingsActivity.q0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        z4Var = ((org.telegram.ui.ActionBar.f2) notificationsCustomSettingsActivity).simpleActionBar;
        z4Var.l(true);
    }

    @Override // org.telegram.ui.Components.wn
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        long j3 = 0;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, j3, !notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j3, null));
        org.telegram.ui.Components.gc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().r2(this.a, j3, null), null).j();
        b();
    }

    @Override // org.telegram.ui.Components.wn
    public final void y() {
        long j3 = this.a;
        if (j3 != 0) {
            lx0 lx0Var = new lx0(a8.p0.j(j3, "dialog_id"), null);
            lx0Var.s = new f(this, 26);
            this.h.presentFragment(lx0Var);
        }
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void dismiss() {
    }

    @Override // org.telegram.ui.Components.wn
    public final /* synthetic */ void n() {
    }
}
