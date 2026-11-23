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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                ((org.telegram.ui.Components.ui) this.c).W2 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) this.c;
                AnimatorSet animatorSet2 = szVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    szVar.q1 = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) this.c;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a60Var.S1 = null;
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
                ((org.telegram.ui.Components.jt0) this.c).R1 = null;
                break;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) this.c;
                AnimatorSet animatorSet4 = n51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    n51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) this.c;
                AnimatorSet animatorSet5 = r51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    r51Var.t1 = null;
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
                org.telegram.ui.Components.ui uiVar = (org.telegram.ui.Components.ui) obj;
                if (uiVar.W2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.q0 q0Var = uiVar.c3;
                        if (q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                        if (uiVar.O2 != 0 || !uiVar.o3) {
                            uiVar.Y2.setVisibility(4);
                            break;
                        }
                    } else if (uiVar.Q2) {
                        org.telegram.ui.Components.mi miVar = uiVar.w2;
                        if (miVar == null || miVar.N()) {
                            uiVar.v3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) obj;
                if (!this.b) {
                    org.telegram.ui.Components.q9 q9Var = ioVar.h;
                    ioVar.h = ioVar.n;
                    ioVar.n = q9Var;
                    q9Var.setVisibility(8);
                    ioVar.n.setAlpha(0.0f);
                    ioVar.h.setVisibility(0);
                    ioVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) obj;
                if (animator == voVar.e) {
                    f10 = z10 ? 1.0f : 0.0f;
                    voVar.d = f10;
                    voVar.setShown(f10);
                    if (!z10) {
                        voVar.setVisibility(8);
                    }
                    voVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) obj;
                npVar.a2 = this.b ? 1.0f : 0.0f;
                npVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * npVar.a2);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.mq) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.kv kvVar = (org.telegram.ui.Components.kv) obj;
                org.telegram.ui.Components.ov ovVar = kvVar.O;
                if (ovVar.V && !kvVar.h) {
                    if (!this.b && !kvVar.n) {
                        kvVar.setBackground(null);
                        break;
                    } else if (kvVar.getBackground() == null) {
                        kvVar.setBackground(org.telegram.ui.ActionBar.m6.a0(ovVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) obj;
                AnimatorSet animatorSet2 = szVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        szVar.r1.setVisibility(4);
                    }
                    szVar.q1 = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.e00 e00Var = (org.telegram.ui.Components.e00) obj;
                e00Var.n = this.b ? 1.0f : 0.0f;
                e00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) obj;
                org.telegram.ui.Components.a20 a20Var = c20Var.a;
                if (!c20Var.H) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    c20Var.d0 = f11;
                    c20Var.W.setPinnedProgress(f11);
                    a20Var.setScaleX(1.0f - (c20Var.d0 * 0.6f));
                    a20Var.setScaleY(1.0f - (c20Var.d0 * 0.6f));
                    if (c20Var.Y) {
                        c20Var.j();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) obj;
                AnimatorSet animatorSet3 = a60Var.S1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        a60Var.T1.setVisibility(4);
                    }
                    a60Var.S1 = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.l60 l60Var = (org.telegram.ui.Components.l60) obj;
                boolean z11 = this.b;
                l60Var.c2 = z11 ? 1.0f : 0.0f;
                l60Var.b.invalidate();
                if (!z11) {
                    l60Var.Q1.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.wa0 wa0Var = (org.telegram.ui.Components.wa0) obj;
                if (wa0Var.getParent() != null) {
                    ((ViewGroup) wa0Var.getParent()).removeView(wa0Var);
                }
                boolean z12 = this.b;
                mk mkVar = (mk) wa0Var;
                org.telegram.messenger.kj kjVar = mkVar.I.x5;
                if (kjVar != null) {
                    kjVar.x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.h3(new lk(mkVar, i10), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) obj;
                qa0Var.Q = null;
                qa0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.qc0 qc0Var = (org.telegram.ui.Components.qc0) obj;
                TextView textView = qc0Var.x;
                bi.t2 t2Var = qc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                t2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                t2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                t2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                qc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
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
                org.telegram.ui.Components.em0 em0Var = (org.telegram.ui.Components.em0) obj;
                if (animator == em0Var.H) {
                    f10 = z13 ? 1.0f : 0.0f;
                    em0Var.G = f10;
                    em0Var.setShown(f10);
                    if (!z13) {
                        em0Var.setVisibility(8);
                    }
                    em0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                if (jt0Var.R1 != null) {
                    jt0Var.R1 = null;
                    if (!this.b) {
                        jt0Var.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) obj;
                k01Var.N = this.b ? 1.0f : 0.0f;
                k01Var.invalidate();
                break;
            case 22:
                boolean z14 = this.b;
                org.telegram.ui.Components.a21 a21Var = (org.telegram.ui.Components.a21) obj;
                long j3 = a21Var.f;
                if (a21Var.e0 == animator) {
                    a21Var.V = z14 ? 1.0f : 0.0f;
                    a21Var.p();
                    a21Var.W = false;
                    ImageView imageView = a21Var.I;
                    boolean z15 = a21Var.T;
                    int i11 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z15 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = a21Var.H;
                    if (!a21Var.T) {
                        i11 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i11);
                    a21Var.e0 = null;
                    org.telegram.messenger.np.u1(a21Var.e).h7.edit().putBoolean("topicssidetabs" + j3, a21Var.U).putBoolean("topicssidetabsb" + j3, a21Var.T).apply();
                    Boolean bool = a21Var.d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = a21Var.d0.booleanValue();
                        a21Var.d0 = null;
                        a21Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.cp0(this, 20));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) obj;
                v11Var.G = this.b ? 1.0f : 0.0f;
                v11Var.h();
                break;
            case 24:
                org.telegram.ui.Components.z11 z11Var = (org.telegram.ui.Components.z11) obj;
                z11Var.V = this.b ? 1.0f : 0.0f;
                z11Var.h();
                z11Var.g();
                break;
            case 25:
                org.telegram.ui.Components.n51 n51Var = (org.telegram.ui.Components.n51) obj;
                AnimatorSet animatorSet4 = n51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        n51Var.p1.setVisibility(4);
                    }
                    n51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.r51 r51Var = (org.telegram.ui.Components.r51) obj;
                AnimatorSet animatorSet5 = r51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        r51Var.s1.setVisibility(4);
                    }
                    r51Var.t1 = null;
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

    public on(org.telegram.ui.Components.io ioVar) {
        this.a = 4;
        this.c = ioVar;
    }
}
