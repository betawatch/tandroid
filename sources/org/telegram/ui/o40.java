package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o40(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((w60) this.c).h = null;
                break;
            case 4:
                mq0 mq0Var = (mq0) this.c;
                if (animator.equals(mq0Var.k0)) {
                    mq0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((c81) this.c).r = null;
                break;
            case 12:
                bg1 bg1Var = (bg1) this.c;
                AnimatorSet animatorSet = bg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bg1Var.I = null;
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
                u50 u50Var = (u50) this.c;
                u50Var.U2 = null;
                u50Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                w60 w60Var = (w60) this.c;
                if (w60Var.h != null && (jdVar = w60Var.f) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        w60Var.n.setVisibility(4);
                    }
                    w60Var.h = null;
                    break;
                }
                break;
            case 2:
                ig0 ig0Var = (ig0) this.c;
                if (!this.b) {
                    ig0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.L = null;
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
                mq0 mq0Var = (mq0) this.c;
                if (animator.equals(mq0Var.k0)) {
                    if (!this.b) {
                        mq0Var.Z.setVisibility(4);
                        mq0Var.a0.setVisibility(4);
                    }
                    mq0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((uv0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                i01 i01Var = (i01) this.c;
                if (i01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = i01Var.n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i01Var.n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i01Var.n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i01Var.n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    i01Var.setVisibility(8);
                }
                i01Var.n.p5(false);
                break;
            case 7:
                o11 o11Var = (o11) this.c;
                if (this.b) {
                    o11Var.c.setVisibility(8);
                    break;
                } else {
                    o11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                b41 b41Var = (b41) this.c;
                b41Var.v = this.b ? 1.0f : 0.0f;
                if (b41Var.S) {
                    b41Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                x51 x51Var = (x51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                x51Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(x51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(x51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                x51Var.N = null;
                break;
            case 10:
                c81 c81Var = (c81) this.c;
                if (c81Var.r != null && (y3Var = c81Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    c81Var.r = null;
                    break;
                }
                break;
            case 11:
                ((ed1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                bg1 bg1Var = (bg1) this.c;
                AnimatorSet animatorSet2 = bg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        bg1Var.e.setVisibility(4);
                        break;
                    } else {
                        bg1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                ai.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                u1Var.U = f10;
                tVar.setAlpha(f10);
                u1Var.invalidate();
                if (u1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    break;
                } else {
                    tVar.clearFocus();
                    AndroidUtilities.hideKeyboard(tVar);
                    break;
                }
            case 14:
                m0 m0Var = (m0) this.c;
                ai.t tVar2 = m0Var.b0;
                if (!m0Var.W) {
                    tVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                m0Var.a0 = f11;
                tVar2.setAlpha(f11);
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
                sg.p0 p0Var = (sg.p0) this.c;
                p0Var.O = this.b ? 1.0f : 0.0f;
                p0Var.f.invalidate();
                sg.o0 o0Var = p0Var.h;
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
                    ((ig0) this.c).V.setVisibility(0);
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
                i01 i01Var = (i01) this.c;
                org.telegram.ui.ActionBar.u0 u0Var = i01Var.n.V0;
                if (u0Var != null && !this.b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i01Var.n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i01Var.n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i01Var.n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                i01Var.setVisibility(0);
                i01Var.n.p5(false);
                break;
            case 7:
                o11 o11Var = (o11) this.c;
                if (!this.b) {
                    o11Var.c.setAlpha(0.0f);
                    o11Var.c.setVisibility(0);
                    break;
                } else {
                    o11Var.f.setAlpha(0.0f);
                    o11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
