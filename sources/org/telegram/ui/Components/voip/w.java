package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.e50;
import org.telegram.ui.i60;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                i60 i60Var = m0Var2.j0;
                i60Var.z1.setAlpha(1.0f - floatValue);
                e50 e50Var = i60Var.O;
                e50Var.setAlpha((1.0f - i60Var.a2.c) * (e50Var.getTag() != null ? 1.0f : 0.0f));
                i60Var.E1(i60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
