package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gd1;
import org.telegram.ui.id1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d60(int i10, Object obj, boolean z10) {
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
        yh.e eVar = null;
        int i11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                o60 o60Var = ((h60) obj).H0;
                if (!o60Var.l0) {
                    try {
                        o60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(o60Var.n.getParentActivity());
                    o60Var.i0 = z10 ? o60Var.k0 : 0L;
                    o60Var.h0 = System.currentTimeMillis();
                    o60Var.j0 = true;
                    o60Var.v();
                    o60Var.invalidate();
                    NotificationCenter.getInstance(o60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                an0 an0Var = (an0) obj;
                an0Var.getClass();
                an0Var.m(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            case 2:
                ((co0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                aw0 aw0Var = (aw0) obj;
                if (!z10) {
                    aw0Var.o0.setVisibility(8);
                    break;
                } else {
                    aw0Var.getClass();
                    break;
                }
            case 4:
                vs0 vs0Var = (vs0) obj;
                if (!z10) {
                    vs0Var.W.s0.setVisibility(0);
                    break;
                } else {
                    vs0Var.getClass();
                    break;
                }
            case 5:
                zs0 zs0Var = (zs0) obj;
                if (!z10) {
                    zs0Var.w.s0.setVisibility(0);
                    break;
                } else {
                    zs0Var.getClass();
                    break;
                }
            case 6:
                vw0 vw0Var = (vw0) obj;
                ArrayList arrayList = vw0Var.r;
                uw0 uw0Var = vw0Var.n;
                if (uw0Var != null) {
                    uw0Var.I(vw0Var.f, z10);
                }
                while (r5 < arrayList.size()) {
                    ((uw0) arrayList.get(r5)).I(vw0Var.f, z10);
                    r5++;
                }
                break;
            case 7:
                ww0 ww0Var = (ww0) obj;
                ArrayList arrayList2 = ww0Var.r;
                uw0 uw0Var2 = ww0Var.n;
                if (uw0Var2 != null) {
                    uw0Var2.I(ww0Var.n0, z10);
                }
                while (r5 < arrayList2.size()) {
                    ((uw0) arrayList2.get(r5)).I(ww0Var.n0, z10);
                    r5++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((j71) obj).Q(z10);
                break;
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                g5.L(cyVar.getParentActivity(), z10 ? cyVar.getUserConfig().getClientUserId() : -1L, new org.telegram.ui.fx(cyVar), cyVar.getResourceProvider());
                break;
            case 11:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.a0(lzVar.O, z10);
                break;
            case 12:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                if (!z10) {
                    pc0Var.b.setVisibility(8);
                    break;
                } else {
                    pc0Var.getClass();
                    break;
                }
            case 13:
                org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) obj;
                if (!z10) {
                    gg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 15:
                int i12 = ProfileActivity.R6;
                ((ProfileActivity) obj).p5(z10, true);
                break;
            case 16:
                ((FrameLayout) obj).setVisibility(z10 ? 4 : 0);
                break;
            case 17:
                qf.d.r(((org.telegram.ui.j01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 18:
                id1 id1Var = (id1) obj;
                AndroidUtilities.runOnUIThread(new yc1(id1Var, i11));
                org.telegram.ui.Cells.s1 s1Var = id1Var.K;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.s1 s1Var2 = id1Var.K;
                        int O2 = s1Var2.O2(id1Var.O);
                        gd1 gd1Var = id1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && gd1Var != null && (checkBoxBaseArr = gd1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = id1Var.K;
                    s1Var3.K7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.qm qmVar = id1Var.c0;
                if (qmVar != null) {
                    AndroidUtilities.runOnUIThread(qmVar);
                    id1Var.c0 = null;
                    break;
                }
                break;
            case 19:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 20:
                vi.j jVar = (vi.j) obj;
                jVar.P = z10;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.j.b("torch requested: enabled=" + z10 + ", available=" + jVar.F() + ", cameraId=" + jVar.o + ", facing=" + jVar.G);
                jVar.g();
                break;
            default:
                yh.k kVar = (yh.k) obj;
                ArrayList arrayList3 = kVar.c;
                boolean isEmpty = TextUtils.isEmpty(kVar.t);
                String str = kVar.t;
                kVar.w = true;
                kVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) ic.a.g(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new yh.e(kVar, 1);
                }
                yh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar.v = kVar.i.getImporters(kVar.j, str, tL_chatInviteImporter, kVar.d, new bi.s4(kVar, isEmpty, eVar2, str, z11));
                break;
        }
    }
}
