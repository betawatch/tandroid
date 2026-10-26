package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ mm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(mm mmVar, mm mmVar2) {
        super(mmVar2);
        this.x = mmVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        un unVar = this.x.B0;
        org.telegram.ui.ActionBar.j5 parentLayout = unVar.getParentLayout();
        if (unVar.bb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.r2) unVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || unVar.Ba > 0 || System.currentTimeMillis() - unVar.Q9 < 250) {
            return false;
        }
        if ((unVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.r2) unVar).isPaused;
        if (z12 || !unVar.Z5) {
            return false;
        }
        di.a3 a3Var = unVar.V1;
        if (a3Var != null && a3Var.isShowing()) {
            return false;
        }
        hk hkVar = unVar.Y;
        return hkVar == null || hkVar.getTrendingStickersAlert() == null || !unVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.e20 e20Var;
        mm mmVar = this.x;
        un unVar = mmVar.B0;
        if (unVar.getParentLayout() == null || !((ActionBarLayout) unVar.getParentLayout()).n) {
            unVar.I9 = f7;
            unVar.J9 = f10;
            di.a3 a3Var = unVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.setTranslationY(f7);
                xk xkVar = unVar.wb;
                if (xkVar != null) {
                    xkVar.setTranslationY(unVar.I9 + (unVar.A1 != null ? r2.getCurrentHeight() : 0));
                }
                fi.v3 v3Var = unVar.I1;
                if (v3Var != null) {
                    v3Var.setTranslationY(f7);
                }
                fi.v3 v3Var2 = unVar.H1;
                if (v3Var2 != null) {
                    v3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = unVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                unVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                unVar.j1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.t60 t60Var = unVar.n3;
                if (t60Var != null) {
                    t60Var.e(f7);
                }
                fi.f6 f6Var = unVar.K2;
                if (f6Var != null) {
                    org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.b;
                    jaVar.u = f7;
                    jaVar.d.invalidate();
                }
                unVar.setFragmentPanTranslationOffset(i10);
                unVar.x9();
                unVar.z9();
            } else {
                mmVar.setNonNoveTranslation(f7);
            }
            unVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
            if (qcVar != null && unVar.vc != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (unVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.r2 lastFragment = ((LaunchActivity) unVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof cy) {
                    cy cyVar = (cy) lastFragment;
                    cyVar.v1 = f7;
                    cyVar.g5();
                }
            }
            org.telegram.ui.Components.t40 t40Var = unVar.E2;
            if (t40Var != null && t40Var.getVisibility() == 0) {
                unVar.E2.f(unVar.Y.getAudioVideoButtonContainer(), false);
            }
            bk bkVar = unVar.j2;
            if (bkVar == null || (e20Var = bkVar.B0) == null) {
                return;
            }
            e20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        un unVar = this.x.B0;
        hk hkVar = unVar.Y;
        if (hkVar != null && (ieVar = hkVar.u0) != null) {
            ieVar.run();
            hkVar.u0 = null;
        }
        org.telegram.ui.Components.t40 t40Var = unVar.E2;
        if (t40Var == null || t40Var.getVisibility() != 0) {
            return;
        }
        unVar.E2.f(unVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        un unVar = this.x.B0;
        unVar.P4 = true;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            if (z10 && (sdVar = hkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                hkVar.V.run();
            }
            ip ipVar = hkVar.W;
            if (ipVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ipVar);
                hkVar.W.run();
            }
        }
        org.telegram.ui.Components.t40 t40Var = unVar.r2;
        if (t40Var != null) {
            t40Var.b(false);
        }
        fi.v3 v3Var = unVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final int i() {
        mm mmVar = this.x;
        un unVar = mmVar.B0;
        if (mmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !unVar.Y.q0()) {
            return 0;
        }
        return unVar.Y.getEmojiPadding();
    }
}
