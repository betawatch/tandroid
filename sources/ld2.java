// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ld2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ umb b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xd2 e;

    public ld2(xd2 xd2Var, umb umbVar, float f, boolean z) {
        this.e = xd2Var;
        this.b = umbVar;
        this.c = f;
        this.d = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xd2 xd2Var = this.e;
        xd2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || xd2Var.L1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
