package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.f50;
import org.telegram.ui.j60;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ v(m0 m0Var, int i10) {
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
                j60 j60Var = m0Var2.j0;
                j60Var.z1.setAlpha(1.0f - floatValue);
                f50 f50Var = j60Var.O;
                f50Var.setAlpha((1.0f - j60Var.a2.c) * (f50Var.getTag() != null ? 1.0f : 0.0f));
                j60Var.E1(j60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
