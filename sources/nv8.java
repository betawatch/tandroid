// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sv8 b;

    public /* synthetic */ nv8(sv8 sv8Var, byte b) {
        this.a = b;
        this.b = sv8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sv8 sv8Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv8Var.R = floatValue;
                sv8Var.r.setUseGyroscope(floatValue);
                break;
            default:
                sv8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv8Var.e();
                break;
        }
    }
}
