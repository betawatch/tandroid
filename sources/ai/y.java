package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                kx kxVar = this.b.b0;
                ValueAnimator valueAnimator = kxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                kxVar.k0 = null;
                break;
            default:
                a0 a0Var = this.b;
                a0Var.w = false;
                a0Var.invalidate();
                break;
        }
    }
}
