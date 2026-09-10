package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ d3(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                h3 h3Var = f3Var.G;
                h3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                h3Var.onContainerViewTranslation();
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                f3Var.invalidate();
                break;
            case 1:
                f3 f3Var2 = this.b;
                f3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var2.y = floatValue;
                h3 h3Var2 = f3Var2.G;
                h3Var2.containerView.setTranslationX(floatValue);
                h3Var2.container.invalidate();
                break;
            case 2:
                f3 f3Var3 = this.b;
                f3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var3.y = floatValue2;
                h3 h3Var3 = f3Var3.G;
                h3Var3.containerView.setTranslationX(floatValue2);
                h3Var3.container.invalidate();
                break;
            case 3:
                f3 f3Var4 = this.b;
                f3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var4 = f3Var4.G;
                h3Var4.backDrawable.setAlpha(h3Var4.dimBehind ? (int) (h3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                h3 h3Var5 = this.b.G;
                f3 f3Var5 = h3Var5.container;
                if (f3Var5 != null) {
                    f3Var5.invalidate();
                }
                h3Var5.onContainerViewTranslation();
                break;
        }
    }
}
