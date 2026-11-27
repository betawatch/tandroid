// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m6 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ActionBarLayout d;

    public m6(ActionBarLayout actionBarLayout, boolean z, boolean z2, boolean z3) {
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
        float f = (j / ((z3 && z2) ? 190.0f : 150.0f)) + actionBarLayout.L0;
        actionBarLayout.L0 = f;
        if (f > 1.0f) {
            actionBarLayout.L0 = 1.0f;
            f = 1.0f;
        }
        e eVar = actionBarLayout.I;
        if (eVar != null) {
            eVar.onTransitionAnimationProgress(true, f);
        }
        e eVar2 = actionBarLayout.J;
        if (eVar2 != null) {
            eVar2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        e eVar3 = actionBarLayout.J;
        Integer valueOf = eVar3 != null ? Integer.valueOf(eVar3.getNavigationBarColor()) : null;
        e eVar4 = actionBarLayout.I;
        Integer valueOf2 = eVar4 != null ? Integer.valueOf(eVar4.getNavigationBarColor()) : null;
        e eVar5 = actionBarLayout.J;
        if (eVar5 != null && eVar5.isSupportEdgeToEdge() && valueOf2 != null) {
            valueOf = valueOf2;
        }
        e eVar6 = actionBarLayout.I;
        if (eVar6 != null && eVar6.isSupportEdgeToEdge() && valueOf != null) {
            valueOf2 = valueOf;
        }
        if (actionBarLayout.I != null && valueOf != null && valueOf2 != null) {
            int f2 = vm2.f(ete.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), valueOf.intValue(), valueOf2.intValue());
            l6 l6Var = actionBarLayout.H;
            if (l6Var != null && l6Var.sheetsStack != null) {
                for (int i = 0; i < actionBarLayout.H.sheetsStack.size(); i++) {
                    ag0 ag0Var = actionBarLayout.H.sheetsStack.get(i);
                    if (ag0Var.z()) {
                        f2 = ag0Var.e(f2);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f2);
        }
        float interpolation = z3 ? z2 ? actionBarLayout.N.getInterpolation(actionBarLayout.L0) : k43.h.getInterpolation(actionBarLayout.L0) : actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        if (z2) {
            float a = ete.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a);
            b bVar = actionBarLayout.s;
            if (z3) {
                float f3 = (0.3f * interpolation) + 0.7f;
                bVar.setScaleX(f3);
                actionBarLayout.s.setScaleY(f3);
                if (actionBarLayout.K != null) {
                    float f4 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(hl.L(40.0f) * f4);
                    actionBarLayout.K.setTranslationY((-hl.L(70.0f)) * f4);
                    float f5 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f5);
                    actionBarLayout.K.setScaleY(f5);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a));
                aob.r0.setAlpha((int) (a * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar.setTranslationX((1.0f - interpolation) * hl.L(48.0f));
            }
        } else {
            float f6 = 1.0f - interpolation;
            float a2 = ete.a(f6, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a2);
            b bVar2 = actionBarLayout.w;
            if (z3) {
                float f7 = (f6 * 0.1f) + 0.9f;
                bVar2.setScaleX(f7);
                actionBarLayout.w.setScaleY(f7);
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                if (actionBarLayout.K == null) {
                    aob.r0.setAlpha((int) (a2 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar2.setTranslationX(hl.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.g0(z2, false, z3);
        } else {
            actionBarLayout.F(false);
        }
    }
}
