package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.rf;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ y(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                rf rfVar = this.b.f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = rfVar.a;
                chatActivityEnterView.A1 = floatValue;
                chatActivityEnterView.o2();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var = this.b;
                l0Var.b0 = floatValue2;
                l0Var.f.d(floatValue2);
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0 l0Var2 = this.b;
                l0Var2.F0 = floatValue3;
                tl tlVar = l0Var2.E0;
                if (tlVar != null && !tlVar.c0()) {
                    l0Var2.E0.a0();
                    break;
                }
                break;
        }
    }
}
