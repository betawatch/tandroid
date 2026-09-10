package org.telegram.ui.Components;

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
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ yo(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 4:
                u00 u00Var = (u00) this.c;
                AnimatorSet animatorSet = u00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u00Var.e = null;
                    break;
                }
                break;
            case 8:
                a70 a70Var = (a70) this.c;
                AnimatorSet animatorSet2 = a70Var.X;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    a70Var.X = null;
                    break;
                }
                break;
            case 13:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 15:
                ((iv0) this.c).N1 = null;
                break;
            case 19:
                x61 x61Var = (x61) this.c;
                AnimatorSet animatorSet3 = x61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x61Var.d = null;
                    break;
                }
                break;
            case 20:
                b71 b71Var = (b71) this.c;
                AnimatorSet animatorSet4 = b71Var.r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    b71Var.r = null;
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.ts) this.c).w = null;
                break;
            case 26:
                ((org.telegram.ui.k70) this.c).h = null;
                break;
            case 29:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.c;
                if (animator.equals(br0Var.k0)) {
                    br0Var.k0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        org.telegram.ui.kd kdVar;
        switch (this.a) {
            case 0:
                zo zoVar = (zo) this.c;
                if (animator == zoVar.e) {
                    boolean z10 = this.b;
                    float f7 = z10 ? 1.0f : 0.0f;
                    zoVar.d = f7;
                    zoVar.setShown(f7);
                    if (!z10) {
                        zoVar.setVisibility(8);
                    }
                    zoVar.a(true);
                    break;
                }
                break;
            case 1:
                sp spVar = (sp) this.c;
                spVar.g0 = this.b ? 1.0f : 0.0f;
                spVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * spVar.g0);
                break;
            case 2:
                if (!this.b) {
                    ((sq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 3:
                cw cwVar = (cw) this.c;
                gw gwVar = cwVar.J;
                if (gwVar.U && !cwVar.h) {
                    if (!this.b && !cwVar.n) {
                        cwVar.setBackground(null);
                        break;
                    } else if (cwVar.getBackground() == null) {
                        cwVar.setBackground(org.telegram.ui.ActionBar.j6.Y(gwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 4:
                u00 u00Var = (u00) this.c;
                AnimatorSet animatorSet = u00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        u00Var.f.setVisibility(4);
                    }
                    u00Var.e = null;
                    break;
                }
                break;
            case 5:
                g10 g10Var = (g10) this.c;
                g10Var.h = this.b ? 1.0f : 0.0f;
                g10Var.invalidate();
                break;
            case 6:
                j30 j30Var = (j30) this.c;
                h30 h30Var = j30Var.a;
                if (!j30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    j30Var.b0 = f10;
                    j30Var.U.setPinnedProgress(f10);
                    h30Var.setScaleX(1.0f - (j30Var.b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (j30Var.b0 * 0.6f));
                    if (j30Var.W) {
                        j30Var.i();
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 8:
                a70 a70Var = (a70) this.c;
                AnimatorSet animatorSet2 = a70Var.X;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        a70Var.Y.setVisibility(4);
                    }
                    a70Var.X = null;
                    break;
                }
                break;
            case 9:
                k70 k70Var = (k70) this.c;
                boolean z11 = this.b;
                k70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.h3) k70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    k70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 10:
                ec0 ec0Var = (ec0) this.c;
                if (ec0Var.getParent() != null) {
                    ((ViewGroup) ec0Var.getParent()).removeView(ec0Var);
                }
                org.telegram.ui.kl klVar = (org.telegram.ui.kl) ec0Var;
                MessagePreviewParams messagePreviewParams = klVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.jl(klVar, 0), 15L);
                    break;
                }
                break;
            case 11:
                yb0 yb0Var = (yb0) this.c;
                yb0Var.P = null;
                yb0Var.g(this.b, false);
                break;
            case 12:
                be0 be0Var = (be0) this.c;
                TextView textView = be0Var.w;
                bi.l4 l4Var = be0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                l4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                l4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                l4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                be0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 13:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 14:
                rn0 rn0Var = (rn0) this.c;
                if (animator == rn0Var.G) {
                    boolean z12 = this.b;
                    float f12 = z12 ? 1.0f : 0.0f;
                    rn0Var.F = f12;
                    rn0Var.setShown(f12);
                    if (!z12) {
                        rn0Var.setVisibility(8);
                    }
                    rn0Var.b(true);
                    break;
                }
                break;
            case 15:
                iv0 iv0Var = (iv0) this.c;
                if (iv0Var.N1 != null) {
                    iv0Var.N1 = null;
                    if (!this.b) {
                        iv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 16:
                super.onAnimationEnd(animator);
                i21 i21Var = (i21) this.c;
                i21Var.M = this.b ? 1.0f : 0.0f;
                i21Var.invalidate();
                break;
            case 17:
                f31 f31Var = (f31) this.c;
                f31Var.F = this.b ? 1.0f : 0.0f;
                f31Var.h();
                break;
            case 18:
                j31 j31Var = (j31) this.c;
                j31Var.Q = this.b ? 1.0f : 0.0f;
                j31Var.h();
                j31Var.g();
                break;
            case 19:
                x61 x61Var = (x61) this.c;
                AnimatorSet animatorSet3 = x61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        x61Var.e.setVisibility(4);
                    }
                    x61Var.d = null;
                    break;
                }
                break;
            case 20:
                b71 b71Var = (b71) this.c;
                AnimatorSet animatorSet4 = b71Var.r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        b71Var.n.setVisibility(4);
                    }
                    b71Var.r = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.c;
                u2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.G && (drawable = (drawableArr = u2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.G = false;
                if (!u2Var.O) {
                    u2Var.n = u2Var.r;
                }
                u2Var.s = 0.0f;
                u2Var.invalidate();
                break;
            case 22:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.c;
                if (tsVar.w != null && (radialProgressView = tsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        tsVar.v.setVisibility(4);
                    }
                    tsVar.w = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.c;
                nzVar.r = this.b ? 1.0f : 0.0f;
                w9 w9Var = nzVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, nzVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, nzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                nzVar.c.invalidate();
                nzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.r, org.telegram.ui.ActionBar.j6.v0(i10, nzVar.a), org.telegram.ui.ActionBar.j6.v0(i11, nzVar.a)), mode));
                nzVar.f.invalidate();
                break;
            case 24:
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.c;
                a10Var.s = this.b ? 1.0f : 0.0f;
                a10Var.invalidate();
                break;
            case 25:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.c;
                j60Var.U2 = null;
                j60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 26:
                org.telegram.ui.k70 k70Var2 = (org.telegram.ui.k70) this.c;
                if (k70Var2.h != null && (kdVar = k70Var2.f) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        k70Var2.n.setVisibility(4);
                    }
                    k70Var2.h = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) this.c;
                if (!this.b) {
                    xg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet5 = xg0Var.L;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    xg0Var.L = null;
                    break;
                }
                break;
            case 28:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            default:
                org.telegram.ui.br0 br0Var = (org.telegram.ui.br0) this.c;
                if (animator.equals(br0Var.k0)) {
                    if (!this.b) {
                        br0Var.Z.setVisibility(4);
                        br0Var.a0.setVisibility(4);
                    }
                    br0Var.k0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 27:
                if (this.b) {
                    ((org.telegram.ui.xg0) this.c).V.setVisibility(0);
                    break;
                }
                break;
            case 28:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public yo(View view) {
        this.a = 7;
        this.c = view;
        this.b = true;
    }

    public yo(View view, boolean z10) {
        this.a = 7;
        this.c = view;
        this.b = z10;
    }
}
