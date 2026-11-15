package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.sl;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ c0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
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
                n0 n0Var = this.b;
                n0Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.b0 = floatValue2;
                n0Var.f.e(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = this.b;
                n0Var2.E0 = floatValue3;
                sl slVar = n0Var2.D0;
                if (slVar != null && !slVar.c0()) {
                    n0Var2.D0.a0();
                    break;
                }
                break;
        }
    }
}
