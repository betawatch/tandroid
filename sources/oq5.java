// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oq5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q b;

    public /* synthetic */ oq5(q qVar, byte b) {
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
                un9 un9Var = qVar.Q;
                if (un9Var != null) {
                    un9Var.y(floatValue2);
                    break;
                }
                break;
        }
    }
}
