package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ f2(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.getClass();
                m3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.h();
                break;
            default:
                this.b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
