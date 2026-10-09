package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((j70) this.c).h = null;
                break;
            case 3:
                br0 br0Var = (br0) this.c;
                if (animator.equals(br0Var.k0)) {
                    br0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((i91) this.c).r = null;
                break;
            case 11:
                ih1 ih1Var = (ih1) this.c;
                AnimatorSet animatorSet = ih1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ih1Var.I = null;
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
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                j70 j70Var = (j70) this.c;
                if (j70Var.h != null && (jdVar = j70Var.f) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        j70Var.n.setVisibility(4);
                    }
                    j70Var.h = null;
                    break;
                }
                break;
            case 1:
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
            case 2:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            case 3:
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
            case 4:
                ((mw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                b11 b11Var = (b11) this.c;
                if (b11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = b11Var.n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = b11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = b11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = b11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    b11Var.setVisibility(8);
                }
                b11Var.n.l5(false);
                break;
            case 6:
                f21 f21Var = (f21) this.c;
                if (this.b) {
                    f21Var.c.setVisibility(8);
                    break;
                } else {
                    f21Var.f.setVisibility(8);
                    break;
                }
            case 7:
                k51 k51Var = (k51) this.c;
                k51Var.v = this.b ? 1.0f : 0.0f;
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                g71 g71Var = (g71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                g71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.hs.g.getInterpolation(g71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(g71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                g71Var.N = null;
                break;
            case 9:
                i91 i91Var = (i91) this.c;
                if (i91Var.r != null && (z3Var = i91Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    i91Var.r = null;
                    break;
                }
                break;
            case 10:
                ((me1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 11:
                ih1 ih1Var = (ih1) this.c;
                AnimatorSet animatorSet2 = ih1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        ih1Var.e.setVisibility(4);
                        break;
                    } else {
                        ih1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                fi.o oVar = u1Var.V;
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
            case 13:
                l0 l0Var = (l0) this.c;
                fi.o oVar2 = l0Var.b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                l0Var.a0 = f11;
                oVar2.setAlpha(f11);
                l0Var.j(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 14:
                qg.z1 z1Var = (qg.z1) this.c;
                ((pg.n) z1Var).y.n.d();
                if (this.b) {
                    z1Var.w.accept(Integer.valueOf(z1Var.s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    break;
                }
                break;
            case 15:
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
            case 16:
                rg.p0 p0Var = (rg.p0) this.c;
                p0Var.M = this.b ? 1.0f : 0.0f;
                p0Var.d.invalidate();
                rg.o0 o0Var = p0Var.e;
                if (o0Var != null) {
                    o0Var.invalidate();
                    break;
                }
                break;
            default:
                zg.a0 a0Var = (zg.a0) this.c;
                org.telegram.ui.Components.kl0 kl0Var = a0Var.n;
                a0Var.k();
                a0Var.l();
                boolean z10 = this.b;
                zg.a0.a(a0Var, z10);
                a0Var.m.invalidateOutline();
                a0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    a0Var.k = true;
                    a0Var.a.invalidate();
                }
                kl0Var.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    kl0Var.setImportantForAccessibility(0);
                    kl0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = a0Var.y;
                    kl0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
                }
                a0Var.C = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b) {
                    ((wg0) this.c).V.setVisibility(0);
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
                b11 b11Var = (b11) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = b11Var.n.U0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = b11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = b11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = b11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                b11Var.setVisibility(0);
                b11Var.n.l5(false);
                break;
            case 6:
                f21 f21Var = (f21) this.c;
                if (!this.b) {
                    f21Var.c.setAlpha(0.0f);
                    f21Var.c.setVisibility(0);
                    break;
                } else {
                    f21Var.f.setAlpha(0.0f);
                    f21Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
