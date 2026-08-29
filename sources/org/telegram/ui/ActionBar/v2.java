package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.b;
                if (f3Var.startAnimationRunnable == this) {
                    z10 = f3Var.dismissed;
                    if (!z10) {
                        f3Var.startAnimationRunnable = null;
                        f3.access$2400(f3Var);
                        break;
                    }
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    break;
                }
                break;
            case 2:
                q1 q1Var = (q1) this.b;
                ValueAnimator valueAnimator = q1Var.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    q1Var.m.start();
                    break;
                }
                break;
            default:
                t4 t4Var = (t4) this.b;
                t4Var.k();
                t4Var.j();
                t4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
