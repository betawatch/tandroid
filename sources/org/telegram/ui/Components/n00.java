package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u00 b;

    public /* synthetic */ n00(u00 u00Var, int i10) {
        this.a = i10;
        this.b = u00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00 u00Var = this.b;
                u00Var.x = floatValue;
                u00Var.invalidate();
                break;
            default:
                u00 u00Var2 = this.b;
                u00Var2.getClass();
                u00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00Var2.invalidate();
                break;
        }
    }
}
