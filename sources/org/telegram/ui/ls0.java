package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ls0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.ex0) this.b).c).x2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ex0) obj).c;
                if (photoViewer.x2 != null) {
                    el0 el0Var = new el0(this, 18);
                    photoViewer.F2 = el0Var;
                    AndroidUtilities.runOnUIThread(el0Var, 860L);
                    break;
                }
                break;
            case 1:
                bt0 bt0Var = (bt0) obj;
                PhotoViewer photoViewer2 = bt0Var.b;
                yf.n nVar = photoViewer2.z1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.z1.b.G = true;
                photoViewer2.m6 = null;
                photoViewer2.r4 = bt0Var.a;
                photoViewer2.f1().I.b(photoViewer2.r4 != 0);
                ph.i3 i3Var = photoViewer2.H1;
                if (i3Var != null) {
                    i3Var.b(photoViewer2.r4 != 3);
                }
                if (photoViewer2.r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.l6 = -1;
                photoViewer2.b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.q2 = true;
                photoViewer2.b0.invalidate();
                break;
            case 2:
                ct0 ct0Var = (ct0) obj;
                PhotoViewer photoViewer3 = ct0Var.b;
                photoViewer3.F1.f0.setVisibility(0);
                photoViewer3.m6 = null;
                photoViewer3.r4 = ct0Var.a;
                photoViewer3.f1().I.b(photoViewer3.r4 != 0);
                ph.i3 i3Var2 = photoViewer3.H1;
                if (i3Var2 != null) {
                    i3Var2.b(photoViewer3.r4 != 3);
                }
                if (photoViewer3.r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.l6 = -1;
                photoViewer3.b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.q2 = true;
                photoViewer3.b0.invalidate();
                break;
            case 3:
                ((PhotoViewer) ((gt0) obj).n0).v3[0].setTag(null);
                break;
            case 4:
                ((ht0) obj).d.Q1.h0 = 1.0f;
                break;
            case 5:
                PhotoViewer photoViewer4 = ((ht0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.h0 = 1.0f;
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new el0(this, 20));
                break;
            case 7:
                ys0 ys0Var = (ys0) obj;
                if (animator.equals(ys0Var.c.Q7)) {
                    ys0Var.c.Q7 = null;
                    break;
                }
                break;
            case 8:
                gu0 gu0Var = (gu0) obj;
                if (gu0Var.e == animator) {
                    gu0Var.c[1].setVisibility(8);
                    gu0Var.e = null;
                    break;
                }
                break;
            case 9:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.C != null) {
                    vu0Var.C = null;
                    vu0Var.b();
                    break;
                }
                break;
            case 10:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.V;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.V = null;
                    break;
                }
                break;
            case 11:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.a0.removeView(premiumPreviewFragment.o0);
                premiumPreviewFragment.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.ex0) obj).c).A5 = null;
                break;
            case 13:
                h01 h01Var = (h01) obj;
                if (!h01Var.B) {
                    h01Var.setVisibility(8);
                    break;
                }
                break;
            case 14:
                e11 e11Var = (e11) obj;
                if (animator.equals(e11Var.c)) {
                    e11Var.c = null;
                    break;
                }
                break;
            case 15:
                l21 l21Var = (l21) obj;
                org.telegram.ui.Components.uo uoVar = l21Var.L;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) l21Var.L.getParent()).removeView(l21Var.L);
                    }
                    l21Var.L = null;
                }
                l21Var.K = null;
                super.onAnimationEnd(animator);
                break;
            case 16:
                ((e41) obj).d.X.h0 = 1.0f;
                break;
            case 17:
                SecretMediaViewer secretMediaViewer = ((e41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.h0 = 1.0f;
                break;
            case 18:
                q61 q61Var = ((f51) obj).e;
                q61Var.P0.D = 0.0f;
                q61Var.P0 = null;
                q61Var.e0.invalidate();
                break;
            case 19:
                mg.g0.a();
                q61 q61Var2 = (q61) obj;
                m51 m51Var = q61Var2.e0;
                m51 m51Var2 = q61Var2.e0;
                m51Var.setLayerType(0, null);
                g51 g51Var = q61Var2.c0;
                g51Var.setLayerType(0, null);
                q61Var2.b0.setLayerType(0, null);
                q61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.hn hnVar = q61Var2.k0;
                if (hnVar != null) {
                    hnVar.setLayerType(0, null);
                }
                View view = q61Var2.j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                g51Var.b();
                q61Var2.a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                q61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new vy0(globalInstance, 15));
                q61Var2.h();
                q61Var2.E(1.0f);
                for (int i11 = 0; i11 < m51Var2.getChildCount(); i11++) {
                    View childAt = m51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < q61Var2.a0.b.getChildCount(); i12++) {
                    View childAt2 = q61Var2.a0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q61Var2.a0.b.invalidate();
                q61Var2.h0.invalidate();
                m51Var2.invalidate();
                break;
            case 20:
                ((ga1) obj).Y.setVisibility(8);
                break;
            case 21:
                cd1 cd1Var = ((qc1) obj).a;
                if (!cd1Var.m1.a()) {
                    cd1Var.O1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((de1) obj).a = null;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((if1) obj).setScrollEnabled(true);
                break;
            case 24:
                ng1 ng1Var = (ng1) obj;
                if (animator.equals(ng1Var.e.H)) {
                    ng1Var.e.H = null;
                    break;
                }
                break;
            case 25:
                eh1 eh1Var = (eh1) obj;
                eh1Var.d = null;
                eh1Var.a = null;
                eh1Var.b = false;
                eh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 26:
                org.telegram.ui.Components.rf0 rf0Var = (org.telegram.ui.Components.rf0) obj;
                ((vi1) rf0Var.b).getClass();
                ((vi1) rf0Var.b).c.setVisibility(4);
                break;
            case 27:
                ((org.telegram.ui.web.a1) obj).s.setVisibility(8);
                break;
            case 28:
                ph.k kVar = ((ph.f) obj).W;
                if (kVar.d0 == animator) {
                    kVar.d0 = null;
                    kVar.f.getEditText().setScrollY(kVar.V);
                    break;
                }
                break;
            default:
                ph.x xVar = (ph.x) obj;
                xVar.l = 1.0f;
                ph.y yVar = xVar.p;
                if (yVar.n.contains(xVar)) {
                    xVar.c.onDetachedFromWindow();
                    eg.t2 t2Var = xVar.d;
                    if (t2Var != null) {
                        t2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.e = null;
                    }
                    xVar.f = false;
                    yVar.n.remove(xVar);
                }
                yVar.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                bt0 bt0Var = (bt0) this.b;
                bt0Var.b.R0.setVisibility(0);
                bt0Var.b.z1.setVisibility(0);
                break;
            case 2:
                break;
            case 13:
                ((h01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
