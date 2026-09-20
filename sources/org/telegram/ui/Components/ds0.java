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
import org.telegram.ui.de1;
import org.telegram.ui.ke1;
import org.telegram.ui.me1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                es0 es0Var = (es0) obj;
                if (!z10) {
                    es0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    es0Var.getClass();
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
                ((k61) obj).P(z10);
                break;
            case 5:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z10);
                break;
            case 6:
                org.telegram.ui.yg0 yg0Var = (org.telegram.ui.yg0) obj;
                if (!z10) {
                    yg0Var.W.setVisibility(8);
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
                nf.f.s(((org.telegram.ui.z01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
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
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.c;
                boolean isEmpty = TextUtils.isEmpty(nVar.t);
                String str = nVar.t;
                nVar.w = true;
                nVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) hg.k0.g(1, arrayList3);
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
                yh.y3 y3Var2 = ((yh.h2) obj).U;
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
                pc pcVar = pc.w;
                if (pcVar != null) {
                    pcVar.c(0L, false);
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
