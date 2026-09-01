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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ns0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ns0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.fx0) this.b).c).x2 = null;
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
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.fx0) obj).c;
                if (photoViewer.x2 != null) {
                    gl0 gl0Var = new gl0(this, 18);
                    photoViewer.F2 = gl0Var;
                    AndroidUtilities.runOnUIThread(gl0Var, 860L);
                    break;
                }
                break;
            case 1:
                dt0 dt0Var = (dt0) obj;
                PhotoViewer photoViewer2 = dt0Var.b;
                zf.n nVar = photoViewer2.z1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.z1.b.G = true;
                photoViewer2.m6 = null;
                photoViewer2.r4 = dt0Var.a;
                photoViewer2.f1().I.b(photoViewer2.r4 != 0);
                qh.i3 i3Var = photoViewer2.H1;
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
                et0 et0Var = (et0) obj;
                PhotoViewer photoViewer3 = et0Var.b;
                photoViewer3.F1.f0.setVisibility(0);
                photoViewer3.m6 = null;
                photoViewer3.r4 = et0Var.a;
                photoViewer3.f1().I.b(photoViewer3.r4 != 0);
                qh.i3 i3Var2 = photoViewer3.H1;
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
                ((PhotoViewer) ((it0) obj).n0).v3[0].setTag(null);
                break;
            case 4:
                ((jt0) obj).d.Q1.h0 = 1.0f;
                break;
            case 5:
                PhotoViewer photoViewer4 = ((jt0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.h0 = 1.0f;
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gl0(this, 20));
                break;
            case 7:
                at0 at0Var = (at0) obj;
                if (animator.equals(at0Var.c.Q7)) {
                    at0Var.c.Q7 = null;
                    break;
                }
                break;
            case 8:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.e == animator) {
                    iu0Var.c[1].setVisibility(8);
                    iu0Var.e = null;
                    break;
                }
                break;
            case 9:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.C != null) {
                    xu0Var.C = null;
                    xu0Var.b();
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
                ((ProfileActivity) ((org.telegram.ui.Components.fx0) obj).c).A5 = null;
                break;
            case 13:
                j01 j01Var = (j01) obj;
                if (!j01Var.B) {
                    j01Var.setVisibility(8);
                    break;
                }
                break;
            case 14:
                g11 g11Var = (g11) obj;
                if (animator.equals(g11Var.c)) {
                    g11Var.c = null;
                    break;
                }
                break;
            case 15:
                n21 n21Var = (n21) obj;
                org.telegram.ui.Components.wo woVar = n21Var.L;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) n21Var.L.getParent()).removeView(n21Var.L);
                    }
                    n21Var.L = null;
                }
                n21Var.K = null;
                super.onAnimationEnd(animator);
                break;
            case 16:
                ((g41) obj).d.X.h0 = 1.0f;
                break;
            case 17:
                SecretMediaViewer secretMediaViewer = ((g41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.h0 = 1.0f;
                break;
            case 18:
                r61 r61Var = ((h51) obj).e;
                r61Var.P0.D = 0.0f;
                r61Var.P0 = null;
                r61Var.e0.invalidate();
                break;
            case 19:
                ng.g0.a();
                r61 r61Var2 = (r61) obj;
                o51 o51Var = r61Var2.e0;
                o51 o51Var2 = r61Var2.e0;
                o51Var.setLayerType(0, null);
                i51 i51Var = r61Var2.c0;
                i51Var.setLayerType(0, null);
                r61Var2.b0.setLayerType(0, null);
                r61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = r61Var2.k0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
                }
                View view = r61Var2.j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i51Var.b();
                r61Var2.a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                r61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new xy0(globalInstance, 14));
                r61Var2.h();
                r61Var2.E(1.0f);
                for (int i11 = 0; i11 < o51Var2.getChildCount(); i11++) {
                    View childAt = o51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < r61Var2.a0.b.getChildCount(); i12++) {
                    View childAt2 = r61Var2.a0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r61Var2.a0.b.invalidate();
                r61Var2.h0.invalidate();
                o51Var2.invalidate();
                break;
            case 20:
                ((ha1) obj).Y.setVisibility(8);
                break;
            case 21:
                ed1 ed1Var = ((sc1) obj).a;
                if (!ed1Var.m1.a()) {
                    ed1Var.O1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((ge1) obj).a = null;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((kf1) obj).setScrollEnabled(true);
                break;
            case 24:
                pg1 pg1Var = (pg1) obj;
                if (animator.equals(pg1Var.e.H)) {
                    pg1Var.e.H = null;
                    break;
                }
                break;
            case 25:
                gh1 gh1Var = (gh1) obj;
                gh1Var.d = null;
                gh1Var.a = null;
                gh1Var.b = false;
                gh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 26:
                org.telegram.ui.Components.tf0 tf0Var = (org.telegram.ui.Components.tf0) obj;
                ((yi1) tf0Var.b).getClass();
                ((yi1) tf0Var.b).c.setVisibility(4);
                break;
            case 27:
                ((org.telegram.ui.web.a1) obj).s.setVisibility(8);
                break;
            case 28:
                qh.k kVar = ((qh.f) obj).W;
                if (kVar.d0 == animator) {
                    kVar.d0 = null;
                    kVar.f.getEditText().setScrollY(kVar.V);
                    break;
                }
                break;
            default:
                qh.x xVar = (qh.x) obj;
                xVar.l = 1.0f;
                qh.y yVar = xVar.p;
                if (yVar.n.contains(xVar)) {
                    xVar.c.onDetachedFromWindow();
                    fg.s2 s2Var = xVar.d;
                    if (s2Var != null) {
                        s2Var.pause();
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
                dt0 dt0Var = (dt0) this.b;
                dt0Var.b.R0.setVisibility(0);
                dt0Var.b.z1.setVisibility(0);
                break;
            case 2:
                break;
            case 13:
                ((j01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
