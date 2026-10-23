package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ ee0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe0 pe0Var = this.b;
                ci.h4 h4Var = pe0Var.e;
                h4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
                h4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                TextView textView = pe0Var.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue));
                pe0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue));
                break;
            default:
                pe0 pe0Var2 = this.b;
                pe0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe0Var2.a0 = floatValue2;
                pe0Var2.h(floatValue2);
                pe0Var2.setAlpha(pe0Var2.a0);
                break;
        }
    }
}
