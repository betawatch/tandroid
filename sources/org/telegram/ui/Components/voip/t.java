package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.a50;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ t(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                xVar.getClass();
                xVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.invalidate();
                break;
            default:
                x xVar2 = this.b;
                xVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar2.c = floatValue;
                a50 a50Var = xVar2.j0;
                a50Var.q3.setAlpha(1.0f - floatValue);
                x30 x30Var = a50Var.F1;
                x30Var.setAlpha((1.0f - a50Var.R3.c) * (x30Var.getTag() != null ? 1.0f : 0.0f));
                a50Var.G1(a50Var.p2);
                xVar2.l();
                break;
        }
    }
}
