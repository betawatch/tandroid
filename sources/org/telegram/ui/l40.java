package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l40(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((s60) this.c).h = null;
                break;
            case 4:
                jq0 jq0Var = (jq0) this.c;
                if (animator.equals(jq0Var.k0)) {
                    jq0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((x71) this.c).r = null;
                break;
            case 12:
                vf1 vf1Var = (vf1) this.c;
                AnimatorSet animatorSet = vf1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vf1Var.I = null;
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
                q50 q50Var = (q50) this.c;
                q50Var.U2 = null;
                q50Var.O.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                s60 s60Var = (s60) this.c;
                if (s60Var.h != null && (jdVar = s60Var.f) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        s60Var.n.setVisibility(4);
                    }
                    s60Var.h = null;
                    break;
                }
                break;
            case 2:
                dg0 dg0Var = (dg0) this.c;
                if (!this.b) {
                    dg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = dg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dg0Var.L = null;
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
                jq0 jq0Var = (jq0) this.c;
                if (animator.equals(jq0Var.k0)) {
                    if (!this.b) {
                        jq0Var.Z.setVisibility(4);
                        jq0Var.a0.setVisibility(4);
                    }
                    jq0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((qv0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                e01 e01Var = (e01) this.c;
                if (e01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = e01Var.n.V0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = e01Var.n;
                    if (profileActivity.O0) {
                        profileActivity.T0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = e01Var.n;
                    if (profileActivity2.M0) {
                        profileActivity2.R0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = e01Var.n;
                    if (profileActivity3.N0) {
                        profileActivity3.S0.setVisibility(8);
                    }
                } else {
                    e01Var.setVisibility(8);
                }
                e01Var.n.l5(false);
                break;
            case 7:
                k11 k11Var = (k11) this.c;
                if (this.b) {
                    k11Var.c.setVisibility(8);
                    break;
                } else {
                    k11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                x31 x31Var = (x31) this.c;
                x31Var.v = this.b ? 1.0f : 0.0f;
                if (x31Var.S) {
                    x31Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                t51 t51Var = (t51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t51Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                t51Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.bs.g.getInterpolation(t51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(t51Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                t51Var.N = null;
                break;
            case 10:
                x71 x71Var = (x71) this.c;
                if (x71Var.r != null && (y3Var = x71Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    x71Var.r = null;
                    break;
                }
                break;
            case 11:
                ((yc1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                vf1 vf1Var = (vf1) this.c;
                AnimatorSet animatorSet2 = vf1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        vf1Var.e.setVisibility(4);
                        break;
                    } else {
                        vf1Var.b.setVisibility(4);
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
                rg.z1 z1Var = (rg.z1) this.c;
                ((qg.o) z1Var).y.n.d();
                if (this.b) {
                    z1Var.w.accept(Integer.valueOf(z1Var.s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
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
                sg.p0 p0Var = q0Var.e;
                if (p0Var != null) {
                    p0Var.invalidate();
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
                    ((dg0) this.c).V.setVisibility(0);
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
                e01 e01Var = (e01) this.c;
                org.telegram.ui.ActionBar.u0 u0Var = e01Var.n.V0;
                if (u0Var != null && !this.b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = e01Var.n;
                if (profileActivity.O0) {
                    profileActivity.T0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = e01Var.n;
                if (profileActivity2.M0) {
                    profileActivity2.R0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = e01Var.n;
                if (profileActivity3.N0) {
                    profileActivity3.S0.setVisibility(0);
                }
                e01Var.setVisibility(0);
                e01Var.n.l5(false);
                break;
            case 7:
                k11 k11Var = (k11) this.c;
                if (!this.b) {
                    k11Var.c.setAlpha(0.0f);
                    k11Var.c.setVisibility(0);
                    break;
                } else {
                    k11Var.f.setAlpha(0.0f);
                    k11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
