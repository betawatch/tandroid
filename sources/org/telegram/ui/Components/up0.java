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
import org.telegram.ui.a81;
import org.telegram.ui.f81;
import org.telegram.ui.h81;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up0(int i7, Object obj, boolean z9) {
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
                vp0 vp0Var = (vp0) obj;
                if (!z9) {
                    vp0Var.V.s0.setVisibility(8);
                    break;
                } else {
                    vp0Var.getClass();
                    break;
                }
            case 1:
                zp0 zp0Var = (zp0) obj;
                if (!z9) {
                    zp0Var.x.s0.setVisibility(8);
                    break;
                } else {
                    zp0Var.getClass();
                    break;
                }
            case 2:
                tt0 tt0Var = (tt0) obj;
                ArrayList arrayList = tt0Var.r;
                st0 st0Var = tt0Var.n;
                if (st0Var != null) {
                    st0Var.K(tt0Var.f, z9);
                }
                while (r4 < arrayList.size()) {
                    ((st0) arrayList.get(r4)).K(tt0Var.f, z9);
                    r4++;
                }
                break;
            case 3:
                ut0 ut0Var = (ut0) obj;
                ArrayList arrayList2 = ut0Var.r;
                st0 st0Var2 = ut0Var.n;
                if (st0Var2 != null) {
                    st0Var2.K(ut0Var.h0, z9);
                }
                while (r4 < arrayList2.size()) {
                    ((st0) arrayList2.get(r4)).K(ut0Var.h0, z9);
                    r4++;
                }
                break;
            case 4:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.valueOf(z9));
                break;
            case 5:
                ((m41) obj).Q(z9);
                break;
            case 6:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj;
                v4.J(ywVar.getParentActivity(), z9 ? ywVar.getUserConfig().e() : -1L, new org.telegram.ui.fv(ywVar), ywVar.getResourceProvider());
                break;
            case 7:
                org.telegram.ui.iy iyVar = (org.telegram.ui.iy) obj;
                iyVar.e0(iyVar.O, z9);
                break;
            case 8:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) obj;
                if (!z9) {
                    ra0Var.b.setVisibility(8);
                    break;
                } else {
                    ra0Var.getClass();
                    break;
                }
            case 9:
                org.telegram.ui.ee0 ee0Var = (org.telegram.ui.ee0) obj;
                if (!z9) {
                    ee0Var.W.setVisibility(8);
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
                RectF rectF = ProfileActivity.V6;
                ((ProfileActivity) obj).G5(z9, true);
                break;
            case 12:
                ((FrameLayout) obj).setVisibility(z9 ? 4 : 0);
                break;
            case 13:
                vf.c.t(((org.telegram.ui.lw0) obj).e.getParentActivity(), org.telegram.messenger.id.M0(z9 ? 2131746704 : 2131746706, null));
                break;
            case 14:
                h81 h81Var = (h81) obj;
                org.telegram.messenger.g0.h3(new a81(h81Var, i10));
                org.telegram.ui.Cells.q1 q1Var = h81Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z9) {
                        org.telegram.ui.Cells.q1 q1Var2 = h81Var.K;
                        int b22 = q1Var2.b2(h81Var.O);
                        f81 f81Var = h81Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && f81Var != null && (checkBoxBaseArr = f81Var.e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = h81Var.K;
                    q1Var3.b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.vl vlVar = h81Var.c0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    h81Var.c0 = null;
                    break;
                }
                break;
            case 15:
                ((View) obj).setVisibility(z9 ? 0 : 8);
                break;
            case 16:
                wi.k kVar = (wi.k) obj;
                kVar.O = z9;
                kVar.P = kVar.F();
                kVar.Q = 0;
                kVar.R = 0;
                kVar.j.b("torch requested: enabled=" + z9 + ", available=" + kVar.F() + ", cameraId=" + kVar.o + ", facing=" + kVar.F);
                kVar.f();
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
