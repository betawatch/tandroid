package org.telegram.ui.ActionBar;

import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
        this.d = actionBarLayout;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.J0 != this) {
            return;
        }
        actionBarLayout.J0 = null;
        boolean z10 = this.a;
        if (z10) {
            actionBarLayout.B0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.L0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.L0 = nanoTime;
        boolean z11 = this.c;
        boolean z12 = this.b;
        float f7 = actionBarLayout.K0 + (j10 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.K0 = f7;
        if (f7 > 1.0f) {
            actionBarLayout.K0 = 1.0f;
        }
        k2 k2Var = actionBarLayout.H;
        if (k2Var != null) {
            k2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        k2 k2Var2 = actionBarLayout.I;
        if (k2Var2 != null) {
            k2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        k2 k2Var3 = actionBarLayout.I;
        Integer valueOf = k2Var3 != null ? Integer.valueOf(k2Var3.getNavigationBarColor()) : null;
        k2 k2Var4 = actionBarLayout.H;
        Integer valueOf2 = k2Var4 != null ? Integer.valueOf(k2Var4.getNavigationBarColor()) : null;
        k2 k2Var5 = actionBarLayout.I;
        if (k2Var5 != null && k2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        k2 k2Var6 = actionBarLayout.H;
        if (k2Var6 != null && k2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.H != null && valueOf != null && valueOf2 != null) {
            int f10 = i0.b.f(w7.u.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    g2 g2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (g2Var.z()) {
                        f10 = g2Var.e(f10);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f10);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.M.getInterpolation(actionBarLayout.K0) : gr.h.getInterpolation(actionBarLayout.K0) : actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        if (z11) {
            float a2 = w7.u.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f11);
                actionBarLayout.s.setScaleY(f11);
                if (actionBarLayout.J != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(org.telegram.messenger.i0.L(40.0f) * f12);
                    actionBarLayout.J.setTranslationY((-org.telegram.messenger.i0.L(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f13);
                    actionBarLayout.J.setScaleY(f13);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                t6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.i0.L(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = w7.u.a(f14, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.w.setScaleX(f15);
                actionBarLayout.w.setScaleY(f15);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    t6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.w.setTranslationX(org.telegram.messenger.i0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.g0(z11, false, z12);
        } else {
            actionBarLayout.G(false);
        }
    }
}
