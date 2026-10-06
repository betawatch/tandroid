package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                jx jxVar = this.b.b0;
                ValueAnimator valueAnimator = jxVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                jxVar.k0 = null;
                break;
            default:
                a0 a0Var = this.b;
                a0Var.w = false;
                a0Var.invalidate();
                break;
        }
    }
}
