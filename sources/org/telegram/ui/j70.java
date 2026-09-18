package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j70(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((n70) this.c).h = null;
                break;
            case 3:
                cr0 cr0Var = (cr0) this.c;
                if (animator.equals(cr0Var.k0)) {
                    cr0Var.k0 = null;
                    break;
                }
                break;
            case 9:
                ((g91) this.c).r = null;
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
        kd kdVar;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.c;
                if (n70Var.h != null && (kdVar = n70Var.f) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        n70Var.n.setVisibility(4);
                    }
                    n70Var.h = null;
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
                ((ow0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 5:
                e11 e11Var = (e11) this.c;
                if (e11Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = e11Var.n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = e11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = e11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = e11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    e11Var.setVisibility(8);
                }
                e11Var.n.l5(false);
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
                k51 k51Var = (k51) this.c;
                k51Var.v = this.b ? 1.0f : 0.0f;
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                e71 e71Var = (e71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                e71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.g.getInterpolation(e71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(e71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                e71Var.N = null;
                break;
            case 9:
                g91 g91Var = (g91) this.c;
                if (g91Var.r != null && (y3Var = g91Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    g91Var.r = null;
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
                e11 e11Var = (e11) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = e11Var.n.U0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = e11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = e11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = e11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                e11Var.setVisibility(0);
                e11Var.n.l5(false);
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
