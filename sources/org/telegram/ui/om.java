package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ pm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(pm pmVar, pm pmVar2) {
        super(pmVar2);
        this.x = pmVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        wn wnVar = this.x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = wnVar.getParentLayout();
        if (wnVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || wnVar.pa > 0 || System.currentTimeMillis() - wnVar.E9 < 250) {
            return false;
        }
        if ((wnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.m2) wnVar).isPaused;
        if (z12 || !wnVar.N5) {
            return false;
        }
        ai.g4 g4Var = wnVar.J1;
        if (g4Var != null && g4Var.isShowing()) {
            return false;
        }
        jk jkVar = wnVar.Y;
        return jkVar == null || jkVar.getTrendingStickersAlert() == null || !wnVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        fj fjVar;
        pm pmVar = this.x;
        wn wnVar = pmVar.J0;
        if (wnVar.getParentLayout() == null || !((ActionBarLayout) wnVar.getParentLayout()).n) {
            wnVar.w9 = f7;
            wnVar.x9 = f10;
            ai.g4 g4Var = wnVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = wnVar.ab;
                if (alVar != null) {
                    alVar.setTranslationY(wnVar.w9 + (wnVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.e4 e4Var = wnVar.w1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = wnVar.v1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = wnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                wnVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                wnVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.h60 h60Var = wnVar.b3;
                if (h60Var != null) {
                    h60Var.e(f7);
                }
                ci.r6 r6Var = wnVar.y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                wnVar.setFragmentPanTranslationOffset(i10);
                wnVar.o9();
                wnVar.r9();
            } else {
                pmVar.setNonNoveTranslation(f7);
            }
            wnVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && wnVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (wnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) wnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof qy) {
                    qy qyVar = (qy) lastFragment;
                    qyVar.v1 = f7;
                    qyVar.X4();
                }
            }
            org.telegram.ui.Components.j40 j40Var = wnVar.s2;
            if (j40Var != null && j40Var.getVisibility() == 0) {
                wnVar.s2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = wnVar.X1;
            if (ekVar == null || (fjVar = ekVar.A0) == null) {
                return;
            }
            fjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        org.telegram.ui.Components.je jeVar;
        wn wnVar = this.x.J0;
        jk jkVar = wnVar.Y;
        if (jkVar != null && (jeVar = jkVar.u0) != null) {
            jeVar.run();
            jkVar.u0 = null;
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.s2;
        if (j40Var == null || j40Var.getVisibility() != 0) {
            return;
        }
        wnVar.s2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        wn wnVar = this.x.J0;
        wnVar.D4 = true;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            if (z10 && (tdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                jkVar.V.run();
            }
            org.telegram.ui.Components.uc ucVar = jkVar.W;
            if (ucVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ucVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.f2;
        if (j40Var != null) {
            j40Var.b(false);
        }
        ci.e4 e4Var = wnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final int i() {
        pm pmVar = this.x;
        wn wnVar = pmVar.J0;
        if (pmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !wnVar.Y.t0()) {
            return 0;
        }
        return wnVar.Y.getEmojiPadding();
    }
}
