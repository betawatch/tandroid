// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg9 b;

    public /* synthetic */ ig9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg9Var.A0();
                yg9Var.Q.setTranslationX(hl.U1(yg9Var.J, yg9Var.H[0] - yg9Var.I[0], 0));
                yg9Var.Q.setTranslationY(hl.U1(yg9Var.J, yg9Var.H[1] - yg9Var.I[1], 0));
                yg9Var.P.invalidate();
                break;
            default:
                yg9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg9Var.b0();
                break;
        }
    }
}
