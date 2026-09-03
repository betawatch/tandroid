package nh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ x1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.getClass();
                d4Var.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                break;
            case 1:
                d4 d4Var2 = this.b;
                d4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var2.q3 = floatValue;
                d4Var2.o3.setTransitionProgress(floatValue);
                break;
            default:
                d4.Z(this.b, valueAnimator);
                break;
        }
    }
}
