package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;

    public /* synthetic */ od0(rd0 rd0Var, int i7) {
        this.a = i7;
        this.b = rd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rd0 rd0Var = this.b;
                rd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var.d.setAlpha(floatValue);
                rd0Var.e.setAlpha(floatValue);
                rd0Var.f.setProgress(floatValue);
                FrameLayout frameLayout = rd0Var.x;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                rd0 rd0Var2 = this.b;
                rd0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd0Var2.f.setProgress(floatValue2);
                rd0Var2.d.setAlpha(floatValue2);
                rd0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = rd0Var2.x;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
