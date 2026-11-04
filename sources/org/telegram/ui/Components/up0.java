package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p71;
import org.telegram.ui.u71;
import org.telegram.ui.w71;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up0(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i3 = this.a;
        zh.e eVar = null;
        int i10 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                vp0 vp0Var = (vp0) obj;
                if (!z10) {
                    vp0Var.W.t0.setVisibility(0);
                    break;
                } else {
                    vp0Var.getClass();
                    break;
                }
            case 1:
                yp0 yp0Var = (yp0) obj;
                if (!z10) {
                    yp0Var.x.t0.setVisibility(0);
                    break;
                } else {
                    yp0Var.getClass();
                    break;
                }
            case 2:
                qt0 qt0Var = (qt0) obj;
                ArrayList arrayList = qt0Var.r;
                pt0 pt0Var = qt0Var.n;
                if (pt0Var != null) {
                    pt0Var.K(qt0Var.f, z10);
                }
                while (r5 < arrayList.size()) {
                    ((pt0) arrayList.get(r5)).K(qt0Var.f, z10);
                    r5++;
                }
                break;
            case 3:
                rt0 rt0Var = (rt0) obj;
                ArrayList arrayList2 = rt0Var.r;
                pt0 pt0Var2 = rt0Var.n;
                if (pt0Var2 != null) {
                    pt0Var2.K(rt0Var.i0, z10);
                }
                while (r5 < arrayList2.size()) {
                    ((pt0) arrayList2.get(r5)).K(rt0Var.i0, z10);
                    r5++;
                }
                break;
            case 4:
                ((org.telegram.messenger.n10) obj).a(null, Boolean.valueOf(z10));
                break;
            case 5:
                ((f41) obj).Q(z10);
                break;
            case 6:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj;
                t4.L(uwVar.getParentActivity(), z10 ? uwVar.getUserConfig().e() : -1L, new org.telegram.ui.av(uwVar), uwVar.getResourceProvider());
                break;
            case 7:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                cyVar.e0(cyVar.P, z10);
                break;
            case 8:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) obj;
                if (!z10) {
                    la0Var.b.setVisibility(8);
                    break;
                } else {
                    la0Var.getClass();
                    break;
                }
            case 9:
                org.telegram.ui.xd0 xd0Var = (org.telegram.ui.xd0) obj;
                if (!z10) {
                    xd0Var.X.setVisibility(8);
                    break;
                }
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.W0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.V8;
                    photoViewer.getClass();
                    break;
                }
            case 11:
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) obj).D5(z10, true);
                break;
            case 12:
                ((FrameLayout) obj).setVisibility(z10 ? 4 : 0);
                break;
            case 13:
                sf.c.t(((org.telegram.ui.bw0) obj).e.getParentActivity(), org.telegram.messenger.bd.M0(z10 ? 2131746712 : 2131746714, null));
                break;
            case 14:
                w71 w71Var = (w71) obj;
                org.telegram.messenger.g0.h3(new p71(w71Var, i10));
                org.telegram.ui.Cells.q1 q1Var = w71Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = w71Var.L;
                        int b22 = q1Var2.b2(w71Var.P);
                        u71 u71Var = w71Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && u71Var != null && (checkBoxBaseArr = u71Var.e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = w71Var.L;
                    q1Var3.b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.pl plVar = w71Var.d0;
                if (plVar != null) {
                    org.telegram.messenger.g0.h3(plVar);
                    w71Var.d0 = null;
                    break;
                }
                break;
            case 15:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 16:
                wi.j jVar = (wi.j) obj;
                jVar.P = z10;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.j.b("torch requested: enabled=" + z10 + ", available=" + jVar.F() + ", cameraId=" + jVar.o + ", facing=" + jVar.G);
                jVar.g();
                break;
            default:
                zh.k kVar = (zh.k) obj;
                ArrayList arrayList3 = kVar.c;
                boolean isEmpty = TextUtils.isEmpty(kVar.t);
                String str = kVar.t;
                kVar.w = true;
                kVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) k2.p1.h(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new zh.e(kVar, 1);
                }
                zh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                kVar.v = kVar.i.a(kVar.j, str, tL_chatInviteImporter, kVar.d, new ci.d4(kVar, isEmpty, eVar2, str, z11));
                break;
        }
    }
}
