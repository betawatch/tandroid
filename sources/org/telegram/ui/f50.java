package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((te0) this.b).s = null;
                break;
            case 9:
                ((PhotoViewer) ((org.telegram.ui.Components.fk0) this.b).c).w2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.ActionBar.k kVar;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                g50 g50Var = (g50) obj;
                g50Var.G = null;
                s50 s50Var = g50Var.L;
                s50Var.M.invalidate();
                s50Var.W1.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
                viewGroup.invalidate();
                s50.J0(s50Var);
                g50Var.H.clear();
                g50Var.I.clear();
                break;
            case 1:
                s70 s70Var = (s70) obj;
                s70Var.d = null;
                s70Var.a = null;
                s70Var.b = false;
                break;
            case 2:
                tc0 tc0Var = (tc0) obj;
                tc0Var.D = false;
                tc0Var.o0();
                break;
            case 3:
                te0 te0Var = (te0) obj;
                if (te0Var.s != null && te0Var.n != null) {
                    te0Var.r.setVisibility(4);
                    te0Var.s = null;
                    break;
                }
                break;
            case 4:
                ((vi0) obj).P.setVisibility(8);
                break;
            case 5:
                qj0 qj0Var = (qj0) obj;
                qj0Var.f = 1.0f;
                qj0Var.invalidate();
                break;
            case 6:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 7:
                ap0 ap0Var = (ap0) obj;
                hc hcVar = ap0Var.K;
                if (hcVar != null) {
                    if (hcVar.getParent() != null) {
                        ((ViewGroup) ap0Var.K.getParent()).removeView(ap0Var.K);
                    }
                    ap0Var.K = null;
                }
                ap0Var.M = null;
                super.onAnimationEnd(animator);
                break;
            case 8:
                cq0 cq0Var = (cq0) obj;
                fq0 fq0Var = cq0Var.z0;
                dq0[] dq0VarArr = fq0Var.n;
                fq0Var.r = null;
                if (fq0Var.w) {
                    dq0VarArr[1].setVisibility(8);
                } else {
                    dq0 dq0Var = dq0VarArr[0];
                    dq0VarArr[0] = dq0VarArr[1];
                    dq0VarArr[1] = dq0Var;
                    dq0Var.setVisibility(8);
                    fq0Var.e = fq0Var.n[0].e == fq0Var.h.getFirstTabId();
                    fq0Var.h.j(1.0f, fq0Var.n[0].e);
                }
                fq0Var.s = false;
                cq0Var.u0 = false;
                cq0Var.t0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) fq0Var).actionBar;
                kVar.setEnabled(true);
                fq0Var.h.setEnabled(true);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.fk0) obj).c;
                if (photoViewer.w2 != null) {
                    zk0 zk0Var = new zk0(this, 18);
                    photoViewer.E2 = zk0Var;
                    AndroidUtilities.runOnUIThread(zk0Var, 860L);
                    break;
                }
                break;
            case 10:
                us0 us0Var = (us0) obj;
                PhotoViewer photoViewer2 = us0Var.b;
                uf.n nVar = photoViewer2.y1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.y1.b.F = true;
                photoViewer2.l6 = null;
                photoViewer2.q4 = us0Var.a;
                photoViewer2.f1().H.b(photoViewer2.q4 != 0);
                lh.a4 a4Var = photoViewer2.G1;
                if (a4Var != null) {
                    a4Var.b(photoViewer2.q4 != 3);
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
                vs0 vs0Var = (vs0) obj;
                PhotoViewer photoViewer3 = vs0Var.b;
                photoViewer3.E1.e0.setVisibility(0);
                photoViewer3.l6 = null;
                photoViewer3.q4 = vs0Var.a;
                photoViewer3.f1().H.b(photoViewer3.q4 != 0);
                lh.a4 a4Var2 = photoViewer3.G1;
                if (a4Var2 != null) {
                    a4Var2.b(photoViewer3.q4 != 3);
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
                ((PhotoViewer) ((at0) obj).m0).u3[0].setTag(null);
                break;
            case 13:
                ((bt0) obj).d.P1.g0 = 1.0f;
                break;
            case 14:
                PhotoViewer photoViewer4 = ((bt0) obj).d;
                photoViewer4.P1.setVisibility(4);
                photoViewer4.P1.g0 = 1.0f;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new zk0(this, 20));
                break;
            case 16:
                rs0 rs0Var = (rs0) obj;
                if (animator.equals(rs0Var.c.P7)) {
                    rs0Var.c.P7 = null;
                    break;
                }
                break;
            case 17:
                zt0 zt0Var = (zt0) obj;
                if (zt0Var.e == animator) {
                    zt0Var.c[1].setVisibility(8);
                    zt0Var.e = null;
                    break;
                }
                break;
            case 18:
                ou0 ou0Var = (ou0) obj;
                if (ou0Var.C != null) {
                    ou0Var.C = null;
                    ou0Var.b();
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
                ((ProfileActivity) ((org.telegram.ui.Components.fk0) obj).c).z5 = null;
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
                x11 x11Var = (x11) obj;
                lh.bb bbVar = x11Var.K;
                if (bbVar != null) {
                    if (bbVar.getParent() != null) {
                        ((ViewGroup) x11Var.K.getParent()).removeView(x11Var.K);
                    }
                    x11Var.K = null;
                }
                x11Var.J = null;
                super.onAnimationEnd(animator);
                break;
            case 25:
                ((r31) obj).d.W.g0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((r31) obj).d;
                secretMediaViewer.W.setVisibility(4);
                secretMediaViewer.W.g0 = 1.0f;
                break;
            case 27:
                a61 a61Var = ((q41) obj).e;
                a61Var.O0.C = 0.0f;
                a61Var.O0 = null;
                a61Var.d0.invalidate();
                break;
            case 28:
                ig.g0.a();
                a61 a61Var2 = (a61) obj;
                x41 x41Var = a61Var2.d0;
                x41 x41Var2 = a61Var2.d0;
                x41Var.setLayerType(0, null);
                r41 r41Var = a61Var2.b0;
                r41Var.setLayerType(0, null);
                a61Var2.a0.setLayerType(0, null);
                a61Var2.U.setLayerType(0, null);
                org.telegram.ui.Components.zm zmVar = a61Var2.j0;
                if (zmVar != null) {
                    zmVar.setLayerType(0, null);
                }
                View view = a61Var2.i0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r41Var.b();
                a61Var2.W.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a61Var2.S1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ky0(globalInstance, 15));
                a61Var2.h();
                a61Var2.E(1.0f);
                for (int i11 = 0; i11 < x41Var2.getChildCount(); i11++) {
                    View childAt = x41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a61Var2.W.b.getChildCount(); i12++) {
                    View childAt2 = a61Var2.W.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a61Var2.W.b.invalidate();
                a61Var2.g0.invalidate();
                x41Var2.invalidate();
                break;
            default:
                ((q91) obj).X.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                us0 us0Var = (us0) this.b;
                us0Var.b.Q0.setVisibility(0);
                us0Var.b.y1.setVisibility(0);
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
