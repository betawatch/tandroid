// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class g62 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a72 b;

    public /* synthetic */ g62(a72 a72Var, byte b) {
        this.a = b;
        this.b = a72Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                a72Var.F.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
