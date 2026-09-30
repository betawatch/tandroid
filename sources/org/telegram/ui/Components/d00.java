package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k00 b;

    public /* synthetic */ d00(k00 k00Var, int i10) {
        this.a = i10;
        this.b = k00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00 k00Var = this.b;
                k00Var.x = floatValue;
                k00Var.invalidate();
                break;
            default:
                k00 k00Var2 = this.b;
                k00Var2.getClass();
                k00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k00Var2.invalidate();
                break;
        }
    }
}
