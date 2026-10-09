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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ fa(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gaVar.h = null;
                    break;
                }
                break;
            case 2:
                ((yi) this.c).b1 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                d10 d10Var = (d10) this.c;
                AnimatorSet animatorSet2 = d10Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    d10Var.e = null;
                    break;
                }
                break;
            case 12:
                t70 t70Var = (t70) this.c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    t70Var.X = null;
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
                ((bw0) this.c).N1 = null;
                break;
            case 23:
                p71 p71Var = (p71) this.c;
                AnimatorSet animatorSet4 = p71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    p71Var.d = null;
                    break;
                }
                break;
            case 24:
                t71 t71Var = (t71) this.c;
                AnimatorSet animatorSet5 = t71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    t71Var.r = null;
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
                ga gaVar = (ga) this.c;
                AnimatorSet animatorSet = gaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        gaVar.c.setVisibility(4);
                        break;
                    } else {
                        gaVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                bd bdVar = (bd) this.c;
                if (animator == bdVar.g) {
                    bdVar.g = null;
                    bdVar.j = this.b ? 1.0f : 0.0f;
                    bdVar.b();
                    break;
                }
                break;
            case 2:
                yi yiVar = (yi) this.c;
                if (yiVar.b1 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.v0 v0Var = yiVar.h1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                        if (yiVar.T0 != 0 || !yiVar.t1) {
                            yiVar.d1.setVisibility(4);
                            break;
                        }
                    } else if (yiVar.V0) {
                        qi qiVar = yiVar.B0;
                        if (qiVar == null || qiVar.L()) {
                            yiVar.A1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                zo zoVar = (zo) this.c;
                if (!this.b) {
                    y9 y9Var = zoVar.h;
                    zoVar.h = zoVar.n;
                    zoVar.n = y9Var;
                    y9Var.setVisibility(8);
                    zoVar.n.setAlpha(0.0f);
                    zoVar.h.setVisibility(0);
                    zoVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                jp jpVar = (jp) this.c;
                if (animator == jpVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    jpVar.d = f7;
                    jpVar.setShown(f7);
                    if (!z10) {
                        jpVar.setVisibility(8);
                    }
                    jpVar.a(true);
                    break;
                }
                break;
            case 5:
                cq cqVar = (cq) this.c;
                cqVar.g0 = this.b ? 1.0f : 0.0f;
                cqVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * cqVar.g0);
                break;
            case 6:
                if (!this.b) {
                    ((cr) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                ow owVar = (ow) this.c;
                sw swVar = owVar.J;
                if (swVar.U && !owVar.h) {
                    if (!this.b && !owVar.n) {
                        owVar.setBackground(null);
                        break;
                    } else if (owVar.getBackground() == null) {
                        owVar.setBackground(org.telegram.ui.ActionBar.i6.Z(swVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                d10 d10Var = (d10) this.c;
                AnimatorSet animatorSet2 = d10Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        d10Var.f.setVisibility(4);
                    }
                    d10Var.e = null;
                    break;
                }
                break;
            case 9:
                o10 o10Var = (o10) this.c;
                o10Var.h = this.b ? 1.0f : 0.0f;
                o10Var.invalidate();
                break;
            case 10:
                q30 q30Var = (q30) this.c;
                o30 o30Var = q30Var.a;
                if (!q30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    q30Var.b0 = f10;
                    q30Var.U.setPinnedProgress(f10);
                    o30Var.setScaleX(1.0f - (q30Var.b0 * 0.6f));
                    o30Var.setScaleY(1.0f - (q30Var.b0 * 0.6f));
                    if (q30Var.W) {
                        q30Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                t70 t70Var = (t70) this.c;
                AnimatorSet animatorSet3 = t70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        t70Var.Y.setVisibility(4);
                    }
                    t70Var.X = null;
                    break;
                }
                break;
            case 13:
                d80 d80Var = (d80) this.c;
                boolean z11 = this.b;
                d80Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) d80Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    d80Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                vc0 vc0Var = (vc0) this.c;
                if (vc0Var.getParent() != null) {
                    ((ViewGroup) vc0Var.getParent()).removeView(vc0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.jl jlVar = (org.telegram.ui.jl) vc0Var;
                MessagePreviewParams messagePreviewParams = jlVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.il(jlVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                pc0 pc0Var = (pc0) this.c;
                pc0Var.P = null;
                pc0Var.g(this.b, false);
                break;
            case 16:
                te0 te0Var = (te0) this.c;
                TextView textView = te0Var.w;
                ai.x5 x5Var = te0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                te0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                no0 no0Var = (no0) this.c;
                if (animator == no0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    no0Var.F = f12;
                    no0Var.setShown(f12);
                    if (!z13) {
                        no0Var.setVisibility(8);
                    }
                    no0Var.b(true);
                    break;
                }
                break;
            case 19:
                bw0 bw0Var = (bw0) this.c;
                if (bw0Var.N1 != null) {
                    bw0Var.N1 = null;
                    if (!this.b) {
                        bw0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                z21 z21Var = (z21) this.c;
                z21Var.M = this.b ? 1.0f : 0.0f;
                z21Var.invalidate();
                break;
            case 21:
                x31 x31Var = (x31) this.c;
                x31Var.F = this.b ? 1.0f : 0.0f;
                x31Var.h();
                break;
            case 22:
                b41 b41Var = (b41) this.c;
                b41Var.Q = this.b ? 1.0f : 0.0f;
                b41Var.h();
                b41Var.g();
                break;
            case 23:
                p71 p71Var = (p71) this.c;
                AnimatorSet animatorSet4 = p71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        p71Var.e.setVisibility(4);
                    }
                    p71Var.d = null;
                    break;
                }
                break;
            case 24:
                t71 t71Var = (t71) this.c;
                AnimatorSet animatorSet5 = t71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        t71Var.n.setVisibility(4);
                    }
                    t71Var.r = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.c;
                v2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.G && (drawable = (drawableArr = v2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.G = false;
                if (!v2Var.O) {
                    v2Var.n = v2Var.r;
                }
                v2Var.s = 0.0f;
                v2Var.invalidate();
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
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) this.c;
                kzVar.r = this.b ? 1.0f : 0.0f;
                y9 y9Var2 = kzVar.c;
                int i10 = org.telegram.ui.ActionBar.i6.C6;
                int w02 = org.telegram.ui.ActionBar.i6.w0(i10, kzVar.a);
                int i11 = org.telegram.ui.ActionBar.i6.Oh;
                int d = i0.a.d(kzVar.r, w02, org.telegram.ui.ActionBar.i6.w0(i11, kzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                kzVar.c.invalidate();
                kzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - kzVar.r, org.telegram.ui.ActionBar.i6.w0(i10, kzVar.a), org.telegram.ui.ActionBar.i6.w0(i11, kzVar.a)), mode));
                kzVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.y00 y00Var = (org.telegram.ui.y00) this.c;
                y00Var.s = this.b ? 1.0f : 0.0f;
                y00Var.invalidate();
                break;
            default:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.c;
                g60Var.U2 = null;
                g60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public fa(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public fa(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public fa(zo zoVar) {
        this.a = 3;
        this.c = zoVar;
    }
}
