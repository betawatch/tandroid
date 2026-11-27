// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dy8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ey8 b;

    public /* synthetic */ dy8(ey8 ey8Var, byte b) {
        this.a = b;
        this.b = ey8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ey8 ey8Var = this.b;
        switch (b) {
            case 0:
                ey8Var.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var = ey8Var.H;
                if (of3Var != null) {
                    of3Var.invalidate();
                    break;
                }
                break;
            case 1:
                ey8Var.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var2 = ey8Var.H;
                if (of3Var2 != null) {
                    of3Var2.invalidate();
                    break;
                }
                break;
            case 2:
                ey8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var3 = ey8Var.H;
                if (of3Var3 != null) {
                    of3Var3.invalidate();
                    break;
                }
                break;
            case 3:
                ey8Var.getClass();
                ey8Var.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                of3 of3Var4 = ey8Var.H;
                if (of3Var4 != null) {
                    of3Var4.invalidate();
                    break;
                }
                break;
            case 4:
                ey8Var.getClass();
                ey8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey8Var.F = true;
                of3 of3Var5 = ey8Var.H;
                if (of3Var5 != null) {
                    of3Var5.invalidate();
                    break;
                }
                break;
            case 5:
                ey8Var.getClass();
                ey8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey8Var.F = false;
                of3 of3Var6 = ey8Var.H;
                if (of3Var6 != null) {
                    of3Var6.invalidate();
                    break;
                }
                break;
            case 6:
                ey8Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var7 = ey8Var.H;
                if (of3Var7 != null) {
                    of3Var7.invalidate();
                }
                sl0 sl0Var = ey8Var.I;
                if (sl0Var != null) {
                    sl0Var.invalidate();
                    break;
                }
                break;
            default:
                ey8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var8 = ey8Var.H;
                if (of3Var8 != null) {
                    of3Var8.invalidate();
                }
                sl0 sl0Var2 = ey8Var.I;
                if (sl0Var2 != null) {
                    sl0Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
