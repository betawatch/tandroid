package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.f60;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                f60 f60Var = m0Var2.j0;
                f60Var.z1.setAlpha(1.0f - floatValue);
                b50 b50Var = f60Var.O;
                b50Var.setAlpha((1.0f - f60Var.a2.c) * (b50Var.getTag() != null ? 1.0f : 0.0f));
                f60Var.E1(f60Var.y0);
                m0Var2.l();
                break;
        }
    }
}
