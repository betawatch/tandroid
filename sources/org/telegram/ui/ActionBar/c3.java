package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ c3(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                h3 h3Var = e3Var.G;
                h3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h3Var.onContainerViewTranslation();
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                e3Var.invalidate();
                break;
            case 1:
                e3 e3Var2 = this.b;
                e3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.y = floatValue;
                h3 h3Var2 = e3Var2.G;
                h3Var2.containerView.setTranslationX(floatValue);
                h3Var2.container.invalidate();
                break;
            case 2:
                e3 e3Var3 = this.b;
                e3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var3.y = floatValue2;
                h3 h3Var3 = e3Var3.G;
                h3Var3.containerView.setTranslationX(floatValue2);
                h3Var3.container.invalidate();
                break;
            case 3:
                e3 e3Var4 = this.b;
                e3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var4 = e3Var4.G;
                h3Var4.backDrawable.setAlpha(h3Var4.dimBehind ? (int) (h3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                h3 h3Var5 = this.b.G;
                e3 e3Var5 = h3Var5.container;
                if (e3Var5 != null) {
                    e3Var5.invalidate();
                }
                h3Var5.onContainerViewTranslation();
                break;
        }
    }
}
