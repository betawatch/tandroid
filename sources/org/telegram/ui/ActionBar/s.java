package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        float f10 = actionBarLayout.A0 + (j10 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.A0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.A0 = 1.0f;
        }
        n2 n2Var = actionBarLayout.D;
        if (n2Var != null) {
            n2Var.onTransitionAnimationProgress(true, actionBarLayout.A0);
        }
        n2 n2Var2 = actionBarLayout.E;
        if (n2Var2 != null) {
            n2Var2.onTransitionAnimationProgress(false, actionBarLayout.A0);
        }
        n2 n2Var3 = actionBarLayout.E;
        Integer valueOf = n2Var3 != null ? Integer.valueOf(n2Var3.getNavigationBarColor()) : null;
        n2 n2Var4 = actionBarLayout.D;
        Integer valueOf2 = n2Var4 != null ? Integer.valueOf(n2Var4.getNavigationBarColor()) : null;
        n2 n2Var5 = actionBarLayout.E;
        if (n2Var5 != null && n2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        n2 n2Var6 = actionBarLayout.D;
        if (n2Var6 != null && n2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.D != null && valueOf != null && valueOf2 != null) {
            int d = i0.b.d(h7.n.a(actionBarLayout.A0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            r rVar = actionBarLayout.C;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i10 = 0; i10 < actionBarLayout.C.sheetsStack.size(); i10++) {
                    j2 j2Var = actionBarLayout.C.sheetsStack.get(i10);
                    if (j2Var.attachedToParent()) {
                        d = j2Var.getNavigationBarColor(d);
                    }
                }
            }
            actionBarLayout.D.setNavigationBarColor(d);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.I.getInterpolation(actionBarLayout.A0) : er.h.getInterpolation(actionBarLayout.A0) : actionBarLayout.H.getInterpolation(actionBarLayout.A0);
        if (z11) {
            float a2 = h7.n.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a2);
            if (z12) {
                float f11 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f11);
                actionBarLayout.s.setScaleY(f11);
                if (actionBarLayout.F != null) {
                    float f12 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(AndroidUtilities.dp(40.0f) * f12);
                    actionBarLayout.F.setTranslationY((-AndroidUtilities.dp(70.0f)) * f12);
                    float f13 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.F.setScaleX(f13);
                    actionBarLayout.F.setScaleY(f13);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                g6.s0.setAlpha((int) (a2 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * AndroidUtilities.dp(48.0f));
            }
        } else {
            float f14 = 1.0f - interpolation;
            float a3 = h7.n.a(f14, 0.0f, 1.0f);
            actionBarLayout.v.setAlpha(a3);
            if (z12) {
                float f15 = (f14 * 0.1f) + 0.9f;
                actionBarLayout.v.setScaleX(f15);
                actionBarLayout.v.setScaleY(f15);
                actionBarLayout.r.setAlpha((int) (46.0f * a3));
                if (actionBarLayout.F == null) {
                    g6.s0.setAlpha((int) (a3 * 255.0f));
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
