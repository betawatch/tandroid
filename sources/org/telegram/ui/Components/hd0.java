package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ hd0(sd0 sd0Var, int i10) {
        this.a = i10;
        this.b = sd0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sd0 sd0Var = this.b;
                sd0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue;
                sd0Var.f(floatValue);
                sd0Var.setAlpha(sd0Var.P);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0 sd0Var2 = this.b;
                ai.x5 x5Var = sd0Var2.e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = sd0Var2.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                sd0Var2.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
