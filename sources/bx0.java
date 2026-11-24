// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ bx0(dx0 dx0Var, byte b) {
        this.a = b;
        this.b = dx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dx0 dx0Var = this.b;
        switch (b) {
            case 0:
                fx0 fx0Var = dx0Var.H;
                fx0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fx0Var.e0();
                fx0Var.n0(fx0Var.b.getTranslationY());
                dx0Var.invalidate();
                break;
            case 1:
                fx0 fx0Var2 = dx0Var.H;
                ww0 ww0Var = fx0Var2.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                }
                fx0Var2.e0();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.E = floatValue;
                fx0 fx0Var3 = dx0Var.H;
                fx0Var3.b.setTranslationX(floatValue);
                fx0Var3.c.invalidate();
                break;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.E = floatValue2;
                fx0 fx0Var4 = dx0Var.H;
                fx0Var4.b.setTranslationX(floatValue2);
                fx0Var4.c.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fx0 fx0Var5 = dx0Var.H;
                fx0Var5.Z.setAlpha(fx0Var5.p0 ? (int) (fx0Var5.q0 * floatValue3) : 0);
                break;
        }
    }
}
