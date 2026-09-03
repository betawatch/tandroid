package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        boolean z4;
        switch (this.a) {
            case 0:
                g3 g3Var = (g3) this.b;
                if (g3Var.startAnimationRunnable == this) {
                    z4 = g3Var.dismissed;
                    if (!z4) {
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
                r1 r1Var = (r1) this.b;
                ValueAnimator valueAnimator = r1Var.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    r1Var.m.start();
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
