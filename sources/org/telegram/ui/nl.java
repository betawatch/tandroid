package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class nl extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ ol x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(ol olVar, ol olVar2) {
        super(olVar2);
        this.x = olVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z9;
        boolean z10;
        boolean z11;
        an anVar = this.x.w0;
        org.telegram.ui.ActionBar.q4 parentLayout = anVar.getParentLayout();
        if (anVar.ib) {
            return false;
        }
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (z9) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.f2) anVar).inBubbleMode;
        if (z10 || org.telegram.messenger.g0.E || parentLayout == null || anVar.Ia > 0 || System.currentTimeMillis() - anVar.X9 < 250) {
            return false;
        }
        if ((anVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.f2) anVar).isPaused;
        if (z11 || !anVar.d6) {
            return false;
        }
        di.u2 u2Var = anVar.X1;
        if (u2Var != null && u2Var.isShowing()) {
            return false;
        }
        qj qjVar = anVar.Z;
        return qjVar == null || qjVar.getTrendingStickersAlert() == null || !anVar.Z.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        fi.m3 m3Var;
        ol olVar = this.x;
        an anVar = olVar.w0;
        if (anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).n) {
            anVar.P9 = f10;
            anVar.Q9 = f11;
            di.u2 u2Var = anVar.X1;
            if (u2Var == null || !u2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                kVar.setTranslationY(f10);
                hk hkVar = anVar.xb;
                if (hkVar != null) {
                    hkVar.setTranslationY(anVar.P9 + (anVar.C1 != null ? r2.getCurrentHeight() : 0));
                }
                fi.m3 m3Var2 = anVar.K1;
                if (m3Var2 != null) {
                    m3Var2.setTranslationY(f10);
                }
                fi.m3 m3Var3 = anVar.J1;
                if (m3Var3 != null) {
                    m3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = anVar.e1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                anVar.Q.setTranslationY(f10 / 2.0f);
                int i7 = (int) f10;
                anVar.l1.setBackgroundTranslation(i7);
                org.telegram.ui.Components.t40 t40Var = anVar.p3;
                if (t40Var != null) {
                    t40Var.g(f10);
                }
                fi.p5 p5Var = anVar.M2;
                if (p5Var != null) {
                    org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) p5Var.b;
                    w9Var.u = f10;
                    w9Var.d.invalidate();
                }
                anVar.setFragmentPanTranslationOffset(i7);
                anVar.K9();
                anVar.M9();
            } else {
                olVar.setNonNoveTranslation(f10);
            }
            anVar.z0.invalidate();
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
            if (ccVar != null && anVar.Ac != null) {
                ccVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (anVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) anVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof ww) {
                    ww wwVar = (ww) lastFragment;
                    wwVar.v1 = f10;
                    wwVar.k5();
                }
            }
            fi.m3 m3Var4 = anVar.G2;
            if (m3Var4 != null && m3Var4.V) {
                m3Var4.y(anVar.Z.getAudioVideoButtonContainer(), false);
            }
            lj ljVar = anVar.l2;
            if (ljVar == null || (m3Var = ljVar.B0) == null) {
                return;
            }
            m3Var.z();
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        org.telegram.ui.Components.ad adVar;
        an anVar = this.x.w0;
        qj qjVar = anVar.Z;
        if (qjVar != null && (adVar = qjVar.u0) != null) {
            adVar.run();
            qjVar.u0 = null;
        }
        fi.m3 m3Var = anVar.G2;
        if (m3Var == null || !m3Var.V) {
            return;
        }
        m3Var.y(anVar.Z.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        org.telegram.ui.Components.ad adVar;
        an anVar = this.x.w0;
        anVar.P4 = true;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            if (z9 && (adVar = qjVar.V) != null) {
                org.telegram.messenger.g0.r(adVar);
                qjVar.V.run();
            }
            org.telegram.ui.Components.f fVar = qjVar.W;
            if (fVar != null) {
                org.telegram.messenger.g0.r(fVar);
                qjVar.W.run();
            }
        }
        fi.m3 m3Var = anVar.t2;
        if (m3Var != null) {
            m3Var.f(false);
        }
        fi.m3 m3Var2 = anVar.O1;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final int i() {
        ol olVar = this.x;
        an anVar = olVar.w0;
        if (olVar.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) || !anVar.Z.s0()) {
            return 0;
        }
        return anVar.Z.getEmojiPadding();
    }
}
