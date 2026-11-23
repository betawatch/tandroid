package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ fu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
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
                bx bxVar = this.b;
                bxVar.getClass();
                bxVar.presentFragment(new n31(null));
                break;
            case 1:
                bx bxVar2 = this.b;
                if (!bxVar2.b3.collapsed_in_dialogs) {
                    bxVar2.getMessagesController().q5(bxVar2.a3, true);
                    bxVar2.finishFragment();
                    break;
                }
                break;
            case 2:
                bx bxVar3 = this.b;
                if (bxVar3.b3.collapsed_in_dialogs) {
                    bxVar3.getMessagesController().q5(bxVar3.a3, false);
                    bxVar3.finishFragment();
                    break;
                }
                break;
            case 3:
                bx bxVar4 = this.b;
                bxVar4.getClass();
                bxVar4.presentFragment(new k());
                break;
            case 4:
                this.b.a5();
                break;
            case 5:
                bx bxVar5 = this.b;
                if (!bx.C4) {
                    bx.C4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.n6.Q0(string) == null || org.telegram.ui.ActionBar.n6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.n6.Q0(string2) == null || !org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.n6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (m6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(m6Var.m());
                        org.telegram.ui.ActionBar.m6 Q0 = !equals ? org.telegram.ui.ActionBar.n6.Q0(str2) : org.telegram.ui.ActionBar.n6.Q0(str);
                        q0Var = bxVar5.l0;
                        if (q0Var != null) {
                            int[] iArr = {(bxVar5.l0.getIconView().getMeasuredWidth() / 2) + r7, (bxVar5.l0.getIconView().getMeasuredHeight() / 2) + r7};
                            q0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.w4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(bxVar5);
                        fu fuVar = new fu(bxVar5, 20);
                        i7 = org.telegram.ui.ActionBar.n6.o;
                        if (i7 == 0) {
                            if (b02 != null) {
                                try {
                                    b02.J(R.raw.auto_night_off, i7 == 3 ? org.telegram.messenger.gd.N0(2131753782, "AutoNightSystemModeOff") : org.telegram.messenger.gd.N0(2131753787, "AutoNightModeOff"), org.telegram.messenger.gd.N0(2131745299, "Settings"), 5000, false, fuVar).j();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            org.telegram.ui.ActionBar.n6.o = 0;
                            org.telegram.ui.ActionBar.n6.w1();
                            org.telegram.ui.ActionBar.n6.B();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(m6Var.m());
                    if (!equals2) {
                    }
                    q0Var = bxVar5.l0;
                    if (q0Var != null) {
                    }
                    org.telegram.ui.Components.kc b022 = org.telegram.ui.Components.kc.b0(bxVar5);
                    fu fuVar2 = new fu(bxVar5, 20);
                    i7 = org.telegram.ui.ActionBar.n6.o;
                    if (i7 == 0) {
                    }
                }
                break;
            case 6:
                bx bxVar6 = this.b;
                bxVar6.getClass();
                bxVar6.presentFragment(new ContactsActivity(null));
                break;
            case 7:
                bx bxVar7 = this.b;
                bxVar7.getClass();
                bxVar7.presentFragment(new j9(null));
                break;
            case 8:
                bx bxVar8 = this.b;
                bxVar8.getClass();
                bxVar8.presentFragment(new y40(new Bundle()));
                break;
            case 9:
                bx.p0(this.b);
                break;
            case 10:
                bx.s0(this.b);
                break;
            case 11:
                this.b.o5();
                break;
            case 12:
                this.b.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                break;
            case 13:
                bx bxVar9 = this.b;
                ArrayList arrayList = bxVar9.K2;
                bxVar9.O2 = true;
                if (bxVar9.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.sr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    bxVar9.E2.z(bxVar9, arrayList2, bxVar9.D1.getFieldText(), false, bxVar9.L2, bxVar9.M2, bxVar9.N2, null);
                    break;
                }
                break;
            case 14:
                bx bxVar10 = this.b;
                ArrayList arrayList3 = bxVar10.K2;
                bxVar10.L2 = false;
                bxVar10.O2 = false;
                if (bxVar10.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.sr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    bxVar10.E2.z(bxVar10, arrayList4, bxVar10.D1.getFieldText(), false, bxVar10.L2, bxVar10.M2, bxVar10.N2, null);
                    break;
                }
                break;
            case 15:
                bx bxVar11 = this.b;
                bxVar11.getClass();
                if (LaunchActivity.Q() != null) {
                    bxVar11.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 16:
                bx bxVar12 = this.b;
                bxVar12.Y.r.requestFocus();
                org.telegram.messenger.g0.I3(bxVar12.Y.r);
                break;
            case 17:
                bx bxVar13 = this.b;
                bxVar13.getClass();
                bxVar13.presentFragment(new FiltersSetupActivity());
                break;
            case 18:
                bx bxVar14 = this.b;
                bxVar14.getClass();
                bxVar14.presentFragment(new k());
                break;
            case 19:
                bx bxVar15 = this.b;
                bxVar15.getMessagesController().U4(bxVar15.m4(), false);
                break;
            case 20:
                bx bxVar16 = this.b;
                bxVar16.getClass();
                bxVar16.presentFragment(new ThemeActivity(1));
                break;
            case 21:
                this.b.U4(false, true);
                break;
            case 22:
                bx bxVar17 = this.b;
                ax[] axVarArr = bxVar17.f0;
                if (axVarArr != null) {
                    int length = axVarArr.length;
                    while (i10 < length) {
                        axVarArr[i10].a.requestLayout();
                        i10++;
                    }
                }
                bxVar17.m5();
                View view = bxVar17.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                bx bxVar18 = this.b;
                org.telegram.messenger.tr messagesStorage = bxVar18.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.pq(messagesStorage, 16));
                Toast.makeText(bxVar18.getParentActivity(), org.telegram.messenger.gd.N0(2131751639, null), 0).show();
                break;
            case 24:
                org.telegram.messenger.mp messagesController = this.b.getMessagesController();
                messagesController.E1.b();
                messagesController.F1.b();
                break;
            case 25:
                bx bxVar19 = this.b;
                jw jwVar = bxVar19.D0;
                if (jwVar != null && jwVar.B0) {
                    jwVar.P(false);
                    break;
                } else {
                    bxVar19.Y.r.getText().clear();
                    org.telegram.messenger.g0.v1(bxVar19.Y.r);
                    bxVar19.Y.r.clearFocus();
                    bxVar19.Z.b(false);
                    break;
                }
                break;
            case 26:
                bx bxVar20 = this.b;
                if (bxVar20.T0 != 10) {
                    bxVar20.q4(false);
                }
                if (!bxVar20.M || !bxVar20.k4().I()) {
                    bxVar20.R4(true, true);
                    break;
                } else {
                    bxVar20.F0.h();
                    break;
                }
                break;
            case 27:
                bx bxVar21 = this.b;
                jh.f fVar = bxVar21.A1;
                if (fVar != null) {
                    fVar.d();
                }
                bxVar21.E3();
                bxVar21.F3();
                oi.w1 w1Var = bxVar21.E1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-bxVar21.w.d());
                    break;
                }
                break;
            case 28:
                bx.z0(this.b);
                break;
            default:
                this.b.getNotificationCenter().k(24, new Object[0]);
                break;
        }
    }
}
