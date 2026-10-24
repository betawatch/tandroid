package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class s implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z10, boolean z11, boolean z12) {
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
        o2 o2Var = actionBarLayout.H;
        if (o2Var != null) {
            o2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        o2 o2Var2 = actionBarLayout.I;
        if (o2Var2 != null) {
            o2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        o2 o2Var3 = actionBarLayout.I;
        Integer valueOf = o2Var3 != null ? Integer.valueOf(o2Var3.getNavigationBarColor()) : null;
        o2 o2Var4 = actionBarLayout.H;
        Integer valueOf2 = o2Var4 != null ? Integer.valueOf(o2Var4.getNavigationBarColor()) : null;
        o2 o2Var5 = actionBarLayout.I;
        if (o2Var5 != null && o2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        o2 o2Var6 = actionBarLayout.H;
        if (o2Var6 != null && o2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.H != null && valueOf != null && valueOf2 != null) {
            int f10 = i0.a.f(w7.r.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            r rVar = actionBarLayout.G;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    k2 k2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (k2Var.attachedToParent()) {
                        f10 = k2Var.getNavigationBarColor(f10);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f10);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.M.getInterpolation(actionBarLayout.K0) : bs.h.getInterpolation(actionBarLayout.K0) : actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        if (z11) {
            float a2 = w7.r.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f11);
                actionBarLayout.s.setScaleY(f11);
                if (actionBarLayout.J != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f13);
                    actionBarLayout.J.setScaleY(f13);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                k6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = w7.r.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    k6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.f0(z11, false, z12);
        } else {
            actionBarLayout.G(false);
        }
    }
}
