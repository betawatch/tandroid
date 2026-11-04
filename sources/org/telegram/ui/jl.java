package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jl extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ kl x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(kl klVar, kl klVar2) {
        super(klVar2);
        this.x = klVar;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        wm wmVar = this.x.x0;
        org.telegram.ui.ActionBar.q4 parentLayout = wmVar.getParentLayout();
        if (wmVar.jb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
        if (z11 || org.telegram.messenger.g0.E || parentLayout == null || wmVar.Ja > 0 || System.currentTimeMillis() - wmVar.Y9 < 250) {
            return false;
        }
        if ((wmVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.d2) wmVar).isPaused;
        if (z12 || !wmVar.e6) {
            return false;
        }
        ei.x2 x2Var = wmVar.Y1;
        if (x2Var != null && x2Var.isShowing()) {
            return false;
        }
        mj mjVar = wmVar.a0;
        return mjVar == null || mjVar.getTrendingStickersAlert() == null || !wmVar.a0.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        gi.l3 l3Var;
        kl klVar = this.x;
        wm wmVar = klVar.x0;
        if (wmVar.getParentLayout() == null || !((ActionBarLayout) wmVar.getParentLayout()).n) {
            wmVar.Q9 = f10;
            wmVar.R9 = f11;
            ei.x2 x2Var = wmVar.Y1;
            if (x2Var == null || !x2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                kVar.setTranslationY(f10);
                dk dkVar = wmVar.yb;
                if (dkVar != null) {
                    dkVar.setTranslationY(wmVar.Q9 + (wmVar.D1 != null ? r2.getCurrentHeight() : 0));
                }
                gi.l3 l3Var2 = wmVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                gi.l3 l3Var3 = wmVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = wmVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                wmVar.R.setTranslationY(f10 / 2.0f);
                int i3 = (int) f10;
                wmVar.m1.setBackgroundTranslation(i3);
                org.telegram.ui.Components.p40 p40Var = wmVar.q3;
                if (p40Var != null) {
                    p40Var.f(f10);
                }
                gi.n5 n5Var = wmVar.N2;
                if (n5Var != null) {
                    org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) n5Var.b;
                    v9Var.u = f10;
                    v9Var.d.invalidate();
                }
                wmVar.setFragmentPanTranslationOffset(i3);
                wmVar.K9();
                wmVar.M9();
            } else {
                klVar.setNonNoveTranslation(f10);
            }
            wmVar.A0.invalidate();
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
            if (acVar != null && wmVar.Bc != null) {
                acVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (wmVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.d2 lastFragment = ((LaunchActivity) wmVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof uw) {
                    uw uwVar = (uw) lastFragment;
                    uwVar.w1 = f10;
                    uwVar.k5();
                }
            }
            gi.l3 l3Var4 = wmVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.y(wmVar.a0.getAudioVideoButtonContainer(), false);
            }
            hj hjVar = wmVar.m2;
            if (hjVar == null || (l3Var = hjVar.C0) == null) {
                return;
            }
            l3Var.z();
        }
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void f() {
        org.telegram.ui.Components.yc ycVar;
        wm wmVar = this.x.x0;
        mj mjVar = wmVar.a0;
        if (mjVar != null && (ycVar = mjVar.v0) != null) {
            ycVar.run();
            mjVar.v0 = null;
        }
        gi.l3 l3Var = wmVar.H2;
        if (l3Var == null || !l3Var.W) {
            return;
        }
        l3Var.y(wmVar.a0.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void g(int i3, boolean z10) {
        org.telegram.ui.Components.yc ycVar;
        wm wmVar = this.x.x0;
        wmVar.Q4 = true;
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            if (z10 && (ycVar = mjVar.W) != null) {
                org.telegram.messenger.g0.r(ycVar);
                mjVar.W.run();
            }
            lo loVar = mjVar.a0;
            if (loVar != null) {
                org.telegram.messenger.g0.r(loVar);
                mjVar.a0.run();
            }
        }
        gi.l3 l3Var = wmVar.u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        gi.l3 l3Var2 = wmVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final int i() {
        kl klVar = this.x;
        wm wmVar = klVar.x0;
        if (klVar.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) || !wmVar.a0.r0()) {
            return 0;
        }
        return wmVar.a0.getEmojiPadding();
    }
}
