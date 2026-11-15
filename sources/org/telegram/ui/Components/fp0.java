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
import org.telegram.ui.c81;
import org.telegram.ui.e81;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fp0(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i7 = this.a;
        zh.e eVar = null;
        int i10 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                ys0 ys0Var = (ys0) obj;
                if (!z10) {
                    ys0Var.p0.setVisibility(8);
                    break;
                } else {
                    ys0Var.getClass();
                    break;
                }
            case 1:
                wp0 wp0Var = (wp0) obj;
                if (!z10) {
                    wp0Var.W.t0.setVisibility(8);
                    break;
                } else {
                    wp0Var.getClass();
                    break;
                }
            case 2:
                zp0 zp0Var = (zp0) obj;
                if (!z10) {
                    zp0Var.x.t0.setVisibility(8);
                    break;
                } else {
                    zp0Var.getClass();
                    break;
                }
            case 3:
                st0 st0Var = (st0) obj;
                ArrayList arrayList = st0Var.r;
                rt0 rt0Var = st0Var.n;
                if (rt0Var != null) {
                    rt0Var.L(st0Var.f, z10);
                }
                while (r5 < arrayList.size()) {
                    ((rt0) arrayList.get(r5)).L(st0Var.f, z10);
                    r5++;
                }
                break;
            case 4:
                tt0 tt0Var = (tt0) obj;
                ArrayList arrayList2 = tt0Var.r;
                rt0 rt0Var2 = tt0Var.n;
                if (rt0Var2 != null) {
                    rt0Var2.L(tt0Var.i0, z10);
                }
                while (r5 < arrayList2.size()) {
                    ((rt0) arrayList2.get(r5)).L(tt0Var.i0, z10);
                    r5++;
                }
                break;
            case 5:
                ((org.telegram.messenger.s10) obj).a(null, Boolean.valueOf(z10));
                break;
            case 6:
                ((p41) obj).Q(z10);
                break;
            case 7:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj;
                t4.J(ywVar.getParentActivity(), z10 ? ywVar.getUserConfig().e() : -1L, new org.telegram.ui.ev(ywVar), ywVar.getResourceProvider());
                break;
            case 8:
                org.telegram.ui.hy hyVar = (org.telegram.ui.hy) obj;
                hyVar.e0(hyVar.P, z10);
                break;
            case 9:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                if (!z10) {
                    pa0Var.b.setVisibility(8);
                    break;
                } else {
                    pa0Var.getClass();
                    break;
                }
            case 10:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj;
                if (!z10) {
                    ce0Var.X.setVisibility(8);
                    break;
                }
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.W0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    photoViewer.getClass();
                    break;
                }
            case 12:
                RectF rectF = ProfileActivity.X6;
                ((ProfileActivity) obj).G5(z10, true);
                break;
            case 13:
                ((FrameLayout) obj).setVisibility(z10 ? 4 : 0);
                break;
            case 14:
                vf.c.t(((org.telegram.ui.iw0) obj).e.getParentActivity(), org.telegram.messenger.hd.M0(z10 ? 2131746704 : 2131746706, null));
                break;
            case 15:
                e81 e81Var = (e81) obj;
                org.telegram.messenger.g0.h3(new x71(e81Var, i10));
                org.telegram.ui.Cells.q1 q1Var = e81Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = e81Var.L;
                        int c22 = q1Var2.c2(e81Var.P);
                        c81 c81Var = e81Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f7;
                        if (checkBoxBaseArr2 != null && c22 >= 0 && c22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[c22]) != null && c81Var != null && (checkBoxBaseArr = c81Var.f7) != null && c22 >= 0 && c22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[c22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = e81Var.L;
                    q1Var3.c6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.tl tlVar = e81Var.d0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    e81Var.d0 = null;
                    break;
                }
                break;
            case 16:
                ((View) obj).setVisibility(z10 ? 0 : 8);
                break;
            case 17:
                zh.l lVar = (zh.l) obj;
                ArrayList arrayList3 = lVar.c;
                boolean isEmpty = TextUtils.isEmpty(lVar.t);
                String str = lVar.t;
                lVar.w = true;
                lVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i5.c.h(1, arrayList3);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    eVar = new zh.e(lVar, 1);
                }
                zh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                lVar.v = lVar.i.a(lVar.j, str, tL_chatInviteImporter, lVar.d, new di.u3(lVar, isEmpty, eVar2, str, z11));
                break;
            default:
                zi.l lVar2 = (zi.l) obj;
                lVar2.O = z10;
                lVar2.P = lVar2.F();
                lVar2.Q = 0;
                lVar2.R = 0;
                lVar2.j.b("torch requested: enabled=" + z10 + ", available=" + lVar2.F() + ", cameraId=" + lVar2.o + ", facing=" + lVar2.F);
                lVar2.f();
                break;
        }
    }
}
