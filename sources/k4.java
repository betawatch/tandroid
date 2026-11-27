// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o4 b;

    public /* synthetic */ k4(o4 o4Var, byte b) {
        this.a = b;
        this.b = o4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o4 o4Var = this.b;
        switch (b) {
            case 0:
                o4Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                o4Var.P = null;
                break;
            case 1:
                o4Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                o4Var.Q = null;
                break;
            default:
                o4Var.a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
