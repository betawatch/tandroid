package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((g70) this.c).h = null;
                break;
            case 3:
                tq0 tq0Var = (tq0) this.c;
                if (animator.equals(tq0Var.k0)) {
                    tq0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((z81) this.c).r = null;
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
                g70 g70Var = (g70) this.c;
                if (g70Var.h != null && (idVar = g70Var.f) != null) {
                    if (this.b) {
                        idVar.setVisibility(4);
                    } else {
                        g70Var.n.setVisibility(4);
                    }
                    g70Var.h = null;
                    break;
                }
                break;
            case 1:
                qg0 qg0Var = (qg0) this.c;
                if (!this.b) {
                    qg0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = qg0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qg0Var.L = null;
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
                tq0 tq0Var = (tq0) this.c;
                if (animator.equals(tq0Var.k0)) {
                    if (!this.b) {
                        tq0Var.Z.setVisibility(4);
                        tq0Var.a0.setVisibility(4);
                    }
                    tq0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((dw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                t01 t01Var = (t01) this.c;
                if (t01Var.h) {
                    org.telegram.ui.ActionBar.u0 u0Var = t01Var.n.U0;
                    if (u0Var != null) {
                        u0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = t01Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = t01Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = t01Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    t01Var.setVisibility(8);
                }
                t01Var.n.l5(false);
                break;
            case 6:
                x11 x11Var = (x11) this.c;
                if (this.b) {
                    x11Var.c.setVisibility(8);
                    break;
                } else {
                    x11Var.f.setVisibility(8);
                    break;
                }
            case 7:
                b51 b51Var = (b51) this.c;
                b51Var.v = this.b ? 1.0f : 0.0f;
                if (b51Var.S) {
                    b51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                w61 w61Var = (w61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w61Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                w61Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.rr.g.getInterpolation(w61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w61Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                w61Var.N = null;
                break;
            case 9:
                z81 z81Var = (z81) this.c;
                if (z81Var.r != null && (z3Var = z81Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    z81Var.r = null;
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
                org.telegram.ui.Components.qk0 qk0Var = b0Var.n;
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
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    qk0Var.setImportantForAccessibility(0);
                    qk0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = b0Var.y;
                    qk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
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
                    ((qg0) this.c).V.setVisibility(0);
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
                t01 t01Var = (t01) this.c;
                org.telegram.ui.ActionBar.u0 u0Var = t01Var.n.U0;
                if (u0Var != null && !this.b) {
                    u0Var.setClickable(true);
                }
                ProfileActivity profileActivity = t01Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = t01Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = t01Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                t01Var.setVisibility(0);
                t01Var.n.l5(false);
                break;
            case 6:
                x11 x11Var = (x11) this.c;
                if (!this.b) {
                    x11Var.c.setAlpha(0.0f);
                    x11Var.c.setVisibility(0);
                    break;
                } else {
                    x11Var.f.setAlpha(0.0f);
                    x11Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
