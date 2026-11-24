// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ kg0(ng0 ng0Var, byte b) {
        this.a = b;
        this.b = ng0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ng0 ng0Var = this.b;
        switch (b) {
            case 0:
                ng0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.I = true;
                ng0Var.invalidate();
                break;
            case 1:
                ng0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.I = true;
                ng0Var.invalidate();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.w0 = floatValue;
                ng0Var.u0.setAlpha(floatValue);
                ng0Var.invalidate();
                break;
        }
    }
}
