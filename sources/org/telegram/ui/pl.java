package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ ql x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(ql qlVar, ql qlVar2) {
        super(qlVar2);
        this.x = qlVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z9;
        boolean z10;
        boolean z11;
        cn cnVar = this.x.w0;
        org.telegram.ui.ActionBar.q4 parentLayout = cnVar.getParentLayout();
        if (cnVar.kb) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (z9) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.f2) cnVar).inBubbleMode;
        if (z10 || org.telegram.messenger.g0.E || parentLayout == null || cnVar.Ka > 0 || System.currentTimeMillis() - cnVar.Z9 < 250) {
            return false;
        }
        if ((cnVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.f2) cnVar).isPaused;
        if (z11 || !cnVar.d6) {
            return false;
        }
        di.u2 u2Var = cnVar.X1;
        if (u2Var != null && u2Var.isShowing()) {
            return false;
        }
        sj sjVar = cnVar.Z;
        return sjVar == null || sjVar.getTrendingStickersAlert() == null || !cnVar.Z.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        fi.m3 m3Var;
        ql qlVar = this.x;
        cn cnVar = qlVar.w0;
        if (cnVar.getParentLayout() == null || !((ActionBarLayout) cnVar.getParentLayout()).n) {
            cnVar.R9 = f10;
            cnVar.S9 = f11;
            di.u2 u2Var = cnVar.X1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                kVar.setTranslationY(f10);
                jk jkVar = cnVar.zb;
                if (jkVar != null) {
                    jkVar.setTranslationY(cnVar.R9 + (cnVar.C1 != null ? r2.getCurrentHeight() : 0));
                }
                fi.m3 m3Var2 = cnVar.K1;
                if (m3Var2 != null) {
                    m3Var2.setTranslationY(f10);
                }
                fi.m3 m3Var3 = cnVar.J1;
                if (m3Var3 != null) {
                    m3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = cnVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                cnVar.Q.setTranslationY(f10 / 2.0f);
                int i7 = (int) f10;
                cnVar.l1.setBackgroundTranslation(i7);
                org.telegram.ui.Components.u40 u40Var = cnVar.p3;
                if (u40Var != null) {
                    u40Var.g(f10);
                }
                fi.p5 p5Var = cnVar.M2;
                if (p5Var != null) {
                    org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.b;
                    w9Var.u = f10;
                    w9Var.d.invalidate();
                }
                cnVar.setFragmentPanTranslationOffset(i7);
                cnVar.L9();
                cnVar.N9();
            } else {
                qlVar.setNonNoveTranslation(f10);
            }
            cnVar.z0.invalidate();
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
            if (ccVar != null && cnVar.Cc != null) {
                ccVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (cnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) cnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof yw) {
                    yw ywVar = (yw) lastFragment;
                    ywVar.w1 = f10;
                    ywVar.k5();
                }
            }
            fi.m3 m3Var4 = cnVar.G2;
            if (m3Var4 != null && m3Var4.V) {
                m3Var4.y(cnVar.Z.getAudioVideoButtonContainer(), false);
            }
            nj njVar = cnVar.l2;
            if (njVar == null || (m3Var = njVar.B0) == null) {
                return;
            }
            m3Var.z();
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        org.telegram.ui.Components.ad adVar;
        cn cnVar = this.x.w0;
        sj sjVar = cnVar.Z;
        if (sjVar != null && (adVar = sjVar.u0) != null) {
            adVar.run();
            sjVar.u0 = null;
        }
        fi.m3 m3Var = cnVar.G2;
        if (m3Var == null || !m3Var.V) {
            return;
        }
        m3Var.y(cnVar.Z.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        org.telegram.ui.Components.ad adVar;
        cn cnVar = this.x.w0;
        cnVar.P4 = true;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            if (z9 && (adVar = sjVar.V) != null) {
                org.telegram.messenger.g0.r(adVar);
                sjVar.V.run();
            }
            org.telegram.ui.Components.f fVar = sjVar.W;
            if (fVar != null) {
                org.telegram.messenger.g0.r(fVar);
                sjVar.W.run();
            }
        }
        fi.m3 m3Var = cnVar.t2;
        if (m3Var != null) {
            m3Var.f(false);
        }
        fi.m3 m3Var2 = cnVar.O1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final int i() {
        ql qlVar = this.x;
        cn cnVar = qlVar.w0;
        if (qlVar.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) || !cnVar.Z.s0()) {
            return 0;
        }
        return cnVar.Z.getEmojiPadding();
    }
}
