package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ e1(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        s2 s2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                s2.m(s2Var);
                break;
            case 1:
                i1 i1Var = s2Var.f;
                ValueAnimator valueAnimator = i1Var.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.E(num.intValue());
                    r2 r2Var = s2Var.h;
                    r2Var.F = num.intValue();
                    r2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = s2.G;
                s2Var.p0(intValue);
                break;
        }
    }
}
