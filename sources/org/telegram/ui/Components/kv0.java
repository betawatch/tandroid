package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pd1;
import org.telegram.ui.wd1;
import org.telegram.ui.yd1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv0(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.a;
        int i11 = 1;
        boolean z4 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList = qv0Var.r;
                pv0 pv0Var = qv0Var.n;
                if (pv0Var != null) {
                    pv0Var.G(qv0Var.f, z4);
                }
                while (r3 < arrayList.size()) {
                    ((pv0) arrayList.get(r3)).G(qv0Var.f, z4);
                    r3++;
                }
                break;
            case 1:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList2 = rv0Var.r;
                pv0 pv0Var2 = rv0Var.n;
                if (pv0Var2 != null) {
                    pv0Var2.G(rv0Var.v0, z4);
                }
                while (r3 < arrayList2.size()) {
                    ((pv0) arrayList2.get(r3)).G(rv0Var.v0, z4);
                    r3++;
                }
                break;
            case 2:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                break;
            case 3:
                ((w51) obj).P(z4);
                break;
            case 4:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) obj;
                a00Var.Z(a00Var.M, z4);
                break;
            case 5:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                if (!z4) {
                    pg0Var.T.setVisibility(8);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z4) {
                    photoViewer.S0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    photoViewer.getClass();
                    break;
                }
            case 7:
                ((ProfileActivity) obj).e5(z4, true);
                break;
            case 8:
                ze.d.s(((org.telegram.ui.n01) obj).e.getParentActivity(), LocaleController.getString(z4 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 9:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                org.telegram.ui.u21 u21Var = t21Var.P;
                hp hpVar = t21Var.b;
                if (hpVar != null && hpVar.d != null) {
                    t21Var.a(z4, true);
                    if (t21Var.H != null) {
                        t21Var.N = true;
                        u21Var.H = z4;
                        u21Var.d0(u21Var.L, u21Var.G, false);
                    }
                    if (hpVar.d != null) {
                        while (r3 < hpVar.d.size()) {
                            ((ip) hpVar.d.get(r3)).c = z4 ? 1 : 0;
                            ((ip) hpVar.d.get(r3)).e = u21Var.b0(((ip) hpVar.d.get(r3)).a, z4);
                            r3++;
                        }
                        u21Var.r = null;
                        hpVar.l();
                        break;
                    }
                }
                break;
            case 10:
                yd1 yd1Var = (yd1) obj;
                AndroidUtilities.runOnUIThread(new pd1(yd1Var, i11));
                org.telegram.ui.Cells.s1 s1Var = yd1Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.s1 s1Var2 = yd1Var.H;
                        int O2 = s1Var2.O2(yd1Var.L);
                        wd1 wd1Var = yd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && wd1Var != null && (checkBoxBaseArr = wd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = yd1Var.H;
                    s1Var3.H7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.wm wmVar = yd1Var.Z;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    yd1Var.Z = null;
                    break;
                }
                break;
            case 11:
                ph.x2 x2Var = (ph.x2) obj;
                if (!z4) {
                    x2Var.F.setVisibility(8);
                    break;
                } else {
                    x2Var.getClass();
                    break;
                }
            case 12:
                ((ph.k3) obj).b.setVisibility(z4 ? 0 : 8);
                break;
            case 13:
                ph.c5 c5Var = (ph.c5) obj;
                if (!z4) {
                    c5Var.U0.setVisibility(8);
                    break;
                } else {
                    c5Var.getClass();
                    break;
                }
            case 14:
                ph.m6 m6Var = (ph.m6) obj;
                if (!z4) {
                    m6Var.setVisibility(8);
                    break;
                } else {
                    m6Var.getClass();
                    break;
                }
            case 15:
                ph.h9 h9Var = (ph.h9) obj;
                if (!z4) {
                    h9Var.x2.g1.setVisibility(8);
                    break;
                } else {
                    h9Var.getClass();
                    break;
                }
            default:
                ((sh.n0) obj).f(z4, false);
                break;
        }
    }
}
