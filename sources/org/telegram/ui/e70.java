package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((i70) this.c).h = null;
                break;
            case 3:
                uq0 uq0Var = (uq0) this.c;
                if (animator.equals(uq0Var.k0)) {
                    uq0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((x81) this.c).r = null;
                break;
            case 11:
                zg1 zg1Var = (zg1) this.c;
                AnimatorSet animatorSet = zg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    zg1Var.I = null;
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
        id idVar;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                i70 i70Var = (i70) this.c;
                if (i70Var.h != null && (idVar = i70Var.f) != null) {
                    if (this.b) {
                        idVar.setVisibility(4);
                    } else {
                        i70Var.n.setVisibility(4);
                    }
                    i70Var.h = null;
                    break;
                }
                break;
            case 1:
                rg0 rg0Var = (rg0) this.c;
                if (!this.b) {
                    rg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = rg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    rg0Var.L = null;
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
                uq0 uq0Var = (uq0) this.c;
                if (animator.equals(uq0Var.k0)) {
                    if (!this.b) {
                        uq0Var.Z.setVisibility(4);
                        uq0Var.a0.setVisibility(4);
                    }
                    uq0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((fw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                v01 v01Var = (v01) this.c;
                if (v01Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = v01Var.n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = v01Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = v01Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = v01Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    v01Var.setVisibility(8);
                }
                v01Var.n.l5(false);
                break;
            case 6:
                z11 z11Var = (z11) this.c;
                if (this.b) {
                    z11Var.c.setVisibility(8);
                    break;
                } else {
                    z11Var.f.setVisibility(8);
                    break;
                }
            case 7:
                a51 a51Var = (a51) this.c;
                a51Var.v = this.b ? 1.0f : 0.0f;
                if (a51Var.S) {
                    a51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                v61 v61Var = (v61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v61Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                v61Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.rr.g.getInterpolation(v61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                v61Var.N = null;
                break;
            case 9:
                x81 x81Var = (x81) this.c;
                if (x81Var.r != null && (z3Var = x81Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    x81Var.r = null;
                    break;
                }
                break;
            case 10:
                ((de1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 11:
                zg1 zg1Var = (zg1) this.c;
                AnimatorSet animatorSet2 = zg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        zg1Var.e.setVisibility(4);
                        break;
                    } else {
                        zg1Var.b.setVisibility(4);
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
                qg.b2 b2Var = (qg.b2) this.c;
                ((pg.n) b2Var).y.n.d();
                if (this.b) {
                    b2Var.w.accept(Integer.valueOf(b2Var.s));
                }
                if (b2Var.getParent() != null) {
                    ((ViewGroup) b2Var.getParent()).removeView(b2Var);
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
                zg.c0 c0Var = (zg.c0) this.c;
                org.telegram.ui.Components.gk0 gk0Var = c0Var.n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.b;
                zg.c0.a(c0Var, z10);
                c0Var.m.invalidateOutline();
                c0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    c0Var.k = true;
                    c0Var.a.invalidate();
                }
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    gk0Var.setImportantForAccessibility(0);
                    gk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.y;
                    gk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
                }
                c0Var.C = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b) {
                    ((rg0) this.c).V.setVisibility(0);
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
                v01 v01Var = (v01) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = v01Var.n.U0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = v01Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = v01Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = v01Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                v01Var.setVisibility(0);
                v01Var.n.l5(false);
                break;
            case 6:
                z11 z11Var = (z11) this.c;
                if (!this.b) {
                    z11Var.c.setAlpha(0.0f);
                    z11Var.c.setVisibility(0);
                    break;
                } else {
                    z11Var.f.setAlpha(0.0f);
                    z11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
