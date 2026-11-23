package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ol extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ pl x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(pl plVar, pl plVar2) {
        super(plVar2);
        this.x = plVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bn bnVar = this.x.x0;
        org.telegram.ui.ActionBar.r4 parentLayout = bnVar.getParentLayout();
        if (bnVar.mb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
        if (z11 || org.telegram.messenger.g0.E || parentLayout == null || bnVar.Ma > 0 || System.currentTimeMillis() - bnVar.ba < 250) {
            return false;
        }
        if ((bnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.g2) bnVar).isPaused;
        if (z12 || !bnVar.f6) {
            return false;
        }
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null && n2Var.isShowing()) {
            return false;
        }
        rj rjVar = bnVar.a0;
        return rjVar == null || rjVar.getTrendingStickersAlert() == null || !bnVar.a0.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        hi.l3 l3Var;
        pl plVar = this.x;
        bn bnVar = plVar.x0;
        if (bnVar.getParentLayout() == null || !((ActionBarLayout) bnVar.getParentLayout()).n) {
            bnVar.T9 = f10;
            bnVar.U9 = f11;
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var == null || !n2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.setTranslationY(f10);
                ik ikVar = bnVar.Bb;
                if (ikVar != null) {
                    ikVar.setTranslationY(bnVar.T9 + (bnVar.D1 != null ? r2.getCurrentHeight() : 0));
                }
                hi.l3 l3Var2 = bnVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                hi.l3 l3Var3 = bnVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = bnVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                bnVar.R.setTranslationY(f10 / 2.0f);
                int i7 = (int) f10;
                bnVar.m1.setBackgroundTranslation(i7);
                org.telegram.ui.Components.h50 h50Var = bnVar.q3;
                if (h50Var != null) {
                    h50Var.g(f10);
                }
                hi.l5 l5Var = bnVar.N2;
                if (l5Var != null) {
                    org.telegram.ui.Components.aa aaVar = (org.telegram.ui.Components.aa) l5Var.b;
                    aaVar.u = f10;
                    aaVar.d.invalidate();
                }
                bnVar.setFragmentPanTranslationOffset(i7);
                bnVar.M9();
                bnVar.O9();
            } else {
                plVar.setNonNoveTranslation(f10);
            }
            bnVar.A0.invalidate();
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
            if (gcVar != null && bnVar.Ec != null) {
                gcVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (bnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) bnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof cx) {
                    cx cxVar = (cx) lastFragment;
                    cxVar.x1 = f10;
                    cxVar.s5();
                }
            }
            hi.l3 l3Var4 = bnVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.z(bnVar.a0.getAudioVideoButtonContainer(), false);
            }
            mj mjVar = bnVar.m2;
            if (mjVar == null || (l3Var = mjVar.C0) == null) {
                return;
            }
            l3Var.A();
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        org.telegram.ui.Components.dd ddVar;
        bn bnVar = this.x.x0;
        rj rjVar = bnVar.a0;
        if (rjVar != null && (ddVar = rjVar.v0) != null) {
            ddVar.run();
            rjVar.v0 = null;
        }
        hi.l3 l3Var = bnVar.H2;
        if (l3Var == null || !l3Var.W) {
            return;
        }
        l3Var.z(bnVar.a0.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        bn bnVar = this.x.x0;
        bnVar.R4 = true;
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            if (z10 && (tdVar = rjVar.W) != null) {
                org.telegram.messenger.g0.r(tdVar);
                rjVar.W.run();
            }
            eh ehVar = rjVar.a0;
            if (ehVar != null) {
                org.telegram.messenger.g0.r(ehVar);
                rjVar.a0.run();
            }
        }
        hi.l3 l3Var = bnVar.u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        hi.l3 l3Var2 = bnVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final int i() {
        pl plVar = this.x;
        bn bnVar = plVar.x0;
        if (plVar.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) || !bnVar.a0.S0()) {
            return 0;
        }
        return bnVar.a0.getEmojiPadding();
    }
}
