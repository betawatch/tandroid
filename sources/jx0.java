// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx0 b;

    public /* synthetic */ jx0(lx0 lx0Var, byte b) {
        this.a = b;
        this.b = lx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lx0 lx0Var = this.b;
        switch (b) {
            case 0:
                nx0 nx0Var = lx0Var.H;
                nx0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nx0Var.e0();
                nx0Var.n0(nx0Var.b.getTranslationY());
                lx0Var.invalidate();
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.E = floatValue;
                nx0 nx0Var2 = lx0Var.H;
                nx0Var2.b.setTranslationX(floatValue);
                nx0Var2.c.invalidate();
                break;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.E = floatValue2;
                nx0 nx0Var3 = lx0Var.H;
                nx0Var3.b.setTranslationX(floatValue2);
                nx0Var3.c.invalidate();
                break;
            case 3:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0 nx0Var4 = lx0Var.H;
                nx0Var4.Z.setAlpha(nx0Var4.p0 ? (int) (nx0Var4.q0 * floatValue3) : 0);
                break;
            default:
                nx0 nx0Var5 = lx0Var.H;
                ex0 ex0Var = nx0Var5.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                }
                nx0Var5.e0();
                break;
        }
    }
}
