package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d30(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                ((pc0) this.b).s = null;
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
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                c40 c40Var = ((e30) obj).o;
                c40 c40Var2 = c40.u5;
                c40Var.d1();
                c40Var.b.invalidate();
                c40Var.H1.invalidate();
                if (c40Var.j2) {
                    c40Var.j2 = false;
                    c40Var.Q0(true);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                q30 q30Var = (q30) obj;
                q30Var.G = null;
                c40 c40Var3 = q30Var.L;
                c40Var3.H1.invalidate();
                c40Var3.R3.invalidate();
                c40Var3.b.invalidate();
                c40.P0(c40Var3);
                q30Var.H.clear();
                q30Var.I.clear();
                break;
            case 2:
                y50 y50Var = (y50) obj;
                y50Var.a = null;
                y50Var.b = false;
                break;
            case 3:
                pa0 pa0Var = (pa0) obj;
                pa0Var.D = false;
                pa0Var.y0();
                break;
            case 4:
                pc0 pc0Var = (pc0) obj;
                if (pc0Var.s != null && pc0Var.n != null) {
                    pc0Var.r.setVisibility(4);
                    pc0Var.s = null;
                    break;
                }
                break;
            case 5:
                ((jg0) obj).T.setVisibility(8);
                break;
            case 6:
                ch0 ch0Var = (ch0) obj;
                ch0Var.f = 1.0f;
                ch0Var.invalidate();
                break;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 8:
                hm0 hm0Var = (hm0) obj;
                cc ccVar = hm0Var.X;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) hm0Var.X.getParent()).removeView(hm0Var.X);
                    }
                    hm0Var.X = null;
                }
                hm0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
            case 9:
                zm0 zm0Var = (zm0) obj;
                an0 an0Var = zm0Var.m0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = an0Var.n;
                an0Var.r = null;
                if (an0Var.x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    an0Var.e = an0Var.n[0].b == an0Var.h.getFirstTabId();
                    an0Var.h.i(1.0f, an0Var.n[0].b);
                }
                an0Var.s = false;
                zm0Var.h0 = false;
                zm0Var.g0 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) an0Var).actionBar;
                kVar.setEnabled(true);
                an0Var.h.setEnabled(true);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.v50) obj).c;
                if (photoViewer.A2 != null) {
                    ef0 ef0Var = new ef0(this, 21);
                    photoViewer.H2 = ef0Var;
                    org.telegram.messenger.g0.i3(ef0Var, 860L);
                    break;
                }
                break;
            case 11:
                qp0 qp0Var = (qp0) obj;
                PhotoViewer photoViewer2 = qp0Var.b;
                og.o oVar = photoViewer2.C1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.b.J = true;
                photoViewer2.o6 = null;
                photoViewer2.t4 = qp0Var.a;
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
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer3 = rp0Var.b;
                photoViewer3.I1.i0.setVisibility(0);
                photoViewer3.o6 = null;
                photoViewer3.t4 = rp0Var.a;
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
                ((PhotoViewer) ((vp0) obj).q0).x3[0].setTag(null);
                break;
            case 14:
                ((wp0) obj).d.T1.k0 = 1.0f;
                break;
            case 15:
                PhotoViewer photoViewer4 = ((wp0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.k0 = 1.0f;
                break;
            case 16:
                org.telegram.messenger.g0.h3(new ef0(this, 23));
                break;
            case 17:
                np0 np0Var = (np0) obj;
                if (animator.equals(np0Var.c.T7)) {
                    np0Var.c.T7 = null;
                    break;
                }
                break;
            case 18:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.e == animator) {
                    tq0Var.c[1].setVisibility(8);
                    tq0Var.e = null;
                    break;
                }
                break;
            case 19:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.C != null) {
                    fr0Var.C = null;
                    fr0Var.b();
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
                ((dv0) obj).b.P5 = null;
                break;
            case 22:
                kw0 kw0Var = (kw0) obj;
                if (!kw0Var.E) {
                    kw0Var.setVisibility(8);
                    break;
                }
                break;
            case 23:
                gx0 gx0Var = (gx0) obj;
                if (animator.equals(gx0Var.d)) {
                    gx0Var.d = null;
                    break;
                }
                break;
            case 24:
                ((hz0) obj).d.Y.k0 = 1.0f;
                break;
            case 25:
                SecretMediaViewer secretMediaViewer = ((hz0) obj).d;
                secretMediaViewer.Y.setVisibility(4);
                secretMediaViewer.Y.k0 = 1.0f;
                break;
            case 26:
                q11 q11Var = ((h01) obj).e;
                q11Var.S0.G = 0.0f;
                q11Var.S0 = null;
                q11Var.h0.invalidate();
                break;
            case 27:
                ch.e0.a();
                q11 q11Var2 = (q11) obj;
                o01 o01Var = q11Var2.h0;
                o01 o01Var2 = q11Var2.h0;
                o01Var.setLayerType(0, null);
                i01 i01Var = q11Var2.f0;
                i01Var.setLayerType(0, null);
                q11Var2.e0.setLayerType(0, null);
                q11Var2.b0.setLayerType(0, null);
                org.telegram.ui.Components.tm tmVar = q11Var2.n0;
                if (tmVar != null) {
                    tmVar.setLayerType(0, null);
                }
                View view = q11Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i01Var.b();
                q11Var2.d0.m(false);
                org.telegram.messenger.qs.e().k(99, 512);
                q11Var2.X1.e();
                org.telegram.messenger.g0.h3(new ru0(org.telegram.messenger.qs.e(), 15));
                q11Var2.h();
                q11Var2.E(1.0f);
                for (int i10 = 0; i10 < o01Var2.getChildCount(); i10++) {
                    View childAt = o01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < q11Var2.d0.b.getChildCount(); i11++) {
                    View childAt2 = q11Var2.d0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q11Var2.d0.b.invalidate();
                q11Var2.k0.invalidate();
                o01Var2.invalidate();
                break;
            case 28:
                ((c51) obj).a0.setVisibility(8);
                break;
            default:
                v71 v71Var = ((k71) obj).a;
                if (!v71Var.q1.a()) {
                    v71Var.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                qp0 qp0Var = (qp0) this.b;
                qp0Var.b.U0.setVisibility(0);
                qp0Var.b.C1.setVisibility(0);
                break;
            case 12:
                break;
            case 22:
                ((kw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
