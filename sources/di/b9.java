package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ b9(e9 e9Var, int i7) {
        this.a = i7;
        this.b = e9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q9 q9Var = this.b.r0;
                q9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9.i(q9Var);
                break;
            default:
                q9 q9Var2 = this.b.r0;
                q9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9.i(q9Var2);
                break;
        }
    }
}
