package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ d3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.getClass();
                f6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.invalidate();
                break;
            case 1:
                f6 f6Var2 = this.b;
                f6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var2.t3 = floatValue;
                f6Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                f6.Z(this.b, valueAnimator);
                break;
        }
    }
}
