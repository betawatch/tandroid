package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ix ixVar = this.b.b0;
                ValueAnimator valueAnimator = ixVar.j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ixVar.k0 = null;
                break;
            default:
                a0 a0Var = this.b;
                a0Var.w = false;
                a0Var.invalidate();
                break;
        }
    }
}
