package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.sl;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ b0(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ae aeVar = this.b.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = aeVar.b;
                chatActivityEnterView.t1 = floatValue;
                chatActivityEnterView.Z1();
                break;
            case 1:
                m0 m0Var = this.b;
                m0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.b0 = floatValue2;
                m0Var.f.e(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var2 = this.b;
                m0Var2.E0 = floatValue3;
                sl slVar = m0Var2.D0;
                if (slVar != null && !slVar.c0()) {
                    m0Var2.D0.a0();
                    break;
                }
                break;
        }
    }
}
