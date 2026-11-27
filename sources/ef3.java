// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ of3 b;

    public /* synthetic */ ef3(of3 of3Var, byte b) {
        this.a = b;
        this.b = of3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        of3 of3Var = this.b;
        switch (b) {
            case 0:
                of3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                break;
            case 1:
                of3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                break;
            default:
                of3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                break;
        }
    }
}
