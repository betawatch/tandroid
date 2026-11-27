// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fa5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ka5 b;

    public /* synthetic */ fa5(ka5 ka5Var, byte b) {
        this.a = b;
        this.b = ka5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ka5Var.a0 = floatValue;
                ka5Var.b0.setAlpha(floatValue);
                ka5Var.a.invalidate();
                break;
            default:
                ga5 ga5Var = ka5Var.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z = false;
                } else {
                    floatValue2 -= 1.0f;
                    z = true;
                }
                if (z && !ka5Var.I0) {
                    ka5Var.x0.setAlpha(1.0f);
                    ka5Var.I0 = true;
                    ga5Var.d.a();
                }
                float f = floatValue2 * 180.0f;
                ka5Var.x0.setRotationY(f);
                ga5Var.d.setRotationY(f);
                break;
        }
    }
}
