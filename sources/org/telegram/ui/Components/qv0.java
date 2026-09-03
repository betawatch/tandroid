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
import org.telegram.ui.xd1;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv0(int i10, Object obj, boolean z4) {
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
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList = rv0Var.r;
                ov0 ov0Var = rv0Var.n;
                if (ov0Var != null) {
                    ov0Var.G(rv0Var.v0, z4);
                }
                while (r3 < arrayList.size()) {
                    ((ov0) arrayList.get(r3)).G(rv0Var.v0, z4);
                    r3++;
                }
                break;
            case 1:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                break;
            case 2:
                ((w51) obj).P(z4);
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
                af.g.s(((org.telegram.ui.n01) obj).e.getParentActivity(), LocaleController.getString(z4 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 8:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                org.telegram.ui.u21 u21Var = t21Var.P;
                kp kpVar = t21Var.b;
                if (kpVar != null && kpVar.d != null) {
                    t21Var.a(z4, true);
                    if (t21Var.H != null) {
                        t21Var.N = true;
                        u21Var.H = z4;
                        u21Var.d0(u21Var.L, u21Var.G, false);
                    }
                    if (kpVar.d != null) {
                        while (r3 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(r3)).c = z4 ? 1 : 0;
                            ((lp) kpVar.d.get(r3)).e = u21Var.b0(((lp) kpVar.d.get(r3)).a, z4);
                            r3++;
                        }
                        u21Var.r = null;
                        kpVar.l();
                        break;
                    }
                }
                break;
            case 9:
                zd1 zd1Var = (zd1) obj;
                AndroidUtilities.runOnUIThread(new pd1(zd1Var, i11));
                org.telegram.ui.Cells.t1 t1Var = zd1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = zd1Var.H;
                        int O2 = t1Var2.O2(zd1Var.L);
                        xd1 xd1Var = zd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && xd1Var != null && (checkBoxBaseArr = xd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = zd1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = zd1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    zd1Var.Z = null;
                    break;
                }
                break;
            case 10:
                ph.l lVar = (ph.l) obj;
                nr0 nr0Var = lVar.T;
                if (!z4) {
                    nr0Var.b(lVar.a.E);
                    break;
                } else {
                    new ph.o(nr0Var.a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(nr0Var, 2)).show();
                    break;
                }
            case 11:
                qh.w2 w2Var = (qh.w2) obj;
                if (!z4) {
                    w2Var.F.setVisibility(8);
                    break;
                } else {
                    w2Var.getClass();
                    break;
                }
            case 12:
                ((qh.j3) obj).b.setVisibility(z4 ? 0 : 8);
                break;
            case 13:
                qh.a5 a5Var = (qh.a5) obj;
                if (!z4) {
                    a5Var.U0.setVisibility(8);
                    break;
                } else {
                    a5Var.getClass();
                    break;
                }
            case 14:
                qh.j6 j6Var = (qh.j6) obj;
                if (!z4) {
                    j6Var.setVisibility(8);
                    break;
                } else {
                    j6Var.getClass();
                    break;
                }
            case 15:
                qh.e9 e9Var = (qh.e9) obj;
                if (!z4) {
                    e9Var.x2.g1.setVisibility(8);
                    break;
                } else {
                    e9Var.getClass();
                    break;
                }
            default:
                ((th.n0) obj).f(z4, false);
                break;
        }
    }
}
