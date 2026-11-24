// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ cg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                cj3Var.V4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cj3Var.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
