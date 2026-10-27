package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ j9(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b.x0;
                y9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var);
                break;
            default:
                y9 y9Var2 = this.b.x0;
                y9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9.k(y9Var2);
                break;
        }
    }
}
