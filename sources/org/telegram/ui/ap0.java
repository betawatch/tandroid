package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ap0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.cl0) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                wp0 wp0Var = (wp0) obj;
                mc mcVar = wp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) wp0Var.X.getParent()).removeView(wp0Var.X);
                    }
                    wp0Var.X = null;
                }
                wp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 1:
                yq0 yq0Var = (yq0) obj;
                br0 br0Var = yq0Var.D0;
                zq0[] zq0VarArr = br0Var.n;
                br0Var.r = null;
                if (br0Var.w) {
                    zq0VarArr[1].setVisibility(8);
                } else {
                    zq0 zq0Var = zq0VarArr[0];
                    zq0VarArr[0] = zq0VarArr[1];
                    zq0VarArr[1] = zq0Var;
                    zq0Var.setVisibility(8);
                    br0Var.e = br0Var.n[0].e == br0Var.h.getFirstTabId();
                    br0Var.h.j(1.0f, br0Var.n[0].e);
                }
                br0Var.s = false;
                yq0Var.y0 = false;
                yq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                kVar.setEnabled(true);
                br0Var.h.setEnabled(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.cl0) obj).c;
                if (photoViewer.A2 != null) {
                    nl0 nl0Var = new nl0(this, 18);
                    photoViewer.I2 = nl0Var;
                    AndroidUtilities.runOnUIThread(nl0Var, 860L);
                    break;
                }
                break;
            case 3:
                rt0 rt0Var = (rt0) obj;
                PhotoViewer photoViewer2 = rt0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = rt0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                ci.i4 i4Var = photoViewer2.K1;
                if (i4Var != null) {
                    i4Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 4:
                st0 st0Var = (st0) obj;
                PhotoViewer photoViewer3 = st0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = st0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                ci.i4 i4Var2 = photoViewer3.K1;
                if (i4Var2 != null) {
                    i4Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 5:
                ((PhotoViewer) ((wt0) obj).q0).y3[0].setTag(null);
                break;
            case 6:
                ((xt0) obj).d.T1.k0 = 1.0f;
                break;
            case 7:
                PhotoViewer photoViewer4 = ((xt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new nl0(this, 20));
                break;
            case 9:
                ot0 ot0Var = (ot0) obj;
                if (animator.equals(ot0Var.c.U7)) {
                    ot0Var.c.U7 = null;
                    break;
                }
                break;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.e == animator) {
                    vu0Var.c[1].setVisibility(8);
                    vu0Var.e = null;
                    break;
                }
                break;
            case 11:
                kv0 kv0Var = (kv0) obj;
                if (kv0Var.C != null) {
                    kv0Var.C = null;
                    kv0Var.b();
                    break;
                }
                break;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 13:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.cl0) obj).c).D5 = null;
                break;
            case 15:
                t01 t01Var = (t01) obj;
                if (!t01Var.E) {
                    t01Var.setVisibility(8);
                    break;
                }
                break;
            case 16:
                p11 p11Var = (p11) obj;
                if (animator.equals(p11Var.d)) {
                    p11Var.d = null;
                    break;
                }
                break;
            case 17:
                x21 x21Var = (x21) obj;
                ci.sb sbVar = x21Var.O;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) x21Var.O.getParent()).removeView(x21Var.O);
                    }
                    x21Var.O = null;
                }
                x21Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                ((r41) obj).d.a0.k0 = 1.0f;
                break;
            case 19:
                SecretMediaViewer secretMediaViewer = ((r41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 20:
                a71 a71Var = ((q51) obj).e;
                a71Var.S0.G = 0.0f;
                a71Var.S0 = null;
                a71Var.h0.invalidate();
                break;
            case 21:
                zg.c0.a();
                a71 a71Var2 = (a71) obj;
                x51 x51Var = a71Var2.h0;
                x51 x51Var2 = a71Var2.h0;
                x51Var.setLayerType(0, null);
                r51 r51Var = a71Var2.f0;
                r51Var.setLayerType(0, null);
                a71Var2.e0.setLayerType(0, null);
                a71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.nn nnVar = a71Var2.n0;
                if (nnVar != null) {
                    nnVar.setLayerType(0, null);
                }
                View view = a71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r51Var.b();
                a71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new hz0(globalInstance, 14));
                a71Var2.h();
                a71Var2.E(1.0f);
                for (int i11 = 0; i11 < x51Var2.getChildCount(); i11++) {
                    View childAt = x51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = a71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a71Var2.d0.b.invalidate();
                a71Var2.k0.invalidate();
                x51Var2.invalidate();
                break;
            case 22:
                ((ta1) obj).a0.setVisibility(8);
                break;
            case 23:
                pd1 pd1Var = ((dd1) obj).a;
                if (!pd1Var.p1.a()) {
                    pd1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((qe1) obj).a = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                break;
            case 26:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    break;
                }
                break;
            case 27:
                oh1 oh1Var = (oh1) obj;
                oh1Var.d = null;
                oh1Var.a = null;
                oh1Var.b = false;
                oh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 28:
                org.telegram.ui.Components.zf0 zf0Var = (org.telegram.ui.Components.zf0) obj;
                ((fj1) zf0Var.b).getClass();
                ((fj1) zf0Var.b).c.setVisibility(4);
                break;
            default:
                ((org.telegram.ui.web.c1) obj).s.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                rt0 rt0Var = (rt0) this.b;
                rt0Var.b.U0.setVisibility(0);
                rt0Var.b.C1.setVisibility(0);
                break;
            case 4:
                break;
            case 15:
                ((t01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
