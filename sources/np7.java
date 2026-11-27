// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class np7 implements nc2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vp7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ NotificationsCustomSettingsActivity h;

    public np7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j, boolean z, vp7 vp7Var, boolean z2, int i, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.a = j;
        this.b = z;
        this.c = vp7Var;
        this.d = z2;
        this.e = i;
        this.f = arrayList;
    }

    public final void a() {
        jla jlaVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.x;
        vp7 vp7Var = this.c;
        ArrayList arrayList2 = this.f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(vp7Var)) >= 0) {
            notificationsCustomSettingsActivity.x.remove(indexOf);
            notificationsCustomSettingsActivity.y.remove(Long.valueOf(vp7Var.d));
        }
        arrayList2.remove(vp7Var);
        if (arrayList2 == notificationsCustomSettingsActivity.x) {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.p0(true);
            notificationsCustomSettingsActivity.d.g(this.e);
        }
        jlaVar = ((e) notificationsCustomSettingsActivity).simpleActionBar;
        jlaVar.o(true);
    }

    public final void b() {
        jla jlaVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().p2(this.a, 0L, null) != this.b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb = new StringBuilder("custom_");
        vp7 vp7Var = this.c;
        sb.append(vp7Var.d);
        vp7Var.b = notificationsSettings.getBoolean(sb.toString(), false);
        int i = notificationsSettings.getInt("notify2_" + vp7Var.d, 0);
        vp7Var.c = i;
        if (i != 0) {
            int i2 = notificationsSettings.getInt("notifyuntil_" + vp7Var.d, -1);
            if (i2 != -1) {
                vp7Var.a = i2;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.x.add(vp7Var);
            notificationsCustomSettingsActivity.y.put(Long.valueOf(vp7Var.d), vp7Var);
            notificationsCustomSettingsActivity.p0(true);
        } else {
            notificationsCustomSettingsActivity.a.getAdapter().g(this.e);
        }
        jlaVar = ((e) notificationsCustomSettingsActivity).simpleActionBar;
        jlaVar.o(true);
    }

    @Override // nc2
    public final void l() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        notificationsCustomSettingsActivity.getNotificationsController().G(this.a, 0L, !notificationsCustomSettingsActivity.getMessagesController().p2(this.a, 0L, null));
        d31.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().p2(this.a, 0L, null), null).j();
        b();
    }

    @Override // nc2
    public final void m() {
        long j = this.a;
        if (j != 0) {
            zu8 zu8Var = new zu8(qu6.k(j, "dialog_id"), null);
            zu8Var.s = new v34(this, (byte) 19);
            this.h.presentFragment(zu8Var);
        }
    }

    @Override // nc2
    public final void p() {
        int i;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        notificationsCustomSettingsActivity.getClass();
        String p = ip7.p(this.a, 0L, false);
        i = ((e) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences sharedPreferences = uc7.s1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + p, true);
        boolean z2 = !z;
        sharedPreferences.edit().putBoolean("sound_enabled_" + p, z2).apply();
        if (d31.a(notificationsCustomSettingsActivity)) {
            d31.S(z ? 1 : 0, notificationsCustomSettingsActivity.getResourceProvider(), notificationsCustomSettingsActivity).j();
        }
    }

    @Override // nc2
    public final void q(int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().p2(this.a, 0L, null)) {
                l();
            }
            if (d31.a(notificationsCustomSettingsActivity)) {
                d31.z(notificationsCustomSettingsActivity, 4, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().H(this.a, i, 0L);
            if (d31.a(notificationsCustomSettingsActivity)) {
                d31.z(notificationsCustomSettingsActivity, 5, i, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override // nc2
    public final void dismiss() {
    }

    @Override // nc2
    public final void i() {
    }
}
