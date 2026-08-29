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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ z9(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                aa aaVar = (aa) this.c;
                AnimatorSet animatorSet = aaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aaVar.h = null;
                    break;
                }
                break;
            case 2:
                ((ni) this.c).U0 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                j00 j00Var = (j00) this.c;
                AnimatorSet animatorSet2 = j00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j00Var.e = null;
                    break;
                }
                break;
            case 12:
                n60 n60Var = (n60) this.c;
                AnimatorSet animatorSet3 = n60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    n60Var.T = null;
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
                ((qu0) this.c).J1 = null;
                break;
            case 23:
                b61 b61Var = (b61) this.c;
                AnimatorSet animatorSet4 = b61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    b61Var.d = null;
                    break;
                }
                break;
            case 24:
                f61 f61Var = (f61) this.c;
                AnimatorSet animatorSet5 = f61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    f61Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.hs) this.c).w = null;
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
                aa aaVar = (aa) this.c;
                AnimatorSet animatorSet = aaVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        aaVar.c.setVisibility(4);
                        break;
                    } else {
                        aaVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                uc ucVar = (uc) this.c;
                if (animator == ucVar.g) {
                    ucVar.g = null;
                    ucVar.i = this.b ? 1.0f : 0.0f;
                    ucVar.b();
                    break;
                }
                break;
            case 2:
                ni niVar = (ni) this.c;
                if (niVar.U0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = niVar.a1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (niVar.M0 != 0 || !niVar.m1) {
                            niVar.W0.setVisibility(4);
                            break;
                        }
                    } else if (niVar.O0) {
                        fi fiVar = niVar.u0;
                        if (fiVar == null || fiVar.I()) {
                            niVar.t1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                co coVar = (co) this.c;
                if (!this.b) {
                    t9 t9Var = coVar.h;
                    coVar.h = coVar.n;
                    coVar.n = t9Var;
                    t9Var.setVisibility(8);
                    coVar.n.setAlpha(0.0f);
                    coVar.h.setVisibility(0);
                    coVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                no noVar = (no) this.c;
                if (animator == noVar.e) {
                    float f9 = z10 ? 1.0f : 0.0f;
                    noVar.d = f9;
                    noVar.setShown(f9);
                    if (!z10) {
                        noVar.setVisibility(8);
                    }
                    noVar.a(true);
                    break;
                }
                break;
            case 5:
                gp gpVar = (gp) this.c;
                gpVar.c0 = this.b ? 1.0f : 0.0f;
                gpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * gpVar.c0);
                break;
            case 6:
                if (!this.b) {
                    ((gq) this.c).D.setVisibility(8);
                    break;
                }
                break;
            case 7:
                pv pvVar = (pv) this.c;
                tv tvVar = pvVar.F;
                if (tvVar.Q && !pvVar.h) {
                    if (!this.b && !pvVar.n) {
                        pvVar.setBackground(null);
                        break;
                    } else if (pvVar.getBackground() == null) {
                        pvVar.setBackground(org.telegram.ui.ActionBar.g6.Y(tvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                j00 j00Var = (j00) this.c;
                AnimatorSet animatorSet2 = j00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        j00Var.f.setVisibility(4);
                    }
                    j00Var.e = null;
                    break;
                }
                break;
            case 9:
                u00 u00Var = (u00) this.c;
                u00Var.h = this.b ? 1.0f : 0.0f;
                u00Var.invalidate();
                break;
            case 10:
                w20 w20Var = (w20) this.c;
                t20 t20Var = w20Var.a;
                if (!w20Var.B) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    w20Var.X = f10;
                    w20Var.Q.setPinnedProgress(f10);
                    t20Var.setScaleX(1.0f - (w20Var.X * 0.6f));
                    t20Var.setScaleY(1.0f - (w20Var.X * 0.6f));
                    if (w20Var.S) {
                        w20Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                n60 n60Var = (n60) this.c;
                AnimatorSet animatorSet3 = n60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        n60Var.U.setVisibility(4);
                    }
                    n60Var.T = null;
                    break;
                }
                break;
            case 13:
                x60 x60Var = (x60) this.c;
                boolean z11 = this.b;
                x60Var.d0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) x60Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    x60Var.R.setVisibility(8);
                    break;
                }
                break;
            case 14:
                rb0 rb0Var = (rb0) this.c;
                if (rb0Var.getParent() != null) {
                    ((ViewGroup) rb0Var.getParent()).removeView(rb0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) rb0Var;
                MessagePreviewParams messagePreviewParams = zkVar.D.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.yk(zkVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                lb0 lb0Var = (lb0) this.c;
                lb0Var.L = null;
                lb0Var.g(this.b, false);
                break;
            case 16:
                nd0 nd0Var = (nd0) this.c;
                TextView textView = nd0Var.w;
                bh.d dVar = nd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                nd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                en0 en0Var = (en0) this.c;
                if (animator == en0Var.C) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    en0Var.B = f12;
                    en0Var.setShown(f12);
                    if (!z13) {
                        en0Var.setVisibility(8);
                    }
                    en0Var.b(true);
                    break;
                }
                break;
            case 19:
                qu0 qu0Var = (qu0) this.c;
                if (qu0Var.J1 != null) {
                    qu0Var.J1 = null;
                    if (!this.b) {
                        qu0Var.x0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                l11 l11Var = (l11) this.c;
                l11Var.I = this.b ? 1.0f : 0.0f;
                l11Var.invalidate();
                break;
            case 21:
                h21 h21Var = (h21) this.c;
                h21Var.B = this.b ? 1.0f : 0.0f;
                h21Var.h();
                break;
            case 22:
                l21 l21Var = (l21) this.c;
                l21Var.M = this.b ? 1.0f : 0.0f;
                l21Var.h();
                l21Var.g();
                break;
            case 23:
                b61 b61Var = (b61) this.c;
                AnimatorSet animatorSet4 = b61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        b61Var.e.setVisibility(4);
                    }
                    b61Var.d = null;
                    break;
                }
                break;
            case 24:
                f61 f61Var = (f61) this.c;
                AnimatorSet animatorSet5 = f61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        f61Var.n.setVisibility(4);
                    }
                    f61Var.r = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.c;
                x2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = x2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!x2Var.C && (drawable = (drawableArr = x2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                x2Var.C = false;
                if (!x2Var.K) {
                    x2Var.n = x2Var.r;
                }
                x2Var.s = 0.0f;
                x2Var.invalidate();
                break;
            case 26:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.c;
                if (hsVar.w != null && (radialProgressView = hsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        hsVar.v.setVisibility(4);
                    }
                    hsVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.c;
                wyVar.r = this.b ? 1.0f : 0.0f;
                t9 t9Var2 = wyVar.c;
                int i10 = org.telegram.ui.ActionBar.g6.C6;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i10, wyVar.a);
                int i11 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(wyVar.r, v02, org.telegram.ui.ActionBar.g6.v0(i11, wyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                t9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                wyVar.c.invalidate();
                wyVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - wyVar.r, org.telegram.ui.ActionBar.g6.v0(i10, wyVar.a), org.telegram.ui.ActionBar.g6.v0(i11, wyVar.a)), mode));
                wyVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.i00 i00Var = (org.telegram.ui.i00) this.c;
                i00Var.s = this.b ? 1.0f : 0.0f;
                i00Var.invalidate();
                break;
            default:
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.c;
                r50Var.Q2 = null;
                r50Var.K.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public z9(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public z9(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public z9(co coVar) {
        this.a = 3;
        this.c = coVar;
    }
}
