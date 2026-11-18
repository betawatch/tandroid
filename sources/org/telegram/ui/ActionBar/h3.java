package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ h3(n3 n3Var, int i7) {
        this.a = i7;
        this.b = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                n3Var.getClass();
                n3Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.invalidate();
                break;
            case 1:
                n3 n3Var2 = this.b;
                n3Var2.getClass();
                n3Var2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                n3 n3Var3 = this.b;
                n3Var3.getClass();
                n3Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var3.invalidate();
                break;
        }
    }
}
