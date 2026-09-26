package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ ag0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.d.setAlpha(floatValue);
                eg0Var.e.setAlpha(floatValue);
                eg0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = eg0Var.w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                break;
            default:
                eg0 eg0Var2 = this.b;
                eg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var2.f.setProgress(floatValue2);
                eg0Var2.d.setAlpha(floatValue2);
                eg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = eg0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
