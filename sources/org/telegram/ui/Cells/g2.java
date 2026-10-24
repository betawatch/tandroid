package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ g2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                q2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                break;
            case 1:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                break;
            default:
                q2 q2Var3 = this.b;
                q2Var3.getClass();
                q2Var3.y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var3.invalidate();
                break;
        }
    }
}
