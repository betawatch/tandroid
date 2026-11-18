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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class on extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ on(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((rn) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.c;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    y9Var.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.si) this.c).W2 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) this.c;
                AnimatorSet animatorSet2 = qzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qzVar.q1 = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) this.c;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x50Var.S1 = null;
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
                ((org.telegram.ui.Components.gt0) this.c).R1 = null;
                break;
            case 25:
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) this.c;
                AnimatorSet animatorSet4 = k51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    k51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.o51 o51Var = (org.telegram.ui.Components.o51) this.c;
                AnimatorSet animatorSet5 = o51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o51Var.t1 = null;
                    break;
                }
                break;
            case 28:
                ((qr) this.c).x = null;
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
                rn rnVar = (rn) obj;
                if (rnVar.h != null && (radialProgressView = rnVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        rnVar.f.setVisibility(4);
                    }
                    rnVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) obj;
                AnimatorSet animatorSet = y9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        y9Var.c.setVisibility(4);
                        break;
                    } else {
                        y9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj;
                if (animator == mcVar.g) {
                    mcVar.g = null;
                    mcVar.j = this.b ? 1.0f : 0.0f;
                    mcVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.si siVar = (org.telegram.ui.Components.si) obj;
                if (siVar.W2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.r0 r0Var = siVar.c3;
                        if (r0Var != null) {
                            r0Var.setVisibility(4);
                        }
                        if (siVar.O2 != 0 || !siVar.o3) {
                            siVar.Y2.setVisibility(4);
                            break;
                        }
                    } else if (siVar.Q2) {
                        org.telegram.ui.Components.ki kiVar = siVar.w2;
                        if (kiVar == null || kiVar.N()) {
                            siVar.v3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.go goVar = (org.telegram.ui.Components.go) obj;
                if (!this.b) {
                    org.telegram.ui.Components.q9 q9Var = goVar.h;
                    goVar.h = goVar.n;
                    goVar.n = q9Var;
                    q9Var.setVisibility(8);
                    goVar.n.setAlpha(0.0f);
                    goVar.h.setVisibility(0);
                    goVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) obj;
                if (animator == toVar.e) {
                    f10 = z10 ? 1.0f : 0.0f;
                    toVar.d = f10;
                    toVar.setShown(f10);
                    if (!z10) {
                        toVar.setVisibility(8);
                    }
                    toVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) obj;
                lpVar.a2 = this.b ? 1.0f : 0.0f;
                lpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * lpVar.a2);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.kq) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) obj;
                org.telegram.ui.Components.lv lvVar = hvVar.O;
                if (lvVar.V && !hvVar.h) {
                    if (!this.b && !hvVar.n) {
                        hvVar.setBackground(null);
                        break;
                    } else if (hvVar.getBackground() == null) {
                        hvVar.setBackground(org.telegram.ui.ActionBar.n6.a0(lvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.qz qzVar = (org.telegram.ui.Components.qz) obj;
                AnimatorSet animatorSet2 = qzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        qzVar.r1.setVisibility(4);
                    }
                    qzVar.q1 = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.c00 c00Var = (org.telegram.ui.Components.c00) obj;
                c00Var.n = this.b ? 1.0f : 0.0f;
                c00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.z10 z10Var = (org.telegram.ui.Components.z10) obj;
                org.telegram.ui.Components.x10 x10Var = z10Var.a;
                if (!z10Var.H) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    z10Var.d0 = f11;
                    z10Var.W.setPinnedProgress(f11);
                    x10Var.setScaleX(1.0f - (z10Var.d0 * 0.6f));
                    x10Var.setScaleY(1.0f - (z10Var.d0 * 0.6f));
                    if (z10Var.Y) {
                        z10Var.j();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) obj;
                AnimatorSet animatorSet3 = x50Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        x50Var.T1.setVisibility(4);
                    }
                    x50Var.S1 = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.j60 j60Var = (org.telegram.ui.Components.j60) obj;
                boolean z11 = this.b;
                j60Var.c2 = z11 ? 1.0f : 0.0f;
                j60Var.b.invalidate();
                if (!z11) {
                    j60Var.Q1.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) obj;
                if (ua0Var.getParent() != null) {
                    ((ViewGroup) ua0Var.getParent()).removeView(ua0Var);
                }
                boolean z12 = this.b;
                mk mkVar = (mk) ua0Var;
                org.telegram.messenger.jj jjVar = mkVar.I.x5;
                if (jjVar != null) {
                    jjVar.x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, i10), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.oa0 oa0Var = (org.telegram.ui.Components.oa0) obj;
                oa0Var.Q = null;
                oa0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) obj;
                TextView textView = pc0Var.x;
                bi.p2 p2Var = pc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                p2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                p2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                p2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                pc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
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
                org.telegram.ui.Components.cm0 cm0Var = (org.telegram.ui.Components.cm0) obj;
                if (animator == cm0Var.H) {
                    f10 = z13 ? 1.0f : 0.0f;
                    cm0Var.G = f10;
                    cm0Var.setShown(f10);
                    if (!z13) {
                        cm0Var.setVisibility(8);
                    }
                    cm0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) obj;
                if (gt0Var.R1 != null) {
                    gt0Var.R1 = null;
                    if (!this.b) {
                        gt0Var.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) obj;
                j01Var.N = this.b ? 1.0f : 0.0f;
                j01Var.invalidate();
                break;
            case 22:
                boolean z14 = this.b;
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj;
                long j3 = z11Var.f;
                if (z11Var.e0 == animator) {
                    z11Var.V = z14 ? 1.0f : 0.0f;
                    z11Var.p();
                    z11Var.W = false;
                    ImageView imageView = z11Var.I;
                    boolean z15 = z11Var.T;
                    int i11 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z15 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = z11Var.H;
                    if (!z11Var.T) {
                        i11 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i11);
                    z11Var.e0 = null;
                    org.telegram.messenger.mp.u1(z11Var.e).h7.edit().putBoolean("topicssidetabs" + j3, z11Var.U).putBoolean("topicssidetabsb" + j3, z11Var.T).apply();
                    Boolean bool = z11Var.d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = z11Var.d0.booleanValue();
                        z11Var.d0 = null;
                        z11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.ap0(this, 20));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) obj;
                u11Var.G = this.b ? 1.0f : 0.0f;
                u11Var.h();
                break;
            case 24:
                org.telegram.ui.Components.y11 y11Var = (org.telegram.ui.Components.y11) obj;
                y11Var.V = this.b ? 1.0f : 0.0f;
                y11Var.h();
                y11Var.g();
                break;
            case 25:
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) obj;
                AnimatorSet animatorSet4 = k51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        k51Var.p1.setVisibility(4);
                    }
                    k51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.o51 o51Var = (org.telegram.ui.Components.o51) obj;
                AnimatorSet animatorSet5 = o51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        o51Var.s1.setVisibility(4);
                    }
                    o51Var.t1 = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj;
                q2Var.w = null;
                if (this.b) {
                    TextView[] textViewArr = q2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!q2Var.H && (drawable = (drawableArr = q2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                q2Var.H = false;
                if (!q2Var.P) {
                    q2Var.n = q2Var.r;
                }
                q2Var.s = 0.0f;
                q2Var.invalidate();
                break;
            case 28:
                qr qrVar = (qr) obj;
                if (qrVar.x != null && (radialProgressView2 = qrVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        qrVar.w.setVisibility(4);
                    }
                    qrVar.x = null;
                    break;
                }
                break;
            default:
                ez ezVar = (ez) obj;
                ezVar.s = this.b ? 1.0f : 0.0f;
                ezVar.invalidate();
                break;
        }
    }

    public on(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public on(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public on(org.telegram.ui.Components.go goVar) {
        this.a = 4;
        this.c = goVar;
    }
}
