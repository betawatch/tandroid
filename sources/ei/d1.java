package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ d1(n2 n2Var, int i10) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        n2 n2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                n2.m(n2Var);
                break;
            case 1:
                h1 h1Var = n2Var.f;
                ValueAnimator valueAnimator = h1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    m2 m2Var = n2Var.h;
                    m2Var.F = num.intValue();
                    m2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = n2.H;
                n2Var.r0(intValue);
                break;
        }
    }
}
