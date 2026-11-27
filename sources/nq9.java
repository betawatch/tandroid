// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nq9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er9 b;

    public /* synthetic */ nq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                er9Var.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                er9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er9Var.f.requestLayout();
                break;
            default:
                er9Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jla jlaVar = er9Var.F;
                if (jlaVar.getTitleTextView() != null) {
                    jlaVar.getTitleTextView().invalidate();
                    break;
                }
                break;
        }
    }
}
