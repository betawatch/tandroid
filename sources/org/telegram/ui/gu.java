package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ gu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.q0 q0Var;
        int i7;
        int i10 = 0;
        switch (this.a) {
            case 0:
                cx cxVar = this.b;
                cxVar.getClass();
                cxVar.presentFragment(new o31(null));
                break;
            case 1:
                cx cxVar2 = this.b;
                if (!cxVar2.b3.collapsed_in_dialogs) {
                    cxVar2.getMessagesController().q5(cxVar2.a3, true);
                    cxVar2.finishFragment();
                    break;
                }
                break;
            case 2:
                cx cxVar3 = this.b;
                if (cxVar3.b3.collapsed_in_dialogs) {
                    cxVar3.getMessagesController().q5(cxVar3.a3, false);
                    cxVar3.finishFragment();
                    break;
                }
                break;
            case 3:
                cx cxVar4 = this.b;
                cxVar4.getClass();
                cxVar4.presentFragment(new k());
                break;
            case 4:
                this.b.a5();
                break;
            case 5:
                cx cxVar5 = this.b;
                if (!cx.C4) {
                    cx.C4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.m6.Q0(string) == null || org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.m6.Q0(string2) == null || !org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(l6Var.m());
                        org.telegram.ui.ActionBar.l6 Q0 = !equals ? org.telegram.ui.ActionBar.m6.Q0(str2) : org.telegram.ui.ActionBar.m6.Q0(str);
                        q0Var = cxVar5.l0;
                        if (q0Var != null) {
                            int[] iArr = {(cxVar5.l0.getIconView().getMeasuredWidth() / 2) + r7, (cxVar5.l0.getIconView().getMeasuredHeight() / 2) + r7};
                            q0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.w4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(cxVar5);
                        gu guVar = new gu(cxVar5, 20);
                        i7 = org.telegram.ui.ActionBar.m6.o;
                        if (i7 == 0) {
                            if (b02 != null) {
                                try {
                                    b02.J(R.raw.auto_night_off, i7 == 3 ? org.telegram.messenger.hd.N0(2131753782, "AutoNightSystemModeOff") : org.telegram.messenger.hd.N0(2131753787, "AutoNightModeOff"), org.telegram.messenger.hd.N0(2131745299, "Settings"), 5000, false, guVar).j();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            org.telegram.ui.ActionBar.m6.o = 0;
                            org.telegram.ui.ActionBar.m6.w1();
                            org.telegram.ui.ActionBar.m6.B();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(l6Var.m());
                    if (!equals2) {
                    }
                    q0Var = cxVar5.l0;
                    if (q0Var != null) {
                    }
                    org.telegram.ui.Components.lc b022 = org.telegram.ui.Components.lc.b0(cxVar5);
                    gu guVar2 = new gu(cxVar5, 20);
                    i7 = org.telegram.ui.ActionBar.m6.o;
                    if (i7 == 0) {
                    }
                }
                break;
            case 6:
                cx cxVar6 = this.b;
                cxVar6.getClass();
                cxVar6.presentFragment(new ContactsActivity(null));
                break;
            case 7:
                cx cxVar7 = this.b;
                cxVar7.getClass();
                cxVar7.presentFragment(new j9(null));
                break;
            case 8:
                cx cxVar8 = this.b;
                cxVar8.getClass();
                cxVar8.presentFragment(new z40(new Bundle()));
                break;
            case 9:
                cx.p0(this.b);
                break;
            case 10:
                cx.s0(this.b);
                break;
            case 11:
                this.b.o5();
                break;
            case 12:
                this.b.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 13:
                cx cxVar9 = this.b;
                ArrayList arrayList = cxVar9.K2;
                cxVar9.O2 = true;
                if (cxVar9.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.tr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    cxVar9.E2.y(cxVar9, arrayList2, cxVar9.D1.getFieldText(), false, cxVar9.L2, cxVar9.M2, cxVar9.N2, null);
                    break;
                }
                break;
            case 14:
                cx cxVar10 = this.b;
                ArrayList arrayList3 = cxVar10.K2;
                cxVar10.L2 = false;
                cxVar10.O2 = false;
                if (cxVar10.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.tr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    cxVar10.E2.y(cxVar10, arrayList4, cxVar10.D1.getFieldText(), false, cxVar10.L2, cxVar10.M2, cxVar10.N2, null);
                    break;
                }
                break;
            case 15:
                cx cxVar11 = this.b;
                cxVar11.getClass();
                if (LaunchActivity.Q() != null) {
                    cxVar11.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 16:
                cx cxVar12 = this.b;
                cxVar12.Y.r.requestFocus();
                org.telegram.messenger.g0.I3(cxVar12.Y.r);
                break;
            case 17:
                cx cxVar13 = this.b;
                cxVar13.getClass();
                cxVar13.presentFragment(new FiltersSetupActivity());
                break;
            case 18:
                cx cxVar14 = this.b;
                cxVar14.getClass();
                cxVar14.presentFragment(new k());
                break;
            case 19:
                cx cxVar15 = this.b;
                cxVar15.getMessagesController().U4(cxVar15.m4(), false);
                break;
            case 20:
                cx cxVar16 = this.b;
                cxVar16.getClass();
                cxVar16.presentFragment(new ThemeActivity(1));
                break;
            case 21:
                this.b.U4(false, true);
                break;
            case 22:
                cx cxVar17 = this.b;
                bx[] bxVarArr = cxVar17.f0;
                if (bxVarArr != null) {
                    int length = bxVarArr.length;
                    while (i10 < length) {
                        bxVarArr[i10].a.requestLayout();
                        i10++;
                    }
                }
                cxVar17.m5();
                View view = cxVar17.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                cx cxVar18 = this.b;
                org.telegram.messenger.ur messagesStorage = cxVar18.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.qq(messagesStorage, 16));
                Toast.makeText(cxVar18.getParentActivity(), org.telegram.messenger.hd.N0(2131751639, null), 0).show();
                break;
            case 24:
                org.telegram.messenger.np messagesController = this.b.getMessagesController();
                messagesController.E1.b();
                messagesController.F1.b();
                break;
            case 25:
                cx cxVar19 = this.b;
                kw kwVar = cxVar19.D0;
                if (kwVar != null && kwVar.B0) {
                    kwVar.N(false);
                    break;
                } else {
                    cxVar19.Y.r.getText().clear();
                    org.telegram.messenger.g0.v1(cxVar19.Y.r);
                    cxVar19.Y.r.clearFocus();
                    cxVar19.Z.b(false);
                    break;
                }
                break;
            case 26:
                cx cxVar20 = this.b;
                if (cxVar20.T0 != 10) {
                    cxVar20.q4(false);
                }
                if (!cxVar20.M || !cxVar20.k4().I()) {
                    cxVar20.R4(true, true);
                    break;
                } else {
                    cxVar20.F0.h();
                    break;
                }
                break;
            case 27:
                cx cxVar21 = this.b;
                jh.f fVar = cxVar21.A1;
                if (fVar != null) {
                    fVar.d();
                }
                cxVar21.E3();
                cxVar21.F3();
                oi.w1 w1Var = cxVar21.E1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-cxVar21.w.d());
                    break;
                }
                break;
            case 28:
                cx.z0(this.b);
                break;
            default:
                this.b.getNotificationCenter().k(24, new Object[0]);
                break;
        }
    }
}
