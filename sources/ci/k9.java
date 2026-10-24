package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ k9(n9 n9Var, int i10) {
        this.a = i10;
        this.b = n9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z9 z9Var = this.b.I0;
                z9Var.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9.k(z9Var);
                break;
            default:
                z9 z9Var2 = this.b.I0;
                z9Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9.k(z9Var2);
                break;
        }
    }
}
