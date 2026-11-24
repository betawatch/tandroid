// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ j4(n4 n4Var, byte b) {
        this.a = b;
        this.b = n4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n4 n4Var = this.b;
        switch (b) {
            case 0:
                n4Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.P = null;
                break;
            case 1:
                n4Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.Q = null;
                break;
            default:
                n4Var.a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
