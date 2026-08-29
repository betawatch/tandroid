package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((pe0) this.b).s = null;
                break;
            case 9:
                ((PhotoViewer) ((org.telegram.ui.Components.ok0) this.b).c).w2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                f50 f50Var = (f50) obj;
                f50Var.G = null;
                r50 r50Var = f50Var.L;
                r50Var.M.invalidate();
                r50Var.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
                viewGroup.invalidate();
                r50.J0(r50Var);
                f50Var.H.clear();
                f50Var.I.clear();
                break;
            case 1:
                r70 r70Var = (r70) obj;
                r70Var.d = null;
                r70Var.a = null;
                r70Var.b = false;
                break;
            case 2:
                rc0 rc0Var = (rc0) obj;
                rc0Var.D = false;
                rc0Var.o0();
                break;
            case 3:
                pe0 pe0Var = (pe0) obj;
                if (pe0Var.s != null && pe0Var.n != null) {
                    pe0Var.r.setVisibility(4);
                    pe0Var.s = null;
                    break;
                }
                break;
            case 4:
                ((si0) obj).P.setVisibility(8);
                break;
            case 5:
                mj0 mj0Var = (mj0) obj;
                mj0Var.f = 1.0f;
                mj0Var.invalidate();
                break;
            case 6:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 7:
                yo0 yo0Var = (yo0) obj;
                fc fcVar = yo0Var.K;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) yo0Var.K.getParent()).removeView(yo0Var.K);
                    }
                    yo0Var.K = null;
                }
                yo0Var.M = null;
                super.onAnimationEnd(animator);
                break;
            case 8:
                bq0 bq0Var = (bq0) obj;
                eq0 eq0Var = bq0Var.z0;
                cq0[] cq0VarArr = eq0Var.n;
                eq0Var.r = null;
                if (eq0Var.w) {
                    cq0VarArr[1].setVisibility(8);
                } else {
                    cq0 cq0Var = cq0VarArr[0];
                    cq0VarArr[0] = cq0VarArr[1];
                    cq0VarArr[1] = cq0Var;
                    cq0Var.setVisibility(8);
                    eq0Var.e = eq0Var.n[0].e == eq0Var.h.getFirstTabId();
                    eq0Var.h.j(1.0f, eq0Var.n[0].e);
                }
                eq0Var.s = false;
                bq0Var.u0 = false;
                bq0Var.t0 = false;
                lVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                lVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ok0) obj).c;
                if (photoViewer.w2 != null) {
                    vk0 vk0Var = new vk0(this, 18);
                    photoViewer.E2 = vk0Var;
                    AndroidUtilities.runOnUIThread(vk0Var, 860L);
                    break;
                }
                break;
            case 10:
                ss0 ss0Var = (ss0) obj;
                PhotoViewer photoViewer2 = ss0Var.b;
                wf.n nVar = photoViewer2.y1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.y1.b.F = true;
                photoViewer2.l6 = null;
                photoViewer2.q4 = ss0Var.a;
                photoViewer2.f1().H.b(photoViewer2.q4 != 0);
                nh.w3 w3Var = photoViewer2.G1;
                if (w3Var != null) {
                    w3Var.b(photoViewer2.q4 != 3);
                }
                if (photoViewer2.q4 != 3) {
                    photoViewer2.V5 = 0.0f;
                }
                photoViewer2.k6 = -1;
                photoViewer2.a6 = 1.0f;
                photoViewer2.W5 = 1.0f;
                photoViewer2.Y5 = 0.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.p2 = true;
                photoViewer2.a0.invalidate();
                break;
            case 11:
                ts0 ts0Var = (ts0) obj;
                PhotoViewer photoViewer3 = ts0Var.b;
                photoViewer3.E1.e0.setVisibility(0);
                photoViewer3.l6 = null;
                photoViewer3.q4 = ts0Var.a;
                photoViewer3.f1().H.b(photoViewer3.q4 != 0);
                nh.w3 w3Var2 = photoViewer3.G1;
                if (w3Var2 != null) {
                    w3Var2.b(photoViewer3.q4 != 3);
                }
                if (photoViewer3.q4 != 3) {
                    photoViewer3.V5 = 0.0f;
                }
                photoViewer3.k6 = -1;
                photoViewer3.a6 = 1.0f;
                photoViewer3.W5 = 1.0f;
                photoViewer3.Y5 = 0.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.p2 = true;
                photoViewer3.a0.invalidate();
                break;
            case 12:
                ((PhotoViewer) ((xs0) obj).m0).u3[0].setTag(null);
                break;
            case 13:
                ((ys0) obj).d.P1.g0 = 1.0f;
                break;
            case 14:
                PhotoViewer photoViewer4 = ((ys0) obj).d;
                photoViewer4.P1.setVisibility(4);
                photoViewer4.P1.g0 = 1.0f;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new vk0(this, 20));
                break;
            case 16:
                ps0 ps0Var = (ps0) obj;
                if (animator.equals(ps0Var.c.P7)) {
                    ps0Var.c.P7 = null;
                    break;
                }
                break;
            case 17:
                wt0 wt0Var = (wt0) obj;
                if (wt0Var.e == animator) {
                    wt0Var.c[1].setVisibility(8);
                    wt0Var.e = null;
                    break;
                }
                break;
            case 18:
                lu0 lu0Var = (lu0) obj;
                if (lu0Var.C != null) {
                    lu0Var.C = null;
                    lu0Var.b();
                    break;
                }
                break;
            case 19:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.U;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.U = null;
                    break;
                }
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.removeView(premiumPreviewFragment.n0);
                premiumPreviewFragment.n0 = null;
                super.onAnimationEnd(animator);
                break;
            case 21:
                ((ProfileActivity) ((org.telegram.ui.Components.ok0) obj).c).z5 = null;
                break;
            case 22:
                wz0 wz0Var = (wz0) obj;
                if (!wz0Var.A) {
                    wz0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                t01 t01Var = (t01) obj;
                if (animator.equals(t01Var.c)) {
                    t01Var.c = null;
                    break;
                }
                break;
            case 24:
                z11 z11Var = (z11) obj;
                nh.pa paVar = z11Var.K;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) z11Var.K.getParent()).removeView(z11Var.K);
                    }
                    z11Var.K = null;
                }
                z11Var.J = null;
                super.onAnimationEnd(animator);
                break;
            case 25:
                ((u31) obj).d.W.g0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((u31) obj).d;
                secretMediaViewer.W.setVisibility(4);
                secretMediaViewer.W.g0 = 1.0f;
                break;
            case 27:
                d61 d61Var = ((t41) obj).e;
                d61Var.O0.C = 0.0f;
                d61Var.O0 = null;
                d61Var.d0.invalidate();
                break;
            case 28:
                kg.g0.a();
                d61 d61Var2 = (d61) obj;
                a51 a51Var = d61Var2.d0;
                a51 a51Var2 = d61Var2.d0;
                a51Var.setLayerType(0, null);
                u41 u41Var = d61Var2.b0;
                u41Var.setLayerType(0, null);
                d61Var2.a0.setLayerType(0, null);
                d61Var2.U.setLayerType(0, null);
                org.telegram.ui.Components.fn fnVar = d61Var2.j0;
                if (fnVar != null) {
                    fnVar.setLayerType(0, null);
                }
                View view = d61Var2.i0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                u41Var.b();
                d61Var2.W.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                d61Var2.S1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ky0(globalInstance, 15));
                d61Var2.h();
                d61Var2.E(1.0f);
                for (int i11 = 0; i11 < a51Var2.getChildCount(); i11++) {
                    View childAt = a51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < d61Var2.W.b.getChildCount(); i12++) {
                    View childAt2 = d61Var2.W.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                d61Var2.W.b.invalidate();
                d61Var2.g0.invalidate();
                a51Var2.invalidate();
                break;
            default:
                ((t91) obj).X.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ss0 ss0Var = (ss0) this.b;
                ss0Var.b.Q0.setVisibility(0);
                ss0Var.b.y1.setVisibility(0);
                break;
            case 11:
                break;
            case 22:
                ((wz0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
