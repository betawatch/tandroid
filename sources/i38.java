// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class i38 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ i38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                a58Var.x2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a58Var.invalidate();
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a58Var.j3 = floatValue;
                a58Var.h3.setTransitionProgress(floatValue);
                break;
            default:
                a58Var.D0(valueAnimator);
                break;
        }
    }
}
