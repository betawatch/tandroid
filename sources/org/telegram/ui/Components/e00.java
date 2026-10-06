package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l00 b;

    public /* synthetic */ e00(l00 l00Var, int i10) {
        this.a = i10;
        this.b = l00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00 l00Var = this.b;
                l00Var.x = floatValue;
                l00Var.invalidate();
                break;
            default:
                l00 l00Var2 = this.b;
                l00Var2.getClass();
                l00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l00Var2.invalidate();
                break;
        }
    }
}
