package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                o1 o1Var = (o1) this.b;
                ValueAnimator valueAnimator = o1Var.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    o1Var.m.start();
                    break;
                }
                break;
            default:
                v4 v4Var = (v4) this.b;
                v4Var.k();
                v4Var.j();
                v4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
