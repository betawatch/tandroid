package org.telegram.ui.ActionBar;

import c8.i9;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        if (actionBarLayout.K0 != this) {
            return;
        }
        actionBarLayout.K0 = null;
        boolean z10 = this.a;
        if (z10) {
            actionBarLayout.C0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j3 = nanoTime - actionBarLayout.M0;
        if (j3 > 40 && z10) {
            j3 = 0;
        } else if (j3 > 18) {
            j3 = 18;
        }
        actionBarLayout.M0 = nanoTime;
        boolean z11 = this.c;
        boolean z12 = this.b;
        float f10 = actionBarLayout.L0 + (j3 / ((z12 && z11) ? 190.0f : 150.0f));
        actionBarLayout.L0 = f10;
        if (f10 > 1.0f) {
            actionBarLayout.L0 = 1.0f;
        }
        e2 e2Var = actionBarLayout.I;
        if (e2Var != null) {
            e2Var.onTransitionAnimationProgress(true, actionBarLayout.L0);
        }
        e2 e2Var2 = actionBarLayout.J;
        if (e2Var2 != null) {
            e2Var2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        e2 e2Var3 = actionBarLayout.J;
        Integer valueOf = e2Var3 != null ? Integer.valueOf(e2Var3.getNavigationBarColor()) : null;
        e2 e2Var4 = actionBarLayout.I;
        Integer valueOf2 = e2Var4 != null ? Integer.valueOf(e2Var4.getNavigationBarColor()) : null;
        e2 e2Var5 = actionBarLayout.J;
        if (e2Var5 != null && e2Var5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        e2 e2Var6 = actionBarLayout.I;
        if (e2Var6 != null && e2Var6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.I != null && valueOf != null && valueOf2 != null) {
            int f11 = i0.a.f(i9.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.sheetsStack != null) {
                for (int i7 = 0; i7 < actionBarLayout.H.sheetsStack.size(); i7++) {
                    a2 a2Var = actionBarLayout.H.sheetsStack.get(i7);
                    if (a2Var.y()) {
                        f11 = a2Var.e(f11);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f11);
        }
        float interpolation = z12 ? z11 ? actionBarLayout.N.getInterpolation(actionBarLayout.L0) : er.h.getInterpolation(actionBarLayout.L0) : actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        if (z11) {
            float a10 = i9.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a10);
            if (z12) {
                float f12 = (0.3f * interpolation) + 0.7f;
                actionBarLayout.s.setScaleX(f12);
                actionBarLayout.s.setScaleY(f12);
                if (actionBarLayout.K != null) {
                    float f13 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(org.telegram.messenger.g0.L(40.0f) * f13);
                    actionBarLayout.K.setTranslationY((-org.telegram.messenger.g0.L(70.0f)) * f13);
                    float f14 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f14);
                    actionBarLayout.K.setScaleY(f14);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a10));
                j6.s0.setAlpha((int) (a10 * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.s.setTranslationX((1.0f - interpolation) * org.telegram.messenger.g0.L(48.0f));
            }
        } else {
            float f15 = 1.0f - interpolation;
            float a11 = i9.a(f15, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a11);
            if (z12) {
                float f16 = (f15 * 0.1f) + 0.9f;
                actionBarLayout.w.setScaleX(f16);
                actionBarLayout.w.setScaleY(f16);
                actionBarLayout.r.setAlpha((int) (46.0f * a11));
                if (actionBarLayout.K == null) {
                    j6.s0.setAlpha((int) (a11 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                actionBarLayout.w.setTranslationX(org.telegram.messenger.g0.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.h0(z11, false, z12);
        } else {
            actionBarLayout.H(false);
        }
    }
}
