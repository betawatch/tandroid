// default package

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nv7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv7 b;

    public /* synthetic */ nv7(yv7 yv7Var, byte b) {
        this.a = b;
        this.b = yv7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yv7 yv7Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6 a6Var = yv7Var.e;
                a6Var.setScaleX(gl.R1(0.8f, 1.0f, floatValue));
                a6Var.setScaleY(gl.R1(0.8f, 1.0f, floatValue));
                a6Var.setAlpha(gl.R1(0.0f, 1.0f, floatValue));
                TextView textView = yv7Var.x;
                textView.setScaleX(gl.R1(1.0f, 0.9f, floatValue));
                textView.setScaleY(gl.R1(1.0f, 0.9f, floatValue));
                textView.setAlpha(gl.R1(1.0f, 0.0f, floatValue));
                yv7Var.s.setAlpha(gl.R1(0.0f, 1.0f, floatValue));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv7Var.b0 = floatValue2;
                yv7Var.h(floatValue2);
                yv7Var.setAlpha(yv7Var.b0);
                break;
        }
    }
}
