package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.r4 parentLayout = cnVar.getParentLayout();
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
        org.telegram.ui.ActionBar.l lVar;
        fi.m3 m3Var;
        ql qlVar = this.x;
        cn cnVar = qlVar.w0;
        if (cnVar.getParentLayout() == null || !((ActionBarLayout) cnVar.getParentLayout()).n) {
            cnVar.R9 = f10;
            cnVar.S9 = f11;
            di.u2 u2Var = cnVar.X1;
            if (u2Var == null || !u2Var.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                lVar.setTranslationY(f10);
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
                org.telegram.ui.Components.t40 t40Var = cnVar.p3;
                if (t40Var != null) {
                    t40Var.g(f10);
                }
                fi.p5 p5Var = cnVar.M2;
                if (p5Var != null) {
                    org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) p5Var.b;
                    v9Var.u = f10;
                    v9Var.d.invalidate();
                }
                cnVar.setFragmentPanTranslationOffset(i7);
                cnVar.L9();
                cnVar.N9();
            } else {
                qlVar.setNonNoveTranslation(f10);
            }
            cnVar.z0.invalidate();
            org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.w;
            if (bcVar != null && cnVar.Cc != null) {
                bcVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (cnVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) cnVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof zw) {
                    zw zwVar = (zw) lastFragment;
                    zwVar.w1 = f10;
                    zwVar.k5();
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
        org.telegram.ui.Components.zc zcVar;
        cn cnVar = this.x.w0;
        sj sjVar = cnVar.Z;
        if (sjVar != null && (zcVar = sjVar.u0) != null) {
            zcVar.run();
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
        org.telegram.ui.Components.zc zcVar;
        cn cnVar = this.x.w0;
        cnVar.P4 = true;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            if (z9 && (zcVar = sjVar.V) != null) {
                org.telegram.messenger.g0.r(zcVar);
                sjVar.V.run();
            }
            fq fqVar = sjVar.W;
            if (fqVar != null) {
                org.telegram.messenger.g0.r(fqVar);
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
