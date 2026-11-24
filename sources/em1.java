// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class em1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ em1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1 mu1Var = yv1Var.m1;
                if (mu1Var != null) {
                    mu1Var.invalidate();
                    yv1Var.A0.invalidate();
                    break;
                }
                break;
            case 1:
                yv1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.Tc();
                break;
            case 2:
                yv1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.Tc();
                break;
            case 3:
                yv1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.O7();
                break;
            default:
                yv1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.O7();
                break;
        }
    }
}
