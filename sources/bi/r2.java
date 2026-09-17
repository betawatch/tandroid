package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ r2(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.getClass();
                o5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                break;
            case 1:
                o5 o5Var2 = this.b;
                o5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.t3 = floatValue;
                o5Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                o5.Z(this.b, valueAnimator);
                break;
        }
    }
}
