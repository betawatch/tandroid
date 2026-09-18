package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
