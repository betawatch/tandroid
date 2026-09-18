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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class aa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ aa(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ba baVar = (ba) this.c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    baVar.h = null;
                    break;
                }
                break;
            case 2:
                ((vi) this.c).Y0 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                n00 n00Var = (n00) this.c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.e = null;
                    break;
                }
                break;
            case 12:
                r60 r60Var = (r60) this.c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r60Var.X = null;
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
                ((zu0) this.c).N1 = null;
                break;
            case 23:
                l61 l61Var = (l61) this.c;
                AnimatorSet animatorSet4 = l61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    l61Var.d = null;
                    break;
                }
                break;
            case 24:
                p61 p61Var = (p61) this.c;
                AnimatorSet animatorSet5 = p61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    p61Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.us) this.c).w = null;
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
                ba baVar = (ba) this.c;
                AnimatorSet animatorSet = baVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        baVar.c.setVisibility(4);
                        break;
                    } else {
                        baVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                wc wcVar = (wc) this.c;
                if (animator == wcVar.g) {
                    wcVar.g = null;
                    wcVar.i = this.b ? 1.0f : 0.0f;
                    wcVar.b();
                    break;
                }
                break;
            case 2:
                vi viVar = (vi) this.c;
                if (viVar.Y0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = viVar.e1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (viVar.Q0 != 0 || !viVar.q1) {
                            viVar.a1.setVisibility(4);
                            break;
                        }
                    } else if (viVar.S0) {
                        ni niVar = viVar.y0;
                        if (niVar == null || niVar.J()) {
                            viVar.x1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                jo joVar = (jo) this.c;
                if (!this.b) {
                    u9 u9Var = joVar.h;
                    joVar.h = joVar.n;
                    joVar.n = u9Var;
                    u9Var.setVisibility(8);
                    joVar.n.setAlpha(0.0f);
                    joVar.h.setVisibility(0);
                    joVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                to toVar = (to) this.c;
                if (animator == toVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    toVar.d = f7;
                    toVar.setShown(f7);
                    if (!z10) {
                        toVar.setVisibility(8);
                    }
                    toVar.a(true);
                    break;
                }
                break;
            case 5:
                mp mpVar = (mp) this.c;
                mpVar.g0 = this.b ? 1.0f : 0.0f;
                mpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.g0);
                break;
            case 6:
                if (!this.b) {
                    ((mq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                yv yvVar = (yv) this.c;
                cw cwVar = yvVar.J;
                if (cwVar.U && !yvVar.h) {
                    if (!this.b && !yvVar.n) {
                        yvVar.setBackground(null);
                        break;
                    } else if (yvVar.getBackground() == null) {
                        yvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(cwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                n00 n00Var = (n00) this.c;
                AnimatorSet animatorSet2 = n00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        n00Var.f.setVisibility(4);
                    }
                    n00Var.e = null;
                    break;
                }
                break;
            case 9:
                y00 y00Var = (y00) this.c;
                y00Var.h = this.b ? 1.0f : 0.0f;
                y00Var.invalidate();
                break;
            case 10:
                z20 z20Var = (z20) this.c;
                x20 x20Var = z20Var.a;
                if (!z20Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    z20Var.b0 = f10;
                    z20Var.U.setPinnedProgress(f10);
                    x20Var.setScaleX(1.0f - (z20Var.b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                r60 r60Var = (r60) this.c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        r60Var.Y.setVisibility(4);
                    }
                    r60Var.X = null;
                    break;
                }
                break;
            case 13:
                b70 b70Var = (b70) this.c;
                boolean z11 = this.b;
                b70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.g3) b70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    b70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                vb0 vb0Var = (vb0) this.c;
                if (vb0Var.getParent() != null) {
                    ((ViewGroup) vb0Var.getParent()).removeView(vb0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.il ilVar = (org.telegram.ui.il) vb0Var;
                MessagePreviewParams messagePreviewParams = ilVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.hl(ilVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                pb0 pb0Var = (pb0) this.c;
                pb0Var.P = null;
                pb0Var.g(this.b, false);
                break;
            case 16:
                sd0 sd0Var = (sd0) this.c;
                TextView textView = sd0Var.w;
                ai.x5 x5Var = sd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                sd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                jn0 jn0Var = (jn0) this.c;
                if (animator == jn0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    jn0Var.F = f12;
                    jn0Var.setShown(f12);
                    if (!z13) {
                        jn0Var.setVisibility(8);
                    }
                    jn0Var.b(true);
                    break;
                }
                break;
            case 19:
                zu0 zu0Var = (zu0) this.c;
                if (zu0Var.N1 != null) {
                    zu0Var.N1 = null;
                    if (!this.b) {
                        zu0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                v11 v11Var = (v11) this.c;
                v11Var.M = this.b ? 1.0f : 0.0f;
                v11Var.invalidate();
                break;
            case 21:
                t21 t21Var = (t21) this.c;
                t21Var.F = this.b ? 1.0f : 0.0f;
                t21Var.h();
                break;
            case 22:
                x21 x21Var = (x21) this.c;
                x21Var.Q = this.b ? 1.0f : 0.0f;
                x21Var.h();
                x21Var.g();
                break;
            case 23:
                l61 l61Var = (l61) this.c;
                AnimatorSet animatorSet4 = l61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        l61Var.e.setVisibility(4);
                    }
                    l61Var.d = null;
                    break;
                }
                break;
            case 24:
                p61 p61Var = (p61) this.c;
                AnimatorSet animatorSet5 = p61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        p61Var.n.setVisibility(4);
                    }
                    p61Var.r = null;
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
                org.telegram.ui.us usVar = (org.telegram.ui.us) this.c;
                if (usVar.w != null && (radialProgressView = usVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        usVar.v.setVisibility(4);
                    }
                    usVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) this.c;
                nzVar.r = this.b ? 1.0f : 0.0f;
                u9 u9Var2 = nzVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, nzVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(nzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, nzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                u9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                nzVar.c.invalidate();
                nzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - nzVar.r, org.telegram.ui.ActionBar.j6.v0(i10, nzVar.a), org.telegram.ui.ActionBar.j6.v0(i11, nzVar.a)), mode));
                nzVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.a10 a10Var = (org.telegram.ui.a10) this.c;
                a10Var.s = this.b ? 1.0f : 0.0f;
                a10Var.invalidate();
                break;
            default:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) this.c;
                k60Var.U2 = null;
                k60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public aa(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public aa(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public aa(jo joVar) {
        this.a = 3;
        this.c = joVar;
    }
}
