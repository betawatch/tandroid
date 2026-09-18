package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                g3 g3Var = e3Var.G;
                g3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                g3Var.onContainerViewTranslation();
                g3Var.onSmoothContainerViewLayout(g3Var.containerView.getTranslationY());
                e3Var.invalidate();
                break;
            case 1:
                e3 e3Var2 = this.b;
                e3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var2.y = floatValue;
                g3 g3Var2 = e3Var2.G;
                g3Var2.containerView.setTranslationX(floatValue);
                g3Var2.container.invalidate();
                break;
            case 2:
                e3 e3Var3 = this.b;
                e3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var3.y = floatValue2;
                g3 g3Var3 = e3Var3.G;
                g3Var3.containerView.setTranslationX(floatValue2);
                g3Var3.container.invalidate();
                break;
            case 3:
                e3 e3Var4 = this.b;
                e3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3 g3Var4 = e3Var4.G;
                g3Var4.backDrawable.setAlpha(g3Var4.dimBehind ? (int) (g3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                g3 g3Var5 = this.b.G;
                e3 e3Var5 = g3Var5.container;
                if (e3Var5 != null) {
                    e3Var5.invalidate();
                }
                g3Var5.onContainerViewTranslation();
                break;
        }
    }
}
