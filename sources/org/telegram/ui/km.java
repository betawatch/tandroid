package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ lm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(lm lmVar, lm lmVar2) {
        super(lmVar2);
        this.x = lmVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        sn snVar = this.x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = snVar.getParentLayout();
        if (snVar.Pa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) snVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || snVar.pa > 0 || System.currentTimeMillis() - snVar.E9 < 250) {
            return false;
        }
        if ((snVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) snVar).isPaused;
        if (z12 || !snVar.N5) {
            return false;
        }
        ci.b3 b3Var = snVar.J1;
        if (b3Var != null && b3Var.isShowing()) {
            return false;
        }
        hk hkVar = snVar.Y;
        return hkVar == null || hkVar.getTrendingStickersAlert() == null || !snVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.c20 c20Var;
        lm lmVar = this.x;
        sn snVar = lmVar.J0;
        if (snVar.getParentLayout() == null || !((ActionBarLayout) snVar.getParentLayout()).n) {
            snVar.w9 = f7;
            snVar.x9 = f10;
            ci.b3 b3Var = snVar.J1;
            if (b3Var == null || !b3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setTranslationY(f7);
                xk xkVar = snVar.bb;
                if (xkVar != null) {
                    xkVar.setTranslationY(snVar.w9 + (snVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ei.x3 x3Var = snVar.w1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = snVar.v1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = snVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                snVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                snVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.r60 r60Var = snVar.b3;
                if (r60Var != null) {
                    r60Var.e(f7);
                }
                ei.g6 g6Var = snVar.y2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                snVar.setFragmentPanTranslationOffset(i10);
                snVar.t9();
                snVar.w9();
            } else {
                lmVar.setNonNoveTranslation(f7);
            }
            snVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && snVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (snVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) snVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.v1 = f7;
                    eyVar.V4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = snVar.s2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                snVar.s2.f(snVar.Y.getAudioVideoButtonContainer(), false);
            }
            bk bkVar = snVar.X1;
            if (bkVar == null || (c20Var = bkVar.B0) == null) {
                return;
            }
            c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        sn snVar = this.x.J0;
        hk hkVar = snVar.Y;
        if (hkVar != null && (ieVar = hkVar.u0) != null) {
            ieVar.run();
            hkVar.u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = snVar.s2;
        if (r40Var == null || r40Var.getVisibility() != 0) {
            return;
        }
        snVar.s2.f(snVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        sn snVar = this.x.J0;
        snVar.D4 = true;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            if (z10 && (rdVar = hkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                hkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = hkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                hkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = snVar.f2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = snVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final int i() {
        lm lmVar = this.x;
        sn snVar = lmVar.J0;
        if (lmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !snVar.Y.r0()) {
            return 0;
        }
        return snVar.Y.getEmojiPadding();
    }
}
