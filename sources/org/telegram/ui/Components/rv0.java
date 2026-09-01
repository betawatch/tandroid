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
import org.telegram.ui.kd1;
import org.telegram.ui.sd1;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv0(int i10, Object obj, boolean z4) {
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
                sv0 sv0Var = (sv0) obj;
                ArrayList arrayList = sv0Var.r;
                pv0 pv0Var = sv0Var.n;
                if (pv0Var != null) {
                    pv0Var.G(sv0Var.v0, z4);
                }
                while (r3 < arrayList.size()) {
                    ((pv0) arrayList.get(r3)).G(sv0Var.v0, z4);
                    r3++;
                }
                break;
            case 1:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                break;
            case 2:
                ((x51) obj).P(z4);
                break;
            case 3:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) obj;
                zzVar.Z(zzVar.M, z4);
                break;
            case 4:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) obj;
                if (!z4) {
                    og0Var.T.setVisibility(8);
                    break;
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z4) {
                    photoViewer.S0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.Q8;
                    photoViewer.getClass();
                    break;
                }
            case 6:
                ((ProfileActivity) obj).e5(z4, true);
                break;
            case 7:
                af.g.s(((org.telegram.ui.i01) obj).e.getParentActivity(), LocaleController.getString(z4 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 8:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                org.telegram.ui.o21 o21Var = n21Var.P;
                kp kpVar = n21Var.b;
                if (kpVar != null && kpVar.d != null) {
                    n21Var.a(z4, true);
                    if (n21Var.H != null) {
                        n21Var.N = true;
                        o21Var.H = z4;
                        o21Var.d0(o21Var.L, o21Var.G, false);
                    }
                    if (kpVar.d != null) {
                        while (r3 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(r3)).c = z4 ? 1 : 0;
                            ((lp) kpVar.d.get(r3)).e = o21Var.b0(((lp) kpVar.d.get(r3)).a, z4);
                            r3++;
                        }
                        o21Var.r = null;
                        kpVar.l();
                        break;
                    }
                }
                break;
            case 9:
                ud1 ud1Var = (ud1) obj;
                AndroidUtilities.runOnUIThread(new kd1(ud1Var, i11));
                org.telegram.ui.Cells.t1 t1Var = ud1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = ud1Var.H;
                        int O2 = t1Var2.O2(ud1Var.L);
                        sd1 sd1Var = ud1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && sd1Var != null && (checkBoxBaseArr = sd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = ud1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ud1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ud1Var.Z = null;
                    break;
                }
                break;
            case 10:
                ph.l lVar = (ph.l) obj;
                or0 or0Var = lVar.T;
                if (!z4) {
                    or0Var.b(lVar.a.E);
                    break;
                } else {
                    new ph.o(or0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(or0Var, 2)).show();
                    break;
                }
            case 11:
                qh.x2 x2Var = (qh.x2) obj;
                if (!z4) {
                    x2Var.F.setVisibility(8);
                    break;
                } else {
                    x2Var.getClass();
                    break;
                }
            case 12:
                ((qh.k3) obj).b.setVisibility(z4 ? 0 : 8);
                break;
            case 13:
                qh.b5 b5Var = (qh.b5) obj;
                if (!z4) {
                    b5Var.U0.setVisibility(8);
                    break;
                } else {
                    b5Var.getClass();
                    break;
                }
            case 14:
                qh.l6 l6Var = (qh.l6) obj;
                if (!z4) {
                    l6Var.setVisibility(8);
                    break;
                } else {
                    l6Var.getClass();
                    break;
                }
            case 15:
                qh.f9 f9Var = (qh.f9) obj;
                if (!z4) {
                    f9Var.x2.g1.setVisibility(8);
                    break;
                } else {
                    f9Var.getClass();
                    break;
                }
            default:
                ((th.n0) obj).f(z4, false);
                break;
        }
    }
}
