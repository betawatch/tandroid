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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class da extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ da(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ea eaVar = (ea) this.c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eaVar.h = null;
                    break;
                }
                break;
            case 2:
                ((xi) this.c).Y0 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                q00 q00Var = (q00) this.c;
                AnimatorSet animatorSet2 = q00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q00Var.e = null;
                    break;
                }
                break;
            case 12:
                f70 f70Var = (f70) this.c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f70Var.X = null;
                    break;
                }
                break;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                ((qv0) this.c).N1 = null;
                break;
            case 23:
                k71 k71Var = (k71) this.c;
                AnimatorSet animatorSet4 = k71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    k71Var.d = null;
                    break;
                }
                break;
            case 24:
                o71 o71Var = (o71) this.c;
                AnimatorSet animatorSet5 = o71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o71Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.qs) this.c).w = null;
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
        switch (this.a) {
            case 0:
                ea eaVar = (ea) this.c;
                AnimatorSet animatorSet = eaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        eaVar.c.setVisibility(4);
                        break;
                    } else {
                        eaVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                zc zcVar = (zc) this.c;
                if (animator == zcVar.g) {
                    zcVar.g = null;
                    zcVar.i = this.b ? 1.0f : 0.0f;
                    zcVar.b();
                    break;
                }
                break;
            case 2:
                xi xiVar = (xi) this.c;
                if (xiVar.Y0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.v0 v0Var = xiVar.e1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                        if (xiVar.Q0 != 0 || !xiVar.q1) {
                            xiVar.a1.setVisibility(4);
                            break;
                        }
                    } else if (xiVar.S0) {
                        pi piVar = xiVar.y0;
                        if (piVar == null || piVar.H()) {
                            xiVar.x1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                mo moVar = (mo) this.c;
                if (!this.b) {
                    w9 w9Var = moVar.h;
                    moVar.h = moVar.n;
                    moVar.n = w9Var;
                    w9Var.setVisibility(8);
                    moVar.n.setAlpha(0.0f);
                    moVar.h.setVisibility(0);
                    moVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                wo woVar = (wo) this.c;
                if (animator == woVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    woVar.d = f7;
                    woVar.setShown(f7);
                    if (!z10) {
                        woVar.setVisibility(8);
                    }
                    woVar.a(true);
                    break;
                }
                break;
            case 5:
                pp ppVar = (pp) this.c;
                ppVar.g0 = this.b ? 1.0f : 0.0f;
                ppVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * ppVar.g0);
                break;
            case 6:
                if (!this.b) {
                    ((pq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                cw cwVar = (cw) this.c;
                gw gwVar = cwVar.J;
                if (gwVar.U && !cwVar.h) {
                    if (!this.b && !cwVar.n) {
                        cwVar.setBackground(null);
                        break;
                    } else if (cwVar.getBackground() == null) {
                        cwVar.setBackground(org.telegram.ui.ActionBar.i6.Y(gwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                q00 q00Var = (q00) this.c;
                AnimatorSet animatorSet2 = q00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        q00Var.f.setVisibility(4);
                    }
                    q00Var.e = null;
                    break;
                }
                break;
            case 9:
                b10 b10Var = (b10) this.c;
                b10Var.h = this.b ? 1.0f : 0.0f;
                b10Var.invalidate();
                break;
            case 10:
                d30 d30Var = (d30) this.c;
                b30 b30Var = d30Var.a;
                if (!d30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    d30Var.b0 = f10;
                    d30Var.U.setPinnedProgress(f10);
                    b30Var.setScaleX(1.0f - (d30Var.b0 * 0.6f));
                    b30Var.setScaleY(1.0f - (d30Var.b0 * 0.6f));
                    if (d30Var.W) {
                        d30Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                f70 f70Var = (f70) this.c;
                AnimatorSet animatorSet3 = f70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        f70Var.Y.setVisibility(4);
                    }
                    f70Var.X = null;
                    break;
                }
                break;
            case 13:
                p70 p70Var = (p70) this.c;
                boolean z11 = this.b;
                p70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) p70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    p70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                ic0 ic0Var = (ic0) this.c;
                if (ic0Var.getParent() != null) {
                    ((ViewGroup) ic0Var.getParent()).removeView(ic0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) ic0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.d5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                cc0 cc0Var = (cc0) this.c;
                cc0Var.P = null;
                cc0Var.g(this.b, false);
                break;
            case 16:
                ee0 ee0Var = (ee0) this.c;
                TextView textView = ee0Var.w;
                ai.w5 w5Var = ee0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                ee0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 18:
                boolean z13 = this.b;
                ao0 ao0Var = (ao0) this.c;
                if (animator == ao0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    ao0Var.F = f12;
                    ao0Var.setShown(f12);
                    if (!z13) {
                        ao0Var.setVisibility(8);
                    }
                    ao0Var.b(true);
                    break;
                }
                break;
            case 19:
                qv0 qv0Var = (qv0) this.c;
                if (qv0Var.N1 != null) {
                    qv0Var.N1 = null;
                    if (!this.b) {
                        qv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                t21 t21Var = (t21) this.c;
                t21Var.M = this.b ? 1.0f : 0.0f;
                t21Var.invalidate();
                break;
            case 21:
                r31 r31Var = (r31) this.c;
                r31Var.F = this.b ? 1.0f : 0.0f;
                r31Var.h();
                break;
            case 22:
                v31 v31Var = (v31) this.c;
                v31Var.Q = this.b ? 1.0f : 0.0f;
                v31Var.h();
                v31Var.g();
                break;
            case 23:
                k71 k71Var = (k71) this.c;
                AnimatorSet animatorSet4 = k71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        k71Var.e.setVisibility(4);
                    }
                    k71Var.d = null;
                    break;
                }
                break;
            case 24:
                o71 o71Var = (o71) this.c;
                AnimatorSet animatorSet5 = o71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        o71Var.n.setVisibility(4);
                    }
                    o71Var.r = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.c;
                w2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.n = w2Var.r;
                }
                w2Var.s = 0.0f;
                w2Var.invalidate();
                break;
            case 26:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.c;
                if (qsVar.w != null && (radialProgressView = qsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        qsVar.v.setVisibility(4);
                    }
                    qsVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.c;
                lzVar.r = this.b ? 1.0f : 0.0f;
                w9 w9Var2 = lzVar.c;
                int i10 = org.telegram.ui.ActionBar.i6.C6;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i10, lzVar.a);
                int i11 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.i6.v0(i11, lzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.c.invalidate();
                lzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.i6.v0(i10, lzVar.a), org.telegram.ui.ActionBar.i6.v0(i11, lzVar.a)), mode));
                lzVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.c;
                y00Var.s = this.b ? 1.0f : 0.0f;
                y00Var.invalidate();
                break;
            default:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.c;
                h60Var.U2 = null;
                h60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public da(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public da(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public da(mo moVar) {
        this.a = 3;
        this.c = moVar;
    }
}
