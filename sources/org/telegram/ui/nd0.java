package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;

    public /* synthetic */ nd0(qd0 qd0Var, int i7) {
        this.a = i7;
        this.b = qd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qd0 qd0Var = this.b;
                qd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd0Var.d.setAlpha(floatValue);
                qd0Var.e.setAlpha(floatValue);
                qd0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = qd0Var.x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                qd0 qd0Var2 = this.b;
                qd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd0Var2.f.setProgress(floatValue2);
                qd0Var2.d.setAlpha(floatValue2);
                qd0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = qd0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
