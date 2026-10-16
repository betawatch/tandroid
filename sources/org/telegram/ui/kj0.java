package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kj0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((PhotoViewer) ((org.telegram.ui.Components.ql0) this.b).c).A2 = null;
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
                ((pj0) obj).T.setVisibility(8);
                break;
            case 1:
                jk0 jk0Var = (jk0) obj;
                jk0Var.f = 1.0f;
                jk0Var.invalidate();
                break;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 3:
                eq0 eq0Var = (eq0) obj;
                qc qcVar = eq0Var.X;
                if (qcVar != null) {
                    if (qcVar.getParent() != null) {
                        ((ViewGroup) eq0Var.X.getParent()).removeView(eq0Var.X);
                    }
                    eq0Var.X = null;
                }
                eq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 4:
                hr0 hr0Var = (hr0) obj;
                kr0 kr0Var = hr0Var.D0;
                ir0[] ir0VarArr = kr0Var.n;
                kr0Var.r = null;
                if (kr0Var.w) {
                    ir0VarArr[1].setVisibility(8);
                } else {
                    ir0 ir0Var = ir0VarArr[0];
                    ir0VarArr[0] = ir0VarArr[1];
                    ir0VarArr[1] = ir0Var;
                    ir0Var.setVisibility(8);
                    kr0Var.e = kr0Var.n[0].e == kr0Var.h.getFirstTabId();
                    kr0Var.h.j(1.0f, kr0Var.n[0].e);
                }
                kr0Var.s = false;
                hr0Var.y0 = false;
                hr0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) kr0Var).actionBar;
                kVar.setEnabled(true);
                kr0Var.h.setEnabled(true);
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).c;
                if (photoViewer.A2 != null) {
                    xk0 xk0Var = new xk0(this, 18);
                    photoViewer.I2 = xk0Var;
                    AndroidUtilities.runOnUIThread(xk0Var, 860L);
                    break;
                }
                break;
            case 6:
                cu0 cu0Var = (cu0) obj;
                PhotoViewer photoViewer2 = cu0Var.b;
                mg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = cu0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                di.h4 h4Var = photoViewer2.K1;
                if (h4Var != null) {
                    h4Var.b(photoViewer2.u4 != 3);
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
            case 7:
                du0 du0Var = (du0) obj;
                PhotoViewer photoViewer3 = du0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = du0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                di.h4 h4Var2 = photoViewer3.K1;
                if (h4Var2 != null) {
                    h4Var2.b(photoViewer3.u4 != 3);
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
            case 8:
                ((PhotoViewer) ((hu0) obj).q0).y3[0].setTag(null);
                break;
            case 9:
                ((iu0) obj).d.T1.k0 = 1.0f;
                break;
            case 10:
                PhotoViewer photoViewer4 = ((iu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new xk0(this, 20));
                break;
            case 12:
                zt0 zt0Var = (zt0) obj;
                if (animator.equals(zt0Var.c.U7)) {
                    zt0Var.c.U7 = null;
                    break;
                }
                break;
            case 13:
                gv0 gv0Var = (gv0) obj;
                if (gv0Var.e == animator) {
                    gv0Var.c[1].setVisibility(8);
                    gv0Var.e = null;
                    break;
                }
                break;
            case 14:
                vv0 vv0Var = (vv0) obj;
                if (vv0Var.C != null) {
                    vv0Var.C = null;
                    vv0Var.b();
                    break;
                }
                break;
            case 15:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 16:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                ((ProfileActivity) ((org.telegram.ui.Components.ql0) obj).c).D5 = null;
                break;
            case 18:
                f11 f11Var = (f11) obj;
                if (!f11Var.E) {
                    f11Var.setVisibility(8);
                    break;
                }
                break;
            case 19:
                c21 c21Var = (c21) obj;
                if (animator.equals(c21Var.c)) {
                    c21Var.c = null;
                    break;
                }
                break;
            case 20:
                k31 k31Var = (k31) obj;
                di.sb sbVar = k31Var.O;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) k31Var.O.getParent()).removeView(k31Var.O);
                    }
                    k31Var.O = null;
                }
                k31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 21:
                ((g51) obj).d.a0.k0 = 1.0f;
                break;
            case 22:
                SecretMediaViewer secretMediaViewer = ((g51) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 23:
                r71 r71Var = ((h61) obj).e;
                r71Var.S0.G = 0.0f;
                r71Var.S0 = null;
                r71Var.h0.invalidate();
                break;
            case 24:
                ah.x0.a();
                r71 r71Var2 = (r71) obj;
                o61 o61Var = r71Var2.h0;
                o61 o61Var2 = r71Var2.h0;
                o61Var.setLayerType(0, null);
                i61 i61Var = r71Var2.f0;
                i61Var.setLayerType(0, null);
                r71Var2.e0.setLayerType(0, null);
                r71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.xn xnVar = r71Var2.n0;
                if (xnVar != null) {
                    xnVar.setLayerType(0, null);
                }
                View view = r71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i61Var.b();
                r71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                r71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new tz0(globalInstance, 14));
                r71Var2.h();
                r71Var2.E(1.0f);
                for (int i11 = 0; i11 < o61Var2.getChildCount(); i11++) {
                    View childAt = o61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < r71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = r71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r71Var2.d0.b.invalidate();
                r71Var2.k0.invalidate();
                o61Var2.invalidate();
                break;
            case 25:
                ((hb1) obj).b0.setVisibility(8);
                break;
            case 26:
                ce1 ce1Var = ((qd1) obj).a;
                if (!ce1Var.p1.a()) {
                    ce1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((ef1) obj).a = null;
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((ig1) obj).setScrollEnabled(true);
                break;
            default:
                nh1 nh1Var = (nh1) obj;
                if (animator.equals(nh1Var.d.K)) {
                    nh1Var.d.K = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                cu0 cu0Var = (cu0) this.b;
                cu0Var.b.U0.setVisibility(0);
                cu0Var.b.C1.setVisibility(0);
                break;
            case 7:
                break;
            case 18:
                ((f11) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
