package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((te0) this.b).s = null;
                break;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                l50 l50Var = (l50) obj;
                l50Var.G = null;
                x50 x50Var = l50Var.L;
                x50Var.Q.invalidate();
                x50Var.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
                viewGroup.invalidate();
                x50.J0(x50Var);
                l50Var.H.clear();
                l50Var.I.clear();
                break;
            case 1:
                x70 x70Var = (x70) obj;
                x70Var.a = null;
                x70Var.b = false;
                break;
            case 2:
                rc0 rc0Var = (rc0) obj;
                rc0Var.H = false;
                rc0Var.p0();
                break;
            case 3:
                te0 te0Var = (te0) obj;
                if (te0Var.s != null && te0Var.n != null) {
                    te0Var.r.setVisibility(4);
                    te0Var.s = null;
                    break;
                }
                break;
            case 4:
                ((xi0) obj).T.setVisibility(8);
                break;
            case 5:
                zj0 zj0Var = (zj0) obj;
                if (zj0Var.M >= 1.0f) {
                    zj0Var.w.setVisibility(8);
                    break;
                }
                break;
            case 6:
                bk0 bk0Var = (bk0) obj;
                bk0Var.f = 1.0f;
                bk0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                tp0 tp0Var = (tp0) obj;
                mc mcVar = tp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) tp0Var.X.getParent()).removeView(tp0Var.X);
                    }
                    tp0Var.X = null;
                }
                tp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                vq0 vq0Var = (vq0) obj;
                xq0 xq0Var = vq0Var.s0;
                org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.n;
                xq0Var.r = null;
                if (xq0Var.w) {
                    q5VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                    q5VarArr[0] = q5VarArr[1];
                    q5VarArr[1] = q5Var;
                    q5Var.setVisibility(8);
                    xq0Var.e = xq0Var.n[0].b == xq0Var.h.getFirstTabId();
                    xq0Var.h.i(1.0f, xq0Var.n[0].b);
                }
                xq0Var.s = false;
                vq0Var.n0 = false;
                vq0Var.m0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) xq0Var).actionBar;
                kVar.setEnabled(true);
                xq0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).c;
                if (photoViewer.A2 != null) {
                    nj0 nj0Var = new nj0(this, 20);
                    photoViewer.I2 = nj0Var;
                    AndroidUtilities.runOnUIThread(nj0Var, 860L);
                    break;
                }
                break;
            case 11:
                lt0 lt0Var = (lt0) obj;
                PhotoViewer photoViewer2 = lt0Var.b;
                ng.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = lt0Var.a;
                photoViewer2.h1().L.b(photoViewer2.u4 != 0);
                fi.z3 z3Var = photoViewer2.K1;
                if (z3Var != null) {
                    z3Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 12:
                mt0 mt0Var = (mt0) obj;
                PhotoViewer photoViewer3 = mt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = mt0Var.a;
                photoViewer3.h1().L.b(photoViewer3.u4 != 0);
                fi.z3 z3Var2 = photoViewer3.K1;
                if (z3Var2 != null) {
                    z3Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 13:
                ((PhotoViewer) ((qt0) obj).q0).y3[0].setTag(null);
                break;
            case 14:
                ((rt0) obj).d.T1.k0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((rt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new nj0(this, 22));
                break;
            case 17:
                it0 it0Var = (it0) obj;
                if (animator.equals(it0Var.c.U7)) {
                    it0Var.c.U7 = null;
                    break;
                }
                break;
            case 18:
                pu0 pu0Var = (pu0) obj;
                if (pu0Var.e == animator) {
                    pu0Var.c[1].setVisibility(8);
                    pu0Var.e = null;
                    break;
                }
                break;
            case 19:
                ev0 ev0Var = (ev0) obj;
                if (ev0Var.C != null) {
                    ev0Var.C = null;
                    ev0Var.b();
                    break;
                }
                break;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 21:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.t0);
                premiumPreviewFragment.t0 = null;
                super.onAnimationEnd(animator);
                break;
            case 22:
                ((oz0) obj).b.J5 = null;
                break;
            case 23:
                m01 m01Var = (m01) obj;
                if (!m01Var.E) {
                    m01Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                j11 j11Var = (j11) obj;
                if (animator.equals(j11Var.d)) {
                    j11Var.d = null;
                    break;
                }
                break;
            case 25:
                ((u31) obj).d.a0.k0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((u31) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 27:
                f61 f61Var = ((v41) obj).e;
                f61Var.S0.G = 0.0f;
                f61Var.S0 = null;
                f61Var.h0.invalidate();
                break;
            case 28:
                bh.m0.a();
                f61 f61Var2 = (f61) obj;
                c51 c51Var = f61Var2.h0;
                c51 c51Var2 = f61Var2.h0;
                c51Var.setLayerType(0, null);
                w41 w41Var = f61Var2.f0;
                w41Var.setLayerType(0, null);
                f61Var2.e0.setLayerType(0, null);
                f61Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.vn vnVar = f61Var2.n0;
                if (vnVar != null) {
                    vnVar.setLayerType(0, null);
                }
                View view = f61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                w41Var.b();
                f61Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                f61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new oy0(globalInstance, 16));
                f61Var2.h();
                f61Var2.E(1.0f);
                for (int i11 = 0; i11 < c51Var2.getChildCount(); i11++) {
                    View childAt = c51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < f61Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = f61Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                f61Var2.d0.b.invalidate();
                f61Var2.k0.invalidate();
                c51Var2.invalidate();
                break;
            default:
                ((y91) obj).a0.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                lt0 lt0Var = (lt0) this.b;
                lt0Var.b.U0.setVisibility(0);
                lt0Var.b.C1.setVisibility(0);
                break;
            case 12:
                break;
            case 23:
                ((m01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
