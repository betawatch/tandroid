// default package

import android.animation.ValueAnimator;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ht implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ ht(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.V(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oVar.a1 = floatValue;
                oVar.r0.setTranslationY(((1.0f - floatValue) * hl.L(51.0f)) + oVar.q0);
                break;
        }
    }
}
