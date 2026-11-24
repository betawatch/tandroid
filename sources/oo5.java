// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ oo5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * qVar.getMeasuredHeight() * 0.5f;
                qVar.z0 = floatValue;
                qVar.w.setTranslationY(floatValue + qVar.y0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.B0 = floatValue2;
                ul9 ul9Var = qVar.Q;
                if (ul9Var != null) {
                    ul9Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
