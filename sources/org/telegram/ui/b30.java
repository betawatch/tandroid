package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b30(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((e50) this.c).h = null;
                break;
            case 4:
                an0 an0Var = (an0) this.c;
                if (animator.equals(an0Var.l0)) {
                    an0Var.l0 = null;
                    break;
                }
                break;
            case 10:
                ((n31) this.c).n = null;
                break;
            case 12:
                za1 za1Var = (za1) this.c;
                AnimatorSet animatorSet = za1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    za1Var.J = null;
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
        org.telegram.ui.Cells.c4 c4Var;
        float f10;
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                e40 e40Var = (e40) obj;
                e40Var.T4 = null;
                e40Var.J1.getSubtitleTextView().setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(20.0f));
                break;
            case 1:
                e50 e50Var = (e50) obj;
                if (e50Var.h != null && (xcVar = e50Var.f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        e50Var.n.setVisibility(4);
                    }
                    e50Var.h = null;
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
                an0 an0Var = (an0) obj;
                if (animator.equals(an0Var.l0)) {
                    if (!z10) {
                        an0Var.a0.setVisibility(4);
                        an0Var.b0.setVisibility(4);
                    }
                    an0Var.l0 = null;
                    break;
                }
                break;
            case 5:
                ((zr0) obj).F = z10 ? 1.0f : 0.0f;
                break;
            case 6:
                mw0 mw0Var = (mw0) obj;
                ProfileActivity profileActivity = mw0Var.n;
                if (mw0Var.h) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    if (g5Var != null) {
                        g5Var.setClickable(false);
                    }
                } else {
                    mw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.Z6;
                profileActivity.P5(false);
                break;
            case 7:
                px0 px0Var = (px0) obj;
                if (z10) {
                    px0Var.c.setVisibility(8);
                    break;
                } else {
                    px0Var.f.setVisibility(8);
                    break;
                }
            case 8:
                sz0 sz0Var = (sz0) obj;
                sz0Var.w = z10 ? 1.0f : 0.0f;
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                    break;
                }
                break;
            case 9:
                m11 m11Var = (m11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.w;
                float f11 = z10 ? 1.0f : 0.0f;
                m11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.kr.g.getInterpolation(m11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                m11Var.O = null;
                break;
            case 10:
                n31 n31Var = (n31) obj;
                if (n31Var.n != null && (c4Var = n31Var.r) != null) {
                    if (!z10) {
                        c4Var.setVisibility(4);
                    }
                    n31Var.n = null;
                    break;
                }
                break;
            case 11:
                ((g81) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 12:
                za1 za1Var = (za1) obj;
                AnimatorSet animatorSet2 = za1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        za1Var.e.setVisibility(4);
                        break;
                    } else {
                        za1Var.b.setVisibility(4);
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
                tg.t1 t1Var = (tg.t1) obj;
                ((sg.i) t1Var).E.s1.d();
                if (z10) {
                    t1Var.x.accept(Integer.valueOf(t1Var.s));
                }
                if (t1Var.getParent() != null) {
                    ((ViewGroup) t1Var.getParent()).removeView(t1Var);
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
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.P = z10 ? 1.0f : 0.0f;
                r0Var.f.invalidate();
                ug.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.invalidate();
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
                mw0 mw0Var = (mw0) this.c;
                ProfileActivity profileActivity = mw0Var.n;
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null && !this.b) {
                    g5Var.setClickable(true);
                }
                profileActivity.F5(true);
                mw0Var.setVisibility(0);
                profileActivity.P5(false);
                break;
            case 7:
                px0 px0Var = (px0) this.c;
                if (!this.b) {
                    px0Var.c.setAlpha(0.0f);
                    px0Var.c.setVisibility(0);
                    break;
                } else {
                    px0Var.f.setAlpha(0.0f);
                    px0Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
