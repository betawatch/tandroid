// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mn4 b;

    public /* synthetic */ kn4(mn4 mn4Var, byte b) {
        this.a = b;
        this.b = mn4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mn4 mn4Var = this.b;
        switch (b) {
            case 0:
                mn4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn4Var.invalidate();
                break;
            case 1:
                mn4Var.getClass();
                mn4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mn4Var.invalidate();
                break;
            default:
                mn4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn4Var.invalidate();
                break;
        }
    }
}
