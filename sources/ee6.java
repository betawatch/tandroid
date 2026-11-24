// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ee6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mh6 b;

    public /* synthetic */ ee6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh6Var.c.setAlpha(floatValue);
                mh6Var.c.setTranslationY((1.0f - floatValue) * gm.L(230.0f));
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * floatValue2) + 0.1f;
                mh6Var.W.setScaleX(f);
                mh6Var.W.setScaleY(f);
                mh6Var.W.setAlpha(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh6Var.c.setAlpha(floatValue3);
                mh6Var.c.setTranslationY((1.0f - floatValue3) * gm.L(230.0f));
                break;
        }
    }
}
