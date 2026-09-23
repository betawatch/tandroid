package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        xn xnVar = this.x.J0;
        org.telegram.ui.ActionBar.c5 parentLayout = xnVar.getParentLayout();
        if (xnVar.Oa) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) xnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || xnVar.pa > 0 || System.currentTimeMillis() - xnVar.E9 < 250) {
            return false;
        }
        if ((xnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) xnVar).isPaused;
        if (z12 || !xnVar.N5) {
            return false;
        }
        ai.g4 g4Var = xnVar.J1;
        if (g4Var != null && g4Var.isShowing()) {
            return false;
        }
        jk jkVar = xnVar.Y;
        return jkVar == null || jkVar.getTrendingStickersAlert() == null || !xnVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        fj fjVar;
        qm qmVar = this.x;
        xn xnVar = qmVar.J0;
        if (xnVar.getParentLayout() == null || !((ActionBarLayout) xnVar.getParentLayout()).n) {
            xnVar.w9 = f7;
            xnVar.x9 = f10;
            ai.g4 g4Var = xnVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar.setTranslationY(f7);
                al alVar = xnVar.ab;
                if (alVar != null) {
                    alVar.setTranslationY(xnVar.w9 + (xnVar.o1 != null ? r2.getCurrentHeight() : 0));
                }
                ci.e4 e4Var = xnVar.w1;
                if (e4Var != null) {
                    e4Var.setTranslationY(f7);
                }
                ci.e4 e4Var2 = xnVar.v1;
                if (e4Var2 != null) {
                    e4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = xnVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f11 = f7 / 2.0f;
                xnVar.P.setTranslationY(f11);
                int i10 = (int) f7;
                xnVar.X0.setBackgroundTranslation(i10);
                dl dlVar = xnVar.b3;
                if (dlVar != null) {
                    dlVar.t0 = f11;
                    dlVar.s();
                }
                ci.r6 r6Var = xnVar.y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                xnVar.setFragmentPanTranslationOffset(i10);
                xnVar.o9();
                xnVar.r9();
            } else {
                qmVar.setNonNoveTranslation(f7);
            }
            xnVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && xnVar.Yb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (xnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) xnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ry) {
                    ry ryVar = (ry) lastFragment;
                    ryVar.v1 = f7;
                    ryVar.X4();
                }
            }
            org.telegram.ui.Components.j40 j40Var = xnVar.s2;
            if (j40Var != null && j40Var.getVisibility() == 0) {
                xnVar.s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
            }
            ek ekVar = xnVar.X1;
            if (ekVar == null || (fjVar = ekVar.A0) == null) {
                return;
            }
            fjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        xn xnVar = this.x.J0;
        jk jkVar = xnVar.Y;
        if (jkVar != null && (ieVar = jkVar.u0) != null) {
            ieVar.run();
            jkVar.u0 = null;
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.s2;
        if (j40Var == null || j40Var.getVisibility() != 0) {
            return;
        }
        xnVar.s2.f(xnVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        xn xnVar = this.x.J0;
        xnVar.D4 = true;
        jk jkVar = xnVar.Y;
        if (jkVar != null) {
            if (z10 && (sdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                jkVar.V.run();
            }
            rh rhVar = jkVar.W;
            if (rhVar != null) {
                AndroidUtilities.cancelRunOnUIThread(rhVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.f2;
        if (j40Var != null) {
            j40Var.b(false);
        }
        ci.e4 e4Var = xnVar.A1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        qm qmVar = this.x;
        xn xnVar = qmVar.J0;
        if (qmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !xnVar.Y.u0()) {
            return 0;
        }
        return xnVar.Y.getEmojiPadding();
    }
}
