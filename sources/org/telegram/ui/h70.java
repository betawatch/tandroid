package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ar0 ar0Var = (ar0) this.c;
                if (animator.equals(ar0Var.k0)) {
                    ar0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((f91) this.c).r = null;
                break;
            case 11:
                hh1 hh1Var = (hh1) this.c;
                AnimatorSet animatorSet = hh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hh1Var.I = null;
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
                l70 l70Var = (l70) this.c;
                if (l70Var.h != null && (idVar = l70Var.f) != null) {
                    if (this.b) {
                        idVar.setVisibility(4);
                    } else {
                        l70Var.n.setVisibility(4);
                    }
                    l70Var.h = null;
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
                ar0 ar0Var = (ar0) this.c;
                if (animator.equals(ar0Var.k0)) {
                    if (!this.b) {
                        ar0Var.Z.setVisibility(4);
                        ar0Var.a0.setVisibility(4);
                    }
                    ar0Var.k0 = null;
                    break;
                }
                break;
            case 4:
                ((mw0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                d11 d11Var = (d11) this.c;
                if (d11Var.h) {
                    org.telegram.ui.ActionBar.v0 v0Var = d11Var.n.U0;
                    if (v0Var != null) {
                        v0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = d11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = d11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = d11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    d11Var.setVisibility(8);
                }
                d11Var.n.l5(false);
                break;
            case 6:
                h21 h21Var = (h21) this.c;
                if (this.b) {
                    h21Var.c.setVisibility(8);
                    break;
                } else {
                    h21Var.f.setVisibility(8);
                    break;
                }
            case 7:
                i51 i51Var = (i51) this.c;
                i51Var.v = this.b ? 1.0f : 0.0f;
                if (i51Var.S) {
                    i51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                d71 d71Var = (d71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                d71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(d71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(d71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                d71Var.N = null;
                break;
            case 9:
                f91 f91Var = (f91) this.c;
                if (f91Var.r != null && (z3Var = f91Var.s) != null) {
                    if (!this.b) {
                        z3Var.setVisibility(4);
                    }
                    f91Var.r = null;
                    break;
                }
                break;
            case 10:
                ((le1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 11:
                hh1 hh1Var = (hh1) this.c;
                AnimatorSet animatorSet2 = hh1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (this.b) {
                        hh1Var.e.setVisibility(4);
                        break;
                    } else {
                        hh1Var.b.setVisibility(4);
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
                org.telegram.ui.Components.fk0 fk0Var = c0Var.n;
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
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.y;
                    fk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
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
                d11 d11Var = (d11) this.c;
                org.telegram.ui.ActionBar.v0 v0Var = d11Var.n.U0;
                if (v0Var != null && !this.b) {
                    v0Var.setClickable(true);
                }
                ProfileActivity profileActivity = d11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = d11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = d11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                d11Var.setVisibility(0);
                d11Var.n.l5(false);
                break;
            case 6:
                h21 h21Var = (h21) this.c;
                if (!this.b) {
                    h21Var.c.setAlpha(0.0f);
                    h21Var.c.setVisibility(0);
                    break;
                } else {
                    h21Var.f.setAlpha(0.0f);
                    h21Var.f.setVisibility(0);
                    break;
                }
        }
    }
}
