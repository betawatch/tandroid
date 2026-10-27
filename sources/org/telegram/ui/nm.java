package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ om x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(om omVar, om omVar2) {
        super(omVar2);
        this.x = omVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        wn wnVar = this.x.B0;
        org.telegram.ui.ActionBar.j5 parentLayout = wnVar.getParentLayout();
        if (wnVar.fb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.r2) wnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || wnVar.Fa > 0 || System.currentTimeMillis() - wnVar.U9 < 250) {
            return false;
        }
        if ((wnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.r2) wnVar).isPaused;
        if (z12 || !wnVar.d6) {
            return false;
        }
        di.a3 a3Var = wnVar.V1;
        if (a3Var != null && a3Var.isShowing()) {
            return false;
        }
        jk jkVar = wnVar.Y;
        return jkVar == null || jkVar.getTrendingStickersAlert() == null || !wnVar.Y.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.e20 e20Var;
        om omVar = this.x;
        wn wnVar = omVar.B0;
        if (wnVar.getParentLayout() == null || !((ActionBarLayout) wnVar.getParentLayout()).n) {
            wnVar.M9 = f7;
            wnVar.N9 = f10;
            di.a3 a3Var = wnVar.V1;
            if (a3Var == null || !a3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar.setTranslationY(f7);
                zk zkVar = wnVar.Ab;
                if (zkVar != null) {
                    zkVar.setTranslationY(wnVar.M9 + (wnVar.A1 != null ? r2.getCurrentHeight() : 0));
                }
                fi.v3 v3Var = wnVar.I1;
                if (v3Var != null) {
                    v3Var.setTranslationY(f7);
                }
                fi.v3 v3Var2 = wnVar.H1;
                if (v3Var2 != null) {
                    v3Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = wnVar.c1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                wnVar.P.setTranslationY(f7 / 2.0f);
                int i10 = (int) f7;
                wnVar.j1.setBackgroundTranslation(i10);
                org.telegram.ui.Components.u60 u60Var = wnVar.n3;
                if (u60Var != null) {
                    u60Var.f(f7);
                }
                fi.f6 f6Var = wnVar.K2;
                if (f6Var != null) {
                    org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f6Var.b;
                    jaVar.u = f7;
                    jaVar.d.invalidate();
                }
                wnVar.setFragmentPanTranslationOffset(i10);
                wnVar.A9();
                wnVar.C9();
            } else {
                omVar.setNonNoveTranslation(f7);
            }
            wnVar.x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
            if (qcVar != null && wnVar.zc != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (wnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.r2 lastFragment = ((LaunchActivity) wnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ey) {
                    ey eyVar = (ey) lastFragment;
                    eyVar.v1 = f7;
                    eyVar.g5();
                }
            }
            org.telegram.ui.Components.t40 t40Var = wnVar.E2;
            if (t40Var != null && t40Var.getVisibility() == 0) {
                wnVar.E2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
            }
            dk dkVar = wnVar.j2;
            if (dkVar == null || (e20Var = dkVar.B0) == null) {
                return;
            }
            e20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        wn wnVar = this.x.B0;
        jk jkVar = wnVar.Y;
        if (jkVar != null && (ieVar = jkVar.u0) != null) {
            ieVar.run();
            jkVar.u0 = null;
        }
        org.telegram.ui.Components.t40 t40Var = wnVar.E2;
        if (t40Var == null || t40Var.getVisibility() != 0) {
            return;
        }
        wnVar.E2.f(wnVar.Y.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        wn wnVar = this.x.B0;
        wnVar.P4 = true;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            if (z10 && (sdVar = jkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                jkVar.V.run();
            }
            kp kpVar = jkVar.W;
            if (kpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kpVar);
                jkVar.W.run();
            }
        }
        org.telegram.ui.Components.t40 t40Var = wnVar.r2;
        if (t40Var != null) {
            t40Var.b(false);
        }
        fi.v3 v3Var = wnVar.M1;
        if (v3Var != null) {
            v3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final int i() {
        om omVar = this.x;
        wn wnVar = omVar.B0;
        if (omVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !wnVar.Y.p0()) {
            return 0;
        }
        return wnVar.Y.getEmojiPadding();
    }
}
