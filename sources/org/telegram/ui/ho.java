package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ho extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ ho(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((ko) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.ti) this.c).b1 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.c;
                AnimatorSet animatorSet2 = v00Var.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.f = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.c;
                AnimatorSet animatorSet3 = m70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m70Var.X = null;
                    break;
                }
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.xv0) this.c).O1 = null;
                break;
            case 24:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.c;
                AnimatorSet animatorSet4 = o71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.c;
                AnimatorSet animatorSet5 = s71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    s71Var.r = null;
                    break;
                }
                break;
            case 27:
                ((hs) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        ViewGroup viewGroup;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                ko koVar = (ko) this.c;
                if (koVar.h != null && (radialProgressView = koVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        koVar.f.setVisibility(4);
                    }
                    koVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        daVar.c.setVisibility(4);
                        break;
                    } else {
                        daVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.c;
                if (animator == ycVar.g) {
                    ycVar.g = null;
                    ycVar.j = this.b ? 1.0f : 0.0f;
                    ycVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.c;
                if (tiVar.b1 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.u0 u0Var = tiVar.h1;
                        if (u0Var != null) {
                            u0Var.setVisibility(4);
                        }
                        if (tiVar.T0 != 0 || !tiVar.t1) {
                            tiVar.d1.setVisibility(4);
                            break;
                        }
                    } else if (tiVar.V0) {
                        org.telegram.ui.Components.li liVar = tiVar.B0;
                        if (liVar == null || liVar.L()) {
                            tiVar.A1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.w9 w9Var = toVar.h;
                    toVar.h = toVar.n;
                    toVar.n = w9Var;
                    w9Var.setVisibility(8);
                    toVar.n.setAlpha(0.0f);
                    toVar.h.setVisibility(0);
                    toVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.c;
                if (animator == dpVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    dpVar.d = f7;
                    dpVar.setShown(f7);
                    if (!z10) {
                        dpVar.setVisibility(8);
                    }
                    dpVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.c;
                wpVar.f0 = this.b ? 1.0f : 0.0f;
                wpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.f0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.wq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.c;
                org.telegram.ui.Components.kw kwVar = gwVar.N;
                if (kwVar.U && !gwVar.h) {
                    if (!this.b && !gwVar.n) {
                        gwVar.setBackground(null);
                        break;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.k6.Z(kwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.c;
                AnimatorSet animatorSet2 = v00Var.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        v00Var.h.setVisibility(4);
                    }
                    v00Var.f = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.c;
                g10Var.n = this.b ? 1.0f : 0.0f;
                g10Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.c;
                org.telegram.ui.Components.f30 f30Var = i30Var.a;
                if (!i30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    i30Var.b0 = f10;
                    i30Var.U.setPinnedProgress(f10);
                    f30Var.setScaleX(1.0f - (i30Var.b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.c;
                AnimatorSet animatorSet3 = m70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        m70Var.Y.setVisibility(4);
                    }
                    m70Var.X = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.x70 x70Var = (org.telegram.ui.Components.x70) this.c;
                boolean z11 = this.b;
                x70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.h3) x70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    x70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.rc0 rc0Var = (org.telegram.ui.Components.rc0) this.c;
                if (rc0Var.getParent() != null) {
                    ((ViewGroup) rc0Var.getParent()).removeView(rc0Var);
                }
                boolean z12 = this.b;
                bl blVar = (bl) rc0Var;
                MessagePreviewParams messagePreviewParams = blVar.H.r5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new al(blVar, 0), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) this.c;
                lc0Var.P = null;
                lc0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.pe0 pe0Var = (org.telegram.ui.Components.pe0) this.c;
                TextView textView = pe0Var.w;
                ci.h4 h4Var = pe0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                pe0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                boolean z13 = this.b;
                org.telegram.ui.Components.jo0 jo0Var = (org.telegram.ui.Components.jo0) this.c;
                if (animator == jo0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    jo0Var.F = f12;
                    jo0Var.setShown(f12);
                    if (!z13) {
                        jo0Var.setVisibility(8);
                    }
                    jo0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.c;
                if (xv0Var.O1 != null) {
                    xv0Var.O1 = null;
                    if (!this.b) {
                        xv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.c;
                v21Var.M = this.b ? 1.0f : 0.0f;
                v21Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) this.c;
                r31Var.F = this.b ? 1.0f : 0.0f;
                r31Var.h();
                break;
            case 23:
                org.telegram.ui.Components.v31 v31Var = (org.telegram.ui.Components.v31) this.c;
                v31Var.U = this.b ? 1.0f : 0.0f;
                v31Var.h();
                v31Var.g();
                break;
            case 24:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.c;
                AnimatorSet animatorSet4 = o71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        o71Var.e.setVisibility(4);
                    }
                    o71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.s71 s71Var = (org.telegram.ui.Components.s71) this.c;
                AnimatorSet animatorSet5 = s71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        s71Var.n.setVisibility(4);
                    }
                    s71Var.r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.c;
                t2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = t2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!t2Var.G && (drawable = (drawableArr = t2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                t2Var.G = false;
                if (!t2Var.O) {
                    t2Var.n = t2Var.r;
                }
                t2Var.s = 0.0f;
                t2Var.invalidate();
                break;
            case 27:
                hs hsVar = (hs) this.c;
                if (hsVar.w != null && (radialProgressView2 = hsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.w = null;
                    break;
                }
                break;
            case 28:
                vy vyVar = (vy) this.c;
                vyVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.w9 w9Var2 = vyVar.c;
                int i10 = org.telegram.ui.ActionBar.k6.C6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, vyVar.a);
                int i11 = org.telegram.ui.ActionBar.k6.Oh;
                int f13 = i0.a.f(vyVar.r, w02, org.telegram.ui.ActionBar.k6.w0(i11, vyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(f13, mode));
                vyVar.c.invalidate();
                vyVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.r, org.telegram.ui.ActionBar.k6.w0(i10, vyVar.a), org.telegram.ui.ActionBar.k6.w0(i11, vyVar.a)), mode));
                vyVar.f.invalidate();
                break;
            default:
                j00 j00Var = (j00) this.c;
                j00Var.s = this.b ? 1.0f : 0.0f;
                j00Var.invalidate();
                break;
        }
    }

    public ho(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public ho(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public ho(org.telegram.ui.Components.to toVar) {
        this.a = 4;
        this.c = toVar;
    }
}
