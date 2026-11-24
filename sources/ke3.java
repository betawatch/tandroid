// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ke3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue3 b;

    public /* synthetic */ ke3(ue3 ue3Var, byte b) {
        this.a = b;
        this.b = ue3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                ue3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                break;
            case 1:
                ue3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                break;
            default:
                ue3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3Var.invalidate();
                break;
        }
    }
}
