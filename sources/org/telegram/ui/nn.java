package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ nn(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((qn) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.c;
                AnimatorSet animatorSet = q9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q9Var.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.ki) this.c).W2 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.jz jzVar = (org.telegram.ui.Components.jz) this.c;
                AnimatorSet animatorSet2 = jzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jzVar.q1 = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.p50 p50Var = (org.telegram.ui.Components.p50) this.c;
                AnimatorSet animatorSet3 = p50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    p50Var.S1 = null;
                    break;
                }
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.ys0) this.c).R1 = null;
                break;
            case 25:
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) this.c;
                AnimatorSet animatorSet4 = a51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    a51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.e51 e51Var = (org.telegram.ui.Components.e51) this.c;
                AnimatorSet animatorSet5 = e51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    e51Var.t1 = null;
                    break;
                }
                break;
            case 28:
                ((pr) this.c).x = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        float f10;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.c;
        switch (i7) {
            case 0:
                qn qnVar = (qn) obj;
                if (qnVar.h != null && (radialProgressView = qnVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        qnVar.f.setVisibility(4);
                    }
                    qnVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) obj;
                AnimatorSet animatorSet = q9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        q9Var.c.setVisibility(4);
                        break;
                    } else {
                        q9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.dc dcVar = (org.telegram.ui.Components.dc) obj;
                if (animator == dcVar.g) {
                    dcVar.g = null;
                    dcVar.j = this.b ? 1.0f : 0.0f;
                    dcVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj;
                if (kiVar.W2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.q0 q0Var = kiVar.c3;
                        if (q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                        if (kiVar.O2 != 0 || !kiVar.o3) {
                            kiVar.Y2.setVisibility(4);
                            break;
                        }
                    } else if (kiVar.Q2) {
                        org.telegram.ui.Components.ci ciVar = kiVar.w2;
                        if (ciVar == null || ciVar.N()) {
                            kiVar.v3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.xn xnVar = (org.telegram.ui.Components.xn) obj;
                if (!this.b) {
                    org.telegram.ui.Components.i9 i9Var = xnVar.h;
                    xnVar.h = xnVar.n;
                    xnVar.n = i9Var;
                    i9Var.setVisibility(8);
                    xnVar.n.setAlpha(0.0f);
                    xnVar.h.setVisibility(0);
                    xnVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.mo moVar = (org.telegram.ui.Components.mo) obj;
                if (animator == moVar.e) {
                    f10 = z10 ? 1.0f : 0.0f;
                    moVar.d = f10;
                    moVar.setShown(f10);
                    if (!z10) {
                        moVar.setVisibility(8);
                    }
                    moVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.ep epVar = (org.telegram.ui.Components.ep) obj;
                epVar.a2 = this.b ? 1.0f : 0.0f;
                epVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * epVar.a2);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.dq) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) obj;
                org.telegram.ui.Components.gv gvVar = cvVar.O;
                if (gvVar.V && !cvVar.h) {
                    if (!this.b && !cvVar.n) {
                        cvVar.setBackground(null);
                        break;
                    } else if (cvVar.getBackground() == null) {
                        cvVar.setBackground(org.telegram.ui.ActionBar.j6.a0(gvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.jz jzVar = (org.telegram.ui.Components.jz) obj;
                AnimatorSet animatorSet2 = jzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        jzVar.r1.setVisibility(4);
                    }
                    jzVar.q1 = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) obj;
                vzVar.n = this.b ? 1.0f : 0.0f;
                vzVar.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) obj;
                org.telegram.ui.Components.q10 q10Var = s10Var.a;
                if (!s10Var.H) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    s10Var.d0 = f11;
                    s10Var.W.setPinnedProgress(f11);
                    q10Var.setScaleX(1.0f - (s10Var.d0 * 0.6f));
                    q10Var.setScaleY(1.0f - (s10Var.d0 * 0.6f));
                    if (s10Var.Y) {
                        s10Var.j();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.p50 p50Var = (org.telegram.ui.Components.p50) obj;
                AnimatorSet animatorSet3 = p50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        p50Var.T1.setVisibility(4);
                    }
                    p50Var.S1 = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) obj;
                boolean z11 = this.b;
                a60Var.c2 = z11 ? 1.0f : 0.0f;
                a60Var.b.invalidate();
                if (!z11) {
                    a60Var.Q1.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.ja0 ja0Var = (org.telegram.ui.Components.ja0) obj;
                if (ja0Var.getParent() != null) {
                    ((ViewGroup) ja0Var.getParent()).removeView(ja0Var);
                }
                boolean z12 = this.b;
                lk lkVar = (lk) ja0Var;
                org.telegram.messenger.kj kjVar = lkVar.I.w5;
                if (kjVar != null) {
                    kjVar.x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.i3(new kk(lkVar, i10), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) obj;
                da0Var.Q = null;
                da0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) obj;
                TextView textView = fc0Var.x;
                bi.v1 v1Var = fc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                v1Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                v1Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                v1Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                fc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                boolean z13 = this.b;
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) obj;
                if (animator == ul0Var.H) {
                    f10 = z13 ? 1.0f : 0.0f;
                    ul0Var.G = f10;
                    ul0Var.setShown(f10);
                    if (!z13) {
                        ul0Var.setVisibility(8);
                    }
                    ul0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) obj;
                if (ys0Var.R1 != null) {
                    ys0Var.R1 = null;
                    if (!this.b) {
                        ys0Var.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) obj;
                b01Var.N = this.b ? 1.0f : 0.0f;
                b01Var.invalidate();
                break;
            case 22:
                boolean z14 = this.b;
                org.telegram.ui.Components.p11 p11Var = (org.telegram.ui.Components.p11) obj;
                long j3 = p11Var.f;
                if (p11Var.e0 == animator) {
                    p11Var.V = z14 ? 1.0f : 0.0f;
                    p11Var.p();
                    p11Var.W = false;
                    ImageView imageView = p11Var.I;
                    boolean z15 = p11Var.T;
                    int i11 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z15 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = p11Var.H;
                    if (!p11Var.T) {
                        i11 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i11);
                    p11Var.e0 = null;
                    org.telegram.messenger.np.s1(p11Var.e).f7.edit().putBoolean("topicssidetabs" + j3, p11Var.U).putBoolean("topicssidetabsb" + j3, p11Var.T).apply();
                    Boolean bool = p11Var.d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = p11Var.d0.booleanValue();
                        p11Var.d0 = null;
                        p11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ro0(this, 21));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Components.k11 k11Var = (org.telegram.ui.Components.k11) obj;
                k11Var.G = this.b ? 1.0f : 0.0f;
                k11Var.h();
                break;
            case 24:
                org.telegram.ui.Components.o11 o11Var = (org.telegram.ui.Components.o11) obj;
                o11Var.V = this.b ? 1.0f : 0.0f;
                o11Var.h();
                o11Var.g();
                break;
            case 25:
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) obj;
                AnimatorSet animatorSet4 = a51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        a51Var.p1.setVisibility(4);
                    }
                    a51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.e51 e51Var = (org.telegram.ui.Components.e51) obj;
                AnimatorSet animatorSet5 = e51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        e51Var.s1.setVisibility(4);
                    }
                    e51Var.t1 = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) obj;
                r2Var.w = null;
                if (this.b) {
                    TextView[] textViewArr = r2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!r2Var.H && (drawable = (drawableArr = r2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                r2Var.H = false;
                if (!r2Var.P) {
                    r2Var.n = r2Var.r;
                }
                r2Var.s = 0.0f;
                r2Var.invalidate();
                break;
            case 28:
                pr prVar = (pr) obj;
                if (prVar.x != null && (radialProgressView2 = prVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        prVar.w.setVisibility(4);
                    }
                    prVar.x = null;
                    break;
                }
                break;
            default:
                bz bzVar = (bz) obj;
                bzVar.s = this.b ? 1.0f : 0.0f;
                bzVar.invalidate();
                break;
        }
    }

    public nn(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public nn(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public nn(org.telegram.ui.Components.xn xnVar) {
        this.a = 4;
        this.c = xnVar;
    }
}
