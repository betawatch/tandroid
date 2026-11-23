package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.sf;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ c0(p0 p0Var, int i7) {
        this.a = i7;
        this.b = p0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sf sfVar = this.b.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = sfVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.m2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var = this.b;
                p0Var.b0 = floatValue2;
                p0Var.f.d(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var2 = this.b;
                p0Var2.F0 = floatValue3;
                tl tlVar = p0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    p0Var2.E0.a0();
                    break;
                }
                break;
        }
    }
}
