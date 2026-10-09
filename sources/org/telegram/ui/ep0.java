package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ep0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ep0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.ul0) this.b).c).A2 = null;
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
                aq0 aq0Var = (aq0) obj;
                lc lcVar = aq0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) aq0Var.X.getParent()).removeView(aq0Var.X);
                    }
                    aq0Var.X = null;
                }
                aq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 1:
                dr0 dr0Var = (dr0) obj;
                gr0 gr0Var = dr0Var.D0;
                er0[] er0VarArr = gr0Var.n;
                gr0Var.r = null;
                if (gr0Var.w) {
                    er0VarArr[1].setVisibility(8);
                } else {
                    er0 er0Var = er0VarArr[0];
                    er0VarArr[0] = er0VarArr[1];
                    er0VarArr[1] = er0Var;
                    er0Var.setVisibility(8);
                    gr0Var.e = gr0Var.n[0].e == gr0Var.h.getFirstTabId();
                    gr0Var.h.j(1.0f, gr0Var.n[0].e);
                }
                gr0Var.s = false;
                dr0Var.y0 = false;
                dr0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                kVar.setEnabled(true);
                gr0Var.h.setEnabled(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ul0) obj).c;
                if (photoViewer.A2 != null) {
                    tk0 tk0Var = new tk0(this, 18);
                    photoViewer.I2 = tk0Var;
                    AndroidUtilities.runOnUIThread(tk0Var, 860L);
                    break;
                }
                break;
            case 3:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer2 = xt0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = xt0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                ci.h4 h4Var = photoViewer2.K1;
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
            case 4:
                yt0 yt0Var = (yt0) obj;
                PhotoViewer photoViewer3 = yt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = yt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                ci.h4 h4Var2 = photoViewer3.K1;
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
            case 5:
                ((PhotoViewer) ((cu0) obj).q0).y3[0].setTag(null);
                break;
            case 6:
                ((du0) obj).d.T1.k0 = 1.0f;
                break;
            case 7:
                PhotoViewer photoViewer4 = ((du0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new tk0(this, 20));
                break;
            case 9:
                ut0 ut0Var = (ut0) obj;
                if (animator.equals(ut0Var.c.U7)) {
                    ut0Var.c.U7 = null;
                    break;
                }
                break;
            case 10:
                bv0 bv0Var = (bv0) obj;
                if (bv0Var.e == animator) {
                    bv0Var.c[1].setVisibility(8);
                    bv0Var.e = null;
                    break;
                }
                break;
            case 11:
                qv0 qv0Var = (qv0) obj;
                if (qv0Var.C != null) {
                    qv0Var.C = null;
                    qv0Var.b();
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
                ((ProfileActivity) ((org.telegram.ui.Components.ul0) obj).c).D5 = null;
                break;
            case 15:
                z01 z01Var = (z01) obj;
                if (!z01Var.E) {
                    z01Var.setVisibility(8);
                    break;
                }
                break;
            case 16:
                v11 v11Var = (v11) obj;
                if (animator.equals(v11Var.c)) {
                    v11Var.c = null;
                    break;
                }
                break;
            case 17:
                d31 d31Var = (d31) obj;
                ci.tb tbVar = d31Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) d31Var.O.getParent()).removeView(d31Var.O);
                    }
                    d31Var.O = null;
                }
                d31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                ((z41) obj).d.a0.k0 = 1.0f;
                break;
            case 19:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 20:
                k71 k71Var = ((a61) obj).e;
                k71Var.S0.G = 0.0f;
                k71Var.S0 = null;
                k71Var.h0.invalidate();
                break;
            case 21:
                zg.d0.a();
                k71 k71Var2 = (k71) obj;
                h61 h61Var = k71Var2.h0;
                h61 h61Var2 = k71Var2.h0;
                h61Var.setLayerType(0, null);
                b61 b61Var = k71Var2.f0;
                b61Var.setLayerType(0, null);
                k71Var2.e0.setLayerType(0, null);
                k71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.ao aoVar = k71Var2.n0;
                if (aoVar != null) {
                    aoVar.setLayerType(0, null);
                }
                View view = k71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                b61Var.b();
                k71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                k71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new nz0(globalInstance, 14));
                k71Var2.h();
                k71Var2.E(1.0f);
                for (int i11 = 0; i11 < h61Var2.getChildCount(); i11++) {
                    View childAt = h61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < k71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = k71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                k71Var2.d0.b.invalidate();
                k71Var2.k0.invalidate();
                h61Var2.invalidate();
                break;
            case 22:
                ((bb1) obj).b0.setVisibility(8);
                break;
            case 23:
                xd1 xd1Var = ((ld1) obj).a;
                if (!xd1Var.p1.a()) {
                    xd1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((ze1) obj).a = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((dg1) obj).setScrollEnabled(true);
                break;
            case 26:
                hh1 hh1Var = (hh1) obj;
                if (animator.equals(hh1Var.d.K)) {
                    hh1Var.d.K = null;
                    break;
                }
                break;
            case 27:
                zh1 zh1Var = (zh1) obj;
                zh1Var.d = null;
                zh1Var.a = null;
                zh1Var.b = false;
                zh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 28:
                ((org.telegram.ui.Wallet.x2) obj).K = null;
                break;
            default:
                ((org.telegram.ui.Wallet.d3) obj).f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                xt0 xt0Var = (xt0) this.b;
                xt0Var.b.U0.setVisibility(0);
                xt0Var.b.C1.setVisibility(0);
                break;
            case 4:
                break;
            case 15:
                ((z01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
