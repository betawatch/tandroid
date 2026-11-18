package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ a00(c00 c00Var, int i7) {
        this.a = i7;
        this.b = c00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c00 c00Var = this.b;
                c00Var.getClass();
                c00Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var.invalidate();
                break;
            case 1:
                c00 c00Var2 = this.b;
                c00Var2.getClass();
                c00Var2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                c00Var2.invalidate();
                break;
            default:
                c00 c00Var3 = this.b;
                c00Var3.getClass();
                c00Var3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c00Var3.invalidate();
                break;
        }
    }
}
