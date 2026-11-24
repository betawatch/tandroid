// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    public /* synthetic */ bl9(el9 el9Var, byte b) {
        this.a = b;
        this.b = el9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                el9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el9Var.g();
                break;
            default:
                el9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el9Var.g();
                break;
        }
    }
}
