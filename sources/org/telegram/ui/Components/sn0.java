package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ie1;
import org.telegram.ui.qe1;
import org.telegram.ui.se1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sn0(int i10, Object obj, boolean z10) {
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
                ((yn0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 1:
                xv0 xv0Var = (xv0) obj;
                if (!z10) {
                    xv0Var.m0.setVisibility(8);
                    break;
                } else {
                    xv0Var.getClass();
                    break;
                }
            case 2:
                ns0 ns0Var = (ns0) obj;
                if (!z10) {
                    ns0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    ns0Var.getClass();
                    break;
                }
            case 3:
                ss0 ss0Var = (ss0) obj;
                if (!z10) {
                    ss0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ss0Var.getClass();
                    break;
                }
            case 4:
                ow0 ow0Var = (ow0) obj;
                ArrayList arrayList = ow0Var.r;
                nw0 nw0Var = ow0Var.n;
                if (nw0Var != null) {
                    nw0Var.H(ow0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((nw0) arrayList.get(i11)).H(ow0Var.f, z10);
                    i11++;
                }
                break;
            case 5:
                pw0 pw0Var = (pw0) obj;
                ArrayList arrayList2 = pw0Var.r;
                nw0 nw0Var2 = pw0Var.n;
                if (nw0Var2 != null) {
                    nw0Var2.H(pw0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((nw0) arrayList2.get(i11)).H(pw0Var.y0, z10);
                    i11++;
                }
                break;
            case 6:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 7:
                ((z61) obj).P(z10);
                break;
            case 8:
                org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) obj;
                h00Var.Z(h00Var.P, z10);
                break;
            case 9:
                org.telegram.ui.bh0 bh0Var = (org.telegram.ui.bh0) obj;
                if (!z10) {
                    bh0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 11:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 12:
                pf.d.s(((org.telegram.ui.f11) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 13:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj;
                org.telegram.ui.l31 l31Var = k31Var.S;
                xp xpVar = k31Var.b;
                if (xpVar != null && xpVar.d != null) {
                    k31Var.a(z10, true);
                    if (k31Var.K != null) {
                        k31Var.Q = true;
                        l31Var.K = z10;
                        l31Var.c0(l31Var.O, l31Var.J, false);
                    }
                    if (xpVar.d != null) {
                        while (i11 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((yp) xpVar.d.get(i11)).e = l31Var.a0(((yp) xpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        l31Var.r = null;
                        xpVar.l();
                        break;
                    }
                }
                break;
            case 14:
                se1 se1Var = (se1) obj;
                AndroidUtilities.runOnUIThread(new ie1(se1Var, i12));
                org.telegram.ui.Cells.u1 u1Var = se1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = se1Var.K;
                        int O2 = u1Var2.O2(se1Var.O);
                        qe1 qe1Var = se1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && qe1Var != null && (checkBoxBaseArr = qe1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = se1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.bn bnVar = se1Var.c0;
                if (bnVar != null) {
                    AndroidUtilities.runOnUIThread(bnVar);
                    se1Var.c0 = null;
                    break;
                }
                break;
            case 15:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 16:
                xh.l lVar = (xh.l) obj;
                ArrayList arrayList3 = lVar.c;
                boolean isEmpty = TextUtils.isEmpty(lVar.t);
                String str = lVar.t;
                lVar.w = true;
                lVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i2.d.g(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new xh.e(lVar, 1);
                }
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar, 300L);
                }
                lVar.v = lVar.i.getImporters(lVar.j, str, tL_chatInviteImporter, lVar.d, new xh.f(lVar, isEmpty, eVar, str, z11));
                break;
            case 17:
                zh.r0 r0Var = (zh.r0) obj;
                if (!z10) {
                    r0Var.q0.setVisibility(8);
                    break;
                } else {
                    r0Var.getClass();
                    break;
                }
            case 18:
                zh.r3 r3Var = (zh.r3) obj;
                r3Var.getClass();
                r3Var.q2(r3Var.d1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, r3Var.D1())), true);
                break;
            default:
                zh.r3 r3Var2 = ((zh.c2) obj).T;
                TL_stars.SavedStarGift I1 = r3Var2.I1(z10);
                if (I1 != null) {
                    r3Var2.c1 = true;
                    r3Var2.l2(I1, r3Var2.E0);
                } else {
                    TL_stars.TL_starGiftUnique J1 = r3Var2.J1(z10);
                    if (J1 != null) {
                        r3Var2.c1 = true;
                        r3Var2.j2(J1.slug, J1, r3Var2.E0);
                    }
                }
                r3Var2.S0 = -1;
                sc scVar = sc.w;
                if (scVar != null) {
                    scVar.c(0L, false);
                    break;
                }
                break;
        }
    }
}
