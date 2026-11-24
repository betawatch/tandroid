// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hl4 b;

    public /* synthetic */ fl4(hl4 hl4Var, byte b) {
        this.a = b;
        this.b = hl4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hl4 hl4Var = this.b;
        switch (b) {
            case 0:
                hl4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                break;
            case 1:
                hl4Var.getClass();
                hl4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hl4Var.invalidate();
                break;
            default:
                hl4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                break;
        }
    }
}
