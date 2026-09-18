package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                g3 g3Var = (g3) this.b;
                if (g3Var.startAnimationRunnable == this) {
                    z10 = g3Var.dismissed;
                    if (!z10) {
                        g3Var.startAnimationRunnable = null;
                        g3.access$2400(g3Var);
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
                w4 w4Var = (w4) this.b;
                w4Var.k();
                w4Var.j();
                w4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
