// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha5 b;

    public /* synthetic */ ba5(ha5 ha5Var, byte b) {
        this.a = b;
        this.b = ha5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ha5Var.a0 = floatValue;
                ha5Var.b0.setAlpha(floatValue);
                ha5Var.a.invalidate();
                break;
            default:
                da5 da5Var = ha5Var.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z = false;
                } else {
                    floatValue2 -= 1.0f;
                    z = true;
                }
                if (z && !ha5Var.I0) {
                    ha5Var.x0.setAlpha(1.0f);
                    ha5Var.I0 = true;
                    da5Var.d.clearImage();
                }
                float f = floatValue2 * 180.0f;
                ha5Var.x0.setRotationY(f);
                da5Var.d.setRotationY(f);
                break;
        }
    }
}
