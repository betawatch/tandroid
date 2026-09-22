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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ba extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ ba(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ca caVar = (ca) this.c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    caVar.h = null;
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
                ((lv0) this.c).N1 = null;
                break;
            case 23:
                a71 a71Var = (a71) this.c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    a71Var.d = null;
                    break;
                }
                break;
            case 24:
                e71 e71Var = (e71) this.c;
                AnimatorSet animatorSet5 = e71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    e71Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.ss) this.c).w = null;
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
                ca caVar = (ca) this.c;
                AnimatorSet animatorSet = caVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        caVar.c.setVisibility(4);
                        break;
                    } else {
                        caVar.b.setVisibility(4);
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
                vi viVar = (vi) this.c;
                if (viVar.Y0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.v0 v0Var = viVar.e1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
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
                    v9 v9Var = joVar.h;
                    joVar.h = joVar.n;
                    joVar.n = v9Var;
                    v9Var.setVisibility(8);
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
                zv zvVar = (zv) this.c;
                dw dwVar = zvVar.J;
                if (dwVar.U && !zvVar.h) {
                    if (!this.b && !zvVar.n) {
                        zvVar.setBackground(null);
                        break;
                    } else if (zvVar.getBackground() == null) {
                        zvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(dwVar.k(), 8, 8));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) m70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    m70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                gc0 gc0Var = (gc0) this.c;
                if (gc0Var.getParent() != null) {
                    ((ViewGroup) gc0Var.getParent()).removeView(gc0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.gl glVar = (org.telegram.ui.gl) gc0Var;
                MessagePreviewParams messagePreviewParams = glVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fl(glVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                ac0 ac0Var = (ac0) this.c;
                ac0Var.P = null;
                ac0Var.g(this.b, false);
                break;
            case 16:
                de0 de0Var = (de0) this.c;
                TextView textView = de0Var.w;
                ai.x5 x5Var = de0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                de0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                k21 k21Var = (k21) this.c;
                k21Var.M = this.b ? 1.0f : 0.0f;
                k21Var.invalidate();
                break;
            case 21:
                i31 i31Var = (i31) this.c;
                i31Var.F = this.b ? 1.0f : 0.0f;
                i31Var.h();
                break;
            case 22:
                m31 m31Var = (m31) this.c;
                m31Var.Q = this.b ? 1.0f : 0.0f;
                m31Var.h();
                m31Var.g();
                break;
            case 23:
                a71 a71Var = (a71) this.c;
                AnimatorSet animatorSet4 = a71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        a71Var.e.setVisibility(4);
                    }
                    a71Var.d = null;
                    break;
                }
                break;
            case 24:
                e71 e71Var = (e71) this.c;
                AnimatorSet animatorSet5 = e71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        e71Var.n.setVisibility(4);
                    }
                    e71Var.r = null;
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
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.c;
                if (ssVar.w != null && (radialProgressView = ssVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) this.c;
                lzVar.r = this.b ? 1.0f : 0.0f;
                v9 v9Var2 = lzVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, lzVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                v9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.c.invalidate();
                lzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.r, org.telegram.ui.ActionBar.j6.v0(i10, lzVar.a), org.telegram.ui.ActionBar.j6.v0(i11, lzVar.a)), mode));
                lzVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.y00 y00Var2 = (org.telegram.ui.y00) this.c;
                y00Var2.s = this.b ? 1.0f : 0.0f;
                y00Var2.invalidate();
                break;
            default:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.c;
                i60Var.U2 = null;
                i60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public ba(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public ba(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public ba(jo joVar) {
        this.a = 3;
        this.c = joVar;
    }
}
