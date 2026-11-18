package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ s1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.getClass();
                z3Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.invalidate();
                break;
            case 1:
                z3 z3Var2 = this.b;
                z3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var2.d3 = floatValue;
                z3Var2.b3.setTransitionProgress(floatValue);
                break;
            default:
                z3.X(this.b, valueAnimator);
                break;
        }
    }
}
