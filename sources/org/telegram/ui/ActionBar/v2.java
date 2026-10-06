package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                p1 p1Var = (p1) this.b;
                ValueAnimator valueAnimator = p1Var.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    p1Var.m.start();
                    break;
                }
                break;
            default:
                u4 u4Var = (u4) this.b;
                u4Var.k();
                u4Var.j();
                u4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
