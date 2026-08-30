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
import org.telegram.ui.id1;
import org.telegram.ui.pd1;
import org.telegram.ui.rd1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj;
                yzVar.Z(yzVar.M, z4);
                break;
            case 5:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) obj;
                if (!z4) {
                    ng0Var.T.setVisibility(8);
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
                af.g.s(((org.telegram.ui.g01) obj).e.getParentActivity(), LocaleController.getString(z4 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 9:
                org.telegram.ui.l21 l21Var = (org.telegram.ui.l21) obj;
                org.telegram.ui.m21 m21Var = l21Var.P;
                ip ipVar = l21Var.b;
                if (ipVar != null && ipVar.d != null) {
                    l21Var.a(z4, true);
                    if (l21Var.H != null) {
                        l21Var.N = true;
                        m21Var.H = z4;
                        m21Var.d0(m21Var.L, m21Var.G, false);
                    }
                    if (ipVar.d != null) {
                        while (r3 < ipVar.d.size()) {
                            ((jp) ipVar.d.get(r3)).c = z4 ? 1 : 0;
                            ((jp) ipVar.d.get(r3)).e = m21Var.b0(((jp) ipVar.d.get(r3)).a, z4);
                            r3++;
                        }
                        m21Var.r = null;
                        ipVar.l();
                        break;
                    }
                }
                break;
            case 10:
                rd1 rd1Var = (rd1) obj;
                AndroidUtilities.runOnUIThread(new id1(rd1Var, i11));
                org.telegram.ui.Cells.t1 t1Var = rd1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = rd1Var.H;
                        int O2 = t1Var2.O2(rd1Var.L);
                        pd1 pd1Var = rd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && pd1Var != null && (checkBoxBaseArr = pd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = rd1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = rd1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    rd1Var.Z = null;
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
                ph.n6 n6Var = (ph.n6) obj;
                if (!z4) {
                    n6Var.setVisibility(8);
                    break;
                } else {
                    n6Var.getClass();
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
                ((sh.o0) obj).f(z4, false);
                break;
        }
    }
}
