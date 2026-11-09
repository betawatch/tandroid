package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ t9(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                u9 u9Var = (u9) this.c;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u9Var.h = null;
                    break;
                }
                break;
            case 2:
                ((di) this.c).S2 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                gz gzVar = (gz) this.c;
                AnimatorSet animatorSet2 = gzVar.m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    gzVar.m1 = null;
                    break;
                }
                break;
            case 12:
                n50 n50Var = (n50) this.c;
                AnimatorSet animatorSet3 = n50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    n50Var.O1 = null;
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
                ((zs0) this.c).Q1 = null;
                break;
            case 24:
                y41 y41Var = (y41) this.c;
                AnimatorSet animatorSet4 = y41Var.k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y41Var.k1 = null;
                    break;
                }
                break;
            case 25:
                c51 c51Var = (c51) this.c;
                AnimatorSet animatorSet5 = c51Var.p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c51Var.p1 = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.pr) this.c).x = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.c;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) obj;
                AnimatorSet animatorSet = u9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        u9Var.c.setVisibility(4);
                        break;
                    } else {
                        u9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                ic icVar = (ic) obj;
                if (animator == icVar.g) {
                    icVar.g = null;
                    icVar.j = this.b ? 1.0f : 0.0f;
                    icVar.b();
                    break;
                }
                break;
            case 2:
                di diVar = (di) obj;
                if (diVar.S2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
                        if (r0Var != null) {
                            r0Var.setVisibility(4);
                        }
                        if (diVar.K2 != 0 || !diVar.k3) {
                            diVar.U2.setVisibility(4);
                            break;
                        }
                    } else if (diVar.M2) {
                        vh vhVar = diVar.s2;
                        if (vhVar == null || vhVar.M()) {
                            diVar.r3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                pn pnVar = (pn) obj;
                if (!this.b) {
                    l9 l9Var = pnVar.h;
                    pnVar.h = pnVar.n;
                    pnVar.n = l9Var;
                    l9Var.setVisibility(8);
                    pnVar.n.setAlpha(0.0f);
                    pnVar.h.setVisibility(0);
                    pnVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z9 = this.b;
                co coVar = (co) obj;
                if (animator == coVar.e) {
                    f10 = z9 ? 1.0f : 0.0f;
                    coVar.d = f10;
                    coVar.setShown(f10);
                    if (!z9) {
                        coVar.setVisibility(8);
                    }
                    coVar.a(true);
                    break;
                }
                break;
            case 5:
                vo voVar = (vo) obj;
                voVar.W1 = this.b ? 1.0f : 0.0f;
                voVar.z1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.W1);
                break;
            case 6:
                if (!this.b) {
                    ((vp) obj).H.setVisibility(8);
                    break;
                }
                break;
            case 7:
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.N;
                if (bvVar.U && !xuVar.h) {
                    if (!this.b && !xuVar.n) {
                        xuVar.setBackground(null);
                        break;
                    } else if (xuVar.getBackground() == null) {
                        xuVar.setBackground(org.telegram.ui.ActionBar.l6.a0(bvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                gz gzVar = (gz) obj;
                AnimatorSet animatorSet2 = gzVar.m1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        gzVar.n1.setVisibility(4);
                    }
                    gzVar.m1 = null;
                    break;
                }
                break;
            case 9:
                sz szVar = (sz) obj;
                szVar.n = this.b ? 1.0f : 0.0f;
                szVar.invalidate();
                break;
            case 10:
                q10 q10Var = (q10) obj;
                n10 n10Var = q10Var.a;
                if (!q10Var.G) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    q10Var.c0 = f11;
                    q10Var.V.setPinnedProgress(f11);
                    n10Var.setScaleX(1.0f - (q10Var.c0 * 0.6f));
                    n10Var.setScaleY(1.0f - (q10Var.c0 * 0.6f));
                    if (q10Var.X) {
                        q10Var.j();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                n50 n50Var = (n50) obj;
                AnimatorSet animatorSet3 = n50Var.O1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        n50Var.P1.setVisibility(4);
                    }
                    n50Var.O1 = null;
                    break;
                }
                break;
            case 13:
                y50 y50Var = (y50) obj;
                boolean z10 = this.b;
                y50Var.Y1 = z10 ? 1.0f : 0.0f;
                y50Var.b.invalidate();
                if (!z10) {
                    y50Var.M1.setVisibility(8);
                    break;
                }
                break;
            case 14:
                ja0 ja0Var = (ja0) obj;
                if (ja0Var.getParent() != null) {
                    ((ViewGroup) ja0Var.getParent()).removeView(ja0Var);
                }
                boolean z11 = this.b;
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) ja0Var;
                org.telegram.messenger.mj mjVar = nkVar.H.v5;
                if (mjVar != null) {
                    mjVar.x = null;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.mk(nkVar, i10), 15L);
                    break;
                }
                break;
            case 15:
                da0 da0Var = (da0) obj;
                da0Var.P = null;
                da0Var.h(this.b, false);
                break;
            case 16:
                fc0 fc0Var = (fc0) obj;
                TextView textView = fc0Var.x;
                di.b4 b4Var = fc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                b4Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                b4Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                b4Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                fc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                break;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 18:
                boolean z12 = this.b;
                rl0 rl0Var = (rl0) obj;
                if (animator == rl0Var.G) {
                    f10 = z12 ? 1.0f : 0.0f;
                    rl0Var.F = f10;
                    rl0Var.setShown(f10);
                    if (!z12) {
                        rl0Var.setVisibility(8);
                    }
                    rl0Var.b(true);
                    break;
                }
                break;
            case 19:
                zs0 zs0Var = (zs0) obj;
                if (zs0Var.Q1 != null) {
                    zs0Var.Q1 = null;
                    if (!this.b) {
                        zs0Var.D0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                a01 a01Var = (a01) obj;
                a01Var.M = this.b ? 1.0f : 0.0f;
                a01Var.invalidate();
                break;
            case 21:
                boolean z13 = this.b;
                n11 n11Var = (n11) obj;
                long j3 = n11Var.f;
                if (n11Var.d0 == animator) {
                    n11Var.U = z13 ? 1.0f : 0.0f;
                    n11Var.p();
                    n11Var.V = false;
                    ImageView imageView = n11Var.H;
                    boolean z14 = n11Var.S;
                    int i11 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z14 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = n11Var.G;
                    if (!n11Var.S) {
                        i11 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i11);
                    n11Var.d0 = null;
                    org.telegram.messenger.qp.s1(n11Var.e).e7.edit().putBoolean("topicssidetabs" + j3, n11Var.T).putBoolean("topicssidetabsb" + j3, n11Var.S).apply();
                    Boolean bool = n11Var.c0;
                    if (bool != null && z13 != bool.booleanValue()) {
                        boolean booleanValue = n11Var.c0.booleanValue();
                        n11Var.c0 = null;
                        n11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new kr0(this, 18));
                    break;
                }
                break;
            case 22:
                i11 i11Var = (i11) obj;
                i11Var.F = this.b ? 1.0f : 0.0f;
                i11Var.h();
                break;
            case 23:
                m11 m11Var = (m11) obj;
                m11Var.U = this.b ? 1.0f : 0.0f;
                m11Var.h();
                m11Var.g();
                break;
            case 24:
                y41 y41Var = (y41) obj;
                AnimatorSet animatorSet4 = y41Var.k1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        y41Var.l1.setVisibility(4);
                    }
                    y41Var.k1 = null;
                    break;
                }
                break;
            case 25:
                c51 c51Var = (c51) obj;
                AnimatorSet animatorSet5 = c51Var.p1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        c51Var.o1.setVisibility(4);
                    }
                    c51Var.p1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) obj;
                n2Var.w = null;
                if (this.b) {
                    TextView[] textViewArr = n2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!n2Var.G && (drawable = (drawableArr = n2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                n2Var.G = false;
                if (!n2Var.O) {
                    n2Var.n = n2Var.r;
                }
                n2Var.s = 0.0f;
                n2Var.invalidate();
                break;
            case 27:
                org.telegram.ui.pr prVar = (org.telegram.ui.pr) obj;
                if (prVar.x != null && (radialProgressView = prVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        prVar.w.setVisibility(4);
                    }
                    prVar.x = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) obj;
                czVar.s = this.b ? 1.0f : 0.0f;
                czVar.invalidate();
                break;
            default:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj;
                e40Var.L4 = null;
                e40Var.F1.getSubtitleTextView().setTranslationY(this.b ? 0.0f : org.telegram.messenger.g0.L(20.0f));
                break;
        }
    }

    public t9(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public t9(View view, boolean z9) {
        this.a = 11;
        this.c = view;
        this.b = z9;
    }

    public t9(pn pnVar) {
        this.a = 3;
        this.c = pnVar;
    }
}
