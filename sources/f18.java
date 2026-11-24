// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f18 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    public /* synthetic */ f18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                y28Var.x2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y28Var.invalidate();
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y28Var.j3 = floatValue;
                y28Var.h3.setTransitionProgress(floatValue);
                break;
            default:
                y28Var.D0(valueAnimator);
                break;
        }
    }
}
