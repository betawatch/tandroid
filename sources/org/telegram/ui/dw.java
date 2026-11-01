package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ dw(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
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
        nb1 nb1Var = null;
        switch (this.a) {
            case 0:
                zx zxVar = this.b;
                zxVar.M4(false, true);
                if (zxVar.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        yx[] yxVarArr = zxVar.e0;
                        if (i11 >= yxVarArr.length) {
                            break;
                        } else {
                            if (yxVarArr[i11].getVisibility() == 0) {
                                yx yxVar = zxVar.e0[i11];
                                if (!yxVar.d.G) {
                                    yxVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 1:
                zx zxVar2 = this.b;
                zxVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zxVar2.Y2);
                zxVar2.presentFragment(new yh.l(bundle));
                break;
            case 2:
                zx.k0(this.b);
                break;
            case 3:
                zx zxVar3 = this.b;
                zxVar3.getClass();
                zxVar3.presentFragment(new c51(null));
                break;
            case 4:
                zx zxVar4 = this.b;
                if (!zxVar4.Z2.collapsed_in_dialogs) {
                    zxVar4.getMessagesController().b5(zxVar4.Y2, true);
                    zxVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                zx zxVar5 = this.b;
                if (zxVar5.Z2.collapsed_in_dialogs) {
                    zxVar5.getMessagesController().b5(zxVar5.Y2, false);
                    zxVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                zx zxVar6 = this.b;
                zxVar6.getClass();
                zxVar6.presentFragment(new j());
                break;
            case 7:
                this.b.S4();
                break;
            case 8:
                zx zxVar7 = this.b;
                if (!zx.x4) {
                    zx.x4 = true;
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
                        t0Var = zxVar7.k0;
                        if (t0Var != null) {
                            int[] iArr = {(zxVar7.k0.getIconView().getMeasuredWidth() / 2) + r7, (zxVar7.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            t0Var.getLocationInWindow(iArr);
                            int i12 = iArr[0];
                            int i13 = iArr[1];
                            org.telegram.messenger.at.e().k(org.telegram.messenger.at.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(zxVar7);
                        ev evVar = new ev(zxVar7, 12);
                        i10 = org.telegram.ui.ActionBar.t6.o;
                        if (i10 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i10 == 3 ? org.telegram.messenger.dd.L0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.dd.L0(2131753790, "AutoNightModeOff"), org.telegram.messenger.dd.L0(2131745512, "Settings"), 5000, false, evVar).j();
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
                    t0Var = zxVar7.k0;
                    if (t0Var != null) {
                    }
                    org.telegram.ui.Components.cc a022 = org.telegram.ui.Components.cc.a0(zxVar7);
                    ev evVar2 = new ev(zxVar7, 12);
                    i10 = org.telegram.ui.ActionBar.t6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 9:
                zx zxVar8 = this.b;
                zxVar8.getClass();
                zxVar8.presentFragment(new u50(new Bundle()));
                break;
            case 10:
                zx.e0(this.b);
                break;
            case 11:
                zx zxVar9 = this.b;
                zxVar9.e0[0].a.requestLayout();
                ww wwVar = zxVar9.F3;
                if (wwVar != null && (wwVar.getFragment() instanceof nb1)) {
                    nb1Var = (nb1) zxVar9.F3.getFragment();
                }
                if (nb1Var != null) {
                    nb1Var.F0();
                }
                zxVar9.S3(false);
                zxVar9.e5();
                jx jxVar = zxVar9.C0;
                if (jxVar != null) {
                    jxVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.o5();
                break;
        }
    }
}
