package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.u20;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ t(x xVar, int i3) {
        this.a = i3;
        this.b = xVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                xVar.getClass();
                xVar.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.invalidate();
                break;
            default:
                x xVar2 = this.b;
                xVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar2.c = floatValue;
                x30 x30Var = xVar2.k0;
                x30Var.r3.setAlpha(1.0f - floatValue);
                u20 u20Var = x30Var.G1;
                u20Var.setAlpha((1.0f - x30Var.S3.c) * (u20Var.getTag() != null ? 1.0f : 0.0f));
                x30Var.G1(x30Var.q2);
                xVar2.l();
                break;
        }
    }
}
