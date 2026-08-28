package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ pf0(tf0 tf0Var, int i9) {
        this.a = i9;
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
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
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
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
