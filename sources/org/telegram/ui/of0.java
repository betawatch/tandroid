package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    public /* synthetic */ of0(sf0 sf0Var, int i10) {
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sf0 sf0Var = this.b;
                sf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf0Var.d.setAlpha(floatValue);
                sf0Var.e.setAlpha(floatValue);
                sf0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = sf0Var.w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                sf0 sf0Var2 = this.b;
                sf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf0Var2.f.setProgress(floatValue2);
                sf0Var2.d.setAlpha(floatValue2);
                sf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = sf0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
