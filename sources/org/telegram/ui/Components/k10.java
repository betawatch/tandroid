package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p10 b;

    public /* synthetic */ k10(p10 p10Var, int i7) {
        this.a = i7;
        this.b = p10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var = this.b;
                p10Var.s.x = (int) floatValue;
                p10Var.i();
                m10 m10Var = p10Var.a;
                if (m10Var.getParent() != null) {
                    p10Var.n.updateViewLayout(m10Var, p10Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p10 p10Var2 = this.b;
                p10Var2.s.y = (int) floatValue2;
                m10 m10Var2 = p10Var2.a;
                if (m10Var2.getParent() != null) {
                    p10Var2.n.updateViewLayout(m10Var2, p10Var2.s);
                    break;
                }
                break;
        }
    }
}
