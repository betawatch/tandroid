package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class gp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.zk0) this.b).c).A2 = null;
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
                cq0 cq0Var = (cq0) obj;
                mc mcVar = cq0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) cq0Var.X.getParent()).removeView(cq0Var.X);
                    }
                    cq0Var.X = null;
                }
                cq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 1:
                er0 er0Var = (er0) obj;
                hr0 hr0Var = er0Var.D0;
                fr0[] fr0VarArr = hr0Var.n;
                hr0Var.r = null;
                if (hr0Var.w) {
                    fr0VarArr[1].setVisibility(8);
                } else {
                    fr0 fr0Var = fr0VarArr[0];
                    fr0VarArr[0] = fr0VarArr[1];
                    fr0VarArr[1] = fr0Var;
                    fr0Var.setVisibility(8);
                    hr0Var.e = hr0Var.n[0].e == hr0Var.h.getFirstTabId();
                    hr0Var.h.j(1.0f, hr0Var.n[0].e);
                }
                hr0Var.s = false;
                er0Var.y0 = false;
                er0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                kVar.setEnabled(true);
                hr0Var.h.setEnabled(true);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.zk0) obj).c;
                if (photoViewer.A2 != null) {
                    sl0 sl0Var = new sl0(this, 17);
                    photoViewer.I2 = sl0Var;
                    AndroidUtilities.runOnUIThread(sl0Var, 860L);
                    break;
                }
                break;
            case 3:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer2 = wt0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = wt0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                ci.j4 j4Var = photoViewer2.K1;
                if (j4Var != null) {
                    j4Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 4:
                xt0 xt0Var = (xt0) obj;
                PhotoViewer photoViewer3 = xt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = xt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                ci.j4 j4Var2 = photoViewer3.K1;
                if (j4Var2 != null) {
                    j4Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 5:
                ((PhotoViewer) ((bu0) obj).q0).y3[0].setTag(null);
                break;
            case 6:
                ((cu0) obj).d.T1.k0 = 1.0f;
                break;
            case 7:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new sl0(this, 19));
                break;
            case 9:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.c.U7)) {
                    tt0Var.c.U7 = null;
                    break;
                }
                break;
            case 10:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.c[1].setVisibility(8);
                    av0Var.e = null;
                    break;
                }
                break;
            case 11:
                pv0 pv0Var = (pv0) obj;
                if (pv0Var.C != null) {
                    pv0Var.C = null;
                    pv0Var.b();
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
                ((ProfileActivity) ((org.telegram.ui.Components.zk0) obj).c).D5 = null;
                break;
            case 15:
                a11 a11Var = (a11) obj;
                if (!a11Var.E) {
                    a11Var.setVisibility(8);
                    break;
                }
                break;
            case 16:
                w11 w11Var = (w11) obj;
                if (animator.equals(w11Var.c)) {
                    w11Var.c = null;
                    break;
                }
                break;
            case 17:
                e31 e31Var = (e31) obj;
                ci.wb wbVar = e31Var.O;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) e31Var.O.getParent()).removeView(e31Var.O);
                    }
                    e31Var.O = null;
                }
                e31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                ((a51) obj).d.a0.k0 = 1.0f;
                break;
            case 19:
                SecretMediaViewer secretMediaViewer = ((a51) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 20:
                j71 j71Var = ((z51) obj).e;
                j71Var.S0.G = 0.0f;
                j71Var.S0 = null;
                j71Var.h0.invalidate();
                break;
            case 21:
                zg.e0.a();
                j71 j71Var2 = (j71) obj;
                g61 g61Var = j71Var2.h0;
                g61 g61Var2 = j71Var2.h0;
                g61Var.setLayerType(0, null);
                a61 a61Var = j71Var2.f0;
                a61Var.setLayerType(0, null);
                j71Var2.e0.setLayerType(0, null);
                j71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = j71Var2.n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = j71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                a61Var.b();
                j71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                j71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new e01(globalInstance, 13));
                j71Var2.h();
                j71Var2.E(1.0f);
                for (int i11 = 0; i11 < g61Var2.getChildCount(); i11++) {
                    View childAt = g61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < j71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = j71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                j71Var2.d0.b.invalidate();
                j71Var2.k0.invalidate();
                g61Var2.invalidate();
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
                if (animator.equals(hh1Var.e.K)) {
                    hh1Var.e.K = null;
                    break;
                }
                break;
            case 27:
                xh1 xh1Var = (xh1) obj;
                xh1Var.d = null;
                xh1Var.a = null;
                xh1Var.b = false;
                xh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 28:
                oi.i iVar = (oi.i) obj;
                ((oj1) iVar.b).getClass();
                ((oj1) iVar.b).c.setVisibility(4);
                break;
            default:
                ((org.telegram.ui.web.d1) obj).s.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                wt0 wt0Var = (wt0) this.b;
                wt0Var.b.U0.setVisibility(0);
                wt0Var.b.C1.setVisibility(0);
                break;
            case 4:
                break;
            case 15:
                ((a11) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
