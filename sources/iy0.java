// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky0 b;

    public /* synthetic */ iy0(ky0 ky0Var, byte b) {
        this.a = b;
        this.b = ky0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ky0 ky0Var = this.b;
        switch (b) {
            case 0:
                my0 my0Var = ky0Var.H;
                my0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                my0Var.e0();
                my0Var.n0(my0Var.b.getTranslationY());
                ky0Var.invalidate();
                break;
            case 1:
                my0 my0Var2 = ky0Var.H;
                dy0 dy0Var = my0Var2.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                }
                my0Var2.e0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.E = floatValue;
                my0 my0Var3 = ky0Var.H;
                my0Var3.b.setTranslationX(floatValue);
                my0Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.E = floatValue2;
                my0 my0Var4 = ky0Var.H;
                my0Var4.b.setTranslationX(floatValue2);
                my0Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0 my0Var5 = ky0Var.H;
                my0Var5.Z.setAlpha(my0Var5.p0 ? (int) (my0Var5.q0 * floatValue3) : 0);
                break;
        }
    }
}
