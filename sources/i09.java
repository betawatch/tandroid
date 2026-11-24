// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i09 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ t09 b;

    public i09(t09 t09Var, float f) {
        this.b = t09Var;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t09 t09Var = this.b;
        t09Var.p0 = floatValue;
        t09Var.o0 = (1.0f - floatValue) * this.a;
        t09Var.invalidate();
    }
}
