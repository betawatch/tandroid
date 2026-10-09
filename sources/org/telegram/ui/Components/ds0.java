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
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.de1;
import org.telegram.ui.ke1;
import org.telegram.ui.me1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ds0(int i10, Object obj, boolean z10) {
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
                bw0 bw0Var = (bw0) obj;
                if (!z10) {
                    bw0Var.m0.setVisibility(8);
                    break;
                } else {
                    bw0Var.getClass();
                    break;
                }
            case 1:
                rs0 rs0Var = (rs0) obj;
                if (!z10) {
                    rs0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    rs0Var.getClass();
                    break;
                }
            case 2:
                ws0 ws0Var = (ws0) obj;
                if (!z10) {
                    ws0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ws0Var.getClass();
                    break;
                }
            case 3:
                sw0 sw0Var = (sw0) obj;
                ArrayList arrayList = sw0Var.r;
                rw0 rw0Var = sw0Var.n;
                if (rw0Var != null) {
                    rw0Var.H(sw0Var.f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((rw0) arrayList.get(i11)).H(sw0Var.f, z10);
                    i11++;
                }
                break;
            case 4:
                tw0 tw0Var = (tw0) obj;
                ArrayList arrayList2 = tw0Var.r;
                rw0 rw0Var2 = tw0Var.n;
                if (rw0Var2 != null) {
                    rw0Var2.H(tw0Var.y0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((rw0) arrayList2.get(i11)).H(tw0Var.y0, z10);
                    i11++;
                }
                break;
            case 5:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 6:
                ((c71) obj).P(z10);
                break;
            case 7:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z10);
                break;
            case 8:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z10) {
                    wg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 10:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 11:
                of.f.s(((org.telegram.ui.y01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                org.telegram.ui.e31 e31Var = d31Var.S;
                aq aqVar = d31Var.b;
                if (aqVar != null && aqVar.d != null) {
                    d31Var.a(z10, true);
                    if (d31Var.K != null) {
                        d31Var.Q = true;
                        e31Var.K = z10;
                        e31Var.c0(e31Var.O, e31Var.J, false);
                    }
                    if (aqVar.d != null) {
                        while (i11 < aqVar.d.size()) {
                            ((bq) aqVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((bq) aqVar.d.get(i11)).e = e31Var.a0(((bq) aqVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        e31Var.r = null;
                        aqVar.l();
                        break;
                    }
                }
                break;
            case 13:
                me1 me1Var = (me1) obj;
                AndroidUtilities.runOnUIThread(new de1(me1Var, i12));
                org.telegram.ui.Cells.u1 u1Var = me1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = me1Var.K;
                        int O2 = u1Var2.O2(me1Var.O);
                        ke1 ke1Var = me1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ke1Var != null && (checkBoxBaseArr = ke1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = me1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.wm wmVar = me1Var.c0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    me1Var.c0 = null;
                    break;
                }
                break;
            case 14:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 15:
                wh.l lVar = (wh.l) obj;
                ArrayList arrayList3 = lVar.c;
                boolean isEmpty = TextUtils.isEmpty(lVar.t);
                String str = lVar.t;
                lVar.w = true;
                lVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) hg.c.g(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new wh.e(lVar, 1);
                }
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar, 300L);
                }
                lVar.v = lVar.i.getImporters(lVar.j, str, tL_chatInviteImporter, lVar.d, new wh.f(lVar, isEmpty, eVar, str, z11));
                break;
            case 16:
                yh.r0 r0Var = (yh.r0) obj;
                if (!z10) {
                    r0Var.q0.setVisibility(8);
                    break;
                } else {
                    r0Var.getClass();
                    break;
                }
            case 17:
                yh.s3 s3Var = (yh.s3) obj;
                s3Var.getClass();
                s3Var.q2(s3Var.d1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, s3Var.D1())), true);
                break;
            case 18:
                yh.s3 s3Var2 = ((yh.d2) obj).T;
                TL_stars.SavedStarGift I1 = s3Var2.I1(z10);
                if (I1 != null) {
                    s3Var2.c1 = true;
                    s3Var2.l2(I1, s3Var2.E0);
                } else {
                    TL_stars.TL_starGiftUnique J1 = s3Var2.J1(z10);
                    if (J1 != null) {
                        s3Var2.c1 = true;
                        s3Var2.j2(J1.slug, J1, s3Var2.E0);
                    }
                }
                s3Var2.S0 = -1;
                tc tcVar = tc.w;
                if (tcVar != null) {
                    tcVar.c(0L, false);
                    break;
                }
                break;
            default:
                zg.n nVar = (zg.n) obj;
                if (!z10) {
                    nVar.getClass();
                    break;
                } else {
                    ((zg.q) nVar.x.b).w.setVisibility(4);
                    break;
                }
        }
    }
}
