package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                aq0 aq0Var = (aq0) this.c;
                if (animator.equals(aq0Var.g0)) {
                    aq0Var.g0 = null;
                    break;
                }
                break;
            case 10:
                ((x71) this.c).r = null;
                break;
            case 12:
                zf1 zf1Var = (zf1) this.c;
                AnimatorSet animatorSet = zf1Var.E;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    zf1Var.E = null;
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
        org.telegram.ui.Cells.w3 w3Var;
        switch (this.a) {
            case 0:
                s50 s50Var = (s50) this.c;
                s50Var.Q2 = null;
                s50Var.K.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 1:
                u60 u60Var = (u60) this.c;
                if (u60Var.h != null && (fdVar = u60Var.f) != null) {
                    if (this.b) {
                        fdVar.setVisibility(4);
                    } else {
                        u60Var.n.setVisibility(4);
                    }
                    u60Var.h = null;
                    break;
                }
                break;
            case 2:
                ig0 ig0Var = (ig0) this.c;
                if (!this.b) {
                    ig0Var.R.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.H = null;
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
                aq0 aq0Var = (aq0) this.c;
                if (animator.equals(aq0Var.g0)) {
                    if (!this.b) {
                        aq0Var.V.setVisibility(4);
                        aq0Var.W.setVisibility(4);
                    }
                    aq0Var.g0 = null;
                    break;
                }
                break;
            case 5:
                ((jv0) this.c).A = this.b ? 1.0f : 0.0f;
                break;
            case 6:
                yz0 yz0Var = (yz0) this.c;
                if (yz0Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = yz0Var.n.Q0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
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
            case 7:
                d11 d11Var = (d11) this.c;
                if (this.b) {
                    d11Var.c.setVisibility(8);
                    break;
                } else {
                    d11Var.f.setVisibility(8);
                    break;
                }
            case 8:
                c41 c41Var = (c41) this.c;
                c41Var.v = this.b ? 1.0f : 0.0f;
                if (c41Var.O) {
                    c41Var.J.invalidate();
                    break;
                }
                break;
            case 9:
                w51 w51Var = (w51) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                float f10 = this.b ? 1.0f : 0.0f;
                w51Var.H = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.g.getInterpolation(w51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w51Var.H, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i10).setAlpha(cascade);
                }
                w51Var.J = null;
                break;
            case 10:
                x71 x71Var = (x71) this.c;
                if (x71Var.r != null && (w3Var = x71Var.s) != null) {
                    if (!this.b) {
                        w3Var.setVisibility(4);
                    }
                    x71Var.r = null;
                    break;
                }
                break;
            case 11:
                ((dd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 12:
                zf1 zf1Var = (zf1) this.c;
                AnimatorSet animatorSet2 = zf1Var.E;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        zf1Var.e.setVisibility(4);
                        break;
                    } else {
                        zf1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.c;
                hh.o oVar = r1Var.R;
                if (!r1Var.P) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f11 = this.b ? 1.0f : 0.0f;
                r1Var.Q = f11;
                oVar.setAlpha(f11);
                r1Var.invalidate();
                if (r1Var.P) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                }
            case 14:
                o0 o0Var = (o0) this.c;
                hh.o oVar2 = o0Var.U;
                if (!o0Var.S) {
                    oVar2.setVisibility(8);
                }
                float f12 = this.b ? 1.0f : 0.0f;
                o0Var.T = f12;
                oVar2.setAlpha(f12);
                o0Var.j(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                break;
            case 15:
                pf.x0 x0Var = (pf.x0) this.c;
                boolean z10 = this.b;
                x0Var.e = z10 ? 1.0f : 0.0f;
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    x0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility((i11 == 1) == z10 ? 0 : 8);
                    x0Var.d[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    i11++;
                }
                break;
            case 16:
                if (this.b) {
                    ((uf.n) this.c).e(false, false, true, false);
                    break;
                }
                break;
            default:
                zf.y1 y1Var = (zf.y1) this.c;
                ((yf.n) y1Var).y.n.d();
                if (this.b) {
                    y1Var.w.accept(Integer.valueOf(y1Var.s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
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
                    ((ig0) this.c).R.setVisibility(0);
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
                yz0 yz0Var = (yz0) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = yz0Var.n.Q0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
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
            case 7:
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
