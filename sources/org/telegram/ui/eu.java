package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ eu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 11;
        int i11 = 0;
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                ywVar.getClass();
                ywVar.presentFragment(new org.telegram.ui.Wallet.w5());
                break;
            case 1:
                yw.u0(ywVar);
                break;
            case 2:
                ywVar.g5();
                break;
            case 3:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                ywVar.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                break;
            case 4:
                ywVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 5:
                yw ywVar2 = this.b;
                ArrayList arrayList = ywVar2.J2;
                ywVar2.N2 = true;
                if (ywVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ywVar2.D2.y(ywVar2, arrayList2, ywVar2.C1.getFieldText(), false, ywVar2.K2, ywVar2.L2, ywVar2.M2, null);
                    break;
                }
                break;
            case 6:
                yw ywVar3 = this.b;
                ArrayList arrayList3 = ywVar3.J2;
                ywVar3.K2 = false;
                ywVar3.N2 = false;
                if (ywVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ywVar3.D2.y(ywVar3, arrayList4, ywVar3.C1.getFieldText(), false, ywVar3.K2, ywVar3.L2, ywVar3.M2, null);
                    break;
                }
                break;
            case 7:
                yw.z0(ywVar);
                break;
            case 8:
                ywVar.getClass();
                if (LaunchActivity.Q() != null) {
                    ywVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                ywVar.X.r.requestFocus();
                org.telegram.messenger.g0.K3(ywVar.X.r);
                break;
            case 10:
                ywVar.getClass();
                ywVar.presentFragment(new k());
                break;
            case 11:
                ywVar.getClass();
                ywVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                ywVar.getClass();
                ywVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                ywVar.M4(false, true);
                break;
            case 14:
                org.telegram.messenger.yr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.rq(messagesStorage, 15));
                Toast.makeText(ywVar.getParentActivity(), org.telegram.messenger.id.M0(2131751651, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                break;
            case 16:
                hw hwVar = ywVar.C0;
                if (hwVar != null && hwVar.A0) {
                    hwVar.R(false);
                    break;
                } else {
                    ywVar.X.r.getText().clear();
                    org.telegram.messenger.g0.v1(ywVar.X.r);
                    ywVar.X.r.clearFocus();
                    ywVar.Y.b(false);
                    break;
                }
                break;
            case 17:
                if (ywVar.S0 != 10) {
                    ywVar.o4(false);
                }
                if (!ywVar.L || !ywVar.j4().I()) {
                    ywVar.J4(true, true);
                    break;
                } else {
                    ywVar.E0.h();
                    break;
                }
                break;
            case 18:
                jh.f fVar = ywVar.z1;
                if (fVar != null) {
                    fVar.d();
                }
                ywVar.E3();
                ywVar.F3();
                li.w1 w1Var = ywVar.D1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-ywVar.w.d());
                    break;
                }
                break;
            case 19:
                ywVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                ywVar.Y3();
                break;
            case 21:
                ywVar.g5();
                break;
            case 22:
                yw.H0(ywVar);
                break;
            case 23:
                ywVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                fi.m3 m3Var = ywVar.q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ywVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                ywVar.e0[0].d.f();
                break;
            case 26:
                UndoView k42 = ywVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new eu(ywVar, i10));
                    break;
                }
                break;
            case 27:
                ywVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                ywVar.g5();
                break;
            case 28:
                org.telegram.messenger.qp.s1(ywVar.currentAccount).l0(null);
                break;
            default:
                ywVar.getClass();
                ywVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
