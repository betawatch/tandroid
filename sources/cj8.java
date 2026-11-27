// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cj8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fj8 b;

    public /* synthetic */ cj8(fj8 fj8Var, byte b) {
        this.a = b;
        this.b = fj8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fj8 fj8Var = this.b;
        switch (b) {
            case 0:
                fj8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                break;
            default:
                fj8Var.getClass();
                fj8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                break;
        }
    }
}
