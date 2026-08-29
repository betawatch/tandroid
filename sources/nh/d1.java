package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ d1(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        k2 k2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                k2.m(k2Var);
                break;
            case 1:
                g1 g1Var = k2Var.f;
                ValueAnimator valueAnimator = g1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.D(num.intValue());
                    j2 j2Var = k2Var.h;
                    j2Var.B = num.intValue();
                    j2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = k2.C;
                k2Var.p0(intValue);
                break;
        }
    }
}
