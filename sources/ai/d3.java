package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ d3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                e6Var.getClass();
                e6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                break;
            case 1:
                e6 e6Var2 = this.b;
                e6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var2.t3 = floatValue;
                e6Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                e6.Z(this.b, valueAnimator);
                break;
        }
    }
}
