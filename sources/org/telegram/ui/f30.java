package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((rc0) this.b).s = null;
                break;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.w50) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                e40 e40Var = ((g30) obj).o;
                e40 e40Var2 = e40.u5;
                e40Var.d1();
                e40Var.b.invalidate();
                e40Var.H1.invalidate();
                if (e40Var.j2) {
                    e40Var.j2 = false;
                    e40Var.Q0(true);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                s30 s30Var = (s30) obj;
                s30Var.G = null;
                e40 e40Var3 = s30Var.L;
                e40Var3.H1.invalidate();
                e40Var3.R3.invalidate();
                e40Var3.b.invalidate();
                e40.P0(e40Var3);
                s30Var.H.clear();
                s30Var.I.clear();
                break;
            case 2:
                a60 a60Var = (a60) obj;
                a60Var.a = null;
                a60Var.b = false;
                break;
            case 3:
                ra0 ra0Var = (ra0) obj;
                ra0Var.D = false;
                ra0Var.y0();
                break;
            case 4:
                rc0 rc0Var = (rc0) obj;
                if (rc0Var.s != null && rc0Var.n != null) {
                    rc0Var.r.setVisibility(4);
                    rc0Var.s = null;
                    break;
                }
                break;
            case 5:
                ((lg0) obj).T.setVisibility(8);
                break;
            case 6:
                eh0 eh0Var = (eh0) obj;
                eh0Var.f = 1.0f;
                eh0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                jm0 jm0Var = (jm0) obj;
                cc ccVar = jm0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) jm0Var.X.getParent()).removeView(jm0Var.X);
                    }
                    jm0Var.X = null;
                }
                jm0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                bn0 bn0Var = (bn0) obj;
                cn0 cn0Var = bn0Var.m0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.n;
                cn0Var.r = null;
                if (cn0Var.x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    cn0Var.e = cn0Var.n[0].b == cn0Var.h.getFirstTabId();
                    cn0Var.h.i(1.0f, cn0Var.n[0].b);
                }
                cn0Var.s = false;
                bn0Var.h0 = false;
                bn0Var.g0 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) cn0Var).actionBar;
                kVar.setEnabled(true);
                cn0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.w50) obj).c;
                if (photoViewer.A2 != null) {
                    gf0 gf0Var = new gf0(this, 21);
                    photoViewer.H2 = gf0Var;
                    org.telegram.messenger.g0.i3(gf0Var, 860L);
                    break;
                }
                break;
            case 11:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer2 = sp0Var.b;
                og.o oVar = photoViewer2.C1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = sp0Var.a;
                photoViewer2.a1().L.b(photoViewer2.t4 != 0);
                fi.q3 q3Var = photoViewer2.K1;
                if (q3Var != null) {
                    q3Var.b(photoViewer2.t4 != 3);
                }
                if (photoViewer2.t4 != 3) {
                    photoViewer2.Y5 = 0.0f;
                }
                photoViewer2.n6 = -1;
                photoViewer2.d6 = 1.0f;
                photoViewer2.Z5 = 1.0f;
                photoViewer2.b6 = 0.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.t3(1.0f);
                photoViewer2.t2 = true;
                photoViewer2.e0.invalidate();
                break;
            case 12:
                tp0 tp0Var = (tp0) obj;
                PhotoViewer photoViewer3 = tp0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = tp0Var.a;
                photoViewer3.a1().L.b(photoViewer3.t4 != 0);
                fi.q3 q3Var2 = photoViewer3.K1;
                if (q3Var2 != null) {
                    q3Var2.b(photoViewer3.t4 != 3);
                }
                if (photoViewer3.t4 != 3) {
                    photoViewer3.Y5 = 0.0f;
                }
                photoViewer3.n6 = -1;
                photoViewer3.d6 = 1.0f;
                photoViewer3.Z5 = 1.0f;
                photoViewer3.b6 = 0.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.t3(1.0f);
                photoViewer3.t2 = true;
                photoViewer3.e0.invalidate();
                break;
            case 13:
                ((PhotoViewer) ((xp0) obj).q0).x3[0].setTag(null);
                break;
            case 14:
                ((yp0) obj).d.T1.k0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((yp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 16:
                org.telegram.messenger.g0.h3(new gf0(this, 23));
                break;
            case 17:
                pp0 pp0Var = (pp0) obj;
                if (animator.equals(pp0Var.c.T7)) {
                    pp0Var.c.T7 = null;
                    break;
                }
                break;
            case 18:
                vq0 vq0Var = (vq0) obj;
                if (vq0Var.e == animator) {
                    vq0Var.c[1].setVisibility(8);
                    vq0Var.e = null;
                    break;
                }
                break;
            case 19:
                hr0 hr0Var = (hr0) obj;
                if (hr0Var.C != null) {
                    hr0Var.C = null;
                    hr0Var.b();
                    break;
                }
                break;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    break;
                }
                break;
            case 21:
                ((fv0) obj).b.R5 = null;
                break;
            case 22:
                mw0 mw0Var = (mw0) obj;
                if (!mw0Var.E) {
                    mw0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                kx0 kx0Var = (kx0) obj;
                if (animator.equals(kx0Var.d)) {
                    kx0Var.d = null;
                    break;
                }
                break;
            case 24:
                ((kz0) obj).d.Y.k0 = 1.0f;
                break;
            case 25:
                SecretMediaViewer secretMediaViewer = ((kz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.k0 = 1.0f;
                break;
            case 26:
                s11 s11Var = ((j01) obj).e;
                s11Var.S0.G = 0.0f;
                s11Var.S0 = null;
                s11Var.h0.invalidate();
                break;
            case 27:
                ch.e0.a();
                s11 s11Var2 = (s11) obj;
                q01 q01Var = s11Var2.h0;
                q01 q01Var2 = s11Var2.h0;
                q01Var.setLayerType(0, null);
                k01 k01Var = s11Var2.f0;
                k01Var.setLayerType(0, null);
                s11Var2.e0.setLayerType(0, null);
                s11Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.tm tmVar = s11Var2.n0;
                if (tmVar != null) {
                    tmVar.setLayerType(0, null);
                }
                View view = s11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                k01Var.b();
                s11Var2.d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                s11Var2.X1.e();
                org.telegram.messenger.g0.h3(new tu0(org.telegram.messenger.qs.e(), 15));
                s11Var2.h();
                s11Var2.E(1.0f);
                for (int i10 = 0; i10 < q01Var2.getChildCount(); i10++) {
                    View childAt = q01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < s11Var2.d0.b.getChildCount(); i11++) {
                    View childAt2 = s11Var2.d0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                s11Var2.d0.b.invalidate();
                s11Var2.k0.invalidate();
                q01Var2.invalidate();
                break;
            case 28:
                ((d51) obj).a0.setVisibility(8);
                break;
            default:
                w71 w71Var = ((l71) obj).a;
                if (!w71Var.q1.a()) {
                    w71Var.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.b.U0.setVisibility(0);
                sp0Var.b.C1.setVisibility(0);
                break;
            case 12:
                break;
            case 22:
                ((mw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
