package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ b2(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.getClass();
                j4Var.r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                break;
            case 1:
                j4 j4Var2 = this.b;
                j4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var2.d3 = floatValue;
                j4Var2.b3.setTransitionProgress(floatValue);
                break;
            default:
                j4.X(this.b, valueAnimator);
                break;
        }
    }
}
