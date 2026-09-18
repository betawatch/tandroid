package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ y(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lx lxVar = this.b.b0;
                ValueAnimator valueAnimator = lxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.k0 = null;
                break;
            default:
                a0 a0Var = this.b;
                a0Var.w = false;
                a0Var.invalidate();
                break;
        }
    }
}
