package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ jm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar, jm jmVar2) {
        super(jmVar2);
        this.x = jmVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        qn qnVar = this.x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = qnVar.getParentLayout();
        if (qnVar.Pa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || qnVar.pa > 0 || System.currentTimeMillis() - qnVar.E9 < 250) {
            return false;
        }
        if ((qnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) qnVar).isPaused;
        if (z12 || !qnVar.N5) {
            return false;
        }
        ci.b3 b3Var = qnVar.J1;
        if (b3Var != null && b3Var.isShowing()) {
            return false;
        }
        fk fkVar = qnVar.Y;
        return fkVar == null || fkVar.getTrendingStickersAlert() == null || !qnVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.c20 c20Var;
        jm jmVar = this.x;
        qn qnVar = jmVar.J0;
        if (qnVar.getParentLayout() == null || !((ActionBarLayout) qnVar.getParentLayout()).n) {
            qnVar.w9 = f7;
            qnVar.x9 = f10;
            ci.b3 b3Var = qnVar.J1;
            if (b3Var == null || !b3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.setTranslationY(f7);
                vk vkVar = qnVar.bb;
                if (vkVar != null) {
                    vkVar.setTranslationY(qnVar.w9 + (qnVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ei.x3 x3Var = qnVar.w1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = qnVar.v1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = qnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                qnVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                qnVar.X0.setBackgroundTranslation(i10);
                org.telegram.ui.Components.r60 r60Var = qnVar.b3;
                if (r60Var != null) {
                    r60Var.e(f7);
                }
                ei.g6 g6Var = qnVar.y2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                qnVar.setFragmentPanTranslationOffset(i10);
                qnVar.t9();
                qnVar.w9();
            } else {
                jmVar.setNonNoveTranslation(f7);
            }
            qnVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && qnVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (qnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) qnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof cy) {
                    cy cyVar = (cy) lastFragment;
                    cyVar.v1 = f7;
                    cyVar.V4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = qnVar.s2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                qnVar.s2.f(qnVar.Y.getAudioVideoButtonContainer(), false);
            }
            zj zjVar = qnVar.X1;
            if (zjVar == null || (c20Var = zjVar.B0) == null) {
                return;
            }
            c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        qn qnVar = this.x.J0;
        fk fkVar = qnVar.Y;
        if (fkVar != null && (ieVar = fkVar.u0) != null) {
            ieVar.run();
            fkVar.u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.s2;
        if (r40Var == null || r40Var.getVisibility() != 0) {
            return;
        }
        qnVar.s2.f(qnVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        qn qnVar = this.x.J0;
        qnVar.D4 = true;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            if (z10 && (rdVar = fkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                fkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = fkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                fkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.f2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = qnVar.A1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final int i() {
        jm jmVar = this.x;
        qn qnVar = jmVar.J0;
        if (jmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !qnVar.Y.r0()) {
            return 0;
        }
        return qnVar.Y.getEmojiPadding();
    }
}
