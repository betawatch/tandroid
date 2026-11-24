// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ml3 b;

    public /* synthetic */ kl3(ml3 ml3Var, byte b) {
        this.a = b;
        this.b = ml3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ml3 ml3Var = this.b;
        switch (b) {
            case 0:
                ml3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ml3Var.requestLayout();
                gu2 gu2Var = ml3Var.c;
                if (gu2Var != null) {
                    gu2Var.accept(Float.valueOf(ml3Var.a));
                    break;
                }
                break;
            default:
                ml3Var.getClass();
                ml3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ml3Var.requestLayout();
                gu2 gu2Var2 = ml3Var.c;
                if (gu2Var2 != null) {
                    gu2Var2.accept(Float.valueOf(ml3Var.a));
                    break;
                }
                break;
        }
    }
}
