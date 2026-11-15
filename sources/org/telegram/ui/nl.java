package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        boolean z10;
        boolean z11;
        boolean z12;
        an anVar = this.x.x0;
        org.telegram.ui.ActionBar.o4 parentLayout = anVar.getParentLayout();
        if (anVar.lb) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (z10) {
            return false;
        }
        z11 = ((org.telegram.ui.ActionBar.e2) anVar).inBubbleMode;
        if (z11 || org.telegram.messenger.g0.E || parentLayout == null || anVar.La > 0 || System.currentTimeMillis() - anVar.aa < 250) {
            return false;
        }
        if ((anVar == parentLayout.getLastFragment() && ((ActionBarLayout) parentLayout).B()) || ((ActionBarLayout) parentLayout).n) {
            return false;
        }
        z12 = ((org.telegram.ui.ActionBar.e2) anVar).isPaused;
        if (z12 || !anVar.e6) {
            return false;
        }
        fi.p2 p2Var = anVar.Y1;
        if (p2Var != null && p2Var.isShowing()) {
            return false;
        }
        qj qjVar = anVar.a0;
        return qjVar == null || qjVar.getTrendingStickersAlert() == null || !anVar.a0.getTrendingStickersAlert().isShowing();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        hi.l3 l3Var;
        ol olVar = this.x;
        an anVar = olVar.x0;
        if (anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).n) {
            anVar.S9 = f10;
            anVar.T9 = f11;
            fi.p2 p2Var = anVar.Y1;
            if (p2Var == null || !p2Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                kVar.setTranslationY(f10);
                hk hkVar = anVar.Ab;
                if (hkVar != null) {
                    hkVar.setTranslationY(anVar.S9 + (anVar.D1 != null ? r2.getCurrentHeight() : 0));
                }
                hi.l3 l3Var2 = anVar.L1;
                if (l3Var2 != null) {
                    l3Var2.setTranslationY(f10);
                }
                hi.l3 l3Var3 = anVar.K1;
                if (l3Var3 != null) {
                    l3Var3.setTranslationY(f10);
                }
                FrameLayout frameLayout = anVar.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f10 / 2.0f);
                }
                anVar.R.setTranslationY(f10 / 2.0f);
                int i7 = (int) f10;
                anVar.m1.setBackgroundTranslation(i7);
                org.telegram.ui.Components.w40 w40Var = anVar.q3;
                if (w40Var != null) {
                    w40Var.g(f10);
                }
                hi.n5 n5Var = anVar.N2;
                if (n5Var != null) {
                    org.telegram.ui.Components.s9 s9Var = (org.telegram.ui.Components.s9) n5Var.b;
                    s9Var.u = f10;
                    s9Var.d.invalidate();
                }
                anVar.setFragmentPanTranslationOffset(i7);
                anVar.M9();
                anVar.O9();
            } else {
                olVar.setNonNoveTranslation(f10);
            }
            anVar.A0.invalidate();
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
            if (xbVar != null && anVar.Dc != null) {
                xbVar.l();
            }
            if (org.telegram.messenger.g0.Q1() && (anVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.e2 lastFragment = ((LaunchActivity) anVar.getParentActivity()).M().getLastFragment();
                if (lastFragment instanceof yw) {
                    yw ywVar = (yw) lastFragment;
                    ywVar.x1 = f10;
                    ywVar.k5();
                }
            }
            hi.l3 l3Var4 = anVar.H2;
            if (l3Var4 != null && l3Var4.W) {
                l3Var4.y(anVar.a0.getAudioVideoButtonContainer(), false);
            }
            lj ljVar = anVar.m2;
            if (ljVar == null || (l3Var = ljVar.C0) == null) {
                return;
            }
            l3Var.z();
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        org.telegram.ui.Components.nd ndVar;
        an anVar = this.x.x0;
        qj qjVar = anVar.a0;
        if (qjVar != null && (ndVar = qjVar.v0) != null) {
            ndVar.run();
            qjVar.v0 = null;
        }
        hi.l3 l3Var = anVar.H2;
        if (l3Var == null || !l3Var.W) {
            return;
        }
        l3Var.y(anVar.a0.getAudioVideoButtonContainer(), false);
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        org.telegram.ui.Components.nd ndVar;
        an anVar = this.x.x0;
        anVar.Q4 = true;
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            if (z10 && (ndVar = qjVar.W) != null) {
                org.telegram.messenger.g0.r(ndVar);
                qjVar.W.run();
            }
            org.telegram.ui.Components.od odVar = qjVar.a0;
            if (odVar != null) {
                org.telegram.messenger.g0.r(odVar);
                qjVar.a0.run();
            }
        }
        hi.l3 l3Var = anVar.u2;
        if (l3Var != null) {
            l3Var.f(false);
        }
        hi.l3 l3Var2 = anVar.P1;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final int i() {
        ol olVar = this.x;
        an anVar = olVar.x0;
        if (olVar.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f) || !anVar.a0.G0()) {
            return 0;
        }
        return anVar.a0.getEmojiPadding();
    }
}
