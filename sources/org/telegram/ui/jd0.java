package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ md0 b;

    public /* synthetic */ jd0(md0 md0Var, int i3) {
        this.a = i3;
        this.b = md0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                md0 md0Var = this.b;
                md0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                md0Var.d.setAlpha(floatValue);
                md0Var.e.setAlpha(floatValue);
                md0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = md0Var.x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                md0 md0Var2 = this.b;
                md0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                md0Var2.f.setProgress(floatValue2);
                md0Var2.d.setAlpha(floatValue2);
                md0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = md0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
