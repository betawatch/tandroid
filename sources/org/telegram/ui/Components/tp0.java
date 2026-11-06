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
import org.telegram.ui.d81;
import org.telegram.ui.f81;
import org.telegram.ui.y71;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tp0(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i7 = this.a;
        yh.e eVar = null;
        int i10 = 1;
        boolean z9 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                up0 up0Var = (up0) obj;
                if (!z9) {
                    up0Var.V.s0.setVisibility(0);
                    break;
                } else {
                    up0Var.getClass();
                    break;
                }
            case 1:
                yp0 yp0Var = (yp0) obj;
                if (!z9) {
                    yp0Var.x.s0.setVisibility(0);
                    break;
                } else {
                    yp0Var.getClass();
                    break;
                }
            case 2:
                rt0 rt0Var = (rt0) obj;
                ArrayList arrayList = rt0Var.r;
                qt0 qt0Var = rt0Var.n;
                if (qt0Var != null) {
                    qt0Var.K(rt0Var.f, z9);
                }
                while (r5 < arrayList.size()) {
                    ((qt0) arrayList.get(r5)).K(rt0Var.f, z9);
                    r5++;
                }
                break;
            case 3:
                st0 st0Var = (st0) obj;
                ArrayList arrayList2 = st0Var.r;
                qt0 qt0Var2 = st0Var.n;
                if (qt0Var2 != null) {
                    qt0Var2.K(st0Var.h0, z9);
                }
                while (r5 < arrayList2.size()) {
                    ((qt0) arrayList2.get(r5)).K(st0Var.h0, z9);
                    r5++;
                }
                break;
            case 4:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.valueOf(z9));
                break;
            case 5:
                ((l41) obj).Q(z9);
                break;
            case 6:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj;
                v4.J(wwVar.getParentActivity(), z9 ? wwVar.getUserConfig().e() : -1L, new org.telegram.ui.dv(wwVar), wwVar.getResourceProvider());
                break;
            case 7:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj;
                gyVar.e0(gyVar.O, z9);
                break;
            case 8:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                if (!z9) {
                    pa0Var.b.setVisibility(8);
                    break;
                } else {
                    pa0Var.getClass();
                    break;
                }
            case 9:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj;
                if (!z9) {
                    ce0Var.W.setVisibility(8);
                    break;
                }
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z9) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.Y8;
                    photoViewer.getClass();
                    break;
                }
            case 11:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) obj).D5(z9, true);
                break;
            case 12:
                ((FrameLayout) obj).setVisibility(z9 ? 4 : 0);
                break;
            case 13:
                vf.c.t(((org.telegram.ui.jw0) obj).e.getParentActivity(), org.telegram.messenger.hd.M0(z9 ? 2131746703 : 2131746705, null));
                break;
            case 14:
                f81 f81Var = (f81) obj;
                org.telegram.messenger.g0.h3(new y71(f81Var, i10));
                org.telegram.ui.Cells.q1 q1Var = f81Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z9) {
                        org.telegram.ui.Cells.q1 q1Var2 = f81Var.K;
                        int b22 = q1Var2.b2(f81Var.O);
                        d81 d81Var = f81Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && d81Var != null && (checkBoxBaseArr = d81Var.e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = f81Var.K;
                    q1Var3.b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.tl tlVar = f81Var.c0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    f81Var.c0 = null;
                    break;
                }
                break;
            case 15:
                ((View) obj).setVisibility(z9 ? 0 : 8);
                break;
            case 16:
                wi.j jVar = (wi.j) obj;
                jVar.P = z9;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.j.b("torch requested: enabled=" + z9 + ", available=" + jVar.F() + ", cameraId=" + jVar.o + ", facing=" + jVar.G);
                jVar.g();
                break;
            default:
                yh.m mVar = (yh.m) obj;
                ArrayList arrayList3 = mVar.c;
                boolean isEmpty = TextUtils.isEmpty(mVar.t);
                String str = mVar.t;
                mVar.w = true;
                mVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList3.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) jg.g.i(1, arrayList3);
                boolean z10 = tL_chatInviteImporter == null;
                if (isEmpty && z10 && z9) {
                    eVar = new yh.e(mVar, 1);
                }
                yh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                mVar.v = mVar.i.a(mVar.j, str, tL_chatInviteImporter, mVar.d, new bi.t4(mVar, isEmpty, eVar2, str, z10));
                break;
        }
    }
}
