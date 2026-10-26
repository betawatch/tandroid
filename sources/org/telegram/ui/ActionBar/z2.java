package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                if (k3Var.startAnimationRunnable == this) {
                    z10 = k3Var.dismissed;
                    if (!z10) {
                        k3Var.startAnimationRunnable = null;
                        k3.access$2500(k3Var);
                        break;
                    }
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.g0(false, true, false);
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
                a5 a5Var = (a5) this.b;
                a5Var.k();
                a5Var.j();
                a5Var.f.setAlpha(1.0f);
                break;
        }
    }
}
