package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.b50;
import org.telegram.ui.y30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ t(w wVar, int i10) {
        this.a = i10;
        this.b = wVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                wVar.getClass();
                wVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                break;
            default:
                w wVar2 = this.b;
                wVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.c = floatValue;
                b50 b50Var = wVar2.j0;
                b50Var.q3.setAlpha(1.0f - floatValue);
                y30 y30Var = b50Var.F1;
                y30Var.setAlpha((1.0f - b50Var.R3.c) * (y30Var.getTag() != null ? 1.0f : 0.0f));
                b50Var.G1(b50Var.p2);
                wVar2.l();
                break;
        }
    }
}
