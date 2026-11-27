// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class om9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm9 b;

    public /* synthetic */ om9(rm9 rm9Var, byte b) {
        this.a = b;
        this.b = rm9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rm9 rm9Var = this.b;
        switch (b) {
            case 0:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                break;
            default:
                rm9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm9Var.g();
                break;
        }
    }
}
