package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ i00(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p00 p00Var = this.b;
                p00Var.x = floatValue;
                p00Var.invalidate();
                break;
            default:
                p00 p00Var2 = this.b;
                p00Var2.getClass();
                p00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p00Var2.invalidate();
                break;
        }
    }
}
