package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lj0(Object obj, int i10) {
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
                ((qj0) obj).T.setVisibility(8);
                break;
            case 1:
                kk0 kk0Var = (kk0) obj;
                kk0Var.f = 1.0f;
                kk0Var.invalidate();
                break;
            case 2:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 3:
                gq0 gq0Var = (gq0) obj;
                rc rcVar = gq0Var.X;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) gq0Var.X.getParent()).removeView(gq0Var.X);
                    }
                    gq0Var.X = null;
                }
                gq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 4:
                jr0 jr0Var = (jr0) obj;
                mr0 mr0Var = jr0Var.D0;
                kr0[] kr0VarArr = mr0Var.n;
                mr0Var.r = null;
                if (mr0Var.w) {
                    kr0VarArr[1].setVisibility(8);
                } else {
                    kr0 kr0Var = kr0VarArr[0];
                    kr0VarArr[0] = kr0VarArr[1];
                    kr0VarArr[1] = kr0Var;
                    kr0Var.setVisibility(8);
                    mr0Var.e = mr0Var.n[0].e == mr0Var.h.getFirstTabId();
                    mr0Var.h.j(1.0f, mr0Var.n[0].e);
                }
                mr0Var.s = false;
                jr0Var.y0 = false;
                jr0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                kVar.setEnabled(true);
                mr0Var.h.setEnabled(true);
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).c;
                if (photoViewer.A2 != null) {
                    yk0 yk0Var = new yk0(this, 18);
                    photoViewer.I2 = yk0Var;
                    AndroidUtilities.runOnUIThread(yk0Var, 860L);
                    break;
                }
                break;
            case 6:
                du0 du0Var = (du0) obj;
                PhotoViewer photoViewer2 = du0Var.b;
                mg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = du0Var.a;
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
                eu0 eu0Var = (eu0) obj;
                PhotoViewer photoViewer3 = eu0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = eu0Var.a;
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
                ((PhotoViewer) ((iu0) obj).q0).y3[0].setTag(null);
                break;
            case 9:
                ((ju0) obj).d.T1.k0 = 1.0f;
                break;
            case 10:
                PhotoViewer photoViewer4 = ((ju0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new yk0(this, 20));
                break;
            case 12:
                au0 au0Var = (au0) obj;
                if (animator.equals(au0Var.c.U7)) {
                    au0Var.c.U7 = null;
                    break;
                }
                break;
            case 13:
                hv0 hv0Var = (hv0) obj;
                if (hv0Var.e == animator) {
                    hv0Var.c[1].setVisibility(8);
                    hv0Var.e = null;
                    break;
                }
                break;
            case 14:
                wv0 wv0Var = (wv0) obj;
                if (wv0Var.C != null) {
                    wv0Var.C = null;
                    wv0Var.b();
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
                g11 g11Var = (g11) obj;
                if (!g11Var.E) {
                    g11Var.setVisibility(8);
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
                AndroidUtilities.runOnUIThread(new uz0(globalInstance, 14));
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
                ((ff1) obj).a = null;
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((jg1) obj).setScrollEnabled(true);
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
                du0 du0Var = (du0) this.b;
                du0Var.b.U0.setVisibility(0);
                du0Var.b.C1.setVisibility(0);
                break;
            case 7:
                break;
            case 18:
                ((g11) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
