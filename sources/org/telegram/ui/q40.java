package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q40(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((x60) this.c).h = null;
                break;
            case 4:
                rq0 rq0Var = (rq0) this.c;
                if (animator.equals(rq0Var.k0)) {
                    rq0Var.k0 = null;
                    break;
                }
                break;
            case 10:
                ((d81) this.c).n = null;
                break;
            case 12:
                dg1 dg1Var = (dg1) this.c;
                AnimatorSet animatorSet = dg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dg1Var.I = null;
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
        kd kdVar;
        org.telegram.ui.Cells.d4 d4Var;
        float f7;
        int i10 = this.a;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                v50 v50Var = (v50) obj;
                v50Var.U2 = null;
                v50Var.O.getSubtitleTextView().setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                x60 x60Var = (x60) obj;
                if (x60Var.h != null && (kdVar = x60Var.f) != null) {
                    if (z10) {
                        kdVar.setVisibility(4);
                    } else {
                        x60Var.n.setVisibility(4);
                    }
                    x60Var.h = null;
                    break;
                }
                break;
            case 2:
                gg0 gg0Var = (gg0) obj;
                if (!z10) {
                    gg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = gg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    gg0Var.L = null;
                    break;
                }
                break;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).v.setVisibility(8);
                    break;
                }
                break;
            case 4:
                rq0 rq0Var = (rq0) obj;
                if (animator.equals(rq0Var.k0)) {
                    if (!z10) {
                        rq0Var.Z.setVisibility(4);
                        rq0Var.a0.setVisibility(4);
                    }
                    rq0Var.k0 = null;
                    break;
                }
                break;
            case 5:
                ((xv0) obj).E = z10 ? 1.0f : 0.0f;
                break;
            case 6:
                m01 m01Var = (m01) obj;
                if (m01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = m01Var.n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = m01Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = m01Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = m01Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    m01Var.setVisibility(8);
                }
                ProfileActivity profileActivity4 = m01Var.n;
                int i11 = ProfileActivity.R6;
                profileActivity4.x5(false);
                break;
            case 7:
                s11 s11Var = (s11) obj;
                if (z10) {
                    s11Var.c.setVisibility(8);
                    break;
                } else {
                    s11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                c41 c41Var = (c41) obj;
                c41Var.v = z10 ? 1.0f : 0.0f;
                if (c41Var.S) {
                    c41Var.N.invalidate();
                    break;
                }
                break;
            case 9:
                y51 y51Var = (y51) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y51Var.v;
                float f10 = z10 ? 1.0f : 0.0f;
                y51Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.g.getInterpolation(y51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(y51Var.L, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setAlpha(cascade);
                }
                y51Var.N = null;
                break;
            case 10:
                d81 d81Var = (d81) obj;
                if (d81Var.n != null && (d4Var = d81Var.r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    d81Var.n = null;
                    break;
                }
                break;
            case 11:
                ((id1) obj).y = z10 ? 1.0f : 0.0f;
                break;
            case 12:
                dg1 dg1Var = (dg1) obj;
                AnimatorSet animatorSet2 = dg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        dg1Var.e.setVisibility(4);
                        break;
                    } else {
                        dg1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                bi.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                f7 = z10 ? 1.0f : 0.0f;
                u1Var.U = f7;
                tVar.setAlpha(f7);
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
                l0 l0Var = (l0) obj;
                bi.t tVar2 = l0Var.b0;
                if (!l0Var.W) {
                    tVar2.setVisibility(8);
                }
                f7 = z10 ? 1.0f : 0.0f;
                l0Var.a0 = f7;
                tVar2.setAlpha(f7);
                l0Var.j(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 15:
                sg.a2 a2Var = (sg.a2) obj;
                ((rg.n) a2Var).y.n.d();
                if (z10) {
                    a2Var.w.accept(Integer.valueOf(a2Var.s));
                }
                if (a2Var.getParent() != null) {
                    ((ViewGroup) a2Var.getParent()).removeView(a2Var);
                    break;
                }
                break;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
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
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.O = z10 ? 1.0f : 0.0f;
                p0Var.f.invalidate();
                tg.o0 o0Var = p0Var.h;
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
                    ((gg0) this.c).V.setVisibility(0);
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
                m01 m01Var = (m01) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = m01Var.n.U0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = m01Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = m01Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = m01Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                m01Var.setVisibility(0);
                m01Var.n.x5(false);
                break;
            case 7:
                s11 s11Var = (s11) this.c;
                if (!this.b) {
                    s11Var.c.setAlpha(0.0f);
                    s11Var.c.setVisibility(0);
                    break;
                } else {
                    s11Var.f.setAlpha(0.0f);
                    s11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
