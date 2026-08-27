package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ a3(c3 c3Var, int i10) {
        this.a = i10;
        this.b = c3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c3 c3Var = this.b;
                e3 e3Var = c3Var.C;
                e3Var.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                e3Var.onContainerViewTranslation();
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                break;
            case 1:
                c3 c3Var2 = this.b;
                c3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var2.y = floatValue;
                e3 e3Var2 = c3Var2.C;
                e3Var2.containerView.setTranslationX(floatValue);
                e3Var2.container.invalidate();
                break;
            case 2:
                c3 c3Var3 = this.b;
                c3Var3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var3.y = floatValue2;
                e3 e3Var3 = c3Var3.C;
                e3Var3.containerView.setTranslationX(floatValue2);
                e3Var3.container.invalidate();
                break;
            case 3:
                c3 c3Var4 = this.b;
                c3Var4.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3 e3Var4 = c3Var4.C;
                e3Var4.backDrawable.setAlpha(e3Var4.dimBehind ? (int) (e3Var4.dimBehindAlpha * floatValue3) : 0);
                break;
            default:
                e3 e3Var5 = this.b.C;
                c3 c3Var5 = e3Var5.container;
                if (c3Var5 != null) {
                    c3Var5.invalidate();
                }
                e3Var5.onContainerViewTranslation();
                break;
        }
    }
}
