package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ km x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.x = kmVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        sn snVar = this.x.J0;
        org.telegram.ui.ActionBar.h5 parentLayout = snVar.getParentLayout();
        if (snVar.bb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || snVar.Ba > 0 || System.currentTimeMillis() - snVar.Q9 < 250) {
            return false;
        }
        if ((snVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.o2) snVar).isPaused;
        if (z12 || !snVar.Z5) {
            return false;
        }
        ci.a3 a3Var = snVar.V1;
        if (a3Var != null && a3Var.isShowing()) {
            return false;
        }
        gk gkVar = snVar.Y;
        return gkVar == null || gkVar.getTrendingStickersAlert() == null || !snVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.c20 c20Var;
        km kmVar = this.x;
        sn snVar = kmVar.J0;
        if (snVar.getParentLayout() == null || !((ActionBarLayout) snVar.getParentLayout()).n) {
            snVar.I9 = f7;
            snVar.J9 = f10;
            ci.a3 a3Var = snVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setTranslationY(f7);
                wk wkVar = snVar.nb;
                if (wkVar != null) {
                    wkVar.setTranslationY(snVar.I9 + (snVar.A1 != null ? r2.getCurrentHeight() : 0));
                }
                ei.x3 x3Var = snVar.I1;
                if (x3Var != null) {
                    x3Var.setTranslationY(f7);
                }
                ei.x3 x3Var2 = snVar.H1;
                if (x3Var2 != null) {
                    x3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = snVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                snVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                snVar.j1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.s60 s60Var = snVar.n3;
                if (s60Var != null) {
                    s60Var.e(f7);
                }
                ei.g6 g6Var = snVar.K2;
                if (g6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) g6Var.b;
                    faVar.u = f7;
                    faVar.d.invalidate();
                }
                snVar.setFragmentPanTranslationOffset(i10);
                snVar.t9();
                snVar.w9();
            } else {
                kmVar.setNonNoveTranslation(f7);
            }
            snVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
            if (qcVar != null && snVar.mc != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (snVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) snVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.v1 = f7;
                    eyVar.W4();
                }
            }
            org.telegram.ui.Components.r40 r40Var = snVar.E2;
            if (r40Var != null && r40Var.getVisibility() == 0) {
                snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
            }
            ak akVar = snVar.j2;
            if (akVar == null || (c20Var = akVar.B0) == null) {
                return;
            }
            c20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        sn snVar = this.x.J0;
        gk gkVar = snVar.Y;
        if (gkVar != null && (ieVar = gkVar.u0) != null) {
            ieVar.run();
            gkVar.u0 = null;
        }
        org.telegram.ui.Components.r40 r40Var = snVar.E2;
        if (r40Var == null || r40Var.getVisibility() != 0) {
            return;
        }
        snVar.E2.f(snVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.rd rdVar;
        sn snVar = this.x.J0;
        snVar.P4 = true;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            if (z10 && (rdVar = gkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                gkVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = gkVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                gkVar.W.run();
            }
        }
        org.telegram.ui.Components.r40 r40Var = snVar.r2;
        if (r40Var != null) {
            r40Var.b(false);
        }
        ei.x3 x3Var = snVar.M1;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final int i() {
        km kmVar = this.x;
        sn snVar = kmVar.J0;
        if (kmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !snVar.Y.q0()) {
            return 0;
        }
        return snVar.Y.getEmojiPadding();
    }
}
