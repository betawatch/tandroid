package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        if (actionBarLayout.D0 != this) {
            return;
        }
        actionBarLayout.D0 = null;
        boolean z10 = this.a;
        if (z10) {
            actionBarLayout.v0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.F0;
        if (j3 > 40 && z10) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.F0 = nanoTime;
        boolean z11 = this.c;
        boolean z12 = this.b;
        float f7 = actionBarLayout.E0 + (j3 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.E0 = f7;
        if (f7 > 1.0f) {
            actionBarLayout.E0 = 1.0f;
        }
        n2 n2Var = actionBarLayout.H;
        if (n2Var != null) {
            n2Var.onTransitionAnimationProgress(true, actionBarLayout.E0);
        }
        n2 n2Var2 = actionBarLayout.I;
        if (n2Var2 != null) {
            n2Var2.onTransitionAnimationProgress(false, actionBarLayout.E0);
        }
        n2 n2Var3 = actionBarLayout.I;
        Integer valueOf = n2Var3 != null ? Integer.valueOf(n2Var3.getNavigationBarColor()) : null;
        n2 n2Var4 = actionBarLayout.H;
        Integer valueOf2 = n2Var4 != null ? Integer.valueOf(n2Var4.getNavigationBarColor()) : null;
        n2 n2Var5 = actionBarLayout.I;
        if (n2Var5 != null && n2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        n2 n2Var6 = actionBarLayout.H;
        if (n2Var6 != null && n2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.H != null && valueOf != null && valueOf2 != null) {
            int d = i0.a.d(w7.p.a(actionBarLayout.E0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    j2 j2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (j2Var.attachedToParent()) {
                        d = j2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(d);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.M.getInterpolation(actionBarLayout.E0) : pr.h.getInterpolation(actionBarLayout.E0) : actionBarLayout.L.getInterpolation(actionBarLayout.E0);
        if (z11) {
            float a2 = w7.p.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z12) {
                float f10 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f10);
                actionBarLayout.s.setScaleY(f10);
                if (actionBarLayout.J != null) {
                    float f11 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                    actionBarLayout.J.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                    float f12 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.J.setScaleX(f12);
                    actionBarLayout.J.setScaleY(f12);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                j6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f13 = 1.0f - interpolation;
            float a10 = w7.p.a(f13, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f14 = (f13 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f14);
                actionBarLayout.v.setScaleY(f14);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    j6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.E0 < 1.0f) {
            actionBarLayout.d0(z11, false, z12);
        } else {
            actionBarLayout.F(false);
        }
    }
}
