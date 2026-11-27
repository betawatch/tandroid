// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gf4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final Object c;

    public gf4(View view) {
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
                ah4 ah4Var = (ah4) obj;
                AnimatorSet animatorSet = ah4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ah4Var.p1 = null;
                    break;
                }
                break;
            case 6:
                ((xc5) obj).h = null;
                break;
            case 8:
                bt5 bt5Var = (bt5) obj;
                AnimatorSet animatorSet2 = bt5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bt5Var.R1 = null;
                    break;
                }
                break;
            case 20:
                d88 d88Var = (d88) obj;
                AnimatorSet animatorSet3 = d88Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    d88Var.L = null;
                    break;
                }
                break;
            case 21:
                l98 l98Var = (l98) obj;
                if (animator.equals(l98Var.l0)) {
                    l98Var.l0 = null;
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
        di1 di1Var;
        byte b = this.a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                hf4 hf4Var = (hf4) obj;
                hf4Var.s = z ? 1.0f : 0.0f;
                hf4Var.invalidate();
                break;
            case 1:
                ah4 ah4Var = (ah4) obj;
                AnimatorSet animatorSet = ah4Var.p1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        ah4Var.q1.setVisibility(4);
                    }
                    ah4Var.p1 = null;
                    break;
                }
                break;
            case 2:
                mn4 mn4Var = (mn4) obj;
                mn4Var.n = z ? 1.0f : 0.0f;
                mn4Var.invalidate();
                break;
            case 3:
                if (!z) {
                    ((wt4) obj).J.setVisibility(8);
                    break;
                }
                break;
            case 4:
                j95 j95Var = (j95) obj;
                j95Var.J4 = null;
                j95Var.H1.getSubtitleTextView().setTranslationY(z ? 0.0f : hl.L(20.0f));
                break;
            case 5:
                ra5 ra5Var = (ra5) obj;
                pa5 pa5Var = ra5Var.a;
                if (!ra5Var.H) {
                    float f = z ? 1.0f : 0.0f;
                    ra5Var.d0 = f;
                    ra5Var.W.setPinnedProgress(f);
                    pa5Var.setScaleX(1.0f - (ra5Var.d0 * 0.6f));
                    pa5Var.setScaleY(1.0f - (ra5Var.d0 * 0.6f));
                    if (ra5Var.Y) {
                        ra5Var.j();
                        break;
                    }
                }
                break;
            case 6:
                xc5 xc5Var = (xc5) obj;
                if (xc5Var.h != null && (di1Var = xc5Var.f) != null) {
                    if (z) {
                        di1Var.setVisibility(4);
                    } else {
                        xc5Var.n.setVisibility(4);
                    }
                    xc5Var.h = null;
                    break;
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(z ? 8 : 4);
                break;
            case 8:
                bt5 bt5Var = (bt5) obj;
                AnimatorSet animatorSet2 = bt5Var.R1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        bt5Var.S1.setVisibility(4);
                    }
                    bt5Var.R1 = null;
                    break;
                }
                break;
            case 9:
                lt5 lt5Var = (lt5) obj;
                lt5Var.b2 = z ? 1.0f : 0.0f;
                lt5Var.b.invalidate();
                if (!z) {
                    lt5Var.P1.setVisibility(8);
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
                    hl.r(runnable);
                    limitPreviewView.l0.run();
                    break;
                }
                break;
            case 11:
                b58 b58Var = (b58) obj;
                b58Var.c.setAlpha(z ? 0.0f : 1.0f);
                b58Var.a.setAlpha(z ? 0.0f : 0.5f);
                b58Var.invalidate();
                break;
            case 12:
                qh6 qh6Var = (qh6) obj;
                if (!z) {
                    qh6Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet3 = qh6Var.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    qh6Var.M = null;
                    break;
                }
                break;
            case 13:
                s57 s57Var = (s57) obj;
                if (s57Var.getParent() != null) {
                    ((ViewGroup) s57Var.getParent()).removeView(s57Var);
                }
                ks1 ks1Var = (ks1) s57Var;
                v47 v47Var = ks1Var.I.x5;
                if (v47Var != null) {
                    v47Var.x = null;
                }
                if (z) {
                    hl.d3(new js1(ks1Var, b2), 15L);
                    break;
                }
                break;
            case 14:
                m57 m57Var = (m57) obj;
                m57Var.Q = null;
                m57Var.g(z, false);
                break;
            case 15:
                xc7 xc7Var = (xc7) obj;
                xc7Var.e = z ? 1.0f : 0.0f;
                xc7Var.invalidate();
                int i = 0;
                while (i < 2) {
                    xc7Var.c[i].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.c[i].setVisibility((i == 1) == z ? 0 : 8);
                    xc7Var.c[i].setAlpha(hl.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, xc7Var.e));
                    xc7Var.d[i].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.d[i].setVisibility((i == 1) == z ? 0 : 8);
                    xc7Var.d[i].setAlpha(hl.R1(i == 0 ? 1.0f : 0.0f, i == 1 ? 1.0f : 0.0f, xc7Var.e));
                    i++;
                }
                break;
            case 16:
                if (!z) {
                    ((mj7) obj).b.setVisibility(8);
                    break;
                }
                break;
            case 17:
                dx7 dx7Var = (dx7) obj;
                if (!z) {
                    dx7Var.J1.setVisibility(8);
                    dx7Var.J1.k();
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
                fz7 fz7Var = (fz7) obj;
                TextView textView = fz7Var.x;
                b6 b6Var = fz7Var.e;
                float f2 = z ? 1.0f : 0.0f;
                b6Var.setScaleX(hl.R1(0.8f, 1.0f, f2));
                b6Var.setScaleY(hl.R1(0.8f, 1.0f, f2));
                b6Var.setAlpha(hl.R1(0.0f, 1.0f, f2));
                textView.setScaleX(hl.R1(1.0f, 0.9f, f2));
                textView.setScaleY(hl.R1(1.0f, 0.9f, f2));
                textView.setAlpha(hl.R1(1.0f, 0.0f, f2));
                fz7Var.s.setAlpha(hl.R1(0.0f, 1.0f, f2));
                break;
            case 20:
                d88 d88Var = (d88) obj;
                AnimatorSet animatorSet4 = d88Var.L;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    d88Var.L = null;
                    if (!z) {
                        d88Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 21:
                l98 l98Var = (l98) obj;
                if (animator.equals(l98Var.l0)) {
                    if (!z) {
                        l98Var.a0.setVisibility(4);
                        l98Var.b0.setVisibility(4);
                    }
                    l98Var.l0 = null;
                    break;
                }
                break;
            case 22:
                oe8 oe8Var = (oe8) obj;
                ((im2) oe8Var).E.r1.e();
                if (z) {
                    oe8Var.x.accept(Integer.valueOf(oe8Var.s));
                }
                if (oe8Var.getParent() != null) {
                    ((ViewGroup) oe8Var.getParent()).removeView(oe8Var);
                    break;
                }
                break;
            case 23:
                ((ji8) obj).F = z ? 1.0f : 0.0f;
                break;
            case 24:
                ok8 ok8Var = (ok8) obj;
                ok8Var.P = z ? 1.0f : 0.0f;
                ok8Var.f.invalidate();
                mk8 mk8Var = ok8Var.h;
                if (mk8Var != null) {
                    mk8Var.invalidate();
                    break;
                }
                break;
            case 25:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                if (yr8Var.h) {
                    sla slaVar = profileActivity.U0;
                    if (slaVar != null) {
                        slaVar.setClickable(false);
                    }
                } else {
                    yr8Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.i4(false);
                break;
            case 26:
                hx8 hx8Var = (hx8) obj;
                if (!z) {
                    hx8Var.f.setVisibility(8);
                    break;
                } else {
                    hx8Var.c.setVisibility(8);
                    break;
                }
            case 27:
                if (!z) {
                    ((nd9) obj).x.setVisibility(8);
                    break;
                }
                break;
            case 28:
                ow9 ow9Var = (ow9) obj;
                if (animator == ow9Var.H) {
                    float f3 = z ? 1.0f : 0.0f;
                    ow9Var.G = f3;
                    ow9Var.setShown(f3);
                    if (!z) {
                        ow9Var.setVisibility(8);
                    }
                    ow9Var.b(true);
                    break;
                }
                break;
            default:
                ky9 ky9Var = (ky9) obj;
                ky9Var.w = z ? 1.0f : 0.0f;
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
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
                    ((qh6) obj).W.setVisibility(0);
                    break;
                }
                break;
            case 18:
                if (z) {
                    ((PasscodeActivity) obj).w.setVisibility(0);
                    break;
                }
                break;
            case 25:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                sla slaVar = profileActivity.U0;
                if (slaVar != null && !z) {
                    slaVar.setClickable(true);
                }
                profileActivity.X3(true);
                yr8Var.setVisibility(0);
                profileActivity.i4(false);
                break;
            case 26:
                hx8 hx8Var = (hx8) obj;
                ImageView imageView = hx8Var.c;
                og2 og2Var = hx8Var.f;
                if (!z) {
                    imageView.setAlpha(0.0f);
                    imageView.setVisibility(0);
                    break;
                } else {
                    og2Var.setAlpha(0.0f);
                    og2Var.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ gf4(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public gf4(View view, boolean z) {
        this.a = (byte) 7;
        this.c = view;
        this.b = z;
    }
}
