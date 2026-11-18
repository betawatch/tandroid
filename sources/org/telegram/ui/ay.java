package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ay extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ay(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((oc0) this.b).s = null;
                break;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.h60) this.b).c).B2 = null;
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
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) obj;
                FrameLayout frameLayout = a80Var.b;
                hi.m5 m5Var = (hi.m5) a80Var.c;
                if (m5Var.getParent() != null) {
                    frameLayout.removeView(m5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((d7) a80Var.d);
                break;
            case 1:
                f40 f40Var = ((h30) obj).o;
                f40 f40Var2 = f40.C5;
                f40Var.e1();
                f40Var.b.invalidate();
                f40Var.L1.invalidate();
                if (f40Var.n2) {
                    f40Var.n2 = false;
                    f40Var.R0(true);
                    break;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                t30 t30Var = (t30) obj;
                t30Var.G = null;
                f40 f40Var3 = t30Var.L;
                f40Var3.L1.invalidate();
                f40Var3.Z3.invalidate();
                f40Var3.b.invalidate();
                f40.Q0(f40Var3);
                t30Var.H.clear();
                t30Var.I.clear();
                break;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.a = null;
                z50Var.b = false;
                break;
            case 4:
                pa0 pa0Var = (pa0) obj;
                pa0Var.E = false;
                pa0Var.y0();
                break;
            case 5:
                oc0 oc0Var = (oc0) obj;
                if (oc0Var.s != null && oc0Var.n != null) {
                    oc0Var.r.setVisibility(4);
                    oc0Var.s = null;
                    break;
                }
                break;
            case 6:
                ((ng0) obj).U.setVisibility(8);
                break;
            case 7:
                gh0 gh0Var = (gh0) obj;
                gh0Var.f = 1.0f;
                gh0Var.invalidate();
                break;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 9:
                lm0 lm0Var = (lm0) obj;
                bc bcVar = lm0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) lm0Var.Y.getParent()).removeView(lm0Var.Y);
                    }
                    lm0Var.Y = null;
                }
                lm0Var.a0 = null;
                super.onAnimationEnd(animator);
                break;
            case 10:
                en0 en0Var = (en0) obj;
                fn0 fn0Var = en0Var.n0;
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.n;
                fn0Var.r = null;
                if (fn0Var.x) {
                    z4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.z4 z4Var = z4VarArr[0];
                    z4VarArr[0] = z4VarArr[1];
                    z4VarArr[1] = z4Var;
                    z4Var.setVisibility(8);
                    fn0Var.e = fn0Var.n[0].b == fn0Var.h.getFirstTabId();
                    fn0Var.h.i(1.0f, fn0Var.n[0].b);
                }
                fn0Var.s = false;
                en0Var.i0 = false;
                en0Var.h0 = false;
                kVar = ((org.telegram.ui.ActionBar.h2) fn0Var).actionBar;
                kVar.setEnabled(true);
                fn0Var.h.setEnabled(true);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.h60) obj).c;
                if (photoViewer.B2 != null) {
                    hf0 hf0Var = new hf0(this, 21);
                    photoViewer.I2 = hf0Var;
                    org.telegram.messenger.g0.h3(hf0Var, 860L);
                    break;
                }
                break;
            case 12:
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer2 = rp0Var.b;
                og.o oVar = photoViewer2.D1.b;
                oVar.q();
                CropAreaView cropAreaView = oVar.a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.b.K = true;
                photoViewer2.p6 = null;
                photoViewer2.u4 = rp0Var.a;
                photoViewer2.b1().M.b(photoViewer2.u4 != 0);
                hi.p3 p3Var = photoViewer2.L1;
                if (p3Var != null) {
                    p3Var.b(photoViewer2.u4 != 3);
                }
                if (photoViewer2.u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.o6 = -1;
                photoViewer2.e6 = 1.0f;
                photoViewer2.a6 = 1.0f;
                photoViewer2.c6 = 0.0f;
                photoViewer2.d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.u2 = true;
                photoViewer2.f0.invalidate();
                break;
            case 13:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer3 = sp0Var.b;
                photoViewer3.J1.j0.setVisibility(0);
                photoViewer3.p6 = null;
                photoViewer3.u4 = sp0Var.a;
                photoViewer3.b1().M.b(photoViewer3.u4 != 0);
                hi.p3 p3Var2 = photoViewer3.L1;
                if (p3Var2 != null) {
                    p3Var2.b(photoViewer3.u4 != 3);
                }
                if (photoViewer3.u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.o6 = -1;
                photoViewer3.e6 = 1.0f;
                photoViewer3.a6 = 1.0f;
                photoViewer3.c6 = 0.0f;
                photoViewer3.d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.u2 = true;
                photoViewer3.f0.invalidate();
                break;
            case 14:
                ((PhotoViewer) ((wp0) obj).r0).y3[0].setTag(null);
                break;
            case 15:
                ((xp0) obj).d.U1.l0 = 1.0f;
                break;
            case 16:
                PhotoViewer photoViewer4 = ((xp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.l0 = 1.0f;
                break;
            case 17:
                org.telegram.messenger.g0.g3(new hf0(this, 23));
                break;
            case 18:
                op0 op0Var = (op0) obj;
                if (animator.equals(op0Var.c.U7)) {
                    op0Var.c.U7 = null;
                    break;
                }
                break;
            case 19:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.e == animator) {
                    tq0Var.c[1].setVisibility(8);
                    tq0Var.e = null;
                    break;
                }
                break;
            case 20:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.C != null) {
                    fr0Var.C = null;
                    fr0Var.b();
                    break;
                }
                break;
            case 21:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    break;
                }
                break;
            case 22:
                ((dv0) obj).b.V5 = null;
                break;
            case 23:
                mw0 mw0Var = (mw0) obj;
                if (!mw0Var.F) {
                    mw0Var.setVisibility(8);
                    break;
                }
                break;
            case 24:
                jx0 jx0Var = (jx0) obj;
                if (animator.equals(jx0Var.d)) {
                    jx0Var.d = null;
                    break;
                }
                break;
            case 25:
                ((jz0) obj).d.Z.l0 = 1.0f;
                break;
            case 26:
                SecretMediaViewer secretMediaViewer = ((jz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.l0 = 1.0f;
                break;
            case 27:
                r11 r11Var = ((i01) obj).e;
                r11Var.T0.H = 0.0f;
                r11Var.T0 = null;
                r11Var.i0.invalidate();
                break;
            case 28:
                ch.f0.a();
                r11 r11Var2 = (r11) obj;
                p01 p01Var = r11Var2.i0;
                p01 p01Var2 = r11Var2.i0;
                p01Var.setLayerType(0, null);
                j01 j01Var = r11Var2.g0;
                j01Var.setLayerType(0, null);
                r11Var2.f0.setLayerType(0, null);
                r11Var2.c0.setLayerType(0, null);
                org.telegram.ui.Components.jn jnVar = r11Var2.o0;
                if (jnVar != null) {
                    jnVar.setLayerType(0, null);
                }
                View view = r11Var2.n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                j01Var.b();
                r11Var2.e0.m(false);
                org.telegram.messenger.ks.e().k(99, 512);
                r11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new ru0(org.telegram.messenger.ks.e(), 15));
                r11Var2.h();
                r11Var2.E(1.0f);
                for (int i10 = 0; i10 < p01Var2.getChildCount(); i10++) {
                    View childAt = p01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < r11Var2.e0.b.getChildCount(); i11++) {
                    View childAt2 = r11Var2.e0.b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                r11Var2.e0.b.invalidate();
                r11Var2.l0.invalidate();
                p01Var2.invalidate();
                break;
            default:
                ((c51) obj).b0.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                rp0 rp0Var = (rp0) this.b;
                rp0Var.b.V0.setVisibility(0);
                rp0Var.b.D1.setVisibility(0);
                break;
            case 13:
                break;
            case 23:
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
