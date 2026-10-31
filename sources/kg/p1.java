package kg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ p1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1 v1Var = this.b;
                v1Var.y2 = floatValue;
                v1Var.c.invalidate();
                break;
            default:
                v1 v1Var2 = this.b;
                v1Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var2.F2.getLayoutParams().height = org.telegram.messenger.i0.W1(floatValue2, v1Var2.G2[0].getHeight(), v1Var2.G2[1].getHeight());
                v1Var2.F2.requestLayout();
                break;
        }
    }
}
