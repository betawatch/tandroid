// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ a51(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                c51Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c51Var.invalidate();
                break;
            case 1:
                c51Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                break;
            case 2:
                c51Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                break;
            case 3:
                c51Var.getClass();
                c51Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                break;
            default:
                c51Var.getClass();
                c51Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                break;
        }
    }
}
