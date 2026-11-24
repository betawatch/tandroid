// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class on3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un3 b;

    public /* synthetic */ on3(un3 un3Var, byte b) {
        this.a = b;
        this.b = un3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        un3 un3Var = this.b;
        switch (b) {
            case 0:
                d dVar = un3Var.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = dVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.q2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un3Var.b0 = floatValue2;
                un3Var.f.d(floatValue2);
                break;
            default:
                un3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qu1 qu1Var = un3Var.E0;
                if (qu1Var != null && !qu1Var.d0()) {
                    un3Var.E0.b0();
                    break;
                }
                break;
        }
    }
}
