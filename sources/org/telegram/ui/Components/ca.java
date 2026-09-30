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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ca extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ ca(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                da daVar = (da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    break;
                }
                break;
            case 2:
                ((wi) this.c).Y0 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                p00 p00Var = (p00) this.c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    p00Var.e = null;
                    break;
                }
                break;
            case 12:
                e70 e70Var = (e70) this.c;
                AnimatorSet animatorSet3 = e70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    e70Var.X = null;
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
                ((lv0) this.c).N1 = null;
                break;
            case 23:
                z61 z61Var = (z61) this.c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    z61Var.d = null;
                    break;
                }
                break;
            case 24:
                d71 d71Var = (d71) this.c;
                AnimatorSet animatorSet5 = d71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    d71Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.ms) this.c).w = null;
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
                da daVar = (da) this.c;
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
                wi wiVar = (wi) this.c;
                if (wiVar.Y0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.u0 u0Var = wiVar.e1;
                        if (u0Var != null) {
                            u0Var.setVisibility(4);
                        }
                        if (wiVar.Q0 != 0 || !wiVar.q1) {
                            wiVar.a1.setVisibility(4);
                            break;
                        }
                    } else if (wiVar.S0) {
                        oi oiVar = wiVar.y0;
                        if (oiVar == null || oiVar.J()) {
                            wiVar.x1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                lo loVar = (lo) this.c;
                if (!this.b) {
                    w9 w9Var = loVar.h;
                    loVar.h = loVar.n;
                    loVar.n = w9Var;
                    w9Var.setVisibility(8);
                    loVar.n.setAlpha(0.0f);
                    loVar.h.setVisibility(0);
                    loVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                vo voVar = (vo) this.c;
                if (animator == voVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    voVar.d = f7;
                    voVar.setShown(f7);
                    if (!z10) {
                        voVar.setVisibility(8);
                    }
                    voVar.a(true);
                    break;
                }
                break;
            case 5:
                op opVar = (op) this.c;
                opVar.g0 = this.b ? 1.0f : 0.0f;
                opVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * opVar.g0);
                break;
            case 6:
                if (!this.b) {
                    ((oq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                bw bwVar = (bw) this.c;
                fw fwVar = bwVar.J;
                if (fwVar.U && !bwVar.h) {
                    if (!this.b && !bwVar.n) {
                        bwVar.setBackground(null);
                        break;
                    } else if (bwVar.getBackground() == null) {
                        bwVar.setBackground(org.telegram.ui.ActionBar.h6.Y(fwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                p00 p00Var = (p00) this.c;
                AnimatorSet animatorSet2 = p00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        p00Var.f.setVisibility(4);
                    }
                    p00Var.e = null;
                    break;
                }
                break;
            case 9:
                a10 a10Var = (a10) this.c;
                a10Var.h = this.b ? 1.0f : 0.0f;
                a10Var.invalidate();
                break;
            case 10:
                c30 c30Var = (c30) this.c;
                a30 a30Var = c30Var.a;
                if (!c30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    c30Var.b0 = f10;
                    c30Var.U.setPinnedProgress(f10);
                    a30Var.setScaleX(1.0f - (c30Var.b0 * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.b0 * 0.6f));
                    if (c30Var.W) {
                        c30Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                e70 e70Var = (e70) this.c;
                AnimatorSet animatorSet3 = e70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        e70Var.Y.setVisibility(4);
                    }
                    e70Var.X = null;
                    break;
                }
                break;
            case 13:
                o70 o70Var = (o70) this.c;
                boolean z11 = this.b;
                o70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.e3) o70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    o70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                hc0 hc0Var = (hc0) this.c;
                if (hc0Var.getParent() != null) {
                    ((ViewGroup) hc0Var.getParent()).removeView(hc0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) hc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dl(elVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                bc0 bc0Var = (bc0) this.c;
                bc0Var.P = null;
                bc0Var.g(this.b, false);
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
                wn0 wn0Var = (wn0) this.c;
                if (animator == wn0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    wn0Var.F = f12;
                    wn0Var.setShown(f12);
                    if (!z13) {
                        wn0Var.setVisibility(8);
                    }
                    wn0Var.b(true);
                    break;
                }
                break;
            case 19:
                lv0 lv0Var = (lv0) this.c;
                if (lv0Var.N1 != null) {
                    lv0Var.N1 = null;
                    if (!this.b) {
                        lv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                j21 j21Var = (j21) this.c;
                j21Var.M = this.b ? 1.0f : 0.0f;
                j21Var.invalidate();
                break;
            case 21:
                h31 h31Var = (h31) this.c;
                h31Var.F = this.b ? 1.0f : 0.0f;
                h31Var.h();
                break;
            case 22:
                l31 l31Var = (l31) this.c;
                l31Var.Q = this.b ? 1.0f : 0.0f;
                l31Var.h();
                l31Var.g();
                break;
            case 23:
                z61 z61Var = (z61) this.c;
                AnimatorSet animatorSet4 = z61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        z61Var.e.setVisibility(4);
                    }
                    z61Var.d = null;
                    break;
                }
                break;
            case 24:
                d71 d71Var = (d71) this.c;
                AnimatorSet animatorSet5 = d71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        d71Var.n.setVisibility(4);
                    }
                    d71Var.r = null;
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
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.c;
                if (msVar.w != null && (radialProgressView = msVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        msVar.v.setVisibility(4);
                    }
                    msVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.c;
                hzVar.r = this.b ? 1.0f : 0.0f;
                w9 w9Var2 = hzVar.c;
                int i10 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, hzVar.a);
                int i11 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(hzVar.r, v02, org.telegram.ui.ActionBar.h6.v0(i11, hzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.c.invalidate();
                hzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.r, org.telegram.ui.ActionBar.h6.v0(i10, hzVar.a), org.telegram.ui.ActionBar.h6.v0(i11, hzVar.a)), mode));
                hzVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.c;
                u00Var.s = this.b ? 1.0f : 0.0f;
                u00Var.invalidate();
                break;
            default:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.c;
                d60Var.U2 = null;
                d60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public ca(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public ca(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public ca(lo loVar) {
        this.a = 3;
        this.c = loVar;
    }
}
