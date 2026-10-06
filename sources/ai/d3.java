package ai;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ d3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                e6Var.getClass();
                e6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                break;
            case 1:
                e6 e6Var2 = this.b;
                e6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var2.t3 = floatValue;
                e6Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                e6.Z(this.b, valueAnimator);
                break;
        }
    }
}
