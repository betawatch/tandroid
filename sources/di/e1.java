package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ e1(t2 t2Var, int i10) {
        this.a = i10;
        this.b = t2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        t2 t2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                t2.m(t2Var);
                break;
            case 1:
                i1 i1Var = t2Var.f;
                ValueAnimator valueAnimator = i1Var.Q;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.D(num.intValue());
                    s2 s2Var = t2Var.h;
                    s2Var.F = num.intValue();
                    s2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = t2.G;
                t2Var.p0(intValue);
                break;
        }
    }
}
