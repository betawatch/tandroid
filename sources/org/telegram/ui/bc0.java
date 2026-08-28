package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((qe0) this.b).s = null;
                break;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.su0) this.b).c).w2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                pc0 pc0Var = (pc0) obj;
                pc0Var.D = false;
                pc0Var.n0();
                break;
            case 1:
                qe0 qe0Var = (qe0) obj;
                if (qe0Var.s != null && qe0Var.n != null) {
                    qe0Var.r.setVisibility(4);
                    qe0Var.s = null;
                    break;
                }
                break;
            case 2:
                ((ti0) obj).P.setVisibility(8);
                break;
            case 3:
                pj0 pj0Var = (pj0) obj;
                pj0Var.f = 1.0f;
                pj0Var.invalidate();
                break;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 5:
                zo0 zo0Var = (zo0) obj;
                gc gcVar = zo0Var.K;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) zo0Var.K.getParent()).removeView(zo0Var.K);
                    }
                    zo0Var.K = null;
                }
                zo0Var.M = null;
                super.onAnimationEnd(animator);
                break;
            case 6:
                bq0 bq0Var = (bq0) obj;
                eq0 eq0Var = bq0Var.z0;
                cq0[] cq0VarArr = eq0Var.n;
                eq0Var.r = null;
                if (eq0Var.w) {
                    cq0VarArr[1].setVisibility(8);
                } else {
                    cq0 cq0Var = cq0VarArr[0];
                    cq0VarArr[0] = cq0VarArr[1];
                    cq0VarArr[1] = cq0Var;
                    cq0Var.setVisibility(8);
                    eq0Var.e = eq0Var.n[0].e == eq0Var.h.getFirstTabId();
                    eq0Var.h.j(1.0f, eq0Var.n[0].e);
                }
                eq0Var.s = false;
                bq0Var.u0 = false;
                bq0Var.t0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) eq0Var).actionBar;
                kVar.setEnabled(true);
                eq0Var.h.setEnabled(true);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.su0) obj).c;
                if (photoViewer.w2 != null) {
                    zk0 zk0Var = new zk0(this, 18);
                    photoViewer.E2 = zk0Var;
                    AndroidUtilities.runOnUIThread(zk0Var, 860L);
                    break;
                }
                break;
            case 8:
                ts0 ts0Var = (ts0) obj;
                PhotoViewer photoViewer2 = ts0Var.b;
                tf.n nVar = photoViewer2.y1.b;
                nVar.q();
                CropAreaView cropAreaView = nVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.y1.b.F = true;
                photoViewer2.l6 = null;
                photoViewer2.q4 = ts0Var.a;
                photoViewer2.f1().H.b(photoViewer2.q4 != 0);
                kh.b4 b4Var = photoViewer2.G1;
                if (b4Var != null) {
                    b4Var.b(photoViewer2.q4 != 3);
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
            case 9:
                us0 us0Var = (us0) obj;
                PhotoViewer photoViewer3 = us0Var.b;
                photoViewer3.E1.e0.setVisibility(0);
                photoViewer3.l6 = null;
                photoViewer3.q4 = us0Var.a;
                photoViewer3.f1().H.b(photoViewer3.q4 != 0);
                kh.b4 b4Var2 = photoViewer3.G1;
                if (b4Var2 != null) {
                    b4Var2.b(photoViewer3.q4 != 3);
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
            case 10:
                ((PhotoViewer) ((zs0) obj).m0).u3[0].setTag(null);
                break;
            case 11:
                ((at0) obj).d.P1.g0 = 1.0f;
                break;
            case 12:
                PhotoViewer photoViewer4 = ((at0) obj).d;
                photoViewer4.P1.setVisibility(4);
                photoViewer4.P1.g0 = 1.0f;
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new zk0(this, 20));
                break;
            case 14:
                qs0 qs0Var = (qs0) obj;
                if (animator.equals(qs0Var.c.P7)) {
                    qs0Var.c.P7 = null;
                    break;
                }
                break;
            case 15:
                yt0 yt0Var = (yt0) obj;
                if (yt0Var.e == animator) {
                    yt0Var.c[1].setVisibility(8);
                    yt0Var.e = null;
                    break;
                }
                break;
            case 16:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.C != null) {
                    nu0Var.C = null;
                    nu0Var.b();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.U;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.U = null;
                    break;
                }
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.removeView(premiumPreviewFragment.n0);
                premiumPreviewFragment.n0 = null;
                super.onAnimationEnd(animator);
                break;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.su0) obj).c).z5 = null;
                break;
            case 20:
                wz0 wz0Var = (wz0) obj;
                if (!wz0Var.A) {
                    wz0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                s01 s01Var = (s01) obj;
                if (animator.equals(s01Var.c)) {
                    s01Var.c = null;
                    break;
                }
                break;
            case 22:
                y11 y11Var = (y11) obj;
                kh.eb ebVar = y11Var.K;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) y11Var.K.getParent()).removeView(y11Var.K);
                    }
                    y11Var.K = null;
                }
                y11Var.J = null;
                super.onAnimationEnd(animator);
                break;
            case 23:
                ((s31) obj).d.W.g0 = 1.0f;
                break;
            case 24:
                SecretMediaViewer secretMediaViewer = ((s31) obj).d;
                secretMediaViewer.W.setVisibility(4);
                secretMediaViewer.W.g0 = 1.0f;
                break;
            case 25:
                b61 b61Var = ((r41) obj).e;
                b61Var.O0.C = 0.0f;
                b61Var.O0 = null;
                b61Var.d0.invalidate();
                break;
            case 26:
                hg.h0.a();
                b61 b61Var2 = (b61) obj;
                y41 y41Var = b61Var2.d0;
                y41 y41Var2 = b61Var2.d0;
                y41Var.setLayerType(0, null);
                s41 s41Var = b61Var2.b0;
                s41Var.setLayerType(0, null);
                b61Var2.a0.setLayerType(0, null);
                b61Var2.U.setLayerType(0, null);
                org.telegram.ui.Components.an anVar = b61Var2.j0;
                if (anVar != null) {
                    anVar.setLayerType(0, null);
                }
                View view = b61Var2.i0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                s41Var.b();
                b61Var2.W.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b61Var2.S1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ky0(globalInstance, 15));
                b61Var2.h();
                b61Var2.E(1.0f);
                for (int i10 = 0; i10 < y41Var2.getChildCount(); i10++) {
                    View childAt = y41Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < b61Var2.W.b.getChildCount(); i11++) {
                    View childAt2 = b61Var2.W.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                b61Var2.W.b.invalidate();
                b61Var2.g0.invalidate();
                y41Var2.invalidate();
                break;
            case 27:
                ((s91) obj).X.setVisibility(8);
                break;
            case 28:
                oc1 oc1Var = ((cc1) obj).a;
                if (!oc1Var.l1.a()) {
                    oc1Var.N1.setVisibility(8);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ((pd1) obj).a = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ts0 ts0Var = (ts0) this.b;
                ts0Var.b.Q0.setVisibility(0);
                ts0Var.b.y1.setVisibility(0);
                break;
            case 9:
                break;
            case 20:
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
