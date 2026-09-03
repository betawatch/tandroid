package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public s(ActionBarLayout actionBarLayout, boolean z4, boolean z10, boolean z11) {
        this.d = actionBarLayout;
        this.a = z4;
        this.b = z10;
        this.c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.A0 != this) {
            return;
        }
        actionBarLayout.A0 = null;
        boolean z4 = this.a;
        if (z4) {
            actionBarLayout.s0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j10 = nanoTime - actionBarLayout.C0;
        if (j10 > 40 && z4) {
            j10 = 0;
        } else if (j10 > 18) {
            j10 = 18;
        }
        actionBarLayout.C0 = nanoTime;
        boolean z10 = this.c;
        boolean z11 = this.b;
        float f10 = actionBarLayout.B0 + (j10 / ((z11 && z10) ? 190.0f : 150.0f));
        actionBarLayout.B0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.B0 = 1.0f;
        }
        p2 p2Var = actionBarLayout.E;
        if (p2Var != null) {
            p2Var.onTransitionAnimationProgress(true, actionBarLayout.B0);
        }
        p2 p2Var2 = actionBarLayout.F;
        if (p2Var2 != null) {
            p2Var2.onTransitionAnimationProgress(false, actionBarLayout.B0);
        }
        p2 p2Var3 = actionBarLayout.F;
        Integer valueOf = p2Var3 != null ? Integer.valueOf(p2Var3.getNavigationBarColor()) : null;
        p2 p2Var4 = actionBarLayout.E;
        Integer valueOf2 = p2Var4 != null ? Integer.valueOf(p2Var4.getNavigationBarColor()) : null;
        p2 p2Var5 = actionBarLayout.F;
        if (p2Var5 != null && p2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        p2 p2Var6 = actionBarLayout.E;
        if (p2Var6 != null && p2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.E != null && valueOf != null && valueOf2 != null) {
            int d = i0.a.d(k7.n.a(actionBarLayout.B0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            r rVar = actionBarLayout.D;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.D.sheetsStack.size(); i10++) {
                    l2 l2Var = actionBarLayout.D.sheetsStack.get(i10);
                    if (l2Var.attachedToParent()) {
                        d = l2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.E.setNavigationBarColor(d);
        }
        float interpolation = z11 ? z10 ? actionBarLayout.J.getInterpolation(actionBarLayout.B0) : mr.h.getInterpolation(actionBarLayout.B0) : actionBarLayout.I.getInterpolation(actionBarLayout.B0);
        if (z10) {
            float a2 = k7.n.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z11) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f11);
                actionBarLayout.s.setScaleY(f11);
                if (actionBarLayout.G != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.G.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.G.setScaleX(f13);
                    actionBarLayout.G.setScaleY(f13);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                j6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a10 = k7.n.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a10);
            if (z11) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                if (actionBarLayout.G == null) {
                    j6.s0.setAlpha((int) (a10 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.v.setTranslationX(AndroidUtilities.dp(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.B0 < 1.0f) {
            actionBarLayout.d0(z10, false, z11);
        } else {
            actionBarLayout.F(false);
        }
    }
}
