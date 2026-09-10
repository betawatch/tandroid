package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        boolean z10;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.b;
                if (h3Var.startAnimationRunnable == this) {
                    z10 = h3Var.dismissed;
                    if (!z10) {
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
