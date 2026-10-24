package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                if (h3Var.startAnimationRunnable == this) {
                    z10 = h3Var.dismissed;
                    if (!z10) {
                        h3Var.startAnimationRunnable = null;
                        h3.access$2500(h3Var);
                        break;
                    }
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.f0(false, true, false);
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
                y4 y4Var = (y4) this.b;
                y4Var.k();
                y4Var.j();
                y4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
