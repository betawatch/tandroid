package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.d60;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ w(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.getClass();
                m0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.invalidate();
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var2.c = floatValue;
                d60 d60Var = m0Var2.j0;
                d60Var.z1.setAlpha(1.0f - floatValue);
                z40 z40Var = d60Var.O;
                z40Var.setAlpha((1.0f - d60Var.a2.c) * (z40Var.getTag() != null ? 1.0f : 0.0f));
                d60Var.E1(d60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
