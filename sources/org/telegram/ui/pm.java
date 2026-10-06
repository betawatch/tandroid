package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pm extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ qm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(qm qmVar, qm qmVar2) {
        super(qmVar2);
        this.x = qmVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        yn ynVar = this.x.M0;
        org.telegram.ui.ActionBar.c5 parentLayout = ynVar.getParentLayout();
        if (ynVar.Ma) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || ynVar.na > 0 || System.currentTimeMillis() - ynVar.C9 < 250) {
            return false;
        }
        if ((ynVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) ynVar).isPaused;
        if (z12 || !ynVar.L5) {
            return false;
        }
        ai.g4 g4Var = ynVar.H1;
        if (g4Var != null && g4Var.isShowing()) {
            return false;
        }
        jk jkVar = ynVar.W;
        return jkVar == null || jkVar.getTrendingStickersAlert() == null || !ynVar.W.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.x10 x10Var;
        qm qmVar = this.x;
        yn ynVar = qmVar.M0;
        if (ynVar.getParentLayout() == null || !((ActionBarLayout) ynVar.getParentLayout()).n) {
            ynVar.u9 = f7;
            ynVar.v9 = f10;
            ai.g4 g4Var = ynVar.H1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = ynVar.Ya;
                if (alVar != null) {
                    alVar.setTranslationY(ynVar.u9 + (ynVar.m1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.e4 e4Var = ynVar.u1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = ynVar.t1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = ynVar.O0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                ynVar.N.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                ynVar.V0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    k60Var.e(f7);
                }
                ci.r6 r6Var = ynVar.w2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) r6Var.b;
                    gaVar.u = f7;
                    gaVar.d.invalidate();
                }
                ynVar.setFragmentPanTranslationOffset(i10);
                ynVar.o9();
                ynVar.q9();
            } else {
                qmVar.setNonNoveTranslation(f7);
            }
            ynVar.v0.invalidate();
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
            if (rcVar != null && ynVar.Wb != null) {
                rcVar.l();
            }
            if (AndroidUtilities.isTablet() && (ynVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) ynVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.v1 = f7;
                    uyVar.g5();
                }
            }
            org.telegram.ui.Components.m40 m40Var = ynVar.q2;
            if (m40Var != null && m40Var.getVisibility() == 0) {
                ynVar.q2.f(ynVar.W.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = ynVar.V1;
            if (ekVar == null || (x10Var = ekVar.A0) == null) {
                return;
            }
            x10Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ke keVar;
        yn ynVar = this.x.M0;
        jk jkVar = ynVar.W;
        if (jkVar != null && (keVar = jkVar.u0) != null) {
            keVar.run();
            jkVar.u0 = null;
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.q2;
        if (m40Var == null || m40Var.getVisibility() != 0) {
            return;
        }
        ynVar.q2.f(ynVar.W.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        yn ynVar = this.x.M0;
        ynVar.B4 = true;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            if (z10 && (tdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                jkVar.V.run();
            }
            org.telegram.ui.Components.be beVar = jkVar.W;
            if (beVar != null) {
                AndroidUtilities.cancelRunOnUIThread(beVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.d2;
        if (m40Var != null) {
            m40Var.b(false);
        }
        ci.e4 e4Var = ynVar.y1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        qm qmVar = this.x;
        yn ynVar = qmVar.M0;
        if (qmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !ynVar.W.t0()) {
            return 0;
        }
        return ynVar.W.getEmojiPadding();
    }
}
