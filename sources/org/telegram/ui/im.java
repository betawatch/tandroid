package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ jm x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar, jm jmVar2) {
        super(jmVar2);
        this.x = jmVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        rn rnVar = this.x.F0;
        org.telegram.ui.ActionBar.b5 parentLayout = rnVar.getParentLayout();
        if (rnVar.Ka) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode;
        if (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null || rnVar.la > 0 || System.currentTimeMillis() - rnVar.A9 < 250) {
            return false;
        }
        if ((rnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).A()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.n2) rnVar).isPaused;
        if (z12 || !rnVar.J5) {
            return false;
        }
        jh.t2 t2Var = rnVar.F1;
        if (t2Var != null && t2Var.isShowing()) {
            return false;
        }
        ck ckVar = rnVar.U;
        return ckVar == null || ckVar.getTrendingStickersAlert() == null || !rnVar.U.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        yi yiVar;
        jm jmVar = this.x;
        rn rnVar = jmVar.F0;
        if (rnVar.getParentLayout() == null || !((ActionBarLayout) rnVar.getParentLayout()).n) {
            rnVar.s9 = f10;
            rnVar.t9 = f11;
            jh.t2 t2Var = rnVar.F1;
            if (t2Var == null || !t2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar;
                kVar.setTranslationY(f10);
                tk tkVar = rnVar.Xa;
                if (tkVar != null) {
                    tkVar.setTranslationY(rnVar.s9 + (rnVar.k1 != null ? r2.getCurrentHeight() : 0));
                }
                lh.w3 w3Var = rnVar.s1;
                if (w3Var != null) {
                    w3Var.setTranslationY(f10);
                }
                lh.w3 w3Var2 = rnVar.r1;
                if (w3Var2 != null) {
                    w3Var2.setTranslationY(f10);
                }
                org.telegram.ui.Components.d21 d21Var = rnVar.N1;
                if (d21Var != null) {
                    d21Var.setTranslationY(f10);
                }
                FrameLayout frameLayout = rnVar.M0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                float f12 = f10 / 2.0f;
                rnVar.L.setTranslationY(f12);
                int i10 = (int) f10;
                rnVar.T0.setBackgroundTranslation(i10);
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    wkVar.p0 = f12;
                    wkVar.s();
                }
                ag.t0 t0Var = rnVar.u2;
                if (t0Var != null) {
                    org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) t0Var.b;
                    v9Var.u = f10;
                    v9Var.d.invalidate();
                }
                rnVar.setFragmentPanTranslationOffset(i10);
                rnVar.o9();
                rnVar.r9();
            } else {
                jmVar.setNonNoveTranslation(f10);
            }
            rnVar.t0.invalidate();
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
            if (ecVar != null && rnVar.Vb != null) {
                ecVar.l();
            }
            if (AndroidUtilities.isTablet() && (rnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) rnVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof gy) {
                    gy gyVar = (gy) lastFragment;
                    gyVar.r1 = f10;
                    gyVar.X4();
                }
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.o2;
            if (x30Var != null && x30Var.getVisibility() == 0) {
                rnVar.o2.f(rnVar.U.getAudioVideoButtonContainer(), false);
            }
            xj xjVar = rnVar.T1;
            if (xjVar == null || (yiVar = xjVar.w0) == null) {
                return;
            }
            yiVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
        org.telegram.ui.Components.ud udVar;
        rn rnVar = this.x.F0;
        ck ckVar = rnVar.U;
        if (ckVar != null && (udVar = ckVar.q0) != null) {
            udVar.run();
            ckVar.q0 = null;
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.o2;
        if (x30Var == null || x30Var.getVisibility() != 0) {
            return;
        }
        rnVar.o2.f(rnVar.U.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.ed edVar;
        rn rnVar = this.x.F0;
        rnVar.z4 = true;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            if (z10 && (edVar = ckVar.R) != null) {
                AndroidUtilities.cancelRunOnUIThread(edVar);
                ckVar.R.run();
            }
            yq yqVar = ckVar.S;
            if (yqVar != null) {
                AndroidUtilities.cancelRunOnUIThread(yqVar);
                ckVar.S.run();
            }
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.b2;
        if (x30Var != null) {
            x30Var.b(false);
        }
        lh.w3 w3Var = rnVar.w1;
        if (w3Var != null) {
            w3Var.e(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final int i() {
        jm jmVar = this.x;
        rn rnVar = jmVar.F0;
        if (jmVar.getKeyboardHeight() > AndroidUtilities.dp(20.0f) || !rnVar.U.t0()) {
            return 0;
        }
        return rnVar.U.getEmojiPadding();
    }
}
