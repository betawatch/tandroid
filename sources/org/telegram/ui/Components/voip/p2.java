package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ p2(q2 q2Var, int i7) {
        this.a = i7;
        this.b = q2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.getClass();
                q2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.a(q2Var.S, q2Var.T);
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.getClass();
                q2Var2.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var2.invalidate();
                break;
        }
    }
}
