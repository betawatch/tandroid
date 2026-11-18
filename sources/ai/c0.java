package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.qf;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                qf qfVar = this.b.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = qfVar.a;
                chatActivityEnterView.y1 = floatValue;
                chatActivityEnterView.i2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var = this.b;
                n0Var.b0 = floatValue2;
                n0Var.f.d(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = this.b;
                n0Var2.F0 = floatValue3;
                tl tlVar = n0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    n0Var2.E0.a0();
                    break;
                }
                break;
        }
    }
}
