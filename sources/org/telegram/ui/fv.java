package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ fv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 11;
        int i12 = 0;
        ay ayVar = this.b;
        switch (i10) {
            case 0:
                ayVar.getClass();
                ayVar.presentFragment(new org.telegram.ui.Wallet.b6());
                break;
            case 1:
                ay.t0(ayVar);
                break;
            case 2:
                ayVar.f5();
                break;
            case 3:
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                ayVar.showAsSheet(new PrivacyControlActivity(11, false), i2Var);
                break;
            case 4:
                ayVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.i0.R());
                break;
            case 5:
                ay ayVar2 = this.b;
                ArrayList arrayList = ayVar2.I2;
                ayVar2.M2 = true;
                if (ayVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i12 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i12)).longValue(), 0L));
                        i12++;
                    }
                    ayVar2.C2.y(ayVar2, arrayList2, ayVar2.B1.getFieldText(), false, ayVar2.J2, ayVar2.K2, ayVar2.L2, null);
                    break;
                }
                break;
            case 6:
                ay ayVar3 = this.b;
                ArrayList arrayList3 = ayVar3.I2;
                ayVar3.J2 = false;
                ayVar3.M2 = false;
                if (ayVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i12 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.gs.a(((Long) arrayList3.get(i12)).longValue(), 0L));
                        i12++;
                    }
                    ayVar3.C2.y(ayVar3, arrayList4, ayVar3.B1.getFieldText(), false, ayVar3.J2, ayVar3.K2, ayVar3.L2, null);
                    break;
                }
                break;
            case 7:
                ay.y0(ayVar);
                break;
            case 8:
                ayVar.getClass();
                if (LaunchActivity.Q() != null) {
                    ayVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 9:
                ayVar.X.r.requestFocus();
                org.telegram.messenger.i0.J3(ayVar.X.r);
                break;
            case 10:
                ayVar.getClass();
                ayVar.presentFragment(new j());
                break;
            case 11:
                ayVar.getClass();
                ayVar.presentFragment(new FiltersSetupActivity());
                break;
            case 12:
                ayVar.getClass();
                ayVar.presentFragment(new ThemeActivity(1));
                break;
            case 13:
                ayVar.L4(false, true);
                break;
            case 14:
                org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.br(messagesStorage, 15));
                Toast.makeText(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131751652, null), 0).show();
                break;
            case 15:
                org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                break;
            case 16:
                kx kxVar = ayVar.C0;
                if (kxVar != null && kxVar.A0) {
                    kxVar.R(false);
                    break;
                } else {
                    ayVar.X.r.getText().clear();
                    org.telegram.messenger.i0.v1(ayVar.X.r);
                    ayVar.X.r.clearFocus();
                    ayVar.Y.b(false);
                    break;
                }
                break;
            case 17:
                if (ayVar.R0 != 10) {
                    ayVar.n4(false);
                }
                if (!ayVar.L || !ayVar.i4().I()) {
                    ayVar.I4(true, true);
                    break;
                } else {
                    ayVar.E0.h();
                    break;
                }
                break;
            case 18:
                zg.e eVar = ayVar.y1;
                if (eVar != null) {
                    eVar.d();
                }
                ayVar.D3();
                ayVar.E3();
                bi.f2 f2Var = ayVar.C1;
                if (f2Var != null) {
                    f2Var.setTranslationY(-ayVar.w.d());
                    break;
                }
                break;
            case 19:
                ayVar.getNotificationCenter().k(24, new Object[0]);
                break;
            case 20:
                ayVar.X3();
                break;
            case 21:
                ayVar.f5();
                break;
            case 22:
                ay.G0(ayVar);
                break;
            case 23:
                ayVar.getMessagesController().h4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 24:
                vh.p2 p2Var = ayVar.q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                ayVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 25:
                ayVar.e0[0].d.f();
                break;
            case 26:
                UndoView j42 = ayVar.j4();
                if (j42 != null) {
                    j42.l(0L, 15, null, new fv(ayVar, i11));
                    break;
                }
                break;
            case 27:
                ayVar.getClass();
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                long j10 = d12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                d12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                ayVar.f5();
                break;
            case 28:
                org.telegram.messenger.vp.r1(ayVar.currentAccount).l0(null);
                break;
            default:
                ayVar.getClass();
                ayVar.presentFragment(new UserInfoActivity());
                break;
        }
    }
}
