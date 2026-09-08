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
import org.telegram.ui.je1;
import org.telegram.ui.le1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mr0(int i10, Object obj, boolean z10) {
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
        xh.e eVar = null;
        int i11 = 0;
        int i12 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                nr0 nr0Var = (nr0) obj;
                if (!z10) {
                    nr0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    nr0Var.getClass();
                    break;
                }
            case 1:
                sr0 sr0Var = (sr0) obj;
                if (!z10) {
                    sr0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    sr0Var.getClass();
                    break;
                }
            case 2:
                ov0 ov0Var = (ov0) obj;
                ArrayList arrayList = ov0Var.r;
                nv0 nv0Var = ov0Var.n;
                if (nv0Var != null) {
                    nv0Var.H(ov0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((nv0) arrayList.get(i11)).H(ov0Var.f, z10);
                    i11++;
                }
                break;
            case 3:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList2 = pv0Var.r;
                nv0 nv0Var2 = pv0Var.n;
                if (nv0Var2 != null) {
                    nv0Var2.H(pv0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((nv0) arrayList2.get(i11)).H(pv0Var.y0, z10);
                    i11++;
                }
                break;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 5:
                ((v51) obj).P(z10);
                break;
            case 6:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z10);
                break;
            case 7:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z10) {
                    wg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.T8;
                    photoViewer.getClass();
                    break;
                }
            case 9:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 10:
                of.f.s(((org.telegram.ui.a11) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 11:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                org.telegram.ui.g31 g31Var = f31Var.S;
                jp jpVar = f31Var.b;
                if (jpVar != null && jpVar.d != null) {
                    f31Var.a(z10, true);
                    if (f31Var.K != null) {
                        f31Var.Q = true;
                        g31Var.K = z10;
                        g31Var.d0(g31Var.O, g31Var.J, false);
                    }
                    if (jpVar.d != null) {
                        while (i11 < jpVar.d.size()) {
                            ((kp) jpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((kp) jpVar.d.get(i11)).e = g31Var.b0(((kp) jpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        g31Var.r = null;
                        jpVar.l();
                        break;
                    }
                }
                break;
            case 12:
                le1 le1Var = (le1) obj;
                AndroidUtilities.runOnUIThread(new ce1(le1Var, i12));
                org.telegram.ui.Cells.t1 t1Var = le1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = le1Var.K;
                        int O2 = t1Var2.O2(le1Var.O);
                        je1 je1Var = le1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && je1Var != null && (checkBoxBaseArr = je1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = le1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.zm zmVar = le1Var.c0;
                if (zmVar != null) {
                    AndroidUtilities.runOnUIThread(zmVar);
                    le1Var.c0 = null;
                    break;
                }
                break;
            case 13:
                xh.n nVar = (xh.n) obj;
                ArrayList arrayList3 = nVar.c;
                boolean isEmpty = TextUtils.isEmpty(nVar.t);
                String str = nVar.t;
                nVar.w = true;
                nVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i2.g.h(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new xh.e(nVar, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                nVar.v = nVar.i.getImporters(nVar.j, str, tL_chatInviteImporter, nVar.d, new xh.f(nVar, isEmpty, eVar2, str, z11));
                break;
            case 14:
                zh.s0 s0Var = (zh.s0) obj;
                if (!z10) {
                    s0Var.q0.setVisibility(8);
                    break;
                } else {
                    s0Var.getClass();
                    break;
                }
            case 15:
                zh.w3 w3Var = (zh.w3) obj;
                w3Var.getClass();
                w3Var.o2(w3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, w3Var.C1())), true);
                break;
            default:
                zh.w3 w3Var2 = ((zh.g2) obj).T;
                TL_stars.SavedStarGift H1 = w3Var2.H1(z10);
                if (H1 != null) {
                    w3Var2.b1 = true;
                    w3Var2.j2(H1, w3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = w3Var2.I1(z10);
                    if (I1 != null) {
                        w3Var2.b1 = true;
                        w3Var2.h2(I1.slug, I1, w3Var2.D0);
                    }
                }
                w3Var2.R0 = -1;
                qc qcVar = qc.w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    break;
                }
                break;
        }
    }
}
