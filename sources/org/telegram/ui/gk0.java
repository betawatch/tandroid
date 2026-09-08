package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
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
                hk0 hk0Var = (hk0) obj;
                hk0Var.f = 1.0f;
                hk0Var.invalidate();
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 2:
                bq0 bq0Var = (bq0) obj;
                mc mcVar = bq0Var.X;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bq0Var.X.getParent()).removeView(bq0Var.X);
                    }
                    bq0Var.X = null;
                }
                bq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 3:
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
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pk0) obj).c;
                if (photoViewer.A2 != null) {
                    rl0 rl0Var = new rl0(this, 17);
                    photoViewer.I2 = rl0Var;
                    AndroidUtilities.runOnUIThread(rl0Var, 860L);
                    break;
                }
                break;
            case 5:
                vt0 vt0Var = (vt0) obj;
                PhotoViewer photoViewer2 = vt0Var.b;
                mg.q qVar = photoViewer2.C1.b;
                qVar.q();
                CropAreaView cropAreaView = qVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = vt0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                di.j4 j4Var = photoViewer2.K1;
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
                photoViewer2.w3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 6:
                wt0 wt0Var = (wt0) obj;
                PhotoViewer photoViewer3 = wt0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = wt0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                di.j4 j4Var2 = photoViewer3.K1;
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
                photoViewer3.w3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 7:
                ((PhotoViewer) ((au0) obj).q0).y3[0].setTag(null);
                break;
            case 8:
                ((bu0) obj).d.T1.k0 = 1.0f;
                break;
            case 9:
                PhotoViewer photoViewer4 = ((bu0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new rl0(this, 19));
                break;
            case 11:
                st0 st0Var = (st0) obj;
                if (animator.equals(st0Var.c.T7)) {
                    st0Var.c.T7 = null;
                    break;
                }
                break;
            case 12:
                zu0 zu0Var = (zu0) obj;
                if (zu0Var.e == animator) {
                    zu0Var.c[1].setVisibility(8);
                    zu0Var.e = null;
                    break;
                }
                break;
            case 13:
                ov0 ov0Var = (ov0) obj;
                if (ov0Var.C != null) {
                    ov0Var.C = null;
                    ov0Var.b();
                    break;
                }
                break;
            case 14:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 15:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 16:
                ((ProfileActivity) ((org.telegram.ui.Components.pk0) obj).c).D5 = null;
                break;
            case 17:
                b11 b11Var = (b11) obj;
                if (!b11Var.E) {
                    b11Var.setVisibility(8);
                    break;
                }
                break;
            case 18:
                y11 y11Var = (y11) obj;
                if (animator.equals(y11Var.c)) {
                    y11Var.c = null;
                    break;
                }
                break;
            case 19:
                f31 f31Var = (f31) obj;
                di.xb xbVar = f31Var.O;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) f31Var.O.getParent()).removeView(f31Var.O);
                    }
                    f31Var.O = null;
                }
                f31Var.N = null;
                super.onAnimationEnd(animator);
                break;
            case 20:
                ((z41) obj).d.a0.k0 = 1.0f;
                break;
            case 21:
                SecretMediaViewer secretMediaViewer = ((z41) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 22:
                j71 j71Var = ((z51) obj).e;
                j71Var.S0.G = 0.0f;
                j71Var.S0 = null;
                j71Var.h0.invalidate();
                break;
            case 23:
                ah.y0.a();
                j71 j71Var2 = (j71) obj;
                g61 g61Var = j71Var2.h0;
                g61 g61Var2 = j71Var2.h0;
                g61Var.setLayerType(0, null);
                a61 a61Var = j71Var2.f0;
                a61Var.setLayerType(0, null);
                j71Var2.e0.setLayerType(0, null);
                j71Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = j71Var2.n0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
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
                AndroidUtilities.runOnUIThread(new f01(globalInstance, 13));
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
            case 24:
                ((bb1) obj).b0.setVisibility(8);
                break;
            case 25:
                wd1 wd1Var = ((kd1) obj).a;
                if (!wd1Var.p1.a()) {
                    wd1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((ye1) obj).a = null;
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((cg1) obj).setScrollEnabled(true);
                break;
            case 28:
                gh1 gh1Var = (gh1) obj;
                if (animator.equals(gh1Var.e.K)) {
                    gh1Var.e.K = null;
                    break;
                }
                break;
            default:
                yh1 yh1Var = (yh1) obj;
                yh1Var.d = null;
                yh1Var.a = null;
                yh1Var.b = false;
                yh1Var.f.c.setAllowDrawCursor(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                vt0 vt0Var = (vt0) this.b;
                vt0Var.b.U0.setVisibility(0);
                vt0Var.b.C1.setVisibility(0);
                break;
            case 6:
                break;
            case 17:
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
