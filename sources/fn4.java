// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fn4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn4 b;

    public /* synthetic */ fn4(hn4 hn4Var, byte b) {
        this.a = b;
        this.b = hn4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hn4 hn4Var = this.b;
        switch (b) {
            case 0:
                hn4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn4Var.invalidate();
                break;
            case 1:
                hn4Var.getClass();
                hn4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hn4Var.invalidate();
                break;
            default:
                hn4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn4Var.invalidate();
                break;
        }
    }
}
