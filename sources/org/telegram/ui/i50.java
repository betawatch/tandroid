package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((re0) this.b).s = null;
                break;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ll0) this.b).c).A2 = null;
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
                j50 j50Var = (j50) obj;
                j50Var.G = null;
                v50 v50Var = j50Var.L;
                v50Var.Q.invalidate();
                v50Var.a2.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
                viewGroup.invalidate();
                v50.J0(v50Var);
                j50Var.H.clear();
                j50Var.I.clear();
                break;
            case 1:
                v70 v70Var = (v70) obj;
                v70Var.a = null;
                v70Var.b = false;
                break;
            case 2:
                pc0 pc0Var = (pc0) obj;
                pc0Var.H = false;
                pc0Var.p0();
                break;
            case 3:
                re0 re0Var = (re0) obj;
                if (re0Var.s != null && re0Var.n != null) {
                    re0Var.r.setVisibility(4);
                    re0Var.s = null;
                    break;
                }
                break;
            case 4:
                ((vi0) obj).T.setVisibility(8);
                break;
            case 5:
                xj0 xj0Var = (xj0) obj;
                if (xj0Var.M >= 1.0f) {
                    xj0Var.w.setVisibility(8);
                    break;
                }
                break;
            case 6:
                zj0 zj0Var = (zj0) obj;
                zj0Var.f = 1.0f;
                zj0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                rp0 rp0Var = (rp0) obj;
                mc mcVar = rp0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) rp0Var.X.getParent()).removeView(rp0Var.X);
                    }
                    rp0Var.X = null;
                }
                rp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                tq0 tq0Var = (tq0) obj;
                vq0 vq0Var = tq0Var.s0;
                org.telegram.ui.ActionBar.q5[] q5VarArr = vq0Var.n;
                vq0Var.r = null;
                if (vq0Var.w) {
                    q5VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                    q5VarArr[0] = q5VarArr[1];
                    q5VarArr[1] = q5Var;
                    q5Var.setVisibility(8);
                    vq0Var.e = vq0Var.n[0].b == vq0Var.h.getFirstTabId();
                    vq0Var.h.i(1.0f, vq0Var.n[0].b);
                }
                vq0Var.s = false;
                tq0Var.n0 = false;
                tq0Var.m0 = false;
                kVar = ((org.telegram.ui.ActionBar.r2) vq0Var).actionBar;
                kVar.setEnabled(true);
                vq0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ll0) obj).c;
                if (photoViewer.A2 != null) {
                    lj0 lj0Var = new lj0(this, 20);
                    photoViewer.I2 = lj0Var;
                    AndroidUtilities.runOnUIThread(lj0Var, 860L);
                    break;
                }
                break;
            case 11:
                jt0 jt0Var = (jt0) obj;
                PhotoViewer photoViewer2 = jt0Var.b;
                ng.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = jt0Var.a;
                photoViewer2.g1().L.b(photoViewer2.u4 != 0);
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
                photoViewer2.y3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 12:
                kt0 kt0Var = (kt0) obj;
                PhotoViewer photoViewer3 = kt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = kt0Var.a;
                photoViewer3.g1().L.b(photoViewer3.u4 != 0);
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
                photoViewer3.y3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 13:
                ((PhotoViewer) ((ot0) obj).q0).y3[0].setTag(null);
                break;
            case 14:
                ((pt0) obj).d.T1.k0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((pt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new lj0(this, 22));
                break;
            case 17:
                gt0 gt0Var = (gt0) obj;
                if (animator.equals(gt0Var.c.U7)) {
                    gt0Var.c.U7 = null;
                    break;
                }
                break;
            case 18:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.e == animator) {
                    nu0Var.c[1].setVisibility(8);
                    nu0Var.e = null;
                    break;
                }
                break;
            case 19:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.C != null) {
                    cv0Var.C = null;
                    cv0Var.b();
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
                ((mz0) obj).b.J5 = null;
                break;
            case 23:
                k01 k01Var = (k01) obj;
                if (!k01Var.E) {
                    k01Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                h11 h11Var = (h11) obj;
                if (animator.equals(h11Var.d)) {
                    h11Var.d = null;
                    break;
                }
                break;
            case 25:
                ((r31) obj).d.a0.k0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((r31) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 27:
                c61 c61Var = ((s41) obj).e;
                c61Var.S0.G = 0.0f;
                c61Var.S0 = null;
                c61Var.h0.invalidate();
                break;
            case 28:
                bh.m0.a();
                c61 c61Var2 = (c61) obj;
                z41 z41Var = c61Var2.h0;
                z41 z41Var2 = c61Var2.h0;
                z41Var.setLayerType(0, null);
                t41 t41Var = c61Var2.f0;
                t41Var.setLayerType(0, null);
                c61Var2.e0.setLayerType(0, null);
                c61Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.vn vnVar = c61Var2.n0;
                if (vnVar != null) {
                    vnVar.setLayerType(0, null);
                }
                View view = c61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                t41Var.b();
                c61Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                c61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new my0(globalInstance, 16));
                c61Var2.h();
                c61Var2.E(1.0f);
                for (int i11 = 0; i11 < z41Var2.getChildCount(); i11++) {
                    View childAt = z41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < c61Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = c61Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                c61Var2.d0.b.invalidate();
                c61Var2.k0.invalidate();
                z41Var2.invalidate();
                break;
            default:
                ((w91) obj).a0.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                jt0 jt0Var = (jt0) this.b;
                jt0Var.b.U0.setVisibility(0);
                jt0Var.b.C1.setVisibility(0);
                break;
            case 12:
                break;
            case 23:
                ((k01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
