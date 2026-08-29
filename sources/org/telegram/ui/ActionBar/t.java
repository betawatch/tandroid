package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        if (actionBarLayout.z0 != this) {
            return;
        }
        actionBarLayout.z0 = null;
        boolean z10 = this.a;
        if (z10) {
            actionBarLayout.r0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.B0;
        if (j10 > 40 && z10) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.B0 = nanoTime;
        boolean z11 = this.c;
        boolean z12 = this.b;
        float f9 = actionBarLayout.A0 + (j10 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.A0 = f9;
        if (f9 > 1.0f) {
            actionBarLayout.A0 = 1.0f;
        }
        o2 o2Var = actionBarLayout.D;
        if (o2Var != null) {
            o2Var.onTransitionAnimationProgress(true, actionBarLayout.A0);
        }
        o2 o2Var2 = actionBarLayout.E;
        if (o2Var2 != null) {
            o2Var2.onTransitionAnimationProgress(false, actionBarLayout.A0);
        }
        o2 o2Var3 = actionBarLayout.E;
        Integer valueOf = o2Var3 != null ? Integer.valueOf(o2Var3.getNavigationBarColor()) : null;
        o2 o2Var4 = actionBarLayout.D;
        Integer valueOf2 = o2Var4 != null ? Integer.valueOf(o2Var4.getNavigationBarColor()) : null;
        o2 o2Var5 = actionBarLayout.E;
        if (o2Var5 != null && o2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        o2 o2Var6 = actionBarLayout.D;
        if (o2Var6 != null && o2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.D != null && valueOf != null && valueOf2 != null) {
            int d = i0.a.d(i7.w.a(actionBarLayout.A0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            s sVar = actionBarLayout.C;
            if (sVar != null && sVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.C.sheetsStack.size(); i10++) {
                    k2 k2Var = actionBarLayout.C.sheetsStack.get(i10);
                    if (k2Var.attachedToParent()) {
                        d = k2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.D.setNavigationBarColor(d);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.I.getInterpolation(actionBarLayout.A0) : jr.h.getInterpolation(actionBarLayout.A0) : actionBarLayout.H.getInterpolation(actionBarLayout.A0);
        if (z11) {
            float a2 = i7.w.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z12) {
                float f10 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f10);
                actionBarLayout.s.setScaleY(f10);
                if (actionBarLayout.F != null) {
                    float f11 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(AndroidUtilities.dp(40.0f) * f11);
                    actionBarLayout.F.setTranslationY((-AndroidUtilities.dp(70.0f)) * f11);
                    float f12 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.F.setScaleX(f12);
                    actionBarLayout.F.setScaleY(f12);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                g6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f13 = 1.0f - interpolation;
            float a10 = i7.w.a(f13, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z12) {
                float f14 = (f13 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f14);
                actionBarLayout.v.setScaleY(f14);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.F == null) {
                    g6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.A0 < 1.0f) {
            actionBarLayout.d0(z11, false, z12);
        } else {
            actionBarLayout.F(false);
        }
    }
}
