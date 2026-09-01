package oh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ x1(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f4 f4Var = this.b;
                f4Var.getClass();
                f4Var.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                break;
            case 1:
                f4 f4Var2 = this.b;
                f4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var2.q3 = floatValue;
                f4Var2.o3.setTransitionProgress(floatValue);
                break;
            default:
                f4.Z(this.b, valueAnimator);
                break;
        }
    }
}
