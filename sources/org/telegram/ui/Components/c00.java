package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ c00(e00 e00Var, int i7) {
        this.a = i7;
        this.b = e00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e00 e00Var = this.b;
                e00Var.getClass();
                e00Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e00Var.invalidate();
                break;
            case 1:
                e00 e00Var2 = this.b;
                e00Var2.getClass();
                e00Var2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e00Var2.invalidate();
                break;
            default:
                e00 e00Var3 = this.b;
                e00Var3.getClass();
                e00Var3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e00Var3.invalidate();
                break;
        }
    }
}
