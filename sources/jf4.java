// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jf4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    public jf4(View view) {
        this.a = (byte) 7;
        this.c = view;
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                dh4 dh4Var = (dh4) obj;
                AnimatorSet animatorSet = dh4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dh4Var.p1 = null;
                    break;
                }
                break;
            case 6:
                ((uc5) obj).h = null;
                break;
            case 8:
                xs5 xs5Var = (xs5) obj;
                AnimatorSet animatorSet2 = xs5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xs5Var.R1 = null;
                    break;
                }
                break;
            case 20:
                q68 q68Var = (q68) obj;
                AnimatorSet animatorSet3 = q68Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    q68Var.L = null;
                    break;
                }
                break;
            case 21:
                w78 w78Var = (w78) obj;
                if (animator.equals(w78Var.l0)) {
                    w78Var.l0 = null;
                    break;
                }
                break;
            case 22:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
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
        cj1 cj1Var;
        byte b = this.a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                kf4 kf4Var = (kf4) obj;
                kf4Var.s = z ? 1.0f : 0.0f;
                kf4Var.invalidate();
                break;
            case 1:
                dh4 dh4Var = (dh4) obj;
                AnimatorSet animatorSet = dh4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        dh4Var.q1.setVisibility(4);
                    }
                    dh4Var.p1 = null;
                    break;
                }
                break;
            case 2:
                hn4 hn4Var = (hn4) obj;
                hn4Var.n = z ? 1.0f : 0.0f;
                hn4Var.invalidate();
                break;
            case 3:
                if (!z) {
                    ((tt4) obj).J.setVisibility(8);
                    break;
                }
                break;
            case 4:
                g95 g95Var = (g95) obj;
                g95Var.J4 = null;
                g95Var.H1.getSubtitleTextView().setTranslationY(z ? 0.0f : gm.L(20.0f));
                break;
            case 5:
                oa5 oa5Var = (oa5) obj;
                ma5 ma5Var = oa5Var.a;
                if (!oa5Var.H) {
                    float f = z ? 1.0f : 0.0f;
                    oa5Var.d0 = f;
                    oa5Var.W.setPinnedProgress(f);
                    ma5Var.setScaleX(1.0f - (oa5Var.d0 * 0.6f));
                    ma5Var.setScaleY(1.0f - (oa5Var.d0 * 0.6f));
                    if (oa5Var.Y) {
                        oa5Var.j();
                        break;
                    }
                }
                break;
            case 6:
                uc5 uc5Var = (uc5) obj;
                if (uc5Var.h != null && (cj1Var = uc5Var.f) != null) {
                    if (z) {
                        cj1Var.setVisibility(4);
                    } else {
                        uc5Var.n.setVisibility(4);
                    }
                    uc5Var.h = null;
                    break;
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(z ? 8 : 4);
                break;
            case 8:
                xs5 xs5Var = (xs5) obj;
                AnimatorSet animatorSet2 = xs5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        xs5Var.S1.setVisibility(4);
                    }
                    xs5Var.R1 = null;
                    break;
                }
                break;
            case 9:
                it5 it5Var = (it5) obj;
                it5Var.b2 = z ? 1.0f : 0.0f;
                it5Var.b.invalidate();
                if (!z) {
                    it5Var.P1.setVisibility(8);
                    break;
                }
                break;
            case 10:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z) {
                    limitPreviewView.k0 = false;
                }
                Runnable runnable = limitPreviewView.l0;
                if (runnable != null) {
                    gm.r(runnable);
                    limitPreviewView.l0.run();
                    break;
                }
                break;
            case 11:
                n38 n38Var = (n38) obj;
                n38Var.c.setAlpha(z ? 0.0f : 1.0f);
                n38Var.a.setAlpha(z ? 0.0f : 0.5f);
                n38Var.invalidate();
                break;
            case 12:
                mh6 mh6Var = (mh6) obj;
                if (!z) {
                    mh6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = mh6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mh6Var.M = null;
                    break;
                }
                break;
            case 13:
                l57 l57Var = (l57) obj;
                if (l57Var.getParent() != null) {
                    ((ViewGroup) l57Var.getParent()).removeView(l57Var);
                }
                jt1 jt1Var = (jt1) l57Var;
                o47 o47Var = jt1Var.I.x5;
                if (o47Var != null) {
                    o47Var.x = null;
                }
                if (z) {
                    gm.d3(new it1(jt1Var, b2), 15L);
                    break;
                }
                break;
            case 14:
                f57 f57Var = (f57) obj;
                f57Var.Q = null;
                f57Var.g(z, false);
                break;
            case 15:
                rc7 rc7Var = (rc7) obj;
                rc7Var.e = z ? 1.0f : 0.0f;
                rc7Var.invalidate();
                int i = 0;
                while (i < 2) {
                    rc7Var.c[i].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    rc7Var.c[i].setVisibility((i == 1) == z ? 0 : 8);
                    rc7Var.c[i].setAlpha(gm.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, rc7Var.e));
                    rc7Var.d[i].setTranslationX(gm.U1(rc7Var.e, 0, -gm.L(62.0f)));
                    rc7Var.d[i].setVisibility((i == 1) == z ? 0 : 8);
                    rc7Var.d[i].setAlpha(gm.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, rc7Var.e));
                    i++;
                }
                break;
            case 16:
                if (!z) {
                    ((gj7) obj).b.setVisibility(8);
                    break;
                }
                break;
            case 17:
                xv7 xv7Var = (xv7) obj;
                if (!z) {
                    xv7Var.P1.setVisibility(8);
                    xv7Var.P1.k();
                    break;
                }
                break;
            case 18:
                if (!z) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 19:
                by7 by7Var = (by7) obj;
                TextView textView = by7Var.x;
                a6 a6Var = by7Var.e;
                float f2 = z ? 1.0f : 0.0f;
                a6Var.setScaleX(gm.R1(0.8f, 1.0f, f2));
                a6Var.setScaleY(gm.R1(0.8f, 1.0f, f2));
                a6Var.setAlpha(gm.R1(0.0f, 1.0f, f2));
                textView.setScaleX(gm.R1(1.0f, 0.9f, f2));
                textView.setScaleY(gm.R1(1.0f, 0.9f, f2));
                textView.setAlpha(gm.R1(1.0f, 0.0f, f2));
                by7Var.s.setAlpha(gm.R1(0.0f, 1.0f, f2));
                break;
            case 20:
                q68 q68Var = (q68) obj;
                AnimatorSet animatorSet4 = q68Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q68Var.L = null;
                    if (!z) {
                        q68Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 21:
                w78 w78Var = (w78) obj;
                if (animator.equals(w78Var.l0)) {
                    if (!z) {
                        w78Var.a0.setVisibility(4);
                        w78Var.b0.setVisibility(4);
                    }
                    w78Var.l0 = null;
                    break;
                }
                break;
            case 22:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!z) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 23:
                cd8 cd8Var = (cd8) obj;
                ((bn2) cd8Var).E.r1.d();
                if (z) {
                    cd8Var.x.accept(Integer.valueOf(cd8Var.s));
                }
                if (cd8Var.getParent() != null) {
                    ((ViewGroup) cd8Var.getParent()).removeView(cd8Var);
                    break;
                }
                break;
            case 24:
                ((xg8) obj).F = z ? 1.0f : 0.0f;
                break;
            case 25:
                cj8 cj8Var = (cj8) obj;
                cj8Var.P = z ? 1.0f : 0.0f;
                cj8Var.f.invalidate();
                aj8 aj8Var = cj8Var.h;
                if (aj8Var != null) {
                    aj8Var.invalidate();
                    break;
                }
                break;
            case 26:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                if (nq8Var.h) {
                    zja zjaVar = profileActivity.U0;
                    if (zjaVar != null) {
                        zjaVar.setClickable(false);
                    }
                } else {
                    nq8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.e7;
                profileActivity.l4(false);
                break;
            case 27:
                zv8 zv8Var = (zv8) obj;
                if (!z) {
                    zv8Var.f.setVisibility(8);
                    break;
                } else {
                    zv8Var.c.setVisibility(8);
                    break;
                }
            case 28:
                if (!z) {
                    ((zb9) obj).w.setVisibility(8);
                    break;
                }
                break;
            default:
                xu9 xu9Var = (xu9) obj;
                if (animator == xu9Var.H) {
                    float f3 = z ? 1.0f : 0.0f;
                    xu9Var.G = f3;
                    xu9Var.setShown(f3);
                    if (!z) {
                        xu9Var.setVisibility(8);
                    }
                    xu9Var.b(true);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (b) {
            case 12:
                if (z) {
                    ((mh6) obj).W.setVisibility(0);
                    break;
                }
                break;
            case 18:
                if (z) {
                    ((PasscodeActivity) obj).w.setVisibility(0);
                    break;
                }
                break;
            case 26:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                zja zjaVar = profileActivity.U0;
                if (zjaVar != null && !z) {
                    zjaVar.setClickable(true);
                }
                profileActivity.a4(true);
                nq8Var.setVisibility(0);
                profileActivity.l4(false);
                break;
            case 27:
                zv8 zv8Var = (zv8) obj;
                ImageView imageView = zv8Var.c;
                jh2 jh2Var = zv8Var.f;
                if (!z) {
                    imageView.setAlpha(0.0f);
                    imageView.setVisibility(0);
                    break;
                } else {
                    jh2Var.setAlpha(0.0f);
                    jh2Var.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ jf4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public jf4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
