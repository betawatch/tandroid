package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                v4 v4Var = (v4) this.b;
                v4Var.k();
                v4Var.j();
                v4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
