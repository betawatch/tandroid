package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ k00(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00 q00Var = this.b;
                q00Var.x = floatValue;
                q00Var.invalidate();
                break;
            default:
                q00 q00Var2 = this.b;
                q00Var2.getClass();
                q00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q00Var2.invalidate();
                break;
        }
    }
}
