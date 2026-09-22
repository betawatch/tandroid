package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cr0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.pk0) this.b).c).A2 = null;
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
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pk0) obj).c;
                if (photoViewer.A2 != null) {
                    pl0 pl0Var = new pl0(this, 17);
                    photoViewer.I2 = pl0Var;
                    AndroidUtilities.runOnUIThread(pl0Var, 860L);
                    break;
                }
                break;
            case 2:
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
            case 3:
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
            case 4:
                ((PhotoViewer) ((bu0) obj).q0).y3[0].setTag(null);
                break;
            case 5:
                ((cu0) obj).d.T1.k0 = 1.0f;
                break;
            case 6:
                PhotoViewer photoViewer4 = ((cu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new pl0(this, 19));
                break;
            case 8:
                tt0 tt0Var = (tt0) obj;
                if (animator.equals(tt0Var.c.U7)) {
                    tt0Var.c.U7 = null;
                    break;
                }
                break;
            case 9:
                av0 av0Var = (av0) obj;
                if (av0Var.e == animator) {
                    av0Var.c[1].setVisibility(8);
                    av0Var.e = null;
                    break;
                }
                break;
            case 10:
                pv0 pv0Var = (pv0) obj;
                if (pv0Var.C != null) {
                    pv0Var.C = null;
                    pv0Var.b();
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
                ((ProfileActivity) ((org.telegram.ui.Components.pk0) obj).c).D5 = null;
                break;
            case 14:
                b11 b11Var = (b11) obj;
                if (!b11Var.E) {
                    b11Var.setVisibility(8);
                    break;
                }
                break;
            case 15:
                x11 x11Var = (x11) obj;
                if (animator.equals(x11Var.c)) {
                    x11Var.c = null;
                    break;
                }
                break;
            case 16:
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
            case 17:
                ((x41) obj).d.a0.k0 = 1.0f;
                break;
            case 18:
                SecretMediaViewer secretMediaViewer = ((x41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 19:
                h71 h71Var = ((x51) obj).e;
                h71Var.S0.G = 0.0f;
                h71Var.S0 = null;
                h71Var.h0.invalidate();
                break;
            case 20:
                zg.f0.a();
                h71 h71Var2 = (h71) obj;
                e61 e61Var = h71Var2.h0;
                e61 e61Var2 = h71Var2.h0;
                e61Var.setLayerType(0, null);
                y51 y51Var = h71Var2.f0;
                y51Var.setLayerType(0, null);
                h71Var2.e0.setLayerType(0, null);
                h71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.kn knVar = h71Var2.n0;
                if (knVar != null) {
                    knVar.setLayerType(0, null);
                }
                View view = h71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                y51Var.b();
                h71Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                h71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new f01(globalInstance, 13));
                h71Var2.h();
                h71Var2.E(1.0f);
                for (int i11 = 0; i11 < e61Var2.getChildCount(); i11++) {
                    View childAt = e61Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < h71Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = h71Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                h71Var2.d0.b.invalidate();
                h71Var2.k0.invalidate();
                e61Var2.invalidate();
                break;
            case 21:
                ((za1) obj).b0.setVisibility(8);
                break;
            case 22:
                wd1 wd1Var = ((kd1) obj).a;
                if (!wd1Var.p1.a()) {
                    wd1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ye1) obj).a = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((cg1) obj).setScrollEnabled(true);
                break;
            case 25:
                gh1 gh1Var = (gh1) obj;
                if (animator.equals(gh1Var.e.K)) {
                    gh1Var.e.K = null;
                    break;
                }
                break;
            case 26:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d = null;
                yh1Var.a = null;
                yh1Var.b = false;
                yh1Var.f.c.setAllowDrawCursor(true);
                break;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((pj1) iVar.b).getClass();
                ((pj1) iVar.b).c.setVisibility(4);
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
                wt0 wt0Var = (wt0) this.b;
                wt0Var.b.U0.setVisibility(0);
                wt0Var.b.C1.setVisibility(0);
                break;
            case 3:
                break;
            case 14:
                ((b11) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
