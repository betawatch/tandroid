// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ bx0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                nx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var = nx0Var.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                    break;
                }
                break;
            case 1:
                nx0Var.e0();
                break;
            case 2:
                nx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var2 = nx0Var.c;
                if (ex0Var2 != null) {
                    ex0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                nx0Var.e0();
                break;
            case 4:
                nx0Var.e0();
                break;
            case 5:
                nx0Var.e0();
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                nx0Var.x0(nx0Var.Y.intValue(), intValue, intValue);
                break;
        }
    }
}
