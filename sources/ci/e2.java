package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ e2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                q4Var.getClass();
                q4Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                break;
            case 1:
                q4 q4Var2 = this.b;
                q4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q4Var2.t3 = floatValue;
                q4Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                q4.Z(this.b, valueAnimator);
                break;
        }
    }
}
