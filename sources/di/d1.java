package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ d1(r2 r2Var, int i10) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        r2 r2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                r2.n(r2Var);
                break;
            case 1:
                h1 h1Var = r2Var.f;
                ValueAnimator valueAnimator = h1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    q2 q2Var = r2Var.h;
                    q2Var.F = num.intValue();
                    q2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = r2.G;
                r2Var.q0(intValue);
                break;
        }
    }
}
