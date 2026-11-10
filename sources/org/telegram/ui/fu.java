package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ fu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 11;
        int i11 = 0;
        zw zwVar = this.b;
        switch (i7) {
            case 0:
                zwVar.getClass();
                zwVar.presentFragment(new org.telegram.ui.Wallet.z5());
                break;
            case 1:
                zw.u0(zwVar);
                break;
            case 2:
                zwVar.g5();
                break;
            case 3:
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                zwVar.showAsSheet(new PrivacyControlActivity(11, false), d2Var);
                break;
            case 4:
                zwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 5:
                zw zwVar2 = this.b;
                ArrayList arrayList = zwVar2.J2;
                zwVar2.N2 = true;
                if (zwVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    zwVar2.D2.y(zwVar2, arrayList2, zwVar2.C1.getFieldText(), false, zwVar2.K2, zwVar2.L2, zwVar2.M2, null);
                    break;
                }
                break;
            case 6:
                zw zwVar3 = this.b;
                ArrayList arrayList3 = zwVar3.J2;
                zwVar3.K2 = false;
                zwVar3.N2 = false;
                if (zwVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    zwVar3.D2.y(zwVar3, arrayList4, zwVar3.C1.getFieldText(), false, zwVar3.K2, zwVar3.L2, zwVar3.M2, null);
                    break;
                }
                break;
            case 7:
                zw.z0(zwVar);
                break;
            case 8:
                zwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    zwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                zwVar.X.r.requestFocus();
                org.telegram.messenger.g0.K3(zwVar.X.r);
                break;
            case 10:
                zwVar.getClass();
                zwVar.presentFragment(new k());
                break;
            case 11:
                zwVar.getClass();
                zwVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                zwVar.getClass();
                zwVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                zwVar.M4(false, true);
                break;
            case 14:
                org.telegram.messenger.yr messagesStorage = zwVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.rq(messagesStorage, 15));
                Toast.makeText(zwVar.getParentActivity(), org.telegram.messenger.id.M0(2131751651, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                break;
            case 16:
                iw iwVar = zwVar.C0;
                if (iwVar != null && iwVar.A0) {
                    iwVar.R(false);
                    break;
                } else {
                    zwVar.X.r.getText().clear();
                    org.telegram.messenger.g0.v1(zwVar.X.r);
                    zwVar.X.r.clearFocus();
                    zwVar.Y.b(false);
                    break;
                }
                break;
            case 17:
                if (zwVar.S0 != 10) {
                    zwVar.o4(false);
                }
                if (!zwVar.L || !zwVar.j4().I()) {
                    zwVar.J4(true, true);
                    break;
                } else {
                    zwVar.E0.h();
                    break;
                }
                break;
            case 18:
                jh.f fVar = zwVar.z1;
                if (fVar != null) {
                    fVar.d();
                }
                zwVar.E3();
                zwVar.F3();
                li.w1 w1Var = zwVar.D1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-zwVar.w.d());
                    break;
                }
                break;
            case 19:
                zwVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                zwVar.Y3();
                break;
            case 21:
                zwVar.g5();
                break;
            case 22:
                zw.H0(zwVar);
                break;
            case 23:
                zwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                fi.m3 m3Var = zwVar.q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                zwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                zwVar.e0[0].d.f();
                break;
            case 26:
                UndoView k42 = zwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new fu(zwVar, i10));
                    break;
                }
                break;
            case 27:
                zwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                zwVar.g5();
                break;
            case 28:
                org.telegram.messenger.qp.s1(zwVar.currentAccount).l0(null);
                break;
            default:
                zwVar.getClass();
                zwVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
