package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ km x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, km kmVar2) {
        super(kmVar2);
        this.x = kmVar;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        un unVar = this.x.w0;
        org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
        if (unVar.ib) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
        if (z11 || org.telegram.messenger.i0.E || parentLayout == null || unVar.Ia > 0 || System.currentTimeMillis() - unVar.X9 < 250) {
            return false;
        }
        if ((unVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.k2) unVar).isPaused;
        if (z12 || !unVar.d6) {
            return false;
        }
        ag.v vVar = unVar.X1;
        if (vVar != null && vVar.isShowing()) {
            return false;
        }
        mk mkVar = unVar.Z;
        return mkVar == null || mkVar.getTrendingStickersAlert() == null || !unVar.Z.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.z00 z00Var;
        km kmVar = this.x;
        un unVar = kmVar.w0;
        if (unVar.getParentLayout() == null || !((ActionBarLayout) unVar.getParentLayout()).n) {
            unVar.P9 = f7;
            unVar.Q9 = f10;
            ag.v vVar = unVar.X1;
            if (vVar == null || !vVar.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                lVar.setTranslationY(f7);
                dl dlVar = unVar.wb;
                if (dlVar != null) {
                    dlVar.setTranslationY(unVar.P9 + (unVar.C1 != null ? r2.getCurrentHeight() : 0));
                }
                vh.p2 p2Var = unVar.K1;
                if (p2Var != null) {
                    p2Var.setTranslationY(f7);
                }
                vh.p2 p2Var2 = unVar.J1;
                if (p2Var2 != null) {
                    p2Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = unVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                unVar.Q.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                unVar.l1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.j50 j50Var = unVar.p3;
                if (j50Var != null) {
                    j50Var.f(f7);
                }
                kg.f0 f0Var = unVar.M2;
                if (f0Var != null) {
                    org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) f0Var.b;
                    q9Var.u = f7;
                    q9Var.d.invalidate();
                }
                unVar.setFragmentPanTranslationOffset(i10);
                unVar.A9();
                unVar.C9();
            } else {
                kmVar.setNonNoveTranslation(f7);
            }
            unVar.z0.invalidate();
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.w;
            if (wbVar != null && unVar.uc != null) {
                wbVar.l();
            }
            if (org.telegram.messenger.i0.Q1() && (unVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.k2 lastFragment = ((LaunchActivity) unVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof ay) {
                    ay ayVar = (ay) lastFragment;
                    ayVar.v1 = f7;
                    ayVar.j5();
                }
            }
            org.telegram.ui.Components.q30 q30Var = unVar.G2;
            if (q30Var != null && q30Var.getVisibility() == 0) {
                unVar.G2.f(unVar.Z.getAudioVideoButtonContainer(), false);
            }
            gk gkVar = unVar.l2;
            if (gkVar == null || (z00Var = gkVar.B0) == null) {
                return;
            }
            z00Var.setExtraTranslationY(org.telegram.messenger.i0.L(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void f() {
        org.telegram.ui.Components.tc tcVar;
        un unVar = this.x.w0;
        mk mkVar = unVar.Z;
        if (mkVar != null && (tcVar = mkVar.u0) != null) {
            tcVar.run();
            mkVar.u0 = null;
        }
        org.telegram.ui.Components.q30 q30Var = unVar.G2;
        if (q30Var == null || q30Var.getVisibility() != 0) {
            return;
        }
        unVar.G2.f(unVar.Z.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.tc tcVar;
        un unVar = this.x.w0;
        unVar.P4 = true;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            if (z10 && (tcVar = mkVar.V) != null) {
                org.telegram.messenger.i0.r(tcVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.cd cdVar = mkVar.W;
            if (cdVar != null) {
                org.telegram.messenger.i0.r(cdVar);
                mkVar.W.run();
            }
        }
        org.telegram.ui.Components.q30 q30Var = unVar.t2;
        if (q30Var != null) {
            q30Var.b(false);
        }
        vh.p2 p2Var = unVar.O1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final int i() {
        km kmVar = this.x;
        un unVar = kmVar.w0;
        if (kmVar.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f) || !unVar.Z.q0()) {
            return 0;
        }
        return unVar.Z.getEmojiPadding();
    }
}
