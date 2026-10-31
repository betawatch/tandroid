package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ ew(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.t0 t0Var;
        int i10;
        pb1 pb1Var = null;
        switch (this.a) {
            case 0:
                ay ayVar = this.b;
                ayVar.L4(false, true);
                if (ayVar.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        zx[] zxVarArr = ayVar.e0;
                        if (i11 >= zxVarArr.length) {
                            break;
                        } else {
                            if (zxVarArr[i11].getVisibility() == 0) {
                                zx zxVar = ayVar.e0[i11];
                                if (!zxVar.d.G) {
                                    zxVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 1:
                ay ayVar2 = this.b;
                ayVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ayVar2.Y2);
                ayVar2.presentFragment(new yh.l(bundle));
                break;
            case 2:
                ay.j0(this.b);
                break;
            case 3:
                ay ayVar3 = this.b;
                ayVar3.getClass();
                ayVar3.presentFragment(new e51(null));
                break;
            case 4:
                ay ayVar4 = this.b;
                if (!ayVar4.Z2.collapsed_in_dialogs) {
                    ayVar4.getMessagesController().b5(ayVar4.Y2, true);
                    ayVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                ay ayVar5 = this.b;
                if (ayVar5.Z2.collapsed_in_dialogs) {
                    ayVar5.getMessagesController().b5(ayVar5.Y2, false);
                    ayVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                ay ayVar6 = this.b;
                ayVar6.getClass();
                ayVar6.presentFragment(new j());
                break;
            case 7:
                this.b.R4();
                break;
            case 8:
                ay ayVar7 = this.b;
                if (!ay.x4) {
                    ay.x4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(s6Var.m());
                        org.telegram.ui.ActionBar.s6 Q0 = !equals ? org.telegram.ui.ActionBar.t6.Q0(str2) : org.telegram.ui.ActionBar.t6.Q0(str);
                        t0Var = ayVar7.k0;
                        if (t0Var != null) {
                            int[] iArr = {(ayVar7.k0.getIconView().getMeasuredWidth() / 2) + r7, (ayVar7.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            t0Var.getLocationInWindow(iArr);
                            int i12 = iArr[0];
                            int i13 = iArr[1];
                            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(ayVar7);
                        fv fvVar = new fv(ayVar7, 12);
                        i10 = org.telegram.ui.ActionBar.t6.o;
                        if (i10 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i10 == 3 ? org.telegram.messenger.cd.L0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.cd.L0(2131753790, "AutoNightModeOff"), org.telegram.messenger.cd.L0(2131745512, "Settings"), 5000, false, fvVar).j();
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                            }
                            org.telegram.ui.ActionBar.t6.o = 0;
                            org.telegram.ui.ActionBar.t6.w1();
                            org.telegram.ui.ActionBar.t6.B();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(s6Var.m());
                    if (!equals2) {
                    }
                    t0Var = ayVar7.k0;
                    if (t0Var != null) {
                    }
                    org.telegram.ui.Components.cc a022 = org.telegram.ui.Components.cc.a0(ayVar7);
                    fv fvVar2 = new fv(ayVar7, 12);
                    i10 = org.telegram.ui.ActionBar.t6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 9:
                ay ayVar8 = this.b;
                ayVar8.getClass();
                ayVar8.presentFragment(new v50(new Bundle()));
                break;
            case 10:
                ay.d0(this.b);
                break;
            case 11:
                ay ayVar9 = this.b;
                ayVar9.e0[0].a.requestLayout();
                xw xwVar = ayVar9.F3;
                if (xwVar != null && (xwVar.getFragment() instanceof pb1)) {
                    pb1Var = (pb1) ayVar9.F3.getFragment();
                }
                if (pb1Var != null) {
                    pb1Var.E0();
                }
                ayVar9.R3(false);
                ayVar9.d5();
                kx kxVar = ayVar9.C0;
                if (kxVar != null) {
                    kxVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.n5();
                break;
        }
    }
}
