package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.f50;
import org.telegram.ui.j60;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ v(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                j60 j60Var = l0Var2.j0;
                j60Var.z1.setAlpha(1.0f - floatValue);
                f50 f50Var = j60Var.O;
                f50Var.setAlpha((1.0f - j60Var.a2.c) * (f50Var.getTag() != null ? 1.0f : 0.0f));
                j60Var.E1(j60Var.y0);
                l0Var2.l();
                break;
        }
    }
}
