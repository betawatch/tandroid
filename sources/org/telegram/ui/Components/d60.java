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
import org.telegram.ui.bd1;
import org.telegram.ui.id1;
import org.telegram.ui.kd1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                p60 p60Var = ((h60) obj).H0;
                if (!p60Var.k0) {
                    try {
                        p60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(p60Var.h.getParentActivity());
                    p60Var.h0 = z10 ? p60Var.j0 : 0L;
                    p60Var.g0 = System.currentTimeMillis();
                    p60Var.i0 = true;
                    p60Var.w();
                    p60Var.invalidate();
                    NotificationCenter.getInstance(p60Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(p60Var.U), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                bn0 bn0Var = (bn0) obj;
                bn0Var.getClass();
                bn0Var.r(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            case 2:
                ((do0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                bw0 bw0Var = (bw0) obj;
                if (!z10) {
                    bw0Var.o0.setVisibility(8);
                    break;
                } else {
                    bw0Var.getClass();
                    break;
                }
            case 4:
                ws0 ws0Var = (ws0) obj;
                if (!z10) {
                    ws0Var.W.s0.setVisibility(0);
                    break;
                } else {
                    ws0Var.getClass();
                    break;
                }
            case 5:
                at0 at0Var = (at0) obj;
                if (!z10) {
                    at0Var.w.s0.setVisibility(0);
                    break;
                } else {
                    at0Var.getClass();
                    break;
                }
            case 6:
                ww0 ww0Var = (ww0) obj;
                ArrayList arrayList = ww0Var.r;
                vw0 vw0Var = ww0Var.n;
                if (vw0Var != null) {
                    vw0Var.I(ww0Var.f, z10);
                }
                while (r5 < arrayList.size()) {
                    ((vw0) arrayList.get(r5)).I(ww0Var.f, z10);
                    r5++;
                }
                break;
            case 7:
                xw0 xw0Var = (xw0) obj;
                ArrayList arrayList2 = xw0Var.r;
                vw0 vw0Var2 = xw0Var.n;
                if (vw0Var2 != null) {
                    vw0Var2.I(xw0Var.n0, z10);
                }
                while (r5 < arrayList2.size()) {
                    ((vw0) arrayList2.get(r5)).I(xw0Var.n0, z10);
                    r5++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((k71) obj).Q(z10);
                break;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                g5.L(eyVar.getParentActivity(), z10 ? eyVar.getUserConfig().getClientUserId() : -1L, new org.telegram.ui.ix(eyVar), eyVar.getResourceProvider());
                break;
            case 11:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.a0(ozVar.O, z10);
                break;
            case 12:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                if (!z10) {
                    rc0Var.b.setVisibility(8);
                    break;
                } else {
                    rc0Var.getClass();
                    break;
                }
            case 13:
                org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) obj;
                if (!z10) {
                    ig0Var.W.setVisibility(8);
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
                qf.d.r(((org.telegram.ui.l01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 18:
                kd1 kd1Var = (kd1) obj;
                AndroidUtilities.runOnUIThread(new bd1(kd1Var, i11));
                org.telegram.ui.Cells.s1 s1Var = kd1Var.K;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.s1 s1Var2 = kd1Var.K;
                        int O2 = s1Var2.O2(kd1Var.O);
                        id1 id1Var = kd1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && id1Var != null && (checkBoxBaseArr = id1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = kd1Var.K;
                    s1Var3.K7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.sm smVar = kd1Var.c0;
                if (smVar != null) {
                    AndroidUtilities.runOnUIThread(smVar);
                    kd1Var.c0 = null;
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
