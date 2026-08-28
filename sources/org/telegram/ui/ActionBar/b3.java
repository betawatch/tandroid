package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ b3(d3 d3Var, int i9) {
        this.a = i9;
        this.b = d3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                f3 f3Var = d3Var.C;
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
                f3 f3Var2 = d3Var2.C;
                f3Var2.containerView.setTranslationX(floatValue);
                f3Var2.container.invalidate();
                break;
            case 2:
                d3 d3Var3 = this.b;
                d3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var3.y = floatValue2;
                f3 f3Var3 = d3Var3.C;
                f3Var3.containerView.setTranslationX(floatValue2);
                f3Var3.container.invalidate();
                break;
            case 3:
                d3 d3Var4 = this.b;
                d3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3 f3Var4 = d3Var4.C;
                f3Var4.backDrawable.setAlpha(f3Var4.dimBehind ? (int) (f3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                f3 f3Var5 = this.b.C;
                d3 d3Var5 = f3Var5.container;
                if (d3Var5 != null) {
                    d3Var5.invalidate();
                }
                f3Var5.onContainerViewTranslation();
                break;
        }
    }
}
