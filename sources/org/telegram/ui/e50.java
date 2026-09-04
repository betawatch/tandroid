package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e50(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((l70) this.c).h = null;
                break;
            case 4:
                br0 br0Var = (br0) this.c;
                if (animator.equals(br0Var.k0)) {
                    br0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((i91) this.c).r = null;
                break;
            case 12:
                hh1 hh1Var = (hh1) this.c;
                AnimatorSet animatorSet = hh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hh1Var.I = null;
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
        jd jdVar;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.a) {
            case 0:
                j60 j60Var = (j60) this.c;
                j60Var.U2 = null;
                j60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                l70 l70Var = (l70) this.c;
                if (l70Var.h != null && (jdVar = l70Var.f) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        l70Var.n.setVisibility(4);
                    }
                    l70Var.h = null;
                    break;
                }
                break;
            case 2:
                wg0 wg0Var = (wg0) this.c;
                if (!this.b) {
                    wg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = wg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wg0Var.L = null;
                    break;
                }
                break;
            case 3:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            case 4:
                br0 br0Var = (br0) this.c;
                if (animator.equals(br0Var.k0)) {
                    if (!this.b) {
                        br0Var.Z.setVisibility(4);
                        br0Var.a0.setVisibility(4);
                    }
                    br0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((lw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                d11 d11Var = (d11) this.c;
                if (d11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = d11Var.n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = d11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = d11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = d11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    d11Var.setVisibility(8);
                }
                d11Var.n.l5(false);
                break;
            case 7:
                i21 i21Var = (i21) this.c;
                if (this.b) {
                    i21Var.c.setVisibility(8);
                    break;
                } else {
                    i21Var.f.setVisibility(8);
                    break;
                }
            case 8:
                k51 k51Var = (k51) this.c;
                k51Var.v = this.b ? 1.0f : 0.0f;
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                f71 f71Var = (f71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                f71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.pr.g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                f71Var.N = null;
                break;
            case 10:
                i91 i91Var = (i91) this.c;
                if (i91Var.r != null && (y3Var = i91Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    i91Var.r = null;
                    break;
                }
                break;
            case 11:
                ((le1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                hh1 hh1Var = (hh1) this.c;
                AnimatorSet animatorSet2 = hh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        hh1Var.e.setVisibility(4);
                        break;
                    } else {
                        hh1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.c;
                gi.o oVar = w1Var.V;
                if (!w1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                w1Var.U = f10;
                oVar.setAlpha(f10);
                w1Var.invalidate();
                if (w1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                }
            case 14:
                k0 k0Var = (k0) this.c;
                gi.o oVar2 = k0Var.b0;
                if (!k0Var.W) {
                    oVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                k0Var.a0 = f11;
                oVar2.setAlpha(f11);
                k0Var.j(k0Var.a0);
                k0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * k0Var.a0);
                k0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * k0Var.a0);
                k0Var.invalidate();
                break;
            case 15:
                rg.a2 a2Var = (rg.a2) this.c;
                ((qg.n) a2Var).y.n.d();
                if (this.b) {
                    a2Var.w.accept(Integer.valueOf(a2Var.s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    break;
                }
                break;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.j0 = false;
                }
                Runnable runnable = limitPreviewView.k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.k0.run();
                    break;
                }
                break;
            default:
                sg.r0 r0Var = (sg.r0) this.c;
                r0Var.M = this.b ? 1.0f : 0.0f;
                r0Var.d.invalidate();
                sg.q0 q0Var = r0Var.e;
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
                    ((wg0) this.c).V.setVisibility(0);
                    break;
                }
                break;
            case 3:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                d11 d11Var = (d11) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = d11Var.n.U0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = d11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = d11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = d11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                d11Var.setVisibility(0);
                d11Var.n.l5(false);
                break;
            case 7:
                i21 i21Var = (i21) this.c;
                if (!this.b) {
                    i21Var.c.setAlpha(0.0f);
                    i21Var.c.setVisibility(0);
                    break;
                } else {
                    i21Var.f.setAlpha(0.0f);
                    i21Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
