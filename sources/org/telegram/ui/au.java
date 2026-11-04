package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ au(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 11;
        int i11 = 0;
        uw uwVar = this.b;
        switch (i3) {
            case 0:
                uwVar.getClass();
                uwVar.presentFragment(new org.telegram.ui.Wallet.w5());
                break;
            case 1:
                uw.u0(uwVar);
                break;
            case 2:
                uwVar.g5();
                break;
            case 3:
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                uwVar.showAsSheet(new PrivacyControlActivity(11, false), b2Var);
                break;
            case 4:
                uwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 5:
                uw uwVar2 = this.b;
                ArrayList arrayList = uwVar2.J2;
                uwVar2.N2 = true;
                if (uwVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    uwVar2.D2.y(uwVar2, arrayList2, uwVar2.C1.getFieldText(), false, uwVar2.K2, uwVar2.L2, uwVar2.M2, null);
                    break;
                }
                break;
            case 6:
                uw uwVar3 = this.b;
                ArrayList arrayList3 = uwVar3.J2;
                uwVar3.K2 = false;
                uwVar3.N2 = false;
                if (uwVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.pr.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    uwVar3.D2.y(uwVar3, arrayList4, uwVar3.C1.getFieldText(), false, uwVar3.K2, uwVar3.L2, uwVar3.M2, null);
                    break;
                }
                break;
            case 7:
                uw.z0(uwVar);
                break;
            case 8:
                uwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    uwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                uwVar.Y.r.requestFocus();
                org.telegram.messenger.g0.K3(uwVar.Y.r);
                break;
            case 10:
                uwVar.getClass();
                uwVar.presentFragment(new k());
                break;
            case 11:
                uwVar.getClass();
                uwVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                uwVar.getClass();
                uwVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                uwVar.M4(false, true);
                break;
            case 14:
                org.telegram.messenger.qr messagesStorage = uwVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.hq(messagesStorage, 16));
                Toast.makeText(uwVar.getParentActivity(), org.telegram.messenger.bd.M0(2131751652, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                messagesController.C1.b();
                messagesController.D1.b();
                break;
            case 16:
                cw cwVar = uwVar.D0;
                if (cwVar != null && cwVar.B0) {
                    cwVar.R(false);
                    break;
                } else {
                    uwVar.Y.r.getText().clear();
                    org.telegram.messenger.g0.v1(uwVar.Y.r);
                    uwVar.Y.r.clearFocus();
                    uwVar.Z.b(false);
                    break;
                }
                break;
            case 17:
                if (uwVar.S0 != 10) {
                    uwVar.o4(false);
                }
                if (!uwVar.M || !uwVar.j4().I()) {
                    uwVar.J4(true, true);
                    break;
                } else {
                    uwVar.F0.h();
                    break;
                }
                break;
            case 18:
                kh.f fVar = uwVar.z1;
                if (fVar != null) {
                    fVar.d();
                }
                uwVar.E3();
                uwVar.F3();
                mi.x1 x1Var = uwVar.D1;
                if (x1Var != null) {
                    x1Var.setTranslationY(-uwVar.w.d());
                    break;
                }
                break;
            case 19:
                uwVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                uwVar.Y3();
                break;
            case 21:
                uwVar.g5();
                break;
            case 22:
                uw.H0(uwVar);
                break;
            case 23:
                uwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                gi.l3 l3Var = uwVar.r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                uwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                uwVar.f0[0].d.f();
                break;
            case 26:
                UndoView k42 = uwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new au(uwVar, i10));
                    break;
                }
                break;
            case 27:
                uwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.hp.e1();
                long j10 = e12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                uwVar.g5();
                break;
            case 28:
                org.telegram.messenger.hp.s1(uwVar.currentAccount).l0(null);
                break;
            default:
                uwVar.getClass();
                uwVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
