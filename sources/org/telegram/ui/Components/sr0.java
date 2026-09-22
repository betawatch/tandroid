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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((w51) obj).P(z10);
                break;
            case 5:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z10);
                break;
            case 6:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z10) {
                    wg0Var.W.setVisibility(8);
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
                nf.f.s(((org.telegram.ui.a11) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 10:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                org.telegram.ui.f31 f31Var = e31Var.S;
                kp kpVar = e31Var.b;
                if (kpVar != null && kpVar.d != null) {
                    e31Var.a(z10, true);
                    if (e31Var.K != null) {
                        e31Var.Q = true;
                        f31Var.K = z10;
                        f31Var.d0(f31Var.O, f31Var.J, false);
                    }
                    if (kpVar.d != null) {
                        while (i11 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i11)).c = z10 ? 1 : 0;
                            ((lp) kpVar.d.get(i11)).e = f31Var.b0(((lp) kpVar.d.get(i11)).a, z10);
                            i11++;
                        }
                        f31Var.r = null;
                        kpVar.l();
                        break;
                    }
                }
                break;
            case 11:
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
                org.telegram.ui.ym ymVar = le1Var.c0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    le1Var.c0 = null;
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
                yh.z3 z3Var = (yh.z3) obj;
                z3Var.getClass();
                z3Var.o2(z3Var.c1, AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, z3Var.C1())), true);
                break;
            case 15:
                yh.z3 z3Var2 = ((yh.i2) obj).T;
                TL_stars.SavedStarGift H1 = z3Var2.H1(z10);
                if (H1 != null) {
                    z3Var2.b1 = true;
                    z3Var2.j2(H1, z3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = z3Var2.I1(z10);
                    if (I1 != null) {
                        z3Var2.b1 = true;
                        z3Var2.h2(I1.slug, I1, z3Var2.D0);
                    }
                }
                z3Var2.R0 = -1;
                oc ocVar = oc.w;
                if (ocVar != null) {
                    ocVar.c(0L, false);
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
