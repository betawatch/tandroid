// default package

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dm3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm3 b;

    public /* synthetic */ dm3(jm3 jm3Var, byte b) {
        this.a = b;
        this.b = jm3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jm3 jm3Var = this.b;
        switch (b) {
            case 0:
                d dVar = jm3Var.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = dVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.l2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm3Var.b0 = floatValue2;
                jm3Var.f.d(floatValue2);
                break;
            default:
                jm3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                et1 et1Var = jm3Var.E0;
                if (et1Var != null && !et1Var.d0()) {
                    jm3Var.E0.b0();
                    break;
                }
                break;
        }
    }
}
