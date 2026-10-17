package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((pe0) this.b).s = null;
                break;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.b).c).A2 = null;
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
                pc0 pc0Var = (pc0) obj;
                pc0Var.H = false;
                pc0Var.n0();
                break;
            case 1:
                pe0 pe0Var = (pe0) obj;
                if (pe0Var.s != null && pe0Var.n != null) {
                    pe0Var.r.setVisibility(4);
                    pe0Var.s = null;
                    break;
                }
                break;
            case 2:
                ((wi0) obj).T.setVisibility(8);
                break;
            case 3:
                qj0 qj0Var = (qj0) obj;
                qj0Var.f = 1.0f;
                qj0Var.invalidate();
                break;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 5:
                jp0 jp0Var = (jp0) obj;
                nc ncVar = jp0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) jp0Var.X.getParent()).removeView(jp0Var.X);
                    }
                    jp0Var.X = null;
                }
                jp0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 6:
                mq0 mq0Var = (mq0) obj;
                pq0 pq0Var = mq0Var.D0;
                nq0[] nq0VarArr = pq0Var.n;
                pq0Var.r = null;
                if (pq0Var.w) {
                    nq0VarArr[1].setVisibility(8);
                } else {
                    nq0 nq0Var = nq0VarArr[0];
                    nq0VarArr[0] = nq0VarArr[1];
                    nq0VarArr[1] = nq0Var;
                    nq0Var.setVisibility(8);
                    pq0Var.e = pq0Var.n[0].e == pq0Var.h.getFirstTabId();
                    pq0Var.h.j(1.0f, pq0Var.n[0].e);
                }
                pq0Var.s = false;
                mq0Var.y0 = false;
                mq0Var.x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) pq0Var).actionBar;
                kVar.setEnabled(true);
                pq0Var.h.setEnabled(true);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).c;
                if (photoViewer.A2 != null) {
                    ek0 ek0Var = new ek0(this, 18);
                    photoViewer.I2 = ek0Var;
                    AndroidUtilities.runOnUIThread(ek0Var, 860L);
                    break;
                }
                break;
            case 8:
                et0 et0Var = (et0) obj;
                PhotoViewer photoViewer2 = et0Var.b;
                mg.p pVar = photoViewer2.C1.b;
                pVar.q();
                CropAreaView cropAreaView = pVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = et0Var.a;
                photoViewer2.f1().L.b(photoViewer2.u4 != 0);
                ei.b4 b4Var = photoViewer2.K1;
                if (b4Var != null) {
                    b4Var.b(photoViewer2.u4 != 3);
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
            case 9:
                ft0 ft0Var = (ft0) obj;
                PhotoViewer photoViewer3 = ft0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = ft0Var.a;
                photoViewer3.f1().L.b(photoViewer3.u4 != 0);
                ei.b4 b4Var2 = photoViewer3.K1;
                if (b4Var2 != null) {
                    b4Var2.b(photoViewer3.u4 != 3);
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
            case 10:
                ((PhotoViewer) ((jt0) obj).q0).y3[0].setTag(null);
                break;
            case 11:
                ((kt0) obj).d.T1.k0 = 1.0f;
                break;
            case 12:
                PhotoViewer photoViewer4 = ((kt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ek0(this, 20));
                break;
            case 14:
                bt0 bt0Var = (bt0) obj;
                if (animator.equals(bt0Var.c.U7)) {
                    bt0Var.c.U7 = null;
                    break;
                }
                break;
            case 15:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.e == animator) {
                    iu0Var.c[1].setVisibility(8);
                    iu0Var.e = null;
                    break;
                }
                break;
            case 16:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.C != null) {
                    xu0Var.C = null;
                    xu0Var.b();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.removeView(premiumPreviewFragment.r0);
                premiumPreviewFragment.r0 = null;
                super.onAnimationEnd(animator);
                break;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.ml0) obj).c).F5 = null;
                break;
            case 20:
                e01 e01Var = (e01) obj;
                if (!e01Var.E) {
                    e01Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                b11 b11Var = (b11) obj;
                if (animator.equals(b11Var.c)) {
                    b11Var.c = null;
                    break;
                }
                break;
            case 22:
                ((o31) obj).d.a0.k0 = 1.0f;
                break;
            case 23:
                SecretMediaViewer secretMediaViewer = ((o31) obj).d;
                secretMediaViewer.a0.setVisibility(4);
                secretMediaViewer.a0.k0 = 1.0f;
                break;
            case 24:
                z51 z51Var = ((p41) obj).e;
                z51Var.S0.G = 0.0f;
                z51Var.S0 = null;
                z51Var.h0.invalidate();
                break;
            case 25:
                ah.x0.a();
                z51 z51Var2 = (z51) obj;
                w41 w41Var = z51Var2.h0;
                w41 w41Var2 = z51Var2.h0;
                w41Var.setLayerType(0, null);
                q41 q41Var = z51Var2.f0;
                q41Var.setLayerType(0, null);
                z51Var2.e0.setLayerType(0, null);
                z51Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = z51Var2.n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = z51Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                q41Var.b();
                z51Var2.d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                z51Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new sy0(globalInstance, 14));
                z51Var2.h();
                z51Var2.E(1.0f);
                for (int i11 = 0; i11 < w41Var2.getChildCount(); i11++) {
                    View childAt = w41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < z51Var2.d0.b.getChildCount(); i12++) {
                    View childAt2 = z51Var2.d0.b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                z51Var2.d0.b.invalidate();
                z51Var2.k0.invalidate();
                w41Var2.invalidate();
                break;
            case 26:
                ((r91) obj).b0.setVisibility(8);
                break;
            case 27:
                mc1 mc1Var = ((ac1) obj).a;
                if (!mc1Var.p1.a()) {
                    mc1Var.R1.setVisibility(8);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((nd1) obj).a = null;
                break;
            default:
                super.onAnimationEnd(animator);
                ((re1) obj).setScrollEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                et0 et0Var = (et0) this.b;
                et0Var.b.U0.setVisibility(0);
                et0Var.b.C1.setVisibility(0);
                break;
            case 9:
                break;
            case 20:
                ((e01) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
