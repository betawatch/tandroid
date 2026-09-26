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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    o00Var.e = null;
                    break;
                }
                break;
            case 12:
                c70 c70Var = (c70) this.c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    c70Var.X = null;
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
                ((jv0) this.c).N1 = null;
                break;
            case 23:
                x61 x61Var = (x61) this.c;
                AnimatorSet animatorSet4 = x61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    x61Var.d = null;
                    break;
                }
                break;
            case 24:
                b71 b71Var = (b71) this.c;
                AnimatorSet animatorSet5 = b71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    b71Var.r = null;
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
                yc ycVar = (yc) this.c;
                if (animator == ycVar.g) {
                    ycVar.g = null;
                    ycVar.i = this.b ? 1.0f : 0.0f;
                    ycVar.b();
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
                ko koVar = (ko) this.c;
                if (!this.b) {
                    w9 w9Var = koVar.h;
                    koVar.h = koVar.n;
                    koVar.n = w9Var;
                    w9Var.setVisibility(8);
                    koVar.n.setAlpha(0.0f);
                    koVar.h.setVisibility(0);
                    koVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                uo uoVar = (uo) this.c;
                if (animator == uoVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    uoVar.d = f7;
                    uoVar.setShown(f7);
                    if (!z10) {
                        uoVar.setVisibility(8);
                    }
                    uoVar.a(true);
                    break;
                }
                break;
            case 5:
                np npVar = (np) this.c;
                npVar.g0 = this.b ? 1.0f : 0.0f;
                npVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * npVar.g0);
                break;
            case 6:
                if (!this.b) {
                    ((nq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                zv zvVar = (zv) this.c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.b && !zvVar.n) {
                        zvVar.setBackground(null);
                        break;
                    } else if (zvVar.getBackground() == null) {
                        zvVar.setBackground(org.telegram.ui.ActionBar.h6.Y(dwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet2 = o00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        o00Var.f.setVisibility(4);
                    }
                    o00Var.e = null;
                    break;
                }
                break;
            case 9:
                z00 z00Var = (z00) this.c;
                z00Var.h = this.b ? 1.0f : 0.0f;
                z00Var.invalidate();
                break;
            case 10:
                a30 a30Var = (a30) this.c;
                y20 y20Var = a30Var.a;
                if (!a30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    a30Var.b0 = f10;
                    a30Var.U.setPinnedProgress(f10);
                    y20Var.setScaleX(1.0f - (a30Var.b0 * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.b0 * 0.6f));
                    if (a30Var.W) {
                        a30Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                c70 c70Var = (c70) this.c;
                AnimatorSet animatorSet3 = c70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        c70Var.Y.setVisibility(4);
                    }
                    c70Var.X = null;
                    break;
                }
                break;
            case 13:
                m70 m70Var = (m70) this.c;
                boolean z11 = this.b;
                m70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.e3) m70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    m70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                fc0 fc0Var = (fc0) this.c;
                if (fc0Var.getParent() != null) {
                    ((ViewGroup) fc0Var.getParent()).removeView(fc0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.el elVar = (org.telegram.ui.el) fc0Var;
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
                zb0 zb0Var = (zb0) this.c;
                zb0Var.P = null;
                zb0Var.g(this.b, false);
                break;
            case 16:
                ce0 ce0Var = (ce0) this.c;
                TextView textView = ce0Var.w;
                ai.w5 w5Var = ce0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                ce0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                un0 un0Var = (un0) this.c;
                if (animator == un0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    un0Var.F = f12;
                    un0Var.setShown(f12);
                    if (!z13) {
                        un0Var.setVisibility(8);
                    }
                    un0Var.b(true);
                    break;
                }
                break;
            case 19:
                jv0 jv0Var = (jv0) this.c;
                if (jv0Var.N1 != null) {
                    jv0Var.N1 = null;
                    if (!this.b) {
                        jv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                h21 h21Var = (h21) this.c;
                h21Var.M = this.b ? 1.0f : 0.0f;
                h21Var.invalidate();
                break;
            case 21:
                f31 f31Var = (f31) this.c;
                f31Var.F = this.b ? 1.0f : 0.0f;
                f31Var.h();
                break;
            case 22:
                j31 j31Var = (j31) this.c;
                j31Var.Q = this.b ? 1.0f : 0.0f;
                j31Var.h();
                j31Var.g();
                break;
            case 23:
                x61 x61Var = (x61) this.c;
                AnimatorSet animatorSet4 = x61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        x61Var.e.setVisibility(4);
                    }
                    x61Var.d = null;
                    break;
                }
                break;
            case 24:
                b71 b71Var = (b71) this.c;
                AnimatorSet animatorSet5 = b71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        b71Var.n.setVisibility(4);
                    }
                    b71Var.r = null;
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

    public ca(ko koVar) {
        this.a = 3;
        this.c = koVar;
    }
}
