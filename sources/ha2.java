// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ha2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ la2 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ha2(la2 la2Var, View view, float f, byte b) {
        this.a = b;
        this.c = la2Var;
        this.d = view;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        View view = this.d;
        la2 la2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight = la2Var.G.getMeasuredHeight();
                mu1 mu1Var = la2Var.F;
                eq0 eq0Var = (eq0) view;
                float measuredHeight2 = ((((measuredHeight - mu1Var.P9) - mu1Var.Ya) / 2.0f) - (eq0Var.getMeasuredHeight() / 2.0f)) + mu1Var.P9;
                eq0Var.setTranslationY(((((float) eq0Var.getTop()) > measuredHeight2 ? measuredHeight2 - eq0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * f));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight3 = la2Var.G.getMeasuredHeight();
                mu1 mu1Var2 = la2Var.F;
                g7c g7cVar = (g7c) view;
                float measuredHeight4 = ((((measuredHeight3 - mu1Var2.P9) - mu1Var2.Ya) / 2.0f) - (g7cVar.getMeasuredHeight() / 2.0f)) + mu1Var2.P9;
                g7cVar.setTranslationY(((((float) g7cVar.getTop()) > measuredHeight4 ? measuredHeight4 - g7cVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * f));
                break;
        }
    }
}
