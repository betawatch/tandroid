package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tc1;
import org.telegram.ui.x91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ha0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 5:
                ((zt0) this.c).Q1 = null;
                break;
            case 10:
                a61 a61Var = (a61) this.c;
                AnimatorSet animatorSet = a61Var.k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    a61Var.k1 = null;
                    break;
                }
                break;
            case 11:
                e61 e61Var = (e61) this.c;
                AnimatorSet animatorSet2 = e61Var.p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e61Var.p1 = null;
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.ns) this.c).x = null;
                break;
            case 16:
                ((org.telegram.ui.c60) this.c).h = null;
                break;
            case 19:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.c;
                if (animator.equals(lo0Var.k0)) {
                    lo0Var.k0 = null;
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.e51) this.c).n = null;
                break;
            case 27:
                tc1 tc1Var = (tc1) this.c;
                AnimatorSet animatorSet3 = tc1Var.I;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tc1Var.I = null;
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
        float f7;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        org.telegram.ui.hd hdVar;
        org.telegram.ui.Cells.d4 d4Var;
        int i10 = this.a;
        int i11 = 0;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ab0 ab0Var = (ab0) obj;
                if (ab0Var.getParent() != null) {
                    ((ViewGroup) ab0Var.getParent()).removeView(ab0Var);
                }
                org.telegram.ui.hl hlVar = (org.telegram.ui.hl) ab0Var;
                org.telegram.messenger.nj njVar = hlVar.H.v5;
                if (njVar != null) {
                    njVar.x = null;
                }
                if (z10) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.gl(hlVar, i11), 15L);
                    break;
                }
                break;
            case 1:
                ua0 ua0Var = (ua0) obj;
                ua0Var.P = null;
                ua0Var.h(z10, false);
                break;
            case 2:
                zc0 zc0Var = (zc0) obj;
                TextView textView = zc0Var.x;
                org.telegram.ui.Cells.a5 a5Var = zc0Var.e;
                float f10 = z10 ? 1.0f : 0.0f;
                a5Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f10));
                a5Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, f10));
                a5Var.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f10));
                textView.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.9f, f10));
                textView.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.9f, f10));
                textView.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, f10));
                zc0Var.s.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, f10));
                break;
            case 3:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) obj;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!z10) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 4:
                rm0 rm0Var = (rm0) obj;
                if (animator == rm0Var.G) {
                    f7 = z10 ? 1.0f : 0.0f;
                    rm0Var.F = f7;
                    rm0Var.setShown(f7);
                    if (!z10) {
                        rm0Var.setVisibility(8);
                    }
                    rm0Var.b(true);
                    break;
                }
                break;
            case 5:
                zt0 zt0Var = (zt0) obj;
                if (zt0Var.Q1 != null) {
                    zt0Var.Q1 = null;
                    if (!z10) {
                        zt0Var.D0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                e11 e11Var = (e11) obj;
                e11Var.M = z10 ? 1.0f : 0.0f;
                e11Var.invalidate();
                break;
            case 7:
                o21 o21Var = (o21) obj;
                long j10 = o21Var.r;
                if (o21Var.g0 == animator) {
                    o21Var.a0 = z10 ? 1.0f : 0.0f;
                    o21Var.p();
                    o21Var.b0 = false;
                    o21Var.K.setImageResource(o21Var.V ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    o21Var.s();
                    o21Var.g0 = null;
                    org.telegram.messenger.vp.r1(o21Var.n).f7.edit().putBoolean("topicssidetabs" + j10, o21Var.W).putBoolean("topicssidetabsb" + j10, o21Var.V).apply();
                    Boolean bool = o21Var.f0;
                    if (bool != null && z10 != bool.booleanValue()) {
                        boolean booleanValue = o21Var.f0.booleanValue();
                        o21Var.f0 = null;
                        o21Var.d(booleanValue);
                    }
                    org.telegram.messenger.i0.g3(new uo0(this, 22));
                    break;
                }
                break;
            case 8:
                j21 j21Var = (j21) obj;
                j21Var.F = z10 ? 1.0f : 0.0f;
                j21Var.h();
                break;
            case 9:
                n21 n21Var = (n21) obj;
                n21Var.U = z10 ? 1.0f : 0.0f;
                n21Var.h();
                n21Var.g();
                break;
            case 10:
                a61 a61Var = (a61) obj;
                AnimatorSet animatorSet = a61Var.k1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z10) {
                        a61Var.l1.setVisibility(4);
                    }
                    a61Var.k1 = null;
                    break;
                }
                break;
            case 11:
                e61 e61Var = (e61) obj;
                AnimatorSet animatorSet2 = e61Var.p1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z10) {
                        e61Var.o1.setVisibility(4);
                    }
                    e61Var.p1 = null;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.b2 b2Var = (org.telegram.ui.Components.voip.b2) obj;
                b2Var.w = null;
                if (z10) {
                    TextView[] textViewArr = b2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!b2Var.G && (drawable = (drawableArr = b2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                b2Var.G = false;
                if (!b2Var.O) {
                    b2Var.n = b2Var.r;
                }
                b2Var.s = 0.0f;
                b2Var.invalidate();
                break;
            case 13:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) obj;
                if (nsVar.x != null && (radialProgressView = nsVar.s) != null) {
                    if (!z10) {
                        radialProgressView.setVisibility(4);
                        nsVar.w.setVisibility(4);
                    }
                    nsVar.x = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.s = z10 ? 1.0f : 0.0f;
                c00Var.invalidate();
                break;
            case 15:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj;
                b50Var.L4 = null;
                b50Var.F1.getSubtitleTextView().setTranslationY(z10 ? 0.0f : org.telegram.messenger.i0.L(20.0f));
                break;
            case 16:
                org.telegram.ui.c60 c60Var = (org.telegram.ui.c60) obj;
                if (c60Var.h != null && (hdVar = c60Var.f) != null) {
                    if (z10) {
                        hdVar.setVisibility(4);
                    } else {
                        c60Var.n.setVisibility(4);
                    }
                    c60Var.h = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) obj;
                if (!z10) {
                    hf0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet3 = hf0Var.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    hf0Var.L = null;
                    break;
                }
                break;
            case 18:
                if (!z10) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) obj;
                if (animator.equals(lo0Var.k0)) {
                    if (!z10) {
                        lo0Var.Z.setVisibility(4);
                        lo0Var.a0.setVisibility(4);
                    }
                    lo0Var.k0 = null;
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.kt0) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 21:
                org.telegram.ui.ay0 ay0Var = (org.telegram.ui.ay0) obj;
                ProfileActivity profileActivity = ay0Var.n;
                if (ay0Var.h) {
                    org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                    if (p5Var != null) {
                        p5Var.setClickable(false);
                    }
                } else {
                    ay0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.R6;
                profileActivity.K5(false);
                break;
            case 22:
                org.telegram.ui.cz0 cz0Var = (org.telegram.ui.cz0) obj;
                if (!z10) {
                    cz0Var.f.setVisibility(8);
                    break;
                } else {
                    cz0Var.c.setVisibility(8);
                    break;
                }
            case 23:
                org.telegram.ui.i11 i11Var = (org.telegram.ui.i11) obj;
                i11Var.w = z10 ? 1.0f : 0.0f;
                if (i11Var.S) {
                    i11Var.N.invalidate();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e31Var.w;
                float f11 = z10 ? 1.0f : 0.0f;
                e31Var.L = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(gr.g.getInterpolation(e31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                while (i11 < itemsCount) {
                    float s10 = org.telegram.messenger.i0.s(e31Var.L, i11, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11).setAlpha(s10);
                    i11++;
                }
                e31Var.N = null;
                break;
            case 25:
                org.telegram.ui.e51 e51Var = (org.telegram.ui.e51) obj;
                if (e51Var.n != null && (d4Var = e51Var.r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    e51Var.n = null;
                    break;
                }
                break;
            case 26:
                ((x91) obj).D = z10 ? 1.0f : 0.0f;
                break;
            case 27:
                tc1 tc1Var = (tc1) obj;
                AnimatorSet animatorSet4 = tc1Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!z10) {
                        tc1Var.b.setVisibility(4);
                        break;
                    } else {
                        tc1Var.e.setVisibility(4);
                        break;
                    }
                }
                break;
            case 28:
                org.telegram.ui.web.l1 l1Var = (org.telegram.ui.web.l1) obj;
                org.telegram.ui.zd zdVar = l1Var.V;
                if (!l1Var.T) {
                    zdVar.setVisibility(8);
                    zdVar.setText("");
                }
                f7 = z10 ? 1.0f : 0.0f;
                l1Var.U = f7;
                zdVar.setAlpha(f7);
                l1Var.invalidate();
                if (!l1Var.T) {
                    zdVar.clearFocus();
                    org.telegram.messenger.i0.v1(zdVar);
                    break;
                } else {
                    zdVar.requestFocus();
                    org.telegram.messenger.i0.J3(zdVar);
                    break;
                }
            default:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) obj;
                org.telegram.ui.zd zdVar2 = m0Var.b0;
                if (!m0Var.W) {
                    zdVar2.setVisibility(8);
                }
                f7 = z10 ? 1.0f : 0.0f;
                m0Var.a0 = f7;
                zdVar2.setAlpha(f7);
                m0Var.j(m0Var.a0);
                m0Var.R.setTranslationX(org.telegram.messenger.i0.L(56.0f) * m0Var.a0);
                m0Var.O.setTranslationX(org.telegram.messenger.i0.L(112.0f) * m0Var.a0);
                m0Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 17:
                if (this.b) {
                    ((org.telegram.ui.hf0) this.c).V.setVisibility(0);
                    break;
                }
                break;
            case 18:
                if (this.b) {
                    ((PasscodeActivity) this.c).w.setVisibility(0);
                    break;
                }
                break;
            case 19:
            case 20:
            default:
                super.onAnimationStart(animator);
                break;
            case 21:
                org.telegram.ui.ay0 ay0Var = (org.telegram.ui.ay0) this.c;
                ProfileActivity profileActivity = ay0Var.n;
                org.telegram.ui.ActionBar.p5 p5Var = profileActivity.T0;
                if (p5Var != null && !this.b) {
                    p5Var.setClickable(true);
                }
                profileActivity.A5(true);
                ay0Var.setVisibility(0);
                profileActivity.K5(false);
                break;
            case 22:
                org.telegram.ui.cz0 cz0Var = (org.telegram.ui.cz0) this.c;
                if (!this.b) {
                    cz0Var.c.setAlpha(0.0f);
                    cz0Var.c.setVisibility(0);
                    break;
                } else {
                    cz0Var.f.setAlpha(0.0f);
                    cz0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
