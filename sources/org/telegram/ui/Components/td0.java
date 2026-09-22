package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ td0(de0 de0Var, int i10) {
        this.a = i10;
        this.b = de0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                de0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.P = floatValue;
                de0Var.f(floatValue);
                de0Var.setAlpha(de0Var.P);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0 de0Var2 = this.b;
                ai.x5 x5Var = de0Var2.e;
                x5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                x5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = de0Var2.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                de0Var2.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
