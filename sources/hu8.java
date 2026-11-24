// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku8 b;

    public /* synthetic */ hu8(ku8 ku8Var, byte b) {
        this.a = b;
        this.b = ku8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ku8 ku8Var = this.b;
        switch (b) {
            case 0:
                ku8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ku8Var.e();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ku8Var.R = floatValue;
                ku8Var.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
