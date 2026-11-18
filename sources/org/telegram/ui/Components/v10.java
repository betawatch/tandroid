package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ v10(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z10 z10Var = this.b;
                z10Var.s.x = (int) floatValue;
                z10Var.i();
                x10 x10Var = z10Var.a;
                if (x10Var.getParent() != null) {
                    z10Var.n.updateViewLayout(x10Var, z10Var.s);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z10 z10Var2 = this.b;
                z10Var2.s.y = (int) floatValue2;
                x10 x10Var2 = z10Var2.a;
                if (x10Var2.getParent() != null) {
                    z10Var2.n.updateViewLayout(x10Var2, z10Var2.s);
                    break;
                }
                break;
        }
    }
}
