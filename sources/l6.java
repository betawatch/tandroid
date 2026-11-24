// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l6 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public l6(ActionBarLayout actionBarLayout, boolean z, boolean z2, boolean z3) {
        this.d = actionBarLayout;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.K0 != this) {
            return;
        }
        actionBarLayout.K0 = null;
        boolean z = this.a;
        if (z) {
            actionBarLayout.C0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j = nanoTime - actionBarLayout.M0;
        if (j > 40 && z) {
            j = 0;
        } else if (j > 18) {
            j = 18;
        }
        actionBarLayout.M0 = nanoTime;
        boolean z2 = this.c;
        boolean z3 = this.b;
        float f = actionBarLayout.L0 + (j / ((z3 && z2) ? 190.0f : 150.0f));
        actionBarLayout.L0 = f;
        if (f > 1.0f) {
            actionBarLayout.L0 = 1.0f;
            f = 1.0f;
        }
        d dVar = actionBarLayout.I;
        if (dVar != null) {
            dVar.onTransitionAnimationProgress(true, f);
        }
        d dVar2 = actionBarLayout.J;
        if (dVar2 != null) {
            dVar2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        d dVar3 = actionBarLayout.J;
        Integer valueOf = dVar3 != null ? Integer.valueOf(dVar3.getNavigationBarColor()) : null;
        d dVar4 = actionBarLayout.I;
        Integer valueOf2 = dVar4 != null ? Integer.valueOf(dVar4.getNavigationBarColor()) : null;
        d dVar5 = actionBarLayout.J;
        if (dVar5 != null && dVar5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        d dVar6 = actionBarLayout.I;
        if (dVar6 != null && dVar6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.I != null && valueOf != null && valueOf2 != null) {
            int f2 = bm2.f(moe.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            k6 k6Var = actionBarLayout.H;
            if (k6Var != null && k6Var.sheetsStack != null) {
                for (int i = 0; i < actionBarLayout.H.sheetsStack.size(); i++) {
                    zf0 zf0Var = actionBarLayout.H.sheetsStack.get(i);
                    if (zf0Var.z()) {
                        f2 = zf0Var.e(f2);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f2);
        }
        float interpolation = z3 ? z2 ? actionBarLayout.N.getInterpolation(actionBarLayout.L0) : s33.h.getInterpolation(actionBarLayout.L0) : actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        if (z2) {
            float a = moe.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a);
            b bVar = actionBarLayout.s;
            if (z3) {
                float f3 = (0.3f * interpolation) + 0.7f;
                bVar.setScaleX(f3);
                actionBarLayout.s.setScaleY(f3);
                if (actionBarLayout.K != null) {
                    float f4 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(gl.L(40.0f) * f4);
                    actionBarLayout.K.setTranslationY((-gl.L(70.0f)) * f4);
                    float f5 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f5);
                    actionBarLayout.K.setScaleY(f5);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a));
                bkb.r0.setAlpha((int) (a * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar.setTranslationX((1.0f - interpolation) * gl.L(48.0f));
            }
        } else {
            float f6 = 1.0f - interpolation;
            float a2 = moe.a(f6, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a2);
            b bVar2 = actionBarLayout.w;
            if (z3) {
                float f7 = (f6 * 0.1f) + 0.9f;
                bVar2.setScaleX(f7);
                actionBarLayout.w.setScaleY(f7);
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                if (actionBarLayout.K == null) {
                    bkb.r0.setAlpha((int) (a2 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar2.setTranslationX(gl.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.g0(z2, false, z3);
        } else {
            actionBarLayout.F(false);
        }
    }
}
