package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ j1(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        f3 f3Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                f3.m(f3Var);
                break;
            case 1:
                p1 p1Var = f3Var.f;
                ValueAnimator valueAnimator = p1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && p1Var.getCurrentPosition() != num.intValue()) {
                    p1Var.D(num.intValue());
                    e3 e3Var = f3Var.h;
                    e3Var.F = num.intValue();
                    e3Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = f3.G;
                f3Var.p0(intValue);
                break;
        }
    }
}
