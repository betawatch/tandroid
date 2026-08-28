package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public /* synthetic */ e1(n2 n2Var, int i9) {
        this.a = i9;
        this.b = n2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        n2 n2Var = this.b;
        Integer num = (Integer) obj;
        switch (i9) {
            case 0:
                n2.m(n2Var);
                break;
            case 1:
                j1 j1Var = n2Var.f;
                ValueAnimator valueAnimator = j1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && j1Var.getCurrentPosition() != num.intValue()) {
                    j1Var.D(num.intValue());
                    m2 m2Var = n2Var.h;
                    m2Var.B = num.intValue();
                    m2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i10 = n2.C;
                n2Var.o0(intValue);
                break;
        }
    }
}
