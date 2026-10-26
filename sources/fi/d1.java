package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ d1(l2 l2Var, int i10) {
        this.a = i10;
        this.b = l2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        l2 l2Var = this.b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                l2.m(l2Var);
                break;
            case 1:
                h1 h1Var = l2Var.f;
                ValueAnimator valueAnimator = h1Var.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.E(num.intValue());
                    k2 k2Var = l2Var.h;
                    k2Var.F = num.intValue();
                    k2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = l2.H;
                l2Var.r0(intValue);
                break;
        }
    }
}
