package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n60(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((r60) this.c).h = null;
                break;
            case 3:
                zp0 zp0Var = (zp0) this.c;
                if (animator.equals(zp0Var.g0)) {
                    zp0Var.g0 = null;
                    break;
                }
                break;
            case 9:
                ((z71) this.c).r = null;
                break;
            case 11:
                ag1 ag1Var = (ag1) this.c;
                AnimatorSet animatorSet = ag1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ag1Var.E = null;
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
        fd fdVar;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                r60 r60Var = (r60) this.c;
                if (r60Var.h != null && (fdVar = r60Var.f) != null) {
                    if (this.b) {
                        fdVar.setVisibility(4);
                    } else {
                        r60Var.n.setVisibility(4);
                    }
                    r60Var.h = null;
                    break;
                }
                break;
            case 1:
                fg0 fg0Var = (fg0) this.c;
                if (!this.b) {
                    fg0Var.R.setVisibility(4);
                }
                AnimatorSet animatorSet = fg0Var.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg0Var.H = null;
                    break;
                }
                break;
            case 2:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            case 3:
                zp0 zp0Var = (zp0) this.c;
                if (animator.equals(zp0Var.g0)) {
                    if (!this.b) {
                        zp0Var.V.setVisibility(4);
                        zp0Var.W.setVisibility(4);
                    }
                    zp0Var.g0 = null;
                    break;
                }
                break;
            case 4:
                ((iv0) this.c).A = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                yz0 yz0Var = (yz0) this.c;
                if (yz0Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = yz0Var.n.Q0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = yz0Var.n;
                    if (profileActivity.J0) {
                        profileActivity.O0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = yz0Var.n;
                    if (profileActivity2.H0) {
                        profileActivity2.M0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = yz0Var.n;
                    if (profileActivity3.I0) {
                        profileActivity3.N0.setVisibility(8);
                    }
                } else {
                    yz0Var.setVisibility(8);
                }
                yz0Var.n.l5(false);
                break;
            case 6:
                c11 c11Var = (c11) this.c;
                if (this.b) {
                    c11Var.c.setVisibility(8);
                    break;
                } else {
                    c11Var.f.setVisibility(8);
                    break;
                }
            case 7:
                d41 d41Var = (d41) this.c;
                d41Var.v = this.b ? 1.0f : 0.0f;
                if (d41Var.O) {
                    d41Var.J.invalidate();
                    break;
                }
                break;
            case 8:
                x51 x51Var = (x51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                float f10 = this.b ? 1.0f : 0.0f;
                x51Var.H = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.g.getInterpolation(x51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    float cascade = AndroidUtilities.cascade(x51Var.H, i9, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i9).setAlpha(cascade);
                }
                x51Var.J = null;
                break;
            case 9:
                z71 z71Var = (z71) this.c;
                if (z71Var.r != null && (z3Var = z71Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    z71Var.r = null;
                    break;
                }
                break;
            case 10:
                ((dd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 11:
                ag1 ag1Var = (ag1) this.c;
                AnimatorSet animatorSet2 = ag1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        ag1Var.e.setVisibility(4);
                        break;
                    } else {
                        ag1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.q1 q1Var = (org.telegram.ui.web.q1) this.c;
                gh.o oVar = q1Var.R;
                if (!q1Var.P) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f11 = this.b ? 1.0f : 0.0f;
                q1Var.Q = f11;
                oVar.setAlpha(f11);
                q1Var.invalidate();
                if (q1Var.P) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                }
            case 13:
                n0 n0Var = (n0) this.c;
                gh.o oVar2 = n0Var.U;
                if (!n0Var.S) {
                    oVar2.setVisibility(8);
                }
                float f12 = this.b ? 1.0f : 0.0f;
                n0Var.T = f12;
                oVar2.setAlpha(f12);
                n0Var.j(n0Var.T);
                n0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * n0Var.T);
                n0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * n0Var.T);
                n0Var.invalidate();
                break;
            case 14:
                if (this.b) {
                    ((tf.n) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 15:
                yf.y1 y1Var = (yf.y1) this.c;
                ((xf.n) y1Var).y.n.d();
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
                    limitPreviewView.f0 = false;
                }
                Runnable runnable = limitPreviewView.g0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.g0.run();
                    break;
                }
                break;
            default:
                zf.p0 p0Var = (zf.p0) this.c;
                p0Var.I = this.b ? 1.0f : 0.0f;
                p0Var.d.invalidate();
                zf.o0 o0Var = p0Var.e;
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
            case 1:
                if (this.b) {
                    ((fg0) this.c).R.setVisibility(0);
                    break;
                }
                break;
            case 2:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                yz0 yz0Var = (yz0) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = yz0Var.n.Q0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = yz0Var.n;
                if (profileActivity.J0) {
                    profileActivity.O0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = yz0Var.n;
                if (profileActivity2.H0) {
                    profileActivity2.M0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = yz0Var.n;
                if (profileActivity3.I0) {
                    profileActivity3.N0.setVisibility(0);
                }
                yz0Var.setVisibility(0);
                yz0Var.n.l5(false);
                break;
            case 6:
                c11 c11Var = (c11) this.c;
                if (!this.b) {
                    c11Var.c.setAlpha(0.0f);
                    c11Var.c.setVisibility(0);
                    break;
                } else {
                    c11Var.f.setAlpha(0.0f);
                    c11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
