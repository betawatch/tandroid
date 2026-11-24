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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class id4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    public id4(View view) {
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
                cf4 cf4Var = (cf4) obj;
                AnimatorSet animatorSet = cf4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cf4Var.p1 = null;
                    break;
                }
                break;
            case 6:
                ((wa5) obj).h = null;
                break;
            case 8:
                zq5 zq5Var = (zq5) obj;
                AnimatorSet animatorSet2 = zq5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    zq5Var.R1 = null;
                    break;
                }
                break;
            case 20:
                o48 o48Var = (o48) obj;
                AnimatorSet animatorSet3 = o48Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    o48Var.L = null;
                    break;
                }
                break;
            case 21:
                u58 u58Var = (u58) obj;
                if (animator.equals(u58Var.l0)) {
                    u58Var.l0 = null;
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
        vh1 vh1Var;
        byte b = this.a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                jd4 jd4Var = (jd4) obj;
                jd4Var.s = z ? 1.0f : 0.0f;
                jd4Var.invalidate();
                break;
            case 1:
                cf4 cf4Var = (cf4) obj;
                AnimatorSet animatorSet = cf4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        cf4Var.q1.setVisibility(4);
                    }
                    cf4Var.p1 = null;
                    break;
                }
                break;
            case 2:
                hl4 hl4Var = (hl4) obj;
                hl4Var.n = z ? 1.0f : 0.0f;
                hl4Var.invalidate();
                break;
            case 3:
                if (!z) {
                    ((sr4) obj).J.setVisibility(8);
                    break;
                }
                break;
            case 4:
                h75 h75Var = (h75) obj;
                h75Var.J4 = null;
                h75Var.H1.getSubtitleTextView().setTranslationY(z ? 0.0f : gl.L(20.0f));
                break;
            case 5:
                o85 o85Var = (o85) obj;
                m85 m85Var = o85Var.a;
                if (!o85Var.H) {
                    float f = z ? 1.0f : 0.0f;
                    o85Var.d0 = f;
                    o85Var.W.setPinnedProgress(f);
                    m85Var.setScaleX(1.0f - (o85Var.d0 * 0.6f));
                    m85Var.setScaleY(1.0f - (o85Var.d0 * 0.6f));
                    if (o85Var.Y) {
                        o85Var.j();
                        break;
                    }
                }
                break;
            case 6:
                wa5 wa5Var = (wa5) obj;
                if (wa5Var.h != null && (vh1Var = wa5Var.f) != null) {
                    if (z) {
                        vh1Var.setVisibility(4);
                    } else {
                        wa5Var.n.setVisibility(4);
                    }
                    wa5Var.h = null;
                    break;
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(z ? 8 : 4);
                break;
            case 8:
                zq5 zq5Var = (zq5) obj;
                AnimatorSet animatorSet2 = zq5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        zq5Var.S1.setVisibility(4);
                    }
                    zq5Var.R1 = null;
                    break;
                }
                break;
            case 9:
                jr5 jr5Var = (jr5) obj;
                jr5Var.b2 = z ? 1.0f : 0.0f;
                jr5Var.b.invalidate();
                if (!z) {
                    jr5Var.P1.setVisibility(8);
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
                    gl.r(runnable);
                    limitPreviewView.l0.run();
                    break;
                }
                break;
            case 11:
                l18 l18Var = (l18) obj;
                l18Var.c.setAlpha(z ? 0.0f : 1.0f);
                l18Var.a.setAlpha(z ? 0.0f : 0.5f);
                l18Var.invalidate();
                break;
            case 12:
                mf6 mf6Var = (mf6) obj;
                if (!z) {
                    mf6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = mf6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mf6Var.M = null;
                    break;
                }
                break;
            case 13:
                l37 l37Var = (l37) obj;
                if (l37Var.getParent() != null) {
                    ((ViewGroup) l37Var.getParent()).removeView(l37Var);
                }
                wr1 wr1Var = (wr1) l37Var;
                o27 o27Var = wr1Var.I.x5;
                if (o27Var != null) {
                    o27Var.x = null;
                }
                if (z) {
                    gl.d3(new vr1(wr1Var, b2), 15L);
                    break;
                }
                break;
            case 14:
                f37 f37Var = (f37) obj;
                f37Var.Q = null;
                f37Var.g(z, false);
                break;
            case 15:
                qa7 qa7Var = (qa7) obj;
                qa7Var.e = z ? 1.0f : 0.0f;
                qa7Var.invalidate();
                int i = 0;
                while (i < 2) {
                    qa7Var.c[i].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.c[i].setVisibility((i == 1) == z ? 0 : 8);
                    qa7Var.c[i].setAlpha(gl.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, qa7Var.e));
                    qa7Var.d[i].setTranslationX(gl.U1(qa7Var.e, 0, -gl.L(62.0f)));
                    qa7Var.d[i].setVisibility((i == 1) == z ? 0 : 8);
                    qa7Var.d[i].setAlpha(gl.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, qa7Var.e));
                    i++;
                }
                break;
            case 16:
                if (!z) {
                    ((dh7) obj).b.setVisibility(8);
                    break;
                }
                break;
            case 17:
                wt7 wt7Var = (wt7) obj;
                if (!z) {
                    wt7Var.P1.setVisibility(8);
                    wt7Var.P1.k();
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
                yv7 yv7Var = (yv7) obj;
                TextView textView = yv7Var.x;
                a6 a6Var = yv7Var.e;
                float f2 = z ? 1.0f : 0.0f;
                a6Var.setScaleX(gl.R1(0.8f, 1.0f, f2));
                a6Var.setScaleY(gl.R1(0.8f, 1.0f, f2));
                a6Var.setAlpha(gl.R1(0.0f, 1.0f, f2));
                textView.setScaleX(gl.R1(1.0f, 0.9f, f2));
                textView.setScaleY(gl.R1(1.0f, 0.9f, f2));
                textView.setAlpha(gl.R1(1.0f, 0.0f, f2));
                yv7Var.s.setAlpha(gl.R1(0.0f, 1.0f, f2));
                break;
            case 20:
                o48 o48Var = (o48) obj;
                AnimatorSet animatorSet4 = o48Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o48Var.L = null;
                    if (!z) {
                        o48Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 21:
                u58 u58Var = (u58) obj;
                if (animator.equals(u58Var.l0)) {
                    if (!z) {
                        u58Var.a0.setVisibility(4);
                        u58Var.b0.setVisibility(4);
                    }
                    u58Var.l0 = null;
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
                za8 za8Var = (za8) obj;
                ((ol2) za8Var).E.r1.d();
                if (z) {
                    za8Var.x.accept(Integer.valueOf(za8Var.s));
                }
                if (za8Var.getParent() != null) {
                    ((ViewGroup) za8Var.getParent()).removeView(za8Var);
                    break;
                }
                break;
            case 24:
                ((ve8) obj).F = z ? 1.0f : 0.0f;
                break;
            case 25:
                ah8 ah8Var = (ah8) obj;
                ah8Var.P = z ? 1.0f : 0.0f;
                ah8Var.f.invalidate();
                yg8 yg8Var = ah8Var.h;
                if (yg8Var != null) {
                    yg8Var.invalidate();
                    break;
                }
                break;
            case 26:
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                if (mo8Var.h) {
                    xha xhaVar = profileActivity.U0;
                    if (xhaVar != null) {
                        xhaVar.setClickable(false);
                    }
                } else {
                    mo8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.h4(false);
                break;
            case 27:
                yt8 yt8Var = (yt8) obj;
                if (!z) {
                    yt8Var.f.setVisibility(8);
                    break;
                } else {
                    yt8Var.c.setVisibility(8);
                    break;
                }
            case 28:
                if (!z) {
                    ((z99) obj).w.setVisibility(8);
                    break;
                }
                break;
            default:
                vs9 vs9Var = (vs9) obj;
                if (animator == vs9Var.H) {
                    float f3 = z ? 1.0f : 0.0f;
                    vs9Var.G = f3;
                    vs9Var.setShown(f3);
                    if (!z) {
                        vs9Var.setVisibility(8);
                    }
                    vs9Var.b(true);
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
                    ((mf6) obj).W.setVisibility(0);
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
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                xha xhaVar = profileActivity.U0;
                if (xhaVar != null && !z) {
                    xhaVar.setClickable(true);
                }
                profileActivity.W3(true);
                mo8Var.setVisibility(0);
                profileActivity.h4(false);
                break;
            case 27:
                yt8 yt8Var = (yt8) obj;
                ImageView imageView = yt8Var.c;
                wf2 wf2Var = yt8Var.f;
                if (!z) {
                    imageView.setAlpha(0.0f);
                    imageView.setVisibility(0);
                    break;
                } else {
                    wf2Var.setAlpha(0.0f);
                    wf2Var.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ id4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public id4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
