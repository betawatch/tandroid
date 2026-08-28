package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc0 b;

    public /* synthetic */ oc0(yc0 yc0Var, int i9) {
        this.a = i9;
        this.b = yc0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yc0 yc0Var = this.b;
                yc0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0Var.L = floatValue;
                yc0Var.f(floatValue);
                yc0Var.setAlpha(yc0Var.L);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0 yc0Var2 = this.b;
                dh.g gVar = yc0Var2.e;
                gVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                gVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, floatValue2));
                gVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                TextView textView = yc0Var2.w;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, floatValue2));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, floatValue2));
                yc0Var2.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
