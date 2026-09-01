package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ pm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(pm pmVar, pm pmVar2) {
        super(pmVar2);
        this.x = pmVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        boolean z4;
        boolean z10;
        boolean z11;
        xn xnVar = this.x.G0;
        org.telegram.ui.ActionBar.f5 parentLayout = xnVar.getParentLayout();
        if (xnVar.La) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
        if (z10 || AndroidUtilities.isInMultiwindow || parentLayout == null || xnVar.ma > 0 || System.currentTimeMillis() - xnVar.B9 < 250) {
            return false;
        }
        if ((xnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.p2) xnVar).isPaused;
        if (z11 || !xnVar.K5) {
            return false;
        }
        oh.u2 u2Var = xnVar.G1;
        if (u2Var != null && u2Var.isShowing()) {
            return false;
        }
        jk jkVar = xnVar.V;
        return jkVar == null || jkVar.getTrendingStickersAlert() == null || !xnVar.V.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f10, float f11, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        ej ejVar;
        pm pmVar = this.x;
        xn xnVar = pmVar.G0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).n) {
            xnVar.t9 = f10;
            xnVar.u9 = f11;
            oh.u2 u2Var = xnVar.G1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setTranslationY(f10);
                al alVar = xnVar.Ya;
                if (alVar != null) {
                    alVar.setTranslationY(xnVar.t9 + (xnVar.l1 != null ? r2.getCurrentHeight() : 0));
                }
                qh.f3 f3Var = xnVar.t1;
                if (f3Var != null) {
                    f3Var.setTranslationY(f10);
                }
                qh.f3 f3Var2 = xnVar.s1;
                if (f3Var2 != null) {
                    f3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.x21 x21Var = xnVar.O1;
                if (x21Var != null) {
                    x21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = xnVar.N0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f12 = f10 / 2.0f;
                xnVar.M.setTranslationY(f12);
                int i10 = (int) f10;
                xnVar.U0.setBackgroundTranslation(i10);
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.q0 = f12;
                    dlVar.s();
                }
                fg.i0 i0Var = xnVar.v2;
                if (i0Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) i0Var.b;
                    x9Var.u = f10;
                    x9Var.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i10);
                xnVar.o9();
                xnVar.r9();
            } else {
                pmVar.setNonNoveTranslation(f10);
            }
            xnVar.u0.invalidate();
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
            if (icVar != null && xnVar.Wb != null) {
                icVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof py) {
                    py pyVar = (py) lastFragment;
                    pyVar.s1 = f10;
                    pyVar.X4();
                }
            }
            org.telegram.ui.Components.m40 m40Var = xnVar.p2;
            if (m40Var != null && m40Var.getVisibility() == 0) {
                xnVar.p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
            }
            dk dkVar = xnVar.U1;
            if (dkVar == null || (ejVar = dkVar.x0) == null) {
                return;
            }
            ejVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        xn xnVar = this.x.G0;
        jk jkVar = xnVar.V;
        if (jkVar != null && (ydVar = jkVar.r0) != null) {
            ydVar.run();
            jkVar.r0 = null;
        }
        org.telegram.ui.Components.m40 m40Var = xnVar.p2;
        if (m40Var == null || m40Var.getVisibility() != 0) {
            return;
        }
        xnVar.p2.f(xnVar.V.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        org.telegram.ui.Components.id idVar;
        xn xnVar = this.x.G0;
        xnVar.A4 = true;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            if (z4 && (idVar = jkVar.S) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                jkVar.S.run();
            }
            mp mpVar = jkVar.T;
            if (mpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(mpVar);
                jkVar.T.run();
            }
        }
        org.telegram.ui.Components.m40 m40Var = xnVar.c2;
        if (m40Var != null) {
            m40Var.b(false);
        }
        qh.f3 f3Var = xnVar.x1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final int i() {
        pm pmVar = this.x;
        xn xnVar = pmVar.G0;
        if (pmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !xnVar.V.t0()) {
            return 0;
        }
        return xnVar.V.getEmojiPadding();
    }
}
