// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class of8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf8 b;

    public /* synthetic */ of8(rf8 rf8Var, byte b) {
        this.a = b;
        this.b = rf8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rf8 rf8Var = this.b;
        switch (b) {
            case 0:
                rf8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf8Var.c(true);
                break;
            default:
                rf8Var.getClass();
                rf8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf8Var.c(true);
                break;
        }
    }
}
