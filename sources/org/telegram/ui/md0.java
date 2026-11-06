package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;

    public /* synthetic */ md0(pd0 pd0Var, int i7) {
        this.a = i7;
        this.b = pd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pd0 pd0Var = this.b;
                pd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var.d.setAlpha(floatValue);
                pd0Var.e.setAlpha(floatValue);
                pd0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = pd0Var.x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                pd0 pd0Var2 = this.b;
                pd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd0Var2.f.setProgress(floatValue2);
                pd0Var2.d.setAlpha(floatValue2);
                pd0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = pd0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
