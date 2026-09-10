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
import org.telegram.ui.ge1;
import org.telegram.ui.ne1;
import org.telegram.ui.pe1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bs0(int i10, Object obj, boolean z10) {
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
        vh.f fVar = null;
        int i11 = 0;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                cs0 cs0Var = (cs0) obj;
                if (!z10) {
                    cs0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    cs0Var.getClass();
                    break;
                }
            case 1:
                aw0 aw0Var = (aw0) obj;
                ArrayList arrayList = aw0Var.r;
                zv0 zv0Var = aw0Var.n;
                if (zv0Var != null) {
                    zv0Var.H(aw0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((zv0) arrayList.get(i11)).H(aw0Var.f, z10);
                    i11++;
                }
                break;
            case 2:
                bw0 bw0Var = (bw0) obj;
                ArrayList arrayList2 = bw0Var.r;
                zv0 zv0Var2 = bw0Var.n;
                if (zv0Var2 != null) {
                    zv0Var2.H(bw0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((zv0) arrayList2.get(i11)).H(bw0Var.y0, z10);
                    i11++;
                }
                break;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 4:
                ((j61) obj).P(z10);
                break;
            case 5:
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) obj;
                e00Var.Z(e00Var.P, z10);
                break;
            case 6:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj;
                if (!z10) {
                    xg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.T8;
                    photoViewer.getClass();
                    break;
                }
            case 8:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 9:
                nf.f.s(((org.telegram.ui.f11) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 10:
                org.telegram.ui.j31 j31Var = (org.telegram.ui.j31) obj;
                org.telegram.ui.k31 k31Var = j31Var.S;
                qp qpVar = j31Var.b;
                if (qpVar != null && qpVar.d != null) {
                    j31Var.a(z10, true);
                    if (j31Var.K != null) {
                        j31Var.Q = true;
                        k31Var.K = z10;
                        k31Var.d0(k31Var.O, k31Var.J, false);
                    }
                    if (qpVar.d != null) {
                        while (i11 < qpVar.d.size()) {
                            ((rp) qpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((rp) qpVar.d.get(i11)).e = k31Var.b0(((rp) qpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        k31Var.r = null;
                        qpVar.l();
                        break;
                    }
                }
                break;
            case 11:
                pe1 pe1Var = (pe1) obj;
                AndroidUtilities.runOnUIThread(new ge1(pe1Var, i12));
                org.telegram.ui.Cells.t1 t1Var = pe1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = pe1Var.K;
                        int O2 = t1Var2.O2(pe1Var.O);
                        ne1 ne1Var = pe1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ne1Var != null && (checkBoxBaseArr = ne1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = pe1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.an anVar = pe1Var.c0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    pe1Var.c0 = null;
                    break;
                }
                break;
            case 12:
                vh.p pVar = (vh.p) obj;
                ArrayList arrayList3 = pVar.c;
                boolean isEmpty = TextUtils.isEmpty(pVar.t);
                String str = pVar.t;
                pVar.w = true;
                pVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) hc.b.i(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    fVar = new vh.f(pVar, 1);
                }
                vh.f fVar2 = fVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(fVar2, 300L);
                }
                pVar.v = pVar.i.getImporters(pVar.j, str, tL_chatInviteImporter, pVar.d, new vh.g(pVar, isEmpty, fVar2, str, z11));
                break;
            case 13:
                xh.s0 s0Var = (xh.s0) obj;
                if (!z10) {
                    s0Var.q0.setVisibility(8);
                    break;
                } else {
                    s0Var.getClass();
                    break;
                }
            case 14:
                xh.x3 x3Var = (xh.x3) obj;
                x3Var.getClass();
                x3Var.o2(x3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, x3Var.C1())), true);
                break;
            case 15:
                xh.x3 x3Var2 = ((xh.h2) obj).T;
                TL_stars.SavedStarGift H1 = x3Var2.H1(z10);
                if (H1 != null) {
                    x3Var2.b1 = true;
                    x3Var2.j2(H1, x3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = x3Var2.I1(z10);
                    if (I1 != null) {
                        x3Var2.b1 = true;
                        x3Var2.h2(I1.slug, I1, x3Var2.D0);
                    }
                }
                x3Var2.R0 = -1;
                pc pcVar = pc.w;
                if (pcVar != null) {
                    pcVar.c(0L, false);
                    break;
                }
                break;
            default:
                yg.o oVar = (yg.o) obj;
                if (!z10) {
                    oVar.getClass();
                    break;
                } else {
                    ((yg.s) oVar.x.c).w.setVisibility(4);
                    break;
                }
        }
    }
}
