package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g10 b;

    public /* synthetic */ f10(g10 g10Var, int i10) {
        this.a = i10;
        this.b = g10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g10 g10Var = this.b;
                g10Var.getClass();
                g10Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var.invalidate();
                break;
            case 1:
                g10 g10Var2 = this.b;
                g10Var2.getClass();
                g10Var2.s = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                g10Var2.invalidate();
                break;
            default:
                g10 g10Var3 = this.b;
                g10Var3.getClass();
                g10Var3.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g10Var3.invalidate();
                break;
        }
    }
}
