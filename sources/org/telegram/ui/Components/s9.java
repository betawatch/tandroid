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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ s9(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t9Var.h = null;
                    break;
                }
                break;
            case 2:
                ((bi) this.c).T2 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                cz czVar = (cz) this.c;
                AnimatorSet animatorSet2 = czVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    czVar.n1 = null;
                    break;
                }
                break;
            case 12:
                i50 i50Var = (i50) this.c;
                AnimatorSet animatorSet3 = i50Var.P1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    i50Var.P1 = null;
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
                ((ws0) this.c).R1 = null;
                break;
            case 24:
                r41 r41Var = (r41) this.c;
                AnimatorSet animatorSet4 = r41Var.l1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    r41Var.l1 = null;
                    break;
                }
                break;
            case 25:
                v41 v41Var = (v41) this.c;
                AnimatorSet animatorSet5 = v41Var.q1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v41Var.q1 = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.lr) this.c).x = null;
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
        int i3 = this.a;
        int i10 = 1;
        Object obj = this.c;
        switch (i3) {
            case 0:
                t9 t9Var = (t9) obj;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        t9Var.c.setVisibility(4);
                        break;
                    } else {
                        t9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                gc gcVar = (gc) obj;
                if (animator == gcVar.g) {
                    gcVar.g = null;
                    gcVar.j = this.b ? 1.0f : 0.0f;
                    gcVar.b();
                    break;
                }
                break;
            case 2:
                bi biVar = (bi) obj;
                if (biVar.T2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
                        if (q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                        if (biVar.L2 != 0 || !biVar.l3) {
                            biVar.V2.setVisibility(4);
                            break;
                        }
                    } else if (biVar.N2) {
                        th thVar = biVar.t2;
                        if (thVar == null || thVar.M()) {
                            biVar.s3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                on onVar = (on) obj;
                if (!this.b) {
                    k9 k9Var = onVar.h;
                    onVar.h = onVar.n;
                    onVar.n = k9Var;
                    k9Var.setVisibility(8);
                    onVar.n.setAlpha(0.0f);
                    onVar.h.setVisibility(0);
                    onVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                bo boVar = (bo) obj;
                if (animator == boVar.e) {
                    f10 = z10 ? 1.0f : 0.0f;
                    boVar.d = f10;
                    boVar.setShown(f10);
                    if (!z10) {
                        boVar.setVisibility(8);
                    }
                    boVar.a(true);
                    break;
                }
                break;
            case 5:
                vo voVar = (vo) obj;
                voVar.X1 = this.b ? 1.0f : 0.0f;
                voVar.A1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * voVar.X1);
                break;
            case 6:
                if (!this.b) {
                    ((vp) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 7:
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.O;
                if (zuVar.V && !vuVar.h) {
                    if (!this.b && !vuVar.n) {
                        vuVar.setBackground(null);
                        break;
                    } else if (vuVar.getBackground() == null) {
                        vuVar.setBackground(org.telegram.ui.ActionBar.k6.a0(zuVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                cz czVar = (cz) obj;
                AnimatorSet animatorSet2 = czVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        czVar.o1.setVisibility(4);
                    }
                    czVar.n1 = null;
                    break;
                }
                break;
            case 9:
                nz nzVar = (nz) obj;
                nzVar.n = this.b ? 1.0f : 0.0f;
                nzVar.invalidate();
                break;
            case 10:
                l10 l10Var = (l10) obj;
                j10 j10Var = l10Var.a;
                if (!l10Var.G) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    l10Var.c0 = f11;
                    l10Var.V.setPinnedProgress(f11);
                    j10Var.setScaleX(1.0f - (l10Var.c0 * 0.6f));
                    j10Var.setScaleY(1.0f - (l10Var.c0 * 0.6f));
                    if (l10Var.X) {
                        l10Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) obj).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                i50 i50Var = (i50) obj;
                AnimatorSet animatorSet3 = i50Var.P1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        i50Var.Q1.setVisibility(4);
                    }
                    i50Var.P1 = null;
                    break;
                }
                break;
            case 13:
                t50 t50Var = (t50) obj;
                boolean z11 = this.b;
                t50Var.Z1 = z11 ? 1.0f : 0.0f;
                t50Var.b.invalidate();
                if (!z11) {
                    t50Var.N1.setVisibility(8);
                    break;
                }
                break;
            case 14:
                da0 da0Var = (da0) obj;
                if (da0Var.getParent() != null) {
                    ((ViewGroup) da0Var.getParent()).removeView(da0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.hk hkVar = (org.telegram.ui.hk) da0Var;
                org.telegram.messenger.dj djVar = hkVar.I.w5;
                if (djVar != null) {
                    djVar.x = null;
                }
                if (z12) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.gk(hkVar, i10), 15L);
                    break;
                }
                break;
            case 15:
                x90 x90Var = (x90) obj;
                x90Var.Q = null;
                x90Var.h(this.b, false);
                break;
            case 16:
                zb0 zb0Var = (zb0) obj;
                TextView textView = zb0Var.x;
                ai.d2 d2Var = zb0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                d2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                d2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                d2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                zb0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
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
                boolean z13 = this.b;
                tl0 tl0Var = (tl0) obj;
                if (animator == tl0Var.H) {
                    f10 = z13 ? 1.0f : 0.0f;
                    tl0Var.G = f10;
                    tl0Var.setShown(f10);
                    if (!z13) {
                        tl0Var.setVisibility(8);
                    }
                    tl0Var.b(true);
                    break;
                }
                break;
            case 19:
                ws0 ws0Var = (ws0) obj;
                if (ws0Var.R1 != null) {
                    ws0Var.R1 = null;
                    if (!this.b) {
                        ws0Var.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                yz0 yz0Var = (yz0) obj;
                yz0Var.N = this.b ? 1.0f : 0.0f;
                yz0Var.invalidate();
                break;
            case 21:
                boolean z14 = this.b;
                g11 g11Var = (g11) obj;
                long j10 = g11Var.f;
                if (g11Var.e0 == animator) {
                    g11Var.V = z14 ? 1.0f : 0.0f;
                    g11Var.p();
                    g11Var.W = false;
                    ImageView imageView = g11Var.I;
                    boolean z15 = g11Var.T;
                    int i11 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z15 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = g11Var.H;
                    if (!g11Var.T) {
                        i11 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i11);
                    g11Var.e0 = null;
                    org.telegram.messenger.hp.s1(g11Var.e).e7.edit().putBoolean("topicssidetabs" + j10, g11Var.U).putBoolean("topicssidetabsb" + j10, g11Var.T).apply();
                    Boolean bool = g11Var.d0;
                    if (bool != null && z14 != bool.booleanValue()) {
                        boolean booleanValue = g11Var.d0.booleanValue();
                        g11Var.d0 = null;
                        g11Var.d(booleanValue);
                    }
                    org.telegram.messenger.g0.h3(new sp0(this, 19));
                    break;
                }
                break;
            case 22:
                b11 b11Var = (b11) obj;
                b11Var.G = this.b ? 1.0f : 0.0f;
                b11Var.h();
                break;
            case 23:
                f11 f11Var = (f11) obj;
                f11Var.V = this.b ? 1.0f : 0.0f;
                f11Var.h();
                f11Var.g();
                break;
            case 24:
                r41 r41Var = (r41) obj;
                AnimatorSet animatorSet4 = r41Var.l1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        r41Var.m1.setVisibility(4);
                    }
                    r41Var.l1 = null;
                    break;
                }
                break;
            case 25:
                v41 v41Var = (v41) obj;
                AnimatorSet animatorSet5 = v41Var.q1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        v41Var.p1.setVisibility(4);
                    }
                    v41Var.q1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) obj;
                c2Var.w = null;
                if (this.b) {
                    TextView[] textViewArr = c2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!c2Var.H && (drawable = (drawableArr = c2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                c2Var.H = false;
                if (!c2Var.P) {
                    c2Var.n = c2Var.r;
                }
                c2Var.s = 0.0f;
                c2Var.invalidate();
                break;
            case 27:
                org.telegram.ui.lr lrVar = (org.telegram.ui.lr) obj;
                if (lrVar.x != null && (radialProgressView = lrVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        lrVar.w.setVisibility(4);
                    }
                    lrVar.x = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj;
                yyVar.s = this.b ? 1.0f : 0.0f;
                yyVar.invalidate();
                break;
            default:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj;
                x30Var.M4 = null;
                x30Var.G1.getSubtitleTextView().setTranslationY(this.b ? 0.0f : org.telegram.messenger.g0.L(20.0f));
                break;
        }
    }

    public s9(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public s9(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public s9(on onVar) {
        this.a = 3;
        this.c = onVar;
    }
}
