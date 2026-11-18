package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c30(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((f50) this.c).h = null;
                break;
            case 4:
                cn0 cn0Var = (cn0) this.c;
                if (animator.equals(cn0Var.l0)) {
                    cn0Var.l0 = null;
                    break;
                }
                break;
            case 10:
                ((o31) this.c).n = null;
                break;
            case 12:
                bb1 bb1Var = (bb1) this.c;
                AnimatorSet animatorSet = bb1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bb1Var.J = null;
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
        xc xcVar;
        org.telegram.ui.Cells.b4 b4Var;
        float f10;
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                f40 f40Var = (f40) obj;
                f40Var.T4 = null;
                f40Var.J1.getSubtitleTextView().setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
                break;
            case 1:
                f50 f50Var = (f50) obj;
                if (f50Var.h != null && (xcVar = f50Var.f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        f50Var.n.setVisibility(4);
                    }
                    f50Var.h = null;
                    break;
                }
                break;
            case 2:
                de0 de0Var = (de0) obj;
                if (!z10) {
                    de0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = de0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    de0Var.M = null;
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).w.setVisibility(8);
                    break;
                }
                break;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (animator.equals(cn0Var.l0)) {
                    if (!z10) {
                        cn0Var.a0.setVisibility(4);
                        cn0Var.b0.setVisibility(4);
                    }
                    cn0Var.l0 = null;
                    break;
                }
                break;
            case 5:
                ((as0) obj).F = z10 ? 1.0f : 0.0f;
                break;
            case 6:
                ow0 ow0Var = (ow0) obj;
                ProfileActivity profileActivity = ow0Var.n;
                if (ow0Var.h) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    if (h5Var != null) {
                        h5Var.setClickable(false);
                    }
                } else {
                    ow0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.P5(false);
                break;
            case 7:
                rx0 rx0Var = (rx0) obj;
                if (z10) {
                    rx0Var.c.setVisibility(8);
                    break;
                } else {
                    rx0Var.f.setVisibility(8);
                    break;
                }
            case 8:
                tz0 tz0Var = (tz0) obj;
                tz0Var.w = z10 ? 1.0f : 0.0f;
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                    break;
                }
                break;
            case 9:
                n11 n11Var = (n11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n11Var.w;
                float f11 = z10 ? 1.0f : 0.0f;
                n11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.lr.g.getInterpolation(n11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(n11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                n11Var.O = null;
                break;
            case 10:
                o31 o31Var = (o31) obj;
                if (o31Var.n != null && (b4Var = o31Var.r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    o31Var.n = null;
                    break;
                }
                break;
            case 11:
                ((i81) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 12:
                bb1 bb1Var = (bb1) obj;
                AnimatorSet animatorSet2 = bb1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        bb1Var.e.setVisibility(4);
                        break;
                    } else {
                        bb1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) obj;
                di.q qVar = j1Var.W;
                if (!j1Var.U) {
                    qVar.setVisibility(8);
                    qVar.setText("");
                }
                f10 = z10 ? 1.0f : 0.0f;
                j1Var.V = f10;
                qVar.setAlpha(f10);
                j1Var.invalidate();
                if (j1Var.U) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.I3(qVar);
                    break;
                } else {
                    qVar.clearFocus();
                    org.telegram.messenger.g0.v1(qVar);
                    break;
                }
            case 14:
                l0 l0Var = (l0) obj;
                di.q qVar2 = l0Var.c0;
                if (!l0Var.a0) {
                    qVar2.setVisibility(8);
                }
                f10 = z10 ? 1.0f : 0.0f;
                l0Var.b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.b0);
                l0Var.invalidate();
                break;
            case 15:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).E.s1.d();
                if (z10) {
                    o1Var.x.accept(Integer.valueOf(o1Var.s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    break;
                }
                break;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.k0 = false;
                }
                Runnable runnable = limitPreviewView.l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.l0.run();
                    break;
                }
                break;
            default:
                ug.s0 s0Var = (ug.s0) obj;
                s0Var.P = z10 ? 1.0f : 0.0f;
                s0Var.f.invalidate();
                ug.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                if (this.b) {
                    ((de0) this.c).W.setVisibility(0);
                    break;
                }
                break;
            case 3:
                if (this.b) {
                    ((PasscodeActivity) this.c).w.setVisibility(0);
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                ow0 ow0Var = (ow0) this.c;
                ProfileActivity profileActivity = ow0Var.n;
                org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                if (h5Var != null && !this.b) {
                    h5Var.setClickable(true);
                }
                profileActivity.F5(true);
                ow0Var.setVisibility(0);
                profileActivity.P5(false);
                break;
            case 7:
                rx0 rx0Var = (rx0) this.c;
                if (!this.b) {
                    rx0Var.c.setAlpha(0.0f);
                    rx0Var.c.setVisibility(0);
                    break;
                } else {
                    rx0Var.f.setAlpha(0.0f);
                    rx0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
