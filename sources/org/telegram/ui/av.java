package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class av implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ av(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
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
        org.telegram.ui.ActionBar.q0 q0Var;
        int i7;
        u91 u91Var = null;
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                ywVar.M4(false, true);
                if (ywVar.f0 != null) {
                    int i10 = 0;
                    while (true) {
                        xw[] xwVarArr = ywVar.f0;
                        if (i10 >= xwVarArr.length) {
                            break;
                        } else {
                            if (xwVarArr[i10].getVisibility() == 0) {
                                xw xwVar = ywVar.f0[i10];
                                if (!xwVar.d.H) {
                                    xwVar.q(false);
                                }
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 1:
                yw ywVar2 = this.b;
                ywVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ywVar2.a3);
                ywVar2.presentFragment(new li.n(bundle));
                break;
            case 2:
                yw.k0(this.b);
                break;
            case 3:
                yw ywVar3 = this.b;
                ywVar3.getClass();
                ywVar3.presentFragment(new k31(null));
                break;
            case 4:
                yw ywVar4 = this.b;
                if (!ywVar4.b3.collapsed_in_dialogs) {
                    ywVar4.getMessagesController().f5(ywVar4.a3, true);
                    ywVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                yw ywVar5 = this.b;
                if (ywVar5.b3.collapsed_in_dialogs) {
                    ywVar5.getMessagesController().f5(ywVar5.a3, false);
                    ywVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                yw ywVar6 = this.b;
                ywVar6.getClass();
                ywVar6.presentFragment(new k());
                break;
            case 7:
                this.b.S4();
                break;
            case 8:
                yw ywVar7 = this.b;
                if (!yw.z4) {
                    yw.z4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.j6.Q0(string) == null || org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.j6.Q0(string2) == null || !org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(i6Var.m());
                        org.telegram.ui.ActionBar.i6 Q0 = !equals ? org.telegram.ui.ActionBar.j6.Q0(str2) : org.telegram.ui.ActionBar.j6.Q0(str);
                        q0Var = ywVar7.l0;
                        if (q0Var != null) {
                            int[] iArr = {(ywVar7.l0.getIconView().getMeasuredWidth() / 2) + r7, (ywVar7.l0.getIconView().getMeasuredHeight() / 2) + r7};
                            q0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(ywVar7);
                        eu euVar = new eu(ywVar7, 12);
                        i7 = org.telegram.ui.ActionBar.j6.o;
                        if (i7 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i7 == 3 ? org.telegram.messenger.hd.M0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.hd.M0(2131753790, "AutoNightModeOff"), org.telegram.messenger.hd.M0(2131745495, "Settings"), 5000, false, euVar).j();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            org.telegram.ui.ActionBar.j6.o = 0;
                            org.telegram.ui.ActionBar.j6.w1();
                            org.telegram.ui.ActionBar.j6.B();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(i6Var.m());
                    if (!equals2) {
                    }
                    q0Var = ywVar7.l0;
                    if (q0Var != null) {
                    }
                    org.telegram.ui.Components.cc a022 = org.telegram.ui.Components.cc.a0(ywVar7);
                    eu euVar2 = new eu(ywVar7, 12);
                    i7 = org.telegram.ui.ActionBar.j6.o;
                    if (i7 == 0) {
                    }
                }
                break;
            case 9:
                yw ywVar8 = this.b;
                ywVar8.getClass();
                ywVar8.presentFragment(new w40(new Bundle()));
                break;
            case 10:
                yw.e0(this.b);
                break;
            case 11:
                yw ywVar9 = this.b;
                ywVar9.f0[0].a.requestLayout();
                uv uvVar = ywVar9.H3;
                if (uvVar != null && (uvVar.getFragment() instanceof u91)) {
                    u91Var = (u91) ywVar9.H3.getFragment();
                }
                if (u91Var != null) {
                    u91Var.F0();
                }
                ywVar9.S3(false);
                ywVar9.e5();
                hw hwVar = ywVar9.D0;
                if (hwVar != null) {
                    hwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.o5();
                break;
        }
    }
}
