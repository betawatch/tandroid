package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
