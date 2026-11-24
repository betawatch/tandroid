// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b72 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;

    public /* synthetic */ b72(v72 v72Var, byte b) {
        this.a = b;
        this.b = v72Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                v72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
