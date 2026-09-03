package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                h3 h3Var = f3Var.D;
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
                h3 h3Var2 = f3Var2.D;
                h3Var2.containerView.setTranslationX(floatValue);
                h3Var2.container.invalidate();
                break;
            case 2:
                f3 f3Var3 = this.b;
                f3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var3.y = floatValue2;
                h3 h3Var3 = f3Var3.D;
                h3Var3.containerView.setTranslationX(floatValue2);
                h3Var3.container.invalidate();
                break;
            case 3:
                f3 f3Var4 = this.b;
                f3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3 h3Var4 = f3Var4.D;
                h3Var4.backDrawable.setAlpha(h3Var4.dimBehind ? (int) (h3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                h3 h3Var5 = this.b.D;
                f3 f3Var5 = h3Var5.container;
                if (f3Var5 != null) {
                    f3Var5.invalidate();
                }
                h3Var5.onContainerViewTranslation();
                break;
        }
    }
}
