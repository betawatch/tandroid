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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ m00(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet = o00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o00Var.e = null;
                    break;
                }
                break;
            case 4:
                t60 t60Var = (t60) this.c;
                AnimatorSet animatorSet2 = t60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t60Var.U = null;
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
                ((org.telegram.ui.ps) this.c).w = null;
                break;
            case 22:
                ((org.telegram.ui.g70) this.c).h = null;
                break;
            case 25:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.c;
                if (animator.equals(mq0Var.h0)) {
                    mq0Var.h0 = null;
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
        org.telegram.ui.md mdVar;
        switch (this.a) {
            case 0:
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet = o00Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        o00Var.f.setVisibility(4);
                    }
                    o00Var.e = null;
                    break;
                }
                break;
            case 1:
                z00 z00Var = (z00) this.c;
                z00Var.h = this.b ? 1.0f : 0.0f;
                z00Var.invalidate();
                break;
            case 2:
                b30 b30Var = (b30) this.c;
                z20 z20Var = b30Var.a;
                if (!b30Var.C) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    b30Var.Y = f10;
                    b30Var.R.setPinnedProgress(f10);
                    z20Var.setScaleX(1.0f - (b30Var.Y * 0.6f));
                    z20Var.setScaleY(1.0f - (b30Var.Y * 0.6f));
                    if (b30Var.T) {
                        b30Var.i();
                        break;
                    }
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 4:
                t60 t60Var = (t60) this.c;
                AnimatorSet animatorSet2 = t60Var.U;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        t60Var.V.setVisibility(4);
                    }
                    t60Var.U = null;
                    break;
                }
                break;
            case 5:
                d70 d70Var = (d70) this.c;
                boolean z4 = this.b;
                d70Var.e0 = z4 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.g3) d70Var).containerView;
                viewGroup.invalidate();
                if (!z4) {
                    d70Var.S.setVisibility(8);
                    break;
                }
                break;
            case 6:
                xb0 xb0Var = (xb0) this.c;
                if (xb0Var.getParent() != null) {
                    ((ViewGroup) xb0Var.getParent()).removeView(xb0Var);
                }
                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) xb0Var;
                MessagePreviewParams messagePreviewParams = hlVar.E.c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gl(hlVar, 0), 15L);
                    break;
                }
                break;
            case 7:
                rb0 rb0Var = (rb0) this.c;
                rb0Var.M = null;
                rb0Var.g(this.b, false);
                break;
            case 8:
                wd0 wd0Var = (wd0) this.c;
                TextView textView = wd0Var.w;
                dh.d dVar = wd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                wd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
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
                nn0 nn0Var = (nn0) this.c;
                if (animator == nn0Var.D) {
                    boolean z10 = this.b;
                    float f12 = z10 ? 1.0f : 0.0f;
                    nn0Var.C = f12;
                    nn0Var.setShown(f12);
                    if (!z10) {
                        nn0Var.setVisibility(8);
                    }
                    nn0Var.b(true);
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
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.c;
                if (psVar.w != null && (radialProgressView = psVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        psVar.v.setVisibility(4);
                    }
                    psVar.w = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) this.c;
                izVar.r = this.b ? 1.0f : 0.0f;
                p9 p9Var = izVar.c;
                int i10 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, izVar.a);
                int i11 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(izVar.r, v02, org.telegram.ui.ActionBar.j6.v0(i11, izVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                izVar.c.invalidate();
                izVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - izVar.r, org.telegram.ui.ActionBar.j6.v0(i10, izVar.a), org.telegram.ui.ActionBar.j6.v0(i11, izVar.a)), mode));
                izVar.f.invalidate();
                break;
            case 20:
                org.telegram.ui.v00 v00Var = (org.telegram.ui.v00) this.c;
                v00Var.s = this.b ? 1.0f : 0.0f;
                v00Var.invalidate();
                break;
            case 21:
                org.telegram.ui.e60 e60Var = (org.telegram.ui.e60) this.c;
                e60Var.R2 = null;
                e60Var.L.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 22:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) this.c;
                if (g70Var.h != null && (mdVar = g70Var.f) != null) {
                    if (this.b) {
                        mdVar.setVisibility(4);
                    } else {
                        g70Var.n.setVisibility(4);
                    }
                    g70Var.h = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) this.c;
                if (!this.b) {
                    pg0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet5 = pg0Var.I;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    pg0Var.I = null;
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
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) this.c;
                if (animator.equals(mq0Var.h0)) {
                    if (!this.b) {
                        mq0Var.W.setVisibility(4);
                        mq0Var.X.setVisibility(4);
                    }
                    mq0Var.h0 = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.yv0) this.c).B = this.b ? 1.0f : 0.0f;
                break;
            case 27:
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.c;
                if (q01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = q01Var.n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = q01Var.n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = q01Var.n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = q01Var.n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    q01Var.setVisibility(8);
                }
                q01Var.n.l5(false);
                break;
            case 28:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.c;
                if (!this.b) {
                    v11Var.f.setVisibility(8);
                    break;
                } else {
                    v11Var.c.setVisibility(8);
                    break;
                }
            default:
                org.telegram.ui.w41 w41Var = (org.telegram.ui.w41) this.c;
                w41Var.v = this.b ? 1.0f : 0.0f;
                if (w41Var.P) {
                    w41Var.K.invalidate();
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
                    ((org.telegram.ui.pg0) this.c).S.setVisibility(0);
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
                org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = q01Var.n.R0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = q01Var.n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = q01Var.n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = q01Var.n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                q01Var.setVisibility(0);
                q01Var.n.l5(false);
                break;
            case 28:
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) this.c;
                if (!this.b) {
                    v11Var.c.setAlpha(0.0f);
                    v11Var.c.setVisibility(0);
                    break;
                } else {
                    v11Var.f.setAlpha(0.0f);
                    v11Var.f.setVisibility(0);
                    break;
                }
        }
    }

    public m00(View view) {
        this.a = 3;
        this.c = view;
        this.b = true;
    }

    public m00(View view, boolean z4) {
        this.a = 3;
        this.c = view;
        this.b = z4;
    }
}
