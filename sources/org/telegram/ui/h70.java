package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((l70) this.c).h = null;
                break;
            case 3:
                cr0 cr0Var = (cr0) this.c;
                if (animator.equals(cr0Var.k0)) {
                    cr0Var.k0 = null;
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
        org.telegram.ui.Cells.a4 a4Var;
        switch (this.a) {
            case 0:
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
            case 1:
                yg0 yg0Var = (yg0) this.c;
                if (!this.b) {
                    yg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = yg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    yg0Var.L = null;
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
                cr0 cr0Var = (cr0) this.c;
                if (animator.equals(cr0Var.k0)) {
                    if (!this.b) {
                        cr0Var.Z.setVisibility(4);
                        cr0Var.a0.setVisibility(4);
                    }
                    cr0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((mw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                c11 c11Var = (c11) this.c;
                if (c11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = c11Var.n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = c11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = c11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = c11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    c11Var.setVisibility(8);
                }
                c11Var.n.l5(false);
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
                l51 l51Var = (l51) this.c;
                l51Var.v = this.b ? 1.0f : 0.0f;
                if (l51Var.S) {
                    l51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                f71 f71Var = (f71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                f71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                f71Var.N = null;
                break;
            case 9:
                i91 i91Var = (i91) this.c;
                if (i91Var.r != null && (a4Var = i91Var.s) != null) {
                    if (!this.b) {
                        a4Var.setVisibility(4);
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
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.c;
                fi.o oVar = w1Var.V;
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
            case 13:
                k0 k0Var = (k0) this.c;
                fi.o oVar2 = k0Var.b0;
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
                zg.b0 b0Var = (zg.b0) this.c;
                org.telegram.ui.Components.pk0 pk0Var = b0Var.n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.b;
                zg.b0.a(b0Var, z10);
                b0Var.m.invalidateOutline();
                b0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    b0Var.k = true;
                    b0Var.a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.y;
                    pk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
                }
                b0Var.C = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b) {
                    ((yg0) this.c).V.setVisibility(0);
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
                c11 c11Var = (c11) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = c11Var.n.U0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = c11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = c11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = c11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                c11Var.setVisibility(0);
                c11Var.n.l5(false);
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
