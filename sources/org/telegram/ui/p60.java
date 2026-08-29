package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p60(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((t60) this.c).h = null;
                break;
            case 3:
                zp0 zp0Var = (zp0) this.c;
                if (animator.equals(zp0Var.g0)) {
                    zp0Var.g0 = null;
                    break;
                }
                break;
            case 9:
                ((b81) this.c).r = null;
                break;
            case 11:
                cg1 cg1Var = (cg1) this.c;
                AnimatorSet animatorSet = cg1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cg1Var.E = null;
                    break;
                }
                break;
            case 15:
                ((qh.n) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ed edVar;
        org.telegram.ui.Cells.w3 w3Var;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                t60 t60Var = (t60) this.c;
                if (t60Var.h != null && (edVar = t60Var.f) != null) {
                    if (this.b) {
                        edVar.setVisibility(4);
                    } else {
                        t60Var.n.setVisibility(4);
                    }
                    t60Var.h = null;
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
                d11 d11Var = (d11) this.c;
                if (this.b) {
                    d11Var.c.setVisibility(8);
                    break;
                } else {
                    d11Var.f.setVisibility(8);
                    break;
                }
            case 7:
                f41 f41Var = (f41) this.c;
                f41Var.v = this.b ? 1.0f : 0.0f;
                if (f41Var.O) {
                    f41Var.J.invalidate();
                    break;
                }
                break;
            case 8:
                z51 z51Var = (z51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z51Var.v;
                float f9 = this.b ? 1.0f : 0.0f;
                z51Var.H = f9;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f9);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.jr.g.getInterpolation(z51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(z51Var.H, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setAlpha(cascade);
                }
                z51Var.J = null;
                break;
            case 9:
                b81 b81Var = (b81) this.c;
                if (b81Var.r != null && (w3Var = b81Var.s) != null) {
                    if (!this.b) {
                        w3Var.setVisibility(4);
                    }
                    b81Var.r = null;
                    break;
                }
                break;
            case 10:
                ((fd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 11:
                cg1 cg1Var = (cg1) this.c;
                AnimatorSet animatorSet2 = cg1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        cg1Var.e.setVisibility(4);
                        break;
                    } else {
                        cg1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.c;
                jh.m mVar = r1Var.R;
                if (!r1Var.P) {
                    mVar.setVisibility(8);
                    mVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                r1Var.Q = f10;
                mVar.setAlpha(f10);
                r1Var.invalidate();
                if (r1Var.P) {
                    mVar.requestFocus();
                    AndroidUtilities.showKeyboard(mVar);
                    break;
                } else {
                    mVar.clearFocus();
                    AndroidUtilities.hideKeyboard(mVar);
                    break;
                }
            case 13:
                o0 o0Var = (o0) this.c;
                jh.m mVar2 = o0Var.U;
                if (!o0Var.S) {
                    mVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                o0Var.T = f11;
                mVar2.setAlpha(f11);
                o0Var.j(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                break;
            case 14:
                ph.p2 p2Var = (ph.p2) this.c;
                p2Var.J0 = this.b ? 1.0f : 0.0f;
                p2Var.h();
                break;
            case 15:
                qh.n nVar = (qh.n) this.c;
                if (nVar.w != null && (radialProgressView = nVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar.s.setVisibility(4);
                    }
                    nVar.w = null;
                    break;
                }
                break;
            case 16:
                rf.y0 y0Var = (rf.y0) this.c;
                boolean z10 = this.b;
                y0Var.e = z10 ? 1.0f : 0.0f;
                y0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    y0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.e));
                    y0Var.c[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    y0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, y0Var.e));
                    y0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.e));
                    y0Var.d[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    y0Var.d[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, y0Var.e));
                    i11++;
                }
                break;
            default:
                if (this.b) {
                    ((wf.n) this.c).e(false, false, true, false);
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
                d11 d11Var = (d11) this.c;
                if (!this.b) {
                    d11Var.c.setAlpha(0.0f);
                    d11Var.c.setVisibility(0);
                    break;
                } else {
                    d11Var.f.setAlpha(0.0f);
                    d11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
