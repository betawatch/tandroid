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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.c;
                AnimatorSet animatorSet = x9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x9Var.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.ti) this.c).W2 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) this.c;
                AnimatorSet animatorSet2 = pzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pzVar.q1 = null;
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
                ((org.telegram.ui.Components.it0) this.c).R1 = null;
                break;
            case 25:
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) this.c;
                AnimatorSet animatorSet4 = m51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    m51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.c;
                AnimatorSet animatorSet5 = q51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    q51Var.t1 = null;
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
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) obj;
                AnimatorSet animatorSet = x9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        x9Var.c.setVisibility(4);
                        break;
                    } else {
                        x9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj;
                if (animator == lcVar.g) {
                    lcVar.g = null;
                    lcVar.j = this.b ? 1.0f : 0.0f;
                    lcVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (tiVar.W2 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.q0 q0Var = tiVar.c3;
                        if (q0Var != null) {
                            q0Var.setVisibility(4);
                        }
                        if (tiVar.O2 != 0 || !tiVar.o3) {
                            tiVar.Y2.setVisibility(4);
                            break;
                        }
                    } else if (tiVar.Q2) {
                        org.telegram.ui.Components.li liVar = tiVar.w2;
                        if (liVar == null || liVar.N()) {
                            tiVar.v3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) obj;
                if (!this.b) {
                    org.telegram.ui.Components.p9 p9Var = foVar.h;
                    foVar.h = foVar.n;
                    foVar.n = p9Var;
                    p9Var.setVisibility(8);
                    foVar.n.setAlpha(0.0f);
                    foVar.h.setVisibility(0);
                    foVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) obj;
                if (animator == soVar.e) {
                    f10 = z10 ? 1.0f : 0.0f;
                    soVar.d = f10;
                    soVar.setShown(f10);
                    if (!z10) {
                        soVar.setVisibility(8);
                    }
                    soVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) obj;
                kpVar.a2 = this.b ? 1.0f : 0.0f;
                kpVar.D1.setTranslationY((-org.telegram.messenger.g0.L(7.0f)) * kpVar.a2);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.jq) obj).I.setVisibility(8);
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
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj;
                AnimatorSet animatorSet2 = pzVar.q1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        pzVar.r1.setVisibility(4);
                    }
                    pzVar.q1 = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.c00 c00Var = (org.telegram.ui.Components.c00) obj;
                c00Var.n = this.b ? 1.0f : 0.0f;
                c00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.a20 a20Var = (org.telegram.ui.Components.a20) obj;
                org.telegram.ui.Components.y10 y10Var = a20Var.a;
                if (!a20Var.H) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    a20Var.d0 = f11;
                    a20Var.W.setPinnedProgress(f11);
                    y10Var.setScaleX(1.0f - (a20Var.d0 * 0.6f));
                    y10Var.setScaleY(1.0f - (a20Var.d0 * 0.6f));
                    if (a20Var.Y) {
                        a20Var.j();
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
                org.telegram.ui.Components.i60 i60Var = (org.telegram.ui.Components.i60) obj;
                boolean z11 = this.b;
                i60Var.c2 = z11 ? 1.0f : 0.0f;
                i60Var.b.invalidate();
                if (!z11) {
                    i60Var.Q1.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                if (ta0Var.getParent() != null) {
                    ((ViewGroup) ta0Var.getParent()).removeView(ta0Var);
                }
                boolean z12 = this.b;
                mk mkVar = (mk) ta0Var;
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
                org.telegram.ui.Components.na0 na0Var = (org.telegram.ui.Components.na0) obj;
                na0Var.Q = null;
                na0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) obj;
                TextView textView = oc0Var.x;
                bi.v2 v2Var = oc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                v2Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                v2Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, f12));
                v2Var.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
                textView.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.9f, f12));
                textView.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, f12));
                oc0Var.s.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, f12));
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
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) obj;
                if (it0Var.R1 != null) {
                    it0Var.R1 = null;
                    if (!this.b) {
                        it0Var.E0.setVisibility(4);
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
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.bp0(this, 20));
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
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) obj;
                AnimatorSet animatorSet4 = m51Var.o1;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        m51Var.p1.setVisibility(4);
                    }
                    m51Var.o1 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) obj;
                AnimatorSet animatorSet5 = q51Var.t1;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        q51Var.s1.setVisibility(4);
                    }
                    q51Var.t1 = null;
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
                dz dzVar = (dz) obj;
                dzVar.s = this.b ? 1.0f : 0.0f;
                dzVar.invalidate();
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

    public on(org.telegram.ui.Components.fo foVar) {
        this.a = 4;
        this.c = foVar;
    }
}
