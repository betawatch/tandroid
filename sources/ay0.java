// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ ay0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                my0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var = my0Var.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                    break;
                }
                break;
            case 1:
                my0Var.e0();
                break;
            case 2:
                my0Var.e0();
                break;
            case 3:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                my0Var.w0(my0Var.Y.intValue(), intValue, intValue);
                break;
            case 4:
                my0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var2 = my0Var.c;
                if (dy0Var2 != null) {
                    dy0Var2.invalidate();
                    break;
                }
                break;
            case 5:
                my0Var.e0();
                break;
            default:
                my0Var.e0();
                break;
        }
    }
}
