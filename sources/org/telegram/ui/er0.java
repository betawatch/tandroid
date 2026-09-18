package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class er0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ er0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.qk0) this.b).c).A2 = null;
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
                fr0 fr0Var = (fr0) obj;
                ir0 ir0Var = fr0Var.D0;
                gr0[] gr0VarArr = ir0Var.n;
                ir0Var.r = null;
                if (ir0Var.w) {
                    gr0VarArr[1].setVisibility(8);
                } else {
                    gr0 gr0Var = gr0VarArr[0];
                    gr0VarArr[0] = gr0VarArr[1];
                    gr0VarArr[1] = gr0Var;
                    gr0Var.setVisibility(8);
                    ir0Var.e = ir0Var.n[0].e == ir0Var.h.getFirstTabId();
                    ir0Var.h.j(1.0f, ir0Var.n[0].e);
                }
                ir0Var.s = false;
                fr0Var.y0 = false;
                fr0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
                kVar.setEnabled(true);
                ir0Var.h.setEnabled(true);
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.qk0) obj).c;
                if (photoViewer.A2 != null) {
                    sl0 sl0Var = new sl0(this, 17);
                    photoViewer.I2 = sl0Var;
                    AndroidUtilities.runOnUIThread(sl0Var, 860L);
                    break;
                }
                break;
            case 2:
                yt0 yt0Var = (yt0) obj;
                PhotoViewer photoViewer2 = yt0Var.b;
                lg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = yt0Var.a;
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
            case 3:
                zt0 zt0Var = (zt0) obj;
                PhotoViewer photoViewer3 = zt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = zt0Var.a;
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
            case 4:
                ((PhotoViewer) ((du0) obj).q0).y3[0].setTag(null);
                break;
            case 5:
                ((eu0) obj).d.T1.k0 = 1.0f;
                break;
            case 6:
                PhotoViewer photoViewer4 = ((eu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new sl0(this, 19));
                break;
            case 8:
                vt0 vt0Var = (vt0) obj;
                if (animator.equals(vt0Var.c.U7)) {
                    vt0Var.c.U7 = null;
                    break;
                }
                break;
            case 9:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.e == animator) {
                    cv0Var.c[1].setVisibility(8);
                    cv0Var.e = null;
                    break;
                }
                break;
            case 10:
                rv0 rv0Var = (rv0) obj;
                if (rv0Var.C != null) {
                    rv0Var.C = null;
                    rv0Var.b();
                    break;
                }
                break;
            case 11:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 12:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.qk0) obj).c).D5 = null;
                break;
            case 14:
                c11 c11Var = (c11) obj;
                if (!c11Var.E) {
                    c11Var.setVisibility(8);
                    break;
                }
                break;
            case 15:
                y11 y11Var = (y11) obj;
                if (animator.equals(y11Var.c)) {
                    y11Var.c = null;
                    break;
                }
                break;
            case 16:
                f31 f31Var = (f31) obj;
                ci.wb wbVar = f31Var.O;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) f31Var.O.getParent()).removeView(f31Var.O);
                    }
                    f31Var.O = null;
                }
                f31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                ((z41) obj).d.a0.k0 = 1.0f;
                break;
            case 18:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 19:
                i71 i71Var = ((y51) obj).e;
                i71Var.S0.G = 0.0f;
                i71Var.S0 = null;
                i71Var.h0.invalidate();
                break;
            case 20:
                zg.f0.a();
                i71 i71Var2 = (i71) obj;
                f61 f61Var = i71Var2.h0;
                f61 f61Var2 = i71Var2.h0;
                f61Var.setLayerType(0, null);
                z51 z51Var = i71Var2.f0;
                z51Var.setLayerType(0, null);
                i71Var2.e0.setLayerType(0, null);
                i71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = i71Var2.n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = i71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                z51Var.b();
                i71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                i71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new g01(globalInstance, 13));
                i71Var2.h();
                i71Var2.E(1.0f);
                for (int i11 = 0; i11 < f61Var2.getChildCount(); i11++) {
                    View childAt = f61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < i71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = i71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                i71Var2.d0.b.invalidate();
                i71Var2.k0.invalidate();
                f61Var2.invalidate();
                break;
            case 21:
                ((ab1) obj).b0.setVisibility(8);
                break;
            case 22:
                xd1 xd1Var = ((ld1) obj).a;
                if (!xd1Var.p1.a()) {
                    xd1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ze1) obj).a = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((dg1) obj).setScrollEnabled(true);
                break;
            case 25:
                hh1 hh1Var = (hh1) obj;
                if (animator.equals(hh1Var.e.K)) {
                    hh1Var.e.K = null;
                    break;
                }
                break;
            case 26:
                xh1 xh1Var = (xh1) obj;
                xh1Var.d = null;
                xh1Var.a = null;
                xh1Var.b = false;
                xh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((oj1) iVar.b).getClass();
                ((oj1) iVar.b).c.setVisibility(4);
                break;
            case 28:
                ((org.telegram.ui.web.d1) obj).s.setVisibility(8);
                break;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                yt0 yt0Var = (yt0) this.b;
                yt0Var.b.U0.setVisibility(0);
                yt0Var.b.C1.setVisibility(0);
                break;
            case 3:
                break;
            case 14:
                ((c11) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
