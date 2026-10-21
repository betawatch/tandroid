package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
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
import org.telegram.ui.pc1;
import org.telegram.ui.wc1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b60(int i10, Object obj, boolean z10) {
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
        int i11 = 1;
        int i12 = 0;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                m60 m60Var = ((f60) obj).H0;
                if (!m60Var.l0) {
                    try {
                        m60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(m60Var.n.getParentActivity());
                    m60Var.i0 = z10 ? m60Var.k0 : 0L;
                    m60Var.h0 = System.currentTimeMillis();
                    m60Var.j0 = true;
                    m60Var.v();
                    m60Var.invalidate();
                    NotificationCenter.getInstance(m60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(m60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                wa0 wa0Var = (wa0) obj;
                if (!z10) {
                    wa0Var.getClass();
                    break;
                } else {
                    wa0Var.G.setVisibility(8);
                    break;
                }
            case 2:
                ((un0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                uv0 uv0Var = (uv0) obj;
                if (!z10) {
                    uv0Var.m0.setVisibility(8);
                    break;
                } else {
                    uv0Var.getClass();
                    break;
                }
            case 4:
                ks0 ks0Var = (ks0) obj;
                if (!z10) {
                    ks0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    ks0Var.getClass();
                    break;
                }
            case 5:
                ps0 ps0Var = (ps0) obj;
                if (!z10) {
                    ps0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ps0Var.getClass();
                    break;
                }
            case 6:
                lw0 lw0Var = (lw0) obj;
                ArrayList arrayList = lw0Var.r;
                kw0 kw0Var = lw0Var.n;
                if (kw0Var != null) {
                    kw0Var.G(lw0Var.f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((kw0) arrayList.get(i12)).G(lw0Var.f, z10);
                    i12++;
                }
                break;
            case 7:
                mw0 mw0Var = (mw0) obj;
                ArrayList arrayList2 = mw0Var.r;
                kw0 kw0Var2 = mw0Var.n;
                if (kw0Var2 != null) {
                    kw0Var2.G(mw0Var.y0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((kw0) arrayList2.get(i12)).G(mw0Var.y0, z10);
                    i12++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((u61) obj).P(z10);
                break;
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                f5.L(cyVar.getParentActivity(), z10 ? cyVar.getUserConfig().getClientUserId() : -1L, new org.telegram.ui.jx(cyVar), cyVar.getResourceProvider());
                break;
            case 11:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.Z(lzVar.P, z10);
                break;
            case 12:
                org.telegram.ui.dg0 dg0Var = (org.telegram.ui.dg0) obj;
                if (!z10) {
                    dg0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
            case 14:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 15:
                pf.d.r(((org.telegram.ui.b01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 16:
                yc1 yc1Var = (yc1) obj;
                AndroidUtilities.runOnUIThread(new pc1(yc1Var, i11));
                org.telegram.ui.Cells.u1 u1Var = yc1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = yc1Var.K;
                        int O2 = u1Var2.O2(yc1Var.O);
                        wc1 wc1Var = yc1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && wc1Var != null && (checkBoxBaseArr = wc1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = yc1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.nm nmVar = yc1Var.c0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    yc1Var.c0 = null;
                    break;
                }
                break;
            case 17:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 18:
                si.j jVar = (si.j) obj;
                jVar.P = z10;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.j.b("torch requested: enabled=" + z10 + ", available=" + jVar.F() + ", cameraId=" + jVar.o + ", facing=" + jVar.G);
                jVar.g();
                break;
            default:
                xh.k kVar = (xh.k) obj;
                ArrayList arrayList3 = kVar.c;
                boolean isEmpty = TextUtils.isEmpty(kVar.t);
                String str = kVar.t;
                kVar.w = true;
                kVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i2.e.h(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new xh.e(kVar, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar.v = kVar.i.getImporters(kVar.j, str, tL_chatInviteImporter, kVar.d, new ai.x4(kVar, isEmpty, eVar2, str, z11));
                break;
        }
    }
}
