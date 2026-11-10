package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ cv(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
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
        org.telegram.ui.ActionBar.r0 r0Var;
        int i7;
        z91 z91Var = null;
        switch (this.a) {
            case 0:
                zw zwVar = this.b;
                zwVar.M4(false, true);
                if (zwVar.e0 != null) {
                    int i10 = 0;
                    while (true) {
                        yw[] ywVarArr = zwVar.e0;
                        if (i10 >= ywVarArr.length) {
                            break;
                        } else {
                            if (ywVarArr[i10].getVisibility() == 0) {
                                yw ywVar = zwVar.e0[i10];
                                if (!ywVar.d.G) {
                                    ywVar.q(false);
                                }
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 1:
                zw zwVar2 = this.b;
                zwVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zwVar2.Z2);
                zwVar2.presentFragment(new ii.p(bundle));
                break;
            case 2:
                zw.k0(this.b);
                break;
            case 3:
                zw zwVar3 = this.b;
                zwVar3.getClass();
                zwVar3.presentFragment(new o31(null));
                break;
            case 4:
                zw zwVar4 = this.b;
                if (!zwVar4.a3.collapsed_in_dialogs) {
                    zwVar4.getMessagesController().e5(zwVar4.Z2, true);
                    zwVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                zw zwVar5 = this.b;
                if (zwVar5.a3.collapsed_in_dialogs) {
                    zwVar5.getMessagesController().e5(zwVar5.Z2, false);
                    zwVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                zw zwVar6 = this.b;
                zwVar6.getClass();
                zwVar6.presentFragment(new k());
                break;
            case 7:
                this.b.S4();
                break;
            case 8:
                zw zwVar7 = this.b;
                if (!zw.y4) {
                    zw.y4 = true;
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
                        r0Var = zwVar7.k0;
                        if (r0Var != null) {
                            int[] iArr = {(zwVar7.k0.getIconView().getMeasuredWidth() / 2) + r7, (zwVar7.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            r0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(zwVar7);
                        fu fuVar = new fu(zwVar7, 12);
                        i7 = org.telegram.ui.ActionBar.m6.o;
                        if (i7 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i7 == 3 ? org.telegram.messenger.id.M0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.id.M0(2131753790, "AutoNightModeOff"), org.telegram.messenger.id.M0(2131745495, "Settings"), 5000, false, fuVar).j();
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
                    r0Var = zwVar7.k0;
                    if (r0Var != null) {
                    }
                    org.telegram.ui.Components.gc a022 = org.telegram.ui.Components.gc.a0(zwVar7);
                    fu fuVar2 = new fu(zwVar7, 12);
                    i7 = org.telegram.ui.ActionBar.m6.o;
                    if (i7 == 0) {
                    }
                }
                break;
            case 9:
                zw zwVar8 = this.b;
                zwVar8.getClass();
                zwVar8.presentFragment(new z40(new Bundle()));
                break;
            case 10:
                zw.e0(this.b);
                break;
            case 11:
                zw zwVar9 = this.b;
                zwVar9.e0[0].a.requestLayout();
                vv vvVar = zwVar9.G3;
                if (vvVar != null && (vvVar.getFragment() instanceof z91)) {
                    z91Var = (z91) zwVar9.G3.getFragment();
                }
                if (z91Var != null) {
                    z91Var.F0();
                }
                zwVar9.S3(false);
                zwVar9.e5();
                iw iwVar = zwVar9.C0;
                if (iwVar != null) {
                    iwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.o5();
                break;
        }
    }
}
