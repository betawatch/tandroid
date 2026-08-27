package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ValueAnimator valueAnimator = h1Var.M;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && h1Var.getCurrentPosition() != num.intValue()) {
                    h1Var.D(num.intValue());
                    k2 k2Var = l2Var.h;
                    k2Var.B = num.intValue();
                    k2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i11 = l2.C;
                l2Var.p0(intValue);
                break;
        }
    }
}
