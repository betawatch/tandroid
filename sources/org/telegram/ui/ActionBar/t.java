package org.telegram.ui.ActionBar;

import c8.j9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public t(ActionBarLayout actionBarLayout, boolean z9, boolean z10, boolean z11) {
        this.d = actionBarLayout;
        this.a = z9;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.J0 != this) {
            return;
        }
        actionBarLayout.J0 = null;
        boolean z9 = this.a;
        if (z9) {
            actionBarLayout.B0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.L0;
        if (j3 > 40 && z9) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.L0 = nanoTime;
        boolean z10 = this.c;
        boolean z11 = this.b;
        float f10 = actionBarLayout.K0 + (j3 / ((z11 && z10) ? 190.0f : 150.0f));
        actionBarLayout.K0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.K0 = 1.0f;
        }
        f2 f2Var = actionBarLayout.H;
        if (f2Var != null) {
            f2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        f2 f2Var2 = actionBarLayout.I;
        if (f2Var2 != null) {
            f2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        f2 f2Var3 = actionBarLayout.I;
        Integer valueOf = f2Var3 != null ? Integer.valueOf(f2Var3.getNavigationBarColor()) : null;
        f2 f2Var4 = actionBarLayout.H;
        Integer valueOf2 = f2Var4 != null ? Integer.valueOf(f2Var4.getNavigationBarColor()) : null;
        f2 f2Var5 = actionBarLayout.I;
        if (f2Var5 != null && f2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        f2 f2Var6 = actionBarLayout.H;
        if (f2Var6 != null && f2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.H != null && valueOf != null && valueOf2 != null) {
            int f11 = i0.a.f(j9.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i7 = 0; i7 < actionBarLayout.G.sheetsStack.size(); i7++) {
                    b2 b2Var = actionBarLayout.G.sheetsStack.get(i7);
                    if (b2Var.y()) {
                        f11 = b2Var.e(f11);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f11);
        }
        float interpolation = z11 ? z10 ? actionBarLayout.M.getInterpolation(actionBarLayout.K0) : xq.h.getInterpolation(actionBarLayout.K0) : actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        if (z10) {
            float a10 = j9.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a10);
            if (z11) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f12);
                actionBarLayout.s.setScaleY(f12);
                if (actionBarLayout.J != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f13);
                    actionBarLayout.J.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f14);
                    actionBarLayout.J.setScaleY(f14);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                k6.s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a11 = j9.a(f15, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a11);
            if (z11) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.w.setScaleX(f16);
                actionBarLayout.w.setScaleY(f16);
                actionBarLayout.r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.J == null) {
                    k6.s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.h0(z10, false, z11);
        } else {
            actionBarLayout.H(false);
        }
    }
}
