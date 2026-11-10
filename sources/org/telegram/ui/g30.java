package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((sc0) this.b).s = null;
                break;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.v50) this.b).c).A2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                f40 f40Var = ((h30) obj).o;
                f40 f40Var2 = f40.x5;
                f40Var.d1();
                f40Var.b.invalidate();
                f40Var.K1.invalidate();
                if (f40Var.m2) {
                    f40Var.m2 = false;
                    f40Var.Q0(true);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                t30 t30Var = (t30) obj;
                t30Var.G = null;
                f40 f40Var3 = t30Var.L;
                f40Var3.K1.invalidate();
                f40Var3.U3.invalidate();
                f40Var3.b.invalidate();
                f40.P0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                break;
            case 2:
                b60 b60Var = (b60) obj;
                b60Var.a = null;
                b60Var.b = false;
                break;
            case 3:
                sa0 sa0Var = (sa0) obj;
                sa0Var.D = false;
                sa0Var.y0();
                break;
            case 4:
                sc0 sc0Var = (sc0) obj;
                if (sc0Var.s != null && sc0Var.n != null) {
                    sc0Var.r.setVisibility(4);
                    sc0Var.s = null;
                    break;
                }
                break;
            case 5:
                ((mg0) obj).T.setVisibility(8);
                break;
            case 6:
                fh0 fh0Var = (fh0) obj;
                fh0Var.f = 1.0f;
                fh0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                km0 km0Var = (km0) obj;
                cc ccVar = km0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) km0Var.X.getParent()).removeView(km0Var.X);
                    }
                    km0Var.X = null;
                }
                km0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                cn0 cn0Var = (cn0) obj;
                dn0 dn0Var = cn0Var.m0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
                dn0Var.r = null;
                if (dn0Var.x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    dn0Var.e = dn0Var.n[0].b == dn0Var.h.getFirstTabId();
                    dn0Var.h.i(1.0f, dn0Var.n[0].b);
                }
                dn0Var.s = false;
                cn0Var.h0 = false;
                cn0Var.g0 = false;
                lVar = ((org.telegram.ui.ActionBar.f2) dn0Var).actionBar;
                lVar.setEnabled(true);
                dn0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.v50) obj).c;
                if (photoViewer.A2 != null) {
                    hf0 hf0Var = new hf0(this, 21);
                    photoViewer.H2 = hf0Var;
                    org.telegram.messenger.g0.i3(hf0Var, 860L);
                    break;
                }
                break;
            case 11:
                tp0 tp0Var = (tp0) obj;
                PhotoViewer photoViewer2 = tp0Var.b;
                og.o oVar = photoViewer2.C1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = tp0Var.a;
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
                up0 up0Var = (up0) obj;
                PhotoViewer photoViewer3 = up0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = up0Var.a;
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
                ((PhotoViewer) ((yp0) obj).q0).x3[0].setTag(null);
                break;
            case 14:
                ((zp0) obj).d.T1.k0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((zp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 16:
                org.telegram.messenger.g0.h3(new hf0(this, 23));
                break;
            case 17:
                qp0 qp0Var = (qp0) obj;
                if (animator.equals(qp0Var.c.T7)) {
                    qp0Var.c.T7 = null;
                    break;
                }
                break;
            case 18:
                wq0 wq0Var = (wq0) obj;
                if (wq0Var.e == animator) {
                    wq0Var.c[1].setVisibility(8);
                    wq0Var.e = null;
                    break;
                }
                break;
            case 19:
                ir0 ir0Var = (ir0) obj;
                if (ir0Var.C != null) {
                    ir0Var.C = null;
                    ir0Var.b();
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
                ((gv0) obj).b.R5 = null;
                break;
            case 22:
                nw0 nw0Var = (nw0) obj;
                if (!nw0Var.E) {
                    nw0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                lx0 lx0Var = (lx0) obj;
                if (animator.equals(lx0Var.d)) {
                    lx0Var.d = null;
                    break;
                }
                break;
            case 24:
                ((lz0) obj).d.Y.k0 = 1.0f;
                break;
            case 25:
                SecretMediaViewer secretMediaViewer = ((lz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.k0 = 1.0f;
                break;
            case 26:
                t11 t11Var = ((k01) obj).e;
                t11Var.S0.G = 0.0f;
                t11Var.S0 = null;
                t11Var.h0.invalidate();
                break;
            case 27:
                ch.e0.a();
                t11 t11Var2 = (t11) obj;
                r01 r01Var = t11Var2.h0;
                r01 r01Var2 = t11Var2.h0;
                r01Var.setLayerType(0, null);
                l01 l01Var = t11Var2.f0;
                l01Var.setLayerType(0, null);
                t11Var2.e0.setLayerType(0, null);
                t11Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.sm smVar = t11Var2.n0;
                if (smVar != null) {
                    smVar.setLayerType(0, null);
                }
                View view = t11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                l01Var.b();
                t11Var2.d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                t11Var2.X1.e();
                org.telegram.messenger.g0.h3(new uu0(org.telegram.messenger.qs.e(), 15));
                t11Var2.h();
                t11Var2.E(1.0f);
                for (int i10 = 0; i10 < r01Var2.getChildCount(); i10++) {
                    View childAt = r01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < t11Var2.d0.b.getChildCount(); i11++) {
                    View childAt2 = t11Var2.d0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                t11Var2.d0.b.invalidate();
                t11Var2.k0.invalidate();
                r01Var2.invalidate();
                break;
            case 28:
                ((e51) obj).a0.setVisibility(8);
                break;
            default:
                x71 x71Var = ((m71) obj).a;
                if (!x71Var.q1.a()) {
                    x71Var.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                tp0 tp0Var = (tp0) this.b;
                tp0Var.b.U0.setVisibility(0);
                tp0Var.b.C1.setVisibility(0);
                break;
            case 12:
                break;
            case 22:
                ((nw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
