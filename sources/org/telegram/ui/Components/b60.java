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
import org.telegram.ui.ad1;
import org.telegram.ui.rc1;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                ((tn0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                sv0 sv0Var = (sv0) obj;
                if (!z10) {
                    sv0Var.m0.setVisibility(8);
                    break;
                } else {
                    sv0Var.getClass();
                    break;
                }
            case 4:
                is0 is0Var = (is0) obj;
                if (!z10) {
                    is0Var.U.q0.setVisibility(0);
                    break;
                } else {
                    is0Var.getClass();
                    break;
                }
            case 5:
                ns0 ns0Var = (ns0) obj;
                if (!z10) {
                    ns0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ns0Var.getClass();
                    break;
                }
            case 6:
                jw0 jw0Var = (jw0) obj;
                ArrayList arrayList = jw0Var.r;
                iw0 iw0Var = jw0Var.n;
                if (iw0Var != null) {
                    iw0Var.H(jw0Var.f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((iw0) arrayList.get(i12)).H(jw0Var.f, z10);
                    i12++;
                }
                break;
            case 7:
                kw0 kw0Var = (kw0) obj;
                ArrayList arrayList2 = kw0Var.r;
                iw0 iw0Var2 = kw0Var.n;
                if (iw0Var2 != null) {
                    iw0Var2.H(kw0Var.y0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((iw0) arrayList2.get(i12)).H(kw0Var.y0, z10);
                    i12++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((s61) obj).P(z10);
                break;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                f5.L(eyVar.getParentActivity(), z10 ? eyVar.getUserConfig().getClientUserId() : -1L, new org.telegram.ui.lx(eyVar), eyVar.getResourceProvider());
                break;
            case 11:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) obj;
                nzVar.Z(nzVar.P, z10);
                break;
            case 12:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z10) {
                    fg0Var.W.setVisibility(8);
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
                pf.d.r(((org.telegram.ui.d01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 16:
                ad1 ad1Var = (ad1) obj;
                AndroidUtilities.runOnUIThread(new rc1(ad1Var, i11));
                org.telegram.ui.Cells.u1 u1Var = ad1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.u1 u1Var2 = ad1Var.K;
                        int O2 = u1Var2.O2(ad1Var.O);
                        yc1 yc1Var = ad1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && yc1Var != null && (checkBoxBaseArr = yc1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ad1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.pm pmVar = ad1Var.c0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    ad1Var.c0 = null;
                    break;
                }
                break;
            case 17:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 18:
                si.k kVar = (si.k) obj;
                kVar.P = z10;
                kVar.Q = kVar.F();
                kVar.R = 0;
                kVar.S = 0;
                kVar.j.b("torch requested: enabled=" + z10 + ", available=" + kVar.F() + ", cameraId=" + kVar.o + ", facing=" + kVar.G);
                kVar.g();
                break;
            default:
                xh.k kVar2 = (xh.k) obj;
                ArrayList arrayList3 = kVar2.c;
                boolean isEmpty = TextUtils.isEmpty(kVar2.t);
                String str = kVar2.t;
                kVar2.w = true;
                kVar2.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i0.a.h(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new xh.e(kVar2, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar2.v = kVar2.i.getImporters(kVar2.j, str, tL_chatInviteImporter, kVar2.d, new ai.w4(kVar2, isEmpty, eVar2, str, z11));
                break;
        }
    }
}
