// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
