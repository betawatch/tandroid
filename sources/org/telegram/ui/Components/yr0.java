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
import org.telegram.ui.be1;
import org.telegram.ui.de1;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yr0(int i10, Object obj, boolean z10) {
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
                zr0 zr0Var = (zr0) obj;
                if (!z10) {
                    zr0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    zr0Var.getClass();
                    break;
                }
            case 1:
                es0 es0Var = (es0) obj;
                if (!z10) {
                    es0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    es0Var.getClass();
                    break;
                }
            case 2:
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
            case 3:
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
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 5:
                ((j61) obj).P(z10);
                break;
            case 6:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj;
                yzVar.Z(yzVar.P, z10);
                break;
            case 7:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj;
                if (!z10) {
                    qg0Var.W.setVisibility(8);
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
                nf.f.s(((org.telegram.ui.q01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 11:
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                org.telegram.ui.w21 w21Var = v21Var.S;
                lp lpVar = v21Var.b;
                if (lpVar != null && lpVar.d != null) {
                    v21Var.a(z10, true);
                    if (v21Var.K != null) {
                        v21Var.Q = true;
                        w21Var.K = z10;
                        w21Var.d0(w21Var.O, w21Var.J, false);
                    }
                    if (lpVar.d != null) {
                        while (i11 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((mp) lpVar.d.get(i11)).e = w21Var.b0(((mp) lpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        w21Var.r = null;
                        lpVar.l();
                        break;
                    }
                }
                break;
            case 12:
                de1 de1Var = (de1) obj;
                AndroidUtilities.runOnUIThread(new ud1(de1Var, i12));
                org.telegram.ui.Cells.u1 u1Var = de1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = de1Var.K;
                        int O2 = u1Var2.O2(de1Var.O);
                        be1 be1Var = de1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && be1Var != null && (checkBoxBaseArr = be1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = de1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.tm tmVar = de1Var.c0;
                if (tmVar != null) {
                    AndroidUtilities.runOnUIThread(tmVar);
                    de1Var.c0 = null;
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
                yh.s0 s0Var = (yh.s0) obj;
                if (!z10) {
                    s0Var.q0.setVisibility(8);
                    break;
                } else {
                    s0Var.getClass();
                    break;
                }
            case 15:
                yh.x3 x3Var = (yh.x3) obj;
                x3Var.getClass();
                x3Var.o2(x3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, x3Var.C1())), true);
                break;
            case 16:
                yh.x3 x3Var2 = ((yh.g2) obj).T;
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
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    break;
                }
                break;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (!z10) {
                    nVar2.getClass();
                    break;
                } else {
                    ((zg.q) nVar2.x.c).w.setVisibility(4);
                    break;
                }
        }
    }
}
