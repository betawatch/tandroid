package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ lv0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uv0 uv0Var = this.b;
                uv0Var.getClass();
                uv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uv0 uv0Var2 = this.b;
                uv0Var2.getClass();
                uv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
