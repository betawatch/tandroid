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
import org.telegram.ui.cd1;
import org.telegram.ui.ed1;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                n60 n60Var = ((f60) obj).H0;
                if (!n60Var.l0) {
                    try {
                        n60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(n60Var.n.getParentActivity());
                    n60Var.i0 = z10 ? n60Var.k0 : 0L;
                    n60Var.h0 = System.currentTimeMillis();
                    n60Var.j0 = true;
                    n60Var.v();
                    n60Var.invalidate();
                    NotificationCenter.getInstance(n60Var.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(n60Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                xa0 xa0Var = (xa0) obj;
                if (!z10) {
                    xa0Var.getClass();
                    break;
                } else {
                    xa0Var.G.setVisibility(8);
                    break;
                }
            case 2:
                ((xn0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                xv0 xv0Var = (xv0) obj;
                if (!z10) {
                    xv0Var.m0.setVisibility(8);
                    break;
                } else {
                    xv0Var.getClass();
                    break;
                }
            case 4:
                ns0 ns0Var = (ns0) obj;
                if (!z10) {
                    ns0Var.V.q0.setVisibility(0);
                    break;
                } else {
                    ns0Var.getClass();
                    break;
                }
            case 5:
                ss0 ss0Var = (ss0) obj;
                if (!z10) {
                    ss0Var.H.q0.setVisibility(0);
                    break;
                } else {
                    ss0Var.getClass();
                    break;
                }
            case 6:
                ow0 ow0Var = (ow0) obj;
                ArrayList arrayList = ow0Var.r;
                nw0 nw0Var = ow0Var.n;
                if (nw0Var != null) {
                    nw0Var.G(ow0Var.f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((nw0) arrayList.get(i12)).G(ow0Var.f, z10);
                    i12++;
                }
                break;
            case 7:
                pw0 pw0Var = (pw0) obj;
                ArrayList arrayList2 = pw0Var.r;
                nw0 nw0Var2 = pw0Var.n;
                if (nw0Var2 != null) {
                    nw0Var2.G(pw0Var.y0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((nw0) arrayList2.get(i12)).G(pw0Var.y0, z10);
                    i12++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((b71) obj).P(z10);
                break;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                f5.M(eyVar.getParentActivity(), z10 ? eyVar.getUserConfig().getClientUserId() : -1L, new org.telegram.ui.lx(eyVar), eyVar.getResourceProvider());
                break;
            case 11:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.Z(ozVar.Q, z10);
                break;
            case 12:
                org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) obj;
                if (!z10) {
                    ig0Var.W.setVisibility(8);
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
                ((ProfileActivity) obj).i5(z10, true);
                break;
            case 15:
                pf.d.r(((org.telegram.ui.f01) obj).e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 16:
                ed1 ed1Var = (ed1) obj;
                AndroidUtilities.runOnUIThread(new vc1(ed1Var, i11));
                org.telegram.ui.Cells.t1 t1Var = ed1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = ed1Var.K;
                        int N2 = t1Var2.N2(ed1Var.O);
                        cd1 cd1Var = ed1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && N2 >= 0 && N2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[N2]) != null && cd1Var != null && (checkBoxBaseArr = cd1Var.R8) != null && N2 >= 0 && N2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[N2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = ed1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.om omVar = ed1Var.c0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    ed1Var.c0 = null;
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
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i2.o1.i(1, arrayList3);
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
