// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j29 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ v29 b;

    public j29(v29 v29Var, float f) {
        this.b = v29Var;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v29 v29Var = this.b;
        v29Var.p0 = floatValue;
        v29Var.o0 = (1.0f - floatValue) * this.a;
        v29Var.invalidate();
    }
}
