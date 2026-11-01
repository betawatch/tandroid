package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ ev(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 11;
        int i12 = 0;
        zx zxVar = this.b;
        switch (i10) {
            case 0:
                zxVar.getClass();
                zxVar.presentFragment(new org.telegram.ui.Wallet.b6());
                break;
            case 1:
                zx.u0(zxVar);
                break;
            case 2:
                zxVar.g5();
                break;
            case 3:
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                zxVar.showAsSheet(new PrivacyControlActivity(11, false), i2Var);
                break;
            case 4:
                zxVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.i0.R());
                break;
            case 5:
                zx zxVar2 = this.b;
                ArrayList arrayList = zxVar2.I2;
                zxVar2.M2 = true;
                if (zxVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i12 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i12)).longValue(), 0L));
                        i12++;
                    }
                    zxVar2.C2.z(zxVar2, arrayList2, zxVar2.B1.getFieldText(), false, zxVar2.J2, zxVar2.K2, zxVar2.L2, null);
                    break;
                }
                break;
            case 6:
                zx zxVar3 = this.b;
                ArrayList arrayList3 = zxVar3.I2;
                zxVar3.J2 = false;
                zxVar3.M2 = false;
                if (zxVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i12 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.hs.a(((Long) arrayList3.get(i12)).longValue(), 0L));
                        i12++;
                    }
                    zxVar3.C2.z(zxVar3, arrayList4, zxVar3.B1.getFieldText(), false, zxVar3.J2, zxVar3.K2, zxVar3.L2, null);
                    break;
                }
                break;
            case 7:
                zx.z0(zxVar);
                break;
            case 8:
                zxVar.getClass();
                if (LaunchActivity.Q() != null) {
                    zxVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                zxVar.X.r.requestFocus();
                org.telegram.messenger.i0.J3(zxVar.X.r);
                break;
            case 10:
                zxVar.getClass();
                zxVar.presentFragment(new j());
                break;
            case 11:
                zxVar.getClass();
                zxVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                zxVar.getClass();
                zxVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                zxVar.M4(false, true);
                break;
            case 14:
                org.telegram.messenger.is messagesStorage = zxVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.cr(messagesStorage, 15));
                Toast.makeText(zxVar.getParentActivity(), org.telegram.messenger.dd.L0(2131751652, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                break;
            case 16:
                jx jxVar = zxVar.C0;
                if (jxVar != null && jxVar.A0) {
                    jxVar.R(false);
                    break;
                } else {
                    zxVar.X.r.getText().clear();
                    org.telegram.messenger.i0.v1(zxVar.X.r);
                    zxVar.X.r.clearFocus();
                    zxVar.Y.b(false);
                    break;
                }
                break;
            case 17:
                if (zxVar.R0 != 10) {
                    zxVar.o4(false);
                }
                if (!zxVar.L || !zxVar.j4().I()) {
                    zxVar.J4(true, true);
                    break;
                } else {
                    zxVar.E0.h();
                    break;
                }
                break;
            case 18:
                zg.e eVar = zxVar.y1;
                if (eVar != null) {
                    eVar.d();
                }
                zxVar.E3();
                zxVar.F3();
                bi.f2 f2Var = zxVar.C1;
                if (f2Var != null) {
                    f2Var.setTranslationY(-zxVar.w.d());
                    break;
                }
                break;
            case 19:
                zxVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                zxVar.Y3();
                break;
            case 21:
                zxVar.g5();
                break;
            case 22:
                zx.H0(zxVar);
                break;
            case 23:
                zxVar.getMessagesController().h4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                vh.p2 p2Var = zxVar.q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                zxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                zxVar.e0[0].d.f();
                break;
            case 26:
                UndoView k42 = zxVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new ev(zxVar, i11));
                    break;
                }
                break;
            case 27:
                zxVar.getClass();
                SharedPreferences d12 = org.telegram.messenger.wp.d1();
                long j10 = d12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                d12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                zxVar.g5();
                break;
            case 28:
                org.telegram.messenger.wp.r1(zxVar.currentAccount).l0(null);
                break;
            default:
                zxVar.getClass();
                zxVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
