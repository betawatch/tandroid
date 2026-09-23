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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sr0(int i10, Object obj, boolean z10) {
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
                tr0 tr0Var = (tr0) obj;
                if (!z10) {
                    tr0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    tr0Var.getClass();
                    break;
                }
            case 1:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList = pv0Var.r;
                ov0 ov0Var = pv0Var.n;
                if (ov0Var != null) {
                    ov0Var.H(pv0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((ov0) arrayList.get(i11)).H(pv0Var.f, z10);
                    i11++;
                }
                break;
            case 2:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList2 = qv0Var.r;
                ov0 ov0Var2 = qv0Var.n;
                if (ov0Var2 != null) {
                    ov0Var2.H(qv0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((ov0) arrayList2.get(i11)).H(qv0Var.y0, z10);
                    i11++;
                }
                break;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 4:
                ((v51) obj).P(z10);
                break;
            case 5:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) obj;
                zzVar.Z(zzVar.P, z10);
                break;
            case 6:
                org.telegram.ui.rg0 rg0Var = (org.telegram.ui.rg0) obj;
                if (!z10) {
                    rg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 8:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 9:
                nf.f.s(((org.telegram.ui.s01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 10:
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj;
                org.telegram.ui.x21 x21Var = w21Var.S;
                lp lpVar = w21Var.b;
                if (lpVar != null && lpVar.d != null) {
                    w21Var.a(z10, true);
                    if (w21Var.K != null) {
                        w21Var.Q = true;
                        x21Var.K = z10;
                        x21Var.d0(x21Var.O, x21Var.J, false);
                    }
                    if (lpVar.d != null) {
                        while (i11 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((mp) lpVar.d.get(i11)).e = x21Var.b0(((mp) lpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        x21Var.r = null;
                        lpVar.l();
                        break;
                    }
                }
                break;
            case 11:
                de1 de1Var = (de1) obj;
                AndroidUtilities.runOnUIThread(new ud1(de1Var, i12));
                org.telegram.ui.Cells.t1 t1Var = de1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = de1Var.K;
                        int O2 = t1Var2.O2(de1Var.O);
                        be1 be1Var = de1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
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
                    org.telegram.ui.Cells.t1 t1Var3 = de1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = de1Var.c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    de1Var.c0 = null;
                    break;
                }
                break;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.c;
                boolean isEmpty = TextUtils.isEmpty(nVar.t);
                String str = nVar.t;
                nVar.w = true;
                nVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) hg.c.h(1, arrayList3);
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
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z10) {
                    s0Var.q0.setVisibility(8);
                    break;
                } else {
                    s0Var.getClass();
                    break;
                }
            case 14:
                yh.y3 y3Var = (yh.y3) obj;
                y3Var.getClass();
                y3Var.o2(y3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, y3Var.C1())), true);
                break;
            case 15:
                yh.y3 y3Var2 = ((yh.h2) obj).T;
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
