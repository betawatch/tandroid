package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class n40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n40(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((u60) this.c).h = null;
                break;
            case 4:
                kq0 kq0Var = (kq0) this.c;
                if (animator.equals(kq0Var.k0)) {
                    kq0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((z71) this.c).r = null;
                break;
            case 12:
                xf1 xf1Var = (xf1) this.c;
                AnimatorSet animatorSet = xf1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xf1Var.I = null;
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
        ld ldVar;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.a) {
            case 0:
                s50 s50Var = (s50) this.c;
                s50Var.U2 = null;
                s50Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                u60 u60Var = (u60) this.c;
                if (u60Var.h != null && (ldVar = u60Var.f) != null) {
                    if (this.b) {
                        ldVar.setVisibility(4);
                    } else {
                        u60Var.n.setVisibility(4);
                    }
                    u60Var.h = null;
                    break;
                }
                break;
            case 2:
                fg0 fg0Var = (fg0) this.c;
                if (!this.b) {
                    fg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = fg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg0Var.L = null;
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
                kq0 kq0Var = (kq0) this.c;
                if (animator.equals(kq0Var.k0)) {
                    if (!this.b) {
                        kq0Var.Z.setVisibility(4);
                        kq0Var.a0.setVisibility(4);
                    }
                    kq0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((sv0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                g01 g01Var = (g01) this.c;
                if (g01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = g01Var.n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = g01Var.n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = g01Var.n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = g01Var.n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    g01Var.setVisibility(8);
                }
                g01Var.n.l5(false);
                break;
            case 7:
                m11 m11Var = (m11) this.c;
                if (this.b) {
                    m11Var.c.setVisibility(8);
                    break;
                } else {
                    m11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                z31 z31Var = (z31) this.c;
                z31Var.v = this.b ? 1.0f : 0.0f;
                if (z31Var.S) {
                    z31Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                v51 v51Var = (v51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v51Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                v51Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(v51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                v51Var.N = null;
                break;
            case 10:
                z71 z71Var = (z71) this.c;
                if (z71Var.r != null && (y3Var = z71Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    z71Var.r = null;
                    break;
                }
                break;
            case 11:
                ((ad1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                xf1 xf1Var = (xf1) this.c;
                AnimatorSet animatorSet2 = xf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        xf1Var.e.setVisibility(4);
                        break;
                    } else {
                        xf1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.t1 t1Var = (org.telegram.ui.web.t1) this.c;
                ai.t tVar = t1Var.V;
                if (!t1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                t1Var.U = f10;
                tVar.setAlpha(f10);
                t1Var.invalidate();
                if (t1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    break;
                } else {
                    tVar.clearFocus();
                    AndroidUtilities.hideKeyboard(tVar);
                    break;
                }
            case 14:
                n0 n0Var = (n0) this.c;
                ai.t tVar2 = n0Var.b0;
                if (!n0Var.W) {
                    tVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                n0Var.a0 = f11;
                tVar2.setAlpha(f11);
                n0Var.j(n0Var.a0);
                n0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.a0);
                n0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.a0);
                n0Var.invalidate();
                break;
            case 15:
                rg.y1 y1Var = (rg.y1) this.c;
                ((qg.o) y1Var).y.n.d();
                if (this.b) {
                    y1Var.w.accept(Integer.valueOf(y1Var.s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
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
                sg.p0 p0Var = (sg.p0) this.c;
                p0Var.M = this.b ? 1.0f : 0.0f;
                p0Var.d.invalidate();
                sg.o0 o0Var = p0Var.e;
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
                    ((fg0) this.c).V.setVisibility(0);
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
                g01 g01Var = (g01) this.c;
                org.telegram.ui.ActionBar.u0 u0Var = g01Var.n.V0;
                if (u0Var != null && !this.b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = g01Var.n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = g01Var.n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = g01Var.n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                g01Var.setVisibility(0);
                g01Var.n.l5(false);
                break;
            case 7:
                m11 m11Var = (m11) this.c;
                if (!this.b) {
                    m11Var.c.setAlpha(0.0f);
                    m11Var.c.setVisibility(0);
                    break;
                } else {
                    m11Var.f.setAlpha(0.0f);
                    m11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
