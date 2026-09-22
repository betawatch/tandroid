package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ y9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z9.a(this.b, valueAnimator);
                break;
            default:
                z9 z9Var = this.b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
