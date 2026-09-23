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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                s60 s60Var = (s60) this.c;
                AnimatorSet animatorSet3 = s60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s60Var.X = null;
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
                ((yu0) this.c).N1 = null;
                break;
            case 23:
                j61 j61Var = (j61) this.c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j61Var.d = null;
                    break;
                }
                break;
            case 24:
                n61 n61Var = (n61) this.c;
                AnimatorSet animatorSet5 = n61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    n61Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.ns) this.c).w = null;
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
                        org.telegram.ui.ActionBar.v0 v0Var = wiVar.e1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
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
                s60 s60Var = (s60) this.c;
                AnimatorSet animatorSet3 = s60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        s60Var.Y.setVisibility(4);
                    }
                    s60Var.X = null;
                    break;
                }
                break;
            case 13:
                c70 c70Var = (c70) this.c;
                boolean z11 = this.b;
                c70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) c70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    c70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 14:
                ub0 ub0Var = (ub0) this.c;
                if (ub0Var.getParent() != null) {
                    ((ViewGroup) ub0Var.getParent()).removeView(ub0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) ub0Var;
                MessagePreviewParams messagePreviewParams = flVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                ob0 ob0Var = (ob0) this.c;
                ob0Var.P = null;
                ob0Var.g(this.b, false);
                break;
            case 16:
                sd0 sd0Var = (sd0) this.c;
                TextView textView = sd0Var.w;
                ai.w5 w5Var = sd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                w5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                w5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                in0 in0Var = (in0) this.c;
                if (animator == in0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    in0Var.F = f12;
                    in0Var.setShown(f12);
                    if (!z13) {
                        in0Var.setVisibility(8);
                    }
                    in0Var.b(true);
                    break;
                }
                break;
            case 19:
                yu0 yu0Var = (yu0) this.c;
                if (yu0Var.N1 != null) {
                    yu0Var.N1 = null;
                    if (!this.b) {
                        yu0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                t11 t11Var = (t11) this.c;
                t11Var.M = this.b ? 1.0f : 0.0f;
                t11Var.invalidate();
                break;
            case 21:
                r21 r21Var = (r21) this.c;
                r21Var.F = this.b ? 1.0f : 0.0f;
                r21Var.h();
                break;
            case 22:
                v21 v21Var = (v21) this.c;
                v21Var.Q = this.b ? 1.0f : 0.0f;
                v21Var.h();
                v21Var.g();
                break;
            case 23:
                j61 j61Var = (j61) this.c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        j61Var.e.setVisibility(4);
                    }
                    j61Var.d = null;
                    break;
                }
                break;
            case 24:
                n61 n61Var = (n61) this.c;
                AnimatorSet animatorSet5 = n61Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        n61Var.n.setVisibility(4);
                    }
                    n61Var.r = null;
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
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.c;
                if (nsVar.w != null && (radialProgressView = nsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nsVar.v.setVisibility(4);
                    }
                    nsVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.c;
                izVar.r = this.b ? 1.0f : 0.0f;
                w9 w9Var2 = izVar.c;
                int i10 = org.telegram.ui.ActionBar.h6.C6;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, izVar.a);
                int i11 = org.telegram.ui.ActionBar.h6.Oh;
                int d = i0.a.d(izVar.r, v02, org.telegram.ui.ActionBar.h6.v0(i11, izVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                izVar.c.invalidate();
                izVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.r, org.telegram.ui.ActionBar.h6.v0(i10, izVar.a), org.telegram.ui.ActionBar.h6.v0(i11, izVar.a)), mode));
                izVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.v00 v00Var = (org.telegram.ui.v00) this.c;
                v00Var.s = this.b ? 1.0f : 0.0f;
                v00Var.invalidate();
                break;
            default:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.c;
                f60Var.U2 = null;
                f60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
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
