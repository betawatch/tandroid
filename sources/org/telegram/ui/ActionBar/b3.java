package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ b3(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                f3 f3Var = d3Var.G;
                f3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.onContainerViewTranslation();
                f3Var.onSmoothContainerViewLayout(f3Var.containerView.getTranslationY());
                d3Var.invalidate();
                break;
            case 1:
                d3 d3Var2 = this.b;
                d3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var2.y = floatValue;
                f3 f3Var2 = d3Var2.G;
                f3Var2.containerView.setTranslationX(floatValue);
                f3Var2.container.invalidate();
                break;
            case 2:
                d3 d3Var3 = this.b;
                d3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var3.y = floatValue2;
                f3 f3Var3 = d3Var3.G;
                f3Var3.containerView.setTranslationX(floatValue2);
                f3Var3.container.invalidate();
                break;
            case 3:
                d3 d3Var4 = this.b;
                d3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var4 = d3Var4.G;
                f3Var4.backDrawable.setAlpha(f3Var4.dimBehind ? (int) (f3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                f3 f3Var5 = this.b.G;
                d3 d3Var5 = f3Var5.container;
                if (d3Var5 != null) {
                    d3Var5.invalidate();
                }
                f3Var5.onContainerViewTranslation();
                break;
        }
    }
}
