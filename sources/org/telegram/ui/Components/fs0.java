package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.ee1;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fs0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.a;
        wh.e eVar = null;
        int i11 = 0;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                gs0 gs0Var = (gs0) obj;
                if (!z10) {
                    gs0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    gs0Var.getClass();
                    break;
                }
            case 1:
                ls0 ls0Var = (ls0) obj;
                if (!z10) {
                    ls0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ls0Var.getClass();
                    break;
                }
            case 2:
                mw0 mw0Var = (mw0) obj;
                ArrayList arrayList = mw0Var.r;
                lw0 lw0Var = mw0Var.n;
                if (lw0Var != null) {
                    lw0Var.F(mw0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((lw0) arrayList.get(i11)).F(mw0Var.f, z10);
                    i11++;
                }
                break;
            case 3:
                nw0 nw0Var = (nw0) obj;
                ArrayList arrayList2 = nw0Var.r;
                lw0 lw0Var2 = nw0Var.n;
                if (lw0Var2 != null) {
                    lw0Var2.F(nw0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((lw0) arrayList2.get(i11)).F(nw0Var.y0, z10);
                    i11++;
                }
                break;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 5:
                ((w61) obj).P(z10);
                break;
            case 6:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Y(c00Var.P, z10);
                break;
            case 7:
                org.telegram.ui.ug0 ug0Var = (org.telegram.ui.ug0) obj;
                if (!z10) {
                    ug0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 9:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 10:
                nf.f.s(((org.telegram.ui.s01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 11:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj;
                org.telegram.ui.y21 y21Var = x21Var.S;
                np npVar = x21Var.b;
                if (npVar != null && npVar.d != null) {
                    x21Var.a(z10, true);
                    if (x21Var.K != null) {
                        x21Var.Q = true;
                        y21Var.K = z10;
                        y21Var.d0(y21Var.O, y21Var.J, false);
                    }
                    if (npVar.d != null) {
                        while (i11 < npVar.d.size()) {
                            ((op) npVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((op) npVar.d.get(i11)).e = y21Var.b0(((op) npVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        y21Var.r = null;
                        npVar.l();
                        break;
                    }
                }
                break;
            case 12:
                ee1 ee1Var = (ee1) obj;
                AndroidUtilities.runOnUIThread(new vd1(ee1Var, i12));
                org.telegram.ui.Cells.u1 u1Var = ee1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = ee1Var.K;
                        int O2 = u1Var2.O2(ee1Var.O);
                        ce1 ce1Var = ee1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ce1Var != null && (checkBoxBaseArr = ce1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ee1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ee1Var.c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ee1Var.c0 = null;
                    break;
                }
                break;
            case 13:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.c;
                boolean isEmpty = TextUtils.isEmpty(nVar.t);
                String str = nVar.t;
                nVar.w = true;
                nVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) hg.c.g(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new wh.e(nVar, 1);
                }
                wh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                nVar.v = nVar.i.getImporters(nVar.j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z11));
                break;
            case 14:
                yh.t0 t0Var = (yh.t0) obj;
                if (!z10) {
                    t0Var.q0.setVisibility(8);
                    break;
                } else {
                    t0Var.getClass();
                    break;
                }
            case 15:
                yh.y3 y3Var = (yh.y3) obj;
                y3Var.getClass();
                y3Var.o2(y3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, y3Var.C1())), true);
                break;
            case 16:
                yh.y3 y3Var2 = ((yh.h2) obj).V;
                TL_stars.SavedStarGift H1 = y3Var2.H1(z10);
                if (H1 != null) {
                    y3Var2.b1 = true;
                    y3Var2.j2(H1, y3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = y3Var2.I1(z10);
                    if (I1 != null) {
                        y3Var2.b1 = true;
                        y3Var2.h2(I1.slug, I1, y3Var2.D0);
                    }
                }
                y3Var2.R0 = -1;
                rc rcVar = rc.w;
                if (rcVar != null) {
                    rcVar.c(0L, false);
                    break;
                }
                break;
            default:
                zg.k kVar = (zg.k) obj;
                if (!z10) {
                    kVar.getClass();
                    break;
                } else {
                    ((zg.o) kVar.x.c).v.setVisibility(4);
                    break;
                }
        }
    }
}
