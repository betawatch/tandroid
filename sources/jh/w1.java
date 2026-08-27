package jh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ w1(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                e4Var.getClass();
                e4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                break;
            case 1:
                e4 e4Var2 = this.b;
                e4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var2.p3 = floatValue;
                e4Var2.n3.setTransitionProgress(floatValue);
                break;
            default:
                e4.Z(this.b, valueAnimator);
                break;
        }
    }
}
