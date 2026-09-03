package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                if (h3Var.startAnimationRunnable == this) {
                    z4 = h3Var.dismissed;
                    if (!z4) {
                        h3Var.startAnimationRunnable = null;
                        h3.access$2400(h3Var);
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
                x4 x4Var = (x4) this.b;
                x4Var.k();
                x4Var.j();
                x4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
