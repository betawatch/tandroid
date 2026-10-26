package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ f3(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                k3 k3Var = h3Var.G;
                k3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                k3Var.onContainerViewTranslation();
                k3Var.onSmoothContainerViewLayout(k3Var.containerView.getTranslationY());
                h3Var.invalidate();
                break;
            case 1:
                h3 h3Var2 = this.b;
                h3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var2.y = floatValue;
                k3 k3Var2 = h3Var2.G;
                k3Var2.containerView.setTranslationX(floatValue);
                k3Var2.container.invalidate();
                break;
            case 2:
                h3 h3Var3 = this.b;
                h3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var3.y = floatValue2;
                k3 k3Var3 = h3Var3.G;
                k3Var3.containerView.setTranslationX(floatValue2);
                k3Var3.container.invalidate();
                break;
            case 3:
                h3 h3Var4 = this.b;
                h3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3 k3Var4 = h3Var4.G;
                k3Var4.backDrawable.setAlpha(k3Var4.dimBehind ? (int) (k3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                k3 k3Var5 = this.b.G;
                h3 h3Var5 = k3Var5.container;
                if (h3Var5 != null) {
                    h3Var5.invalidate();
                }
                k3Var5.onContainerViewTranslation();
                break;
        }
    }
}
