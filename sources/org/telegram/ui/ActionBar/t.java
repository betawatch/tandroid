package org.telegram.ui.ActionBar;

import a8.ee;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        r2 r2Var = actionBarLayout.H;
        if (r2Var != null) {
            r2Var.onTransitionAnimationProgress(true, actionBarLayout.K0);
        }
        r2 r2Var2 = actionBarLayout.I;
        if (r2Var2 != null) {
            r2Var2.onTransitionAnimationProgress(false, actionBarLayout.K0);
        }
        r2 r2Var3 = actionBarLayout.I;
        Integer valueOf = r2Var3 != null ? Integer.valueOf(r2Var3.getNavigationBarColor()) : null;
        r2 r2Var4 = actionBarLayout.H;
        Integer valueOf2 = r2Var4 != null ? Integer.valueOf(r2Var4.getNavigationBarColor()) : null;
        r2 r2Var5 = actionBarLayout.I;
        if (r2Var5 != null && r2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        r2 r2Var6 = actionBarLayout.H;
        if (r2Var6 != null && r2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.H != null && valueOf != null && valueOf2 != null) {
            int f10 = i0.a.f(ee.a(actionBarLayout.K0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.G.sheetsStack.size(); i10++) {
                    n2 n2Var = actionBarLayout.G.sheetsStack.get(i10);
                    if (n2Var.attachedToParent()) {
                        f10 = n2Var.getNavigationBarColor(f10);
                    }
                }
            }
            actionBarLayout.H.setNavigationBarColor(f10);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.M.getInterpolation(actionBarLayout.K0) : ds.h.getInterpolation(actionBarLayout.K0) : actionBarLayout.L.getInterpolation(actionBarLayout.K0);
        if (z11) {
            float a2 = ee.a(interpolation, 0.0f, 1.0f);
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
                y6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = ee.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.J == null) {
                    y6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.K0 < 1.0f) {
            actionBarLayout.g0(z11, false, z12);
        } else {
            actionBarLayout.G(false);
        }
    }
}
