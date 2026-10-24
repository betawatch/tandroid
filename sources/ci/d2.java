package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ d2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p4 p4Var = this.b;
                p4Var.getClass();
                p4Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                break;
            case 1:
                p4 p4Var2 = this.b;
                p4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var2.t3 = floatValue;
                p4Var2.r3.setTransitionProgress(floatValue);
                break;
            default:
                p4.Y(this.b, valueAnimator);
                break;
        }
    }
}
