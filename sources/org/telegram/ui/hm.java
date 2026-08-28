package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hm extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ im x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(im imVar, im imVar2) {
        super(imVar2);
        this.x = imVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        qn qnVar = this.x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = qnVar.getParentLayout();
        if (qnVar.Ka) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || qnVar.la > 0 || System.currentTimeMillis() - qnVar.A9 < 250) {
            return false;
        }
        if ((qnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.o2) qnVar).isPaused;
        if (z12 || !qnVar.J5) {
            return false;
        }
        ih.u2 u2Var = qnVar.F1;
        if (u2Var != null && u2Var.isShowing()) {
            return false;
        }
        ak akVar = qnVar.U;
        return akVar == null || akVar.getTrendingStickersAlert() == null || !qnVar.U.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        wi wiVar;
        im imVar = this.x;
        qn qnVar = imVar.F0;
        if (qnVar.getParentLayout() == null || !((ActionBarLayout) qnVar.getParentLayout()).n) {
            qnVar.s9 = f10;
            qnVar.t9 = f11;
            ih.u2 u2Var = qnVar.F1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.setTranslationY(f10);
                rk rkVar = qnVar.Xa;
                if (rkVar != null) {
                    rkVar.setTranslationY(qnVar.s9 + (qnVar.k1 != null ? r2.getCurrentHeight() : 0));
                }
                kh.x3 x3Var = qnVar.s1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f10);
                }
                kh.x3 x3Var2 = qnVar.r1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = qnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f12 = f10 / 2.0f;
                qnVar.L.setTranslationY(f12);
                int i9 = (int) f10;
                qnVar.T0.setBackgroundTranslation(i9);
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.p0 = f12;
                    ukVar.s();
                }
                kh.h6 h6Var = qnVar.u2;
                if (h6Var != null) {
                    org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) h6Var.b;
                    x9Var.u = f10;
                    x9Var.d.invalidate();
                }
                qnVar.setFragmentPanTranslationOffset(i9);
                qnVar.o9();
                qnVar.r9();
            } else {
                imVar.setNonNoveTranslation(f10);
            }
            qnVar.t0.invalidate();
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
            if (gcVar != null && qnVar.Vb != null) {
                gcVar.l();
            }
            if (AndroidUtilities.isTablet() && (qnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) qnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof dy) {
                    dy dyVar = (dy) lastFragment;
                    dyVar.r1 = f10;
                    dyVar.X4();
                }
            }
            org.telegram.ui.Components.s30 s30Var = qnVar.o2;
            if (s30Var != null && s30Var.getVisibility() == 0) {
                qnVar.o2.f(qnVar.U.getAudioVideoButtonContainer(), false);
            }
            vj vjVar = qnVar.T1;
            if (vjVar == null || (wiVar = vjVar.w0) == null) {
                return;
            }
            wiVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        org.telegram.ui.Components.yd ydVar;
        qn qnVar = this.x.F0;
        ak akVar = qnVar.U;
        if (akVar != null && (ydVar = akVar.q0) != null) {
            ydVar.run();
            akVar.q0 = null;
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.o2;
        if (s30Var == null || s30Var.getVisibility() != 0) {
            return;
        }
        qnVar.o2.f(qnVar.U.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i9, boolean z10) {
        org.telegram.ui.Components.hd hdVar;
        qn qnVar = this.x.F0;
        qnVar.z4 = true;
        ak akVar = qnVar.U;
        if (akVar != null) {
            if (z10 && (hdVar = akVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(hdVar);
                akVar.R.run();
            }
            wq wqVar = akVar.S;
            if (wqVar != null) {
                AndroidUtilities.cancelRunOnUIThread(wqVar);
                akVar.S.run();
            }
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.b2;
        if (s30Var != null) {
            s30Var.b(false);
        }
        kh.x3 x3Var = qnVar.w1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final int i() {
        im imVar = this.x;
        qn qnVar = imVar.F0;
        if (imVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !qnVar.U.s0()) {
            return 0;
        }
        return qnVar.U.getEmojiPadding();
    }
}
