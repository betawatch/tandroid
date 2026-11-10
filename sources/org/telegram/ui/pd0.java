package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ pd0(sd0 sd0Var, int i7) {
        this.a = i7;
        this.b = sd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sd0 sd0Var = this.b;
                sd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.d.setAlpha(floatValue);
                sd0Var.e.setAlpha(floatValue);
                sd0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = sd0Var.x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                sd0 sd0Var2 = this.b;
                sd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var2.f.setProgress(floatValue2);
                sd0Var2.d.setAlpha(floatValue2);
                sd0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = sd0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
