// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cj8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fj8 b;

    public /* synthetic */ cj8(fj8 fj8Var, byte b) {
        this.a = b;
        this.b = fj8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fj8 fj8Var = this.b;
        switch (b) {
            case 0:
                fj8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                break;
            default:
                fj8Var.getClass();
                fj8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fj8Var.c(true);
                break;
        }
    }
}
