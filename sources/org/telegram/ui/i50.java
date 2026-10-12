package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i50(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((p70) this.c).h = null;
                break;
            case 4:
                hr0 hr0Var = (hr0) this.c;
                if (animator.equals(hr0Var.k0)) {
                    hr0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((o91) this.c).r = null;
                break;
            case 12:
                oh1 oh1Var = (oh1) this.c;
                AnimatorSet animatorSet = oh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oh1Var.I = null;
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
        pd pdVar;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                n60 n60Var = (n60) this.c;
                n60Var.U2 = null;
                n60Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                p70 p70Var = (p70) this.c;
                if (p70Var.h != null && (pdVar = p70Var.f) != null) {
                    if (this.b) {
                        pdVar.setVisibility(4);
                    } else {
                        p70Var.n.setVisibility(4);
                    }
                    p70Var.h = null;
                    break;
                }
                break;
            case 2:
                bh0 bh0Var = (bh0) this.c;
                if (!this.b) {
                    bh0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = bh0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bh0Var.L = null;
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
                hr0 hr0Var = (hr0) this.c;
                if (animator.equals(hr0Var.k0)) {
                    if (!this.b) {
                        hr0Var.Z.setVisibility(4);
                        hr0Var.a0.setVisibility(4);
                    }
                    hr0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((sw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                i11 i11Var = (i11) this.c;
                if (i11Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = i11Var.n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    i11Var.setVisibility(8);
                }
                i11Var.n.l5(false);
                break;
            case 7:
                n21 n21Var = (n21) this.c;
                if (this.b) {
                    n21Var.c.setVisibility(8);
                    break;
                } else {
                    n21Var.f.setVisibility(8);
                    break;
                }
            case 8:
                r51 r51Var = (r51) this.c;
                r51Var.v = this.b ? 1.0f : 0.0f;
                if (r51Var.S) {
                    r51Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                n71 n71Var = (n71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                n71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.es.g.getInterpolation(n71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(n71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                n71Var.N = null;
                break;
            case 10:
                o91 o91Var = (o91) this.c;
                if (o91Var.r != null && (z3Var = o91Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    o91Var.r = null;
                    break;
                }
                break;
            case 11:
                ((se1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                oh1 oh1Var = (oh1) this.c;
                AnimatorSet animatorSet2 = oh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        oh1Var.e.setVisibility(4);
                        break;
                    } else {
                        oh1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                gi.o oVar = u1Var.V;
                if (!u1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                u1Var.U = f10;
                oVar.setAlpha(f10);
                u1Var.invalidate();
                if (u1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                }
            case 14:
                m0 m0Var = (m0) this.c;
                gi.o oVar2 = m0Var.b0;
                if (!m0Var.W) {
                    oVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                m0Var.a0 = f11;
                oVar2.setAlpha(f11);
                m0Var.j(m0Var.a0);
                m0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.a0);
                m0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.a0);
                m0Var.invalidate();
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
                sg.q0 q0Var = (sg.q0) this.c;
                q0Var.M = this.b ? 1.0f : 0.0f;
                q0Var.d.invalidate();
                sg.o0 o0Var = q0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
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
                    ((bh0) this.c).V.setVisibility(0);
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
                i11 i11Var = (i11) this.c;
                org.telegram.ui.ActionBar.u0 u0Var = i11Var.n.U0;
                if (u0Var != null && !this.b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                i11Var.setVisibility(0);
                i11Var.n.l5(false);
                break;
            case 7:
                n21 n21Var = (n21) this.c;
                if (!this.b) {
                    n21Var.c.setAlpha(0.0f);
                    n21Var.c.setVisibility(0);
                    break;
                } else {
                    n21Var.f.setAlpha(0.0f);
                    n21Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
