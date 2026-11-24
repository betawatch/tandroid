// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cz9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz9 b;

    public /* synthetic */ cz9(fz9 fz9Var, byte b) {
        this.a = b;
        this.b = fz9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fz9 fz9Var = this.b;
        switch (b) {
            case 0:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                break;
            case 1:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                break;
            default:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                break;
        }
    }
}
