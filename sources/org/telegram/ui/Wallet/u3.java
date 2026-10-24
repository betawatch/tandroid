package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ u3(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.getClass();
                o5Var.H0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.getClass();
                o5Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.O0();
                break;
        }
    }
}
