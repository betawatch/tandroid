package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug0 b;

    public /* synthetic */ sg0(ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = this.b;
                ug0Var.getClass();
                ug0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.invalidate();
                break;
            default:
                ug0 ug0Var2 = this.b;
                ug0Var2.getClass();
                ug0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.invalidate();
                break;
        }
    }
}
