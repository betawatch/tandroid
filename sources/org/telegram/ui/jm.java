package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ km x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.x = kmVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        tn tnVar = this.x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = tnVar.getParentLayout();
        if (tnVar.Ka) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || tnVar.la > 0 || System.currentTimeMillis() - tnVar.A9 < 250) {
            return false;
        }
        if ((tnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.o2) tnVar).isPaused;
        if (z12 || !tnVar.J5) {
            return false;
        }
        lh.s2 s2Var = tnVar.F1;
        if (s2Var != null && s2Var.isShowing()) {
            return false;
        }
        dk dkVar = tnVar.U;
        return dkVar == null || dkVar.getTrendingStickersAlert() == null || !tnVar.U.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f9, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        zi ziVar;
        km kmVar = this.x;
        tn tnVar = kmVar.F0;
        if (tnVar.getParentLayout() == null || !((ActionBarLayout) tnVar.getParentLayout()).n) {
            tnVar.s9 = f9;
            tnVar.t9 = f10;
            lh.s2 s2Var = tnVar.F1;
            if (s2Var == null || !s2Var.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.setTranslationY(f9);
                uk ukVar = tnVar.Xa;
                if (ukVar != null) {
                    ukVar.setTranslationY(tnVar.s9 + (tnVar.k1 != null ? r2.getCurrentHeight() : 0));
                }
                nh.t3 t3Var = tnVar.s1;
                if (t3Var != null) {
                    t3Var.setTranslationY(f9);
                }
                nh.t3 t3Var2 = tnVar.r1;
                if (t3Var2 != null) {
                    t3Var2.setTranslationY(f9);
                }
                org.telegram.ui.Components.m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.setTranslationY(f9);
                }
                FrameLayout frameLayout = tnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f9 / 2.0f);
                }
                float f11 = f9 / 2.0f;
                tnVar.L.setTranslationY(f11);
                int i10 = (int) f9;
                tnVar.T0.setBackgroundTranslation(i10);
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.p0 = f11;
                    xkVar.s();
                }
                cg.i0 i0Var = tnVar.u2;
                if (i0Var != null) {
                    org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) i0Var.b;
                    caVar.u = f9;
                    caVar.d.invalidate();
                }
                tnVar.setFragmentPanTranslationOffset(i10);
                tnVar.o9();
                tnVar.r9();
            } else {
                kmVar.setNonNoveTranslation(f9);
            }
            tnVar.t0.invalidate();
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
            if (mcVar != null && tnVar.Vb != null) {
                mcVar.l();
            }
            if (AndroidUtilities.isTablet() && (tnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) tnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof fy) {
                    fy fyVar = (fy) lastFragment;
                    fyVar.r1 = f9;
                    fyVar.X4();
                }
            }
            org.telegram.ui.Components.g40 g40Var = tnVar.o2;
            if (g40Var != null && g40Var.getVisibility() == 0) {
                tnVar.o2.f(tnVar.U.getAudioVideoButtonContainer(), false);
            }
            yj yjVar = tnVar.T1;
            if (yjVar == null || (ziVar = yjVar.w0) == null) {
                return;
            }
            ziVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f9);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        org.telegram.ui.Components.be beVar;
        tn tnVar = this.x.F0;
        dk dkVar = tnVar.U;
        if (dkVar != null && (beVar = dkVar.q0) != null) {
            beVar.run();
            dkVar.q0 = null;
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.o2;
        if (g40Var == null || g40Var.getVisibility() != 0) {
            return;
        }
        tnVar.o2.f(tnVar.U.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.ld ldVar;
        tn tnVar = this.x.F0;
        tnVar.z4 = true;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            if (z10 && (ldVar = dkVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(ldVar);
                dkVar.R.run();
            }
            org.telegram.ui.Components.z2 z2Var = dkVar.S;
            if (z2Var != null) {
                AndroidUtilities.cancelRunOnUIThread(z2Var);
                dkVar.S.run();
            }
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.b2;
        if (g40Var != null) {
            g40Var.b(false);
        }
        nh.t3 t3Var = tnVar.w1;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final int i() {
        km kmVar = this.x;
        tn tnVar = kmVar.F0;
        if (kmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !tnVar.U.t0()) {
            return 0;
        }
        return tnVar.U.getEmojiPadding();
    }
}
