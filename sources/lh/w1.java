package lh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ w1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.getClass();
                d4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                break;
            case 1:
                d4 d4Var2 = this.b;
                d4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var2.p3 = floatValue;
                d4Var2.n3.setTransitionProgress(floatValue);
                break;
            default:
                d4.Z(this.b, valueAnimator);
                break;
        }
    }
}
