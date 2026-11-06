package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ cu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 11;
        int i11 = 0;
        ww wwVar = this.b;
        switch (i7) {
            case 0:
                wwVar.getClass();
                wwVar.presentFragment(new org.telegram.ui.Wallet.y5());
                break;
            case 1:
                ww.u0(wwVar);
                break;
            case 2:
                wwVar.g5();
                break;
            case 3:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                wwVar.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                break;
            case 4:
                wwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 5:
                ww wwVar2 = this.b;
                ArrayList arrayList = wwVar2.I2;
                wwVar2.M2 = true;
                if (wwVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    wwVar2.C2.y(wwVar2, arrayList2, wwVar2.B1.getFieldText(), false, wwVar2.J2, wwVar2.K2, wwVar2.L2, null);
                    break;
                }
                break;
            case 6:
                ww wwVar3 = this.b;
                ArrayList arrayList3 = wwVar3.I2;
                wwVar3.J2 = false;
                wwVar3.M2 = false;
                if (wwVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    wwVar3.C2.y(wwVar3, arrayList4, wwVar3.B1.getFieldText(), false, wwVar3.J2, wwVar3.K2, wwVar3.L2, null);
                    break;
                }
                break;
            case 7:
                ww.z0(wwVar);
                break;
            case 8:
                wwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    wwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                wwVar.X.r.requestFocus();
                org.telegram.messenger.g0.K3(wwVar.X.r);
                break;
            case 10:
                wwVar.getClass();
                wwVar.presentFragment(new k());
                break;
            case 11:
                wwVar.getClass();
                wwVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                wwVar.getClass();
                wwVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                wwVar.M4(false, true);
                break;
            case 14:
                org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.qq(messagesStorage, 16));
                Toast.makeText(wwVar.getParentActivity(), org.telegram.messenger.hd.M0(2131751652, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                break;
            case 16:
                fw fwVar = wwVar.C0;
                if (fwVar != null && fwVar.A0) {
                    fwVar.R(false);
                    break;
                } else {
                    wwVar.X.r.getText().clear();
                    org.telegram.messenger.g0.v1(wwVar.X.r);
                    wwVar.X.r.clearFocus();
                    wwVar.Y.b(false);
                    break;
                }
                break;
            case 17:
                if (wwVar.R0 != 10) {
                    wwVar.o4(false);
                }
                if (!wwVar.L || !wwVar.j4().I()) {
                    wwVar.J4(true, true);
                    break;
                } else {
                    wwVar.E0.h();
                    break;
                }
                break;
            case 18:
                jh.f fVar = wwVar.y1;
                if (fVar != null) {
                    fVar.d();
                }
                wwVar.E3();
                wwVar.F3();
                li.w1 w1Var = wwVar.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-wwVar.w.d());
                    break;
                }
                break;
            case 19:
                wwVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                wwVar.Y3();
                break;
            case 21:
                wwVar.g5();
                break;
            case 22:
                ww.H0(wwVar);
                break;
            case 23:
                wwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                fi.m3 m3Var = wwVar.q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                wwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                wwVar.e0[0].d.f();
                break;
            case 26:
                UndoView k42 = wwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new cu(wwVar, i10));
                    break;
                }
                break;
            case 27:
                wwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                wwVar.g5();
                break;
            case 28:
                org.telegram.messenger.qp.s1(wwVar.currentAccount).l0(null);
                break;
            default:
                wwVar.getClass();
                wwVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
