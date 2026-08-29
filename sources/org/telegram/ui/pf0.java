package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ pf0(tf0 tf0Var, int i10) {
        this.a = i10;
        this.b = tf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tf0 tf0Var = this.b;
                tf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var.d.setAlpha(floatValue);
                tf0Var.e.setAlpha(floatValue);
                tf0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = tf0Var.w;
                frameLayout.setAlpha(floatValue);
                float f9 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f9);
                frameLayout.setScaleY(f9);
                break;
            default:
                tf0 tf0Var2 = this.b;
                tf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf0Var2.f.setProgress(floatValue2);
                tf0Var2.d.setAlpha(floatValue2);
                tf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = tf0Var2.w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                break;
        }
    }
}
