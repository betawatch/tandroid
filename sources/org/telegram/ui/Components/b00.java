package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ b00(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h00 h00Var = this.b;
                h00Var.x = floatValue;
                h00Var.invalidate();
                break;
            default:
                h00 h00Var2 = this.b;
                h00Var2.getClass();
                h00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h00Var2.invalidate();
                break;
        }
    }
}
