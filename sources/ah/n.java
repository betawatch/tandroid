package ah;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ n(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * r0.c.getMeasuredHeight());
                break;
            default:
                this.b.w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * r0.c.getMeasuredHeight());
                break;
        }
    }
}
