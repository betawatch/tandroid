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
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ l00(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                n00 n00Var = (n00) this.c;
                AnimatorSet animatorSet = n00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n00Var.e = null;
                    break;
                }
                break;
            case 4:
                s60 s60Var = (s60) this.c;
                AnimatorSet animatorSet2 = s60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s60Var.U = null;
                    break;
                }
                break;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 11:
                ((yu0) this.c).K1 = null;
                break;
            case 15:
                m61 m61Var = (m61) this.c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    m61Var.d = null;
                    break;
                }
                break;
            case 16:
                q61 q61Var = (q61) this.c;
                AnimatorSet animatorSet4 = q61Var.r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q61Var.r = null;
                    break;
                }
                break;
            case 18:
                ((org.telegram.ui.ns) this.c).w = null;
                break;
            case 22:
                ((org.telegram.ui.e70) this.c).h = null;
                break;
            case 25:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.c;
                if (animator.equals(fq0Var.h0)) {
                    fq0Var.h0 = null;
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
                n00 n00Var = (n00) this.c;
                AnimatorSet animatorSet = n00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        n00Var.f.setVisibility(4);
                    }
                    n00Var.e = null;
                    break;
                }
                break;
            case 1:
                y00 y00Var = (y00) this.c;
                y00Var.h = this.b ? 1.0f : 0.0f;
                y00Var.invalidate();
                break;
            case 2:
                a30 a30Var = (a30) this.c;
                y20 y20Var = a30Var.a;
                if (!a30Var.C) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    a30Var.Y = f10;
                    a30Var.R.setPinnedProgress(f10);
                    y20Var.setScaleX(1.0f - (a30Var.Y * 0.6f));
                    y20Var.setScaleY(1.0f - (a30Var.Y * 0.6f));
                    if (a30Var.T) {
                        a30Var.i();
                        break;
                    }
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 4:
                s60 s60Var = (s60) this.c;
                AnimatorSet animatorSet2 = s60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        s60Var.V.setVisibility(4);
                    }
                    s60Var.U = null;
                    break;
                }
                break;
            case 5:
                c70 c70Var = (c70) this.c;
                boolean z4 = this.b;
                c70Var.e0 = z4 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.g3) c70Var).containerView;
                viewGroup.invalidate();
                if (!z4) {
                    c70Var.S.setVisibility(8);
                    break;
                }
                break;
            case 6:
                wb0 wb0Var = (wb0) this.c;
                if (wb0Var.getParent() != null) {
                    ((ViewGroup) wb0Var.getParent()).removeView(wb0Var);
                }
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) wb0Var;
                MessagePreviewParams messagePreviewParams = flVar.E.c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    break;
                }
                break;
            case 7:
                qb0 qb0Var = (qb0) this.c;
                qb0Var.M = null;
                qb0Var.g(this.b, false);
                break;
            case 8:
                vd0 vd0Var = (vd0) this.c;
                TextView textView = vd0Var.w;
                dh.d dVar = vd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                vd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 9:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 10:
                on0 on0Var = (on0) this.c;
                if (animator == on0Var.D) {
                    boolean z10 = this.b;
                    float f12 = z10 ? 1.0f : 0.0f;
                    on0Var.C = f12;
                    on0Var.setShown(f12);
                    if (!z10) {
                        on0Var.setVisibility(8);
                    }
                    on0Var.b(true);
                    break;
                }
                break;
            case 11:
                yu0 yu0Var = (yu0) this.c;
                if (yu0Var.K1 != null) {
                    yu0Var.K1 = null;
                    if (!this.b) {
                        yu0Var.y0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                w11 w11Var = (w11) this.c;
                w11Var.J = this.b ? 1.0f : 0.0f;
                w11Var.invalidate();
                break;
            case 13:
                r21 r21Var = (r21) this.c;
                r21Var.C = this.b ? 1.0f : 0.0f;
                r21Var.h();
                break;
            case 14:
                v21 v21Var = (v21) this.c;
                v21Var.N = this.b ? 1.0f : 0.0f;
                v21Var.h();
                v21Var.g();
                break;
            case 15:
                m61 m61Var = (m61) this.c;
                AnimatorSet animatorSet3 = m61Var.d;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        m61Var.e.setVisibility(4);
                    }
                    m61Var.d = null;
                    break;
                }
                break;
            case 16:
                q61 q61Var = (q61) this.c;
                AnimatorSet animatorSet4 = q61Var.r;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        q61Var.n.setVisibility(4);
                    }
                    q61Var.r = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.c;
                v2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = v2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!v2Var.D && (drawable = (drawableArr = v2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                v2Var.D = false;
                if (!v2Var.L) {
                    v2Var.n = v2Var.r;
                }
                v2Var.s = 0.0f;
                v2Var.invalidate();
                break;
            case 18:
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
            case 19:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) this.c;
                gzVar.r = this.b ? 1.0f : 0.0f;
                p9 p9Var = gzVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, gzVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(gzVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, gzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                gzVar.c.invalidate();
                gzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - gzVar.r, org.telegram.ui.ActionBar.j6.v0(i10, gzVar.a), org.telegram.ui.ActionBar.j6.v0(i11, gzVar.a)), mode));
                gzVar.f.invalidate();
                break;
            case 20:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.c;
                u00Var.s = this.b ? 1.0f : 0.0f;
                u00Var.invalidate();
                break;
            case 21:
                org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) this.c;
                c60Var.R2 = null;
                c60Var.L.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 22:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) this.c;
                if (e70Var.h != null && (kdVar = e70Var.f) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        e70Var.n.setVisibility(4);
                    }
                    e70Var.h = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) this.c;
                if (!this.b) {
                    ng0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet5 = ng0Var.I;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    ng0Var.I = null;
                    break;
                }
                break;
            case 24:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.fq0 fq0Var = (org.telegram.ui.fq0) this.c;
                if (animator.equals(fq0Var.h0)) {
                    if (!this.b) {
                        fq0Var.W.setVisibility(4);
                        fq0Var.X.setVisibility(4);
                    }
                    fq0Var.h0 = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.rv0) this.c).B = this.b ? 1.0f : 0.0f;
                break;
            case 27:
                org.telegram.ui.j01 j01Var = (org.telegram.ui.j01) this.c;
                if (j01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = j01Var.n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = j01Var.n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = j01Var.n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = j01Var.n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    j01Var.setVisibility(8);
                }
                j01Var.n.l5(false);
                break;
            case 28:
                org.telegram.ui.o11 o11Var = (org.telegram.ui.o11) this.c;
                if (!this.b) {
                    o11Var.f.setVisibility(8);
                    break;
                } else {
                    o11Var.c.setVisibility(8);
                    break;
                }
            default:
                org.telegram.ui.p41 p41Var = (org.telegram.ui.p41) this.c;
                p41Var.v = this.b ? 1.0f : 0.0f;
                if (p41Var.P) {
                    p41Var.K.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 23:
                if (this.b) {
                    ((org.telegram.ui.ng0) this.c).S.setVisibility(0);
                    break;
                }
                break;
            case 24:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            case 25:
            case 26:
            default:
                super.onAnimationStart(animator);
                break;
            case 27:
                org.telegram.ui.j01 j01Var = (org.telegram.ui.j01) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = j01Var.n.R0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = j01Var.n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = j01Var.n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = j01Var.n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                j01Var.setVisibility(0);
                j01Var.n.l5(false);
                break;
            case 28:
                org.telegram.ui.o11 o11Var = (org.telegram.ui.o11) this.c;
                if (!this.b) {
                    o11Var.c.setAlpha(0.0f);
                    o11Var.c.setVisibility(0);
                    break;
                } else {
                    o11Var.f.setAlpha(0.0f);
                    o11Var.f.setVisibility(0);
                    break;
                }
        }
    }

    public l00(View view) {
        this.a = 3;
        this.c = view;
        this.b = true;
    }

    public l00(View view, boolean z4) {
        this.a = 3;
        this.c = view;
        this.b = z4;
    }
}
