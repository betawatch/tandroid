package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ e2(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b;
                l3Var.getClass();
                l3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.h();
                break;
            default:
                this.b.y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
