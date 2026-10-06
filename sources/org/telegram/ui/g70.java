package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class g70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((k70) this.c).h = null;
                break;
            case 3:
                wq0 wq0Var = (wq0) this.c;
                if (animator.equals(wq0Var.k0)) {
                    wq0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((y81) this.c).n = null;
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
        kd kdVar;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.a) {
            case 0:
                k70 k70Var = (k70) this.c;
                if (k70Var.h != null && (kdVar = k70Var.f) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        k70Var.n.setVisibility(4);
                    }
                    k70Var.h = null;
                    break;
                }
                break;
            case 1:
                ug0 ug0Var = (ug0) this.c;
                if (!this.b) {
                    ug0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ug0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ug0Var.L = null;
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
                wq0 wq0Var = (wq0) this.c;
                if (animator.equals(wq0Var.k0)) {
                    if (!this.b) {
                        wq0Var.Z.setVisibility(4);
                        wq0Var.a0.setVisibility(4);
                    }
                    wq0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((gw0) this.c).E = this.b ? 1.0f : 0.0f;
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
                y11 y11Var = (y11) this.c;
                if (this.b) {
                    y11Var.c.setVisibility(8);
                    break;
                } else {
                    y11Var.f.setVisibility(8);
                    break;
                }
            case 7:
                c51 c51Var = (c51) this.c;
                c51Var.v = this.b ? 1.0f : 0.0f;
                if (c51Var.S) {
                    c51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                w61 w61Var = (w61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                w61Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.tr.g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                w61Var.N = null;
                break;
            case 9:
                y81 y81Var = (y81) this.c;
                if (y81Var.n != null && (z3Var = y81Var.r) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    y81Var.n = null;
                    break;
                }
                break;
            case 10:
                ((ee1) this.c).y = this.b ? 1.0f : 0.0f;
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
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.c;
                fi.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                v1Var.U = f10;
                oVar.setAlpha(f10);
                v1Var.invalidate();
                if (v1Var.T) {
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
                qg.y1 y1Var = (qg.y1) this.c;
                ((pg.n) y1Var).y.n.d();
                if (this.b) {
                    y1Var.w.accept(Integer.valueOf(y1Var.s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
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
                rg.q0 q0Var = (rg.q0) this.c;
                q0Var.M = this.b ? 1.0f : 0.0f;
                q0Var.d.invalidate();
                rg.p0 p0Var = q0Var.e;
                if (p0Var != null) {
                    p0Var.invalidate();
                    break;
                }
                break;
            default:
                zg.z zVar = (zg.z) this.c;
                org.telegram.ui.Components.sk0 sk0Var = zVar.n;
                zVar.k();
                zVar.l();
                boolean z10 = this.b;
                zg.z.a(zVar, z10);
                zVar.m.invalidateOutline();
                zVar.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    zVar.k = true;
                    zVar.a.invalidate();
                }
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(zVar.j, 1.0f, 0.0f));
                if (!z10) {
                    sk0Var.setImportantForAccessibility(0);
                    sk0Var.setSkipDraw(false);
                    zVar.f();
                    Runtime.getRuntime().gc();
                    int i11 = zVar.y;
                    sk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
                }
                zVar.C = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b) {
                    ((ug0) this.c).V.setVisibility(0);
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
                y11 y11Var = (y11) this.c;
                if (!this.b) {
                    y11Var.c.setAlpha(0.0f);
                    y11Var.c.setVisibility(0);
                    break;
                } else {
                    y11Var.f.setAlpha(0.0f);
                    y11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
