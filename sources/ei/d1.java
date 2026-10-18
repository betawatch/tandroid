package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                n2.n(n2Var);
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
                int i11 = n2.G;
                n2Var.q0(intValue);
                break;
        }
    }
}
