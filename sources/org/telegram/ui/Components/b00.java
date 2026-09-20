package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ b00(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.b;
                i00Var.x = floatValue;
                i00Var.invalidate();
                break;
            default:
                i00 i00Var2 = this.b;
                i00Var2.getClass();
                i00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                break;
        }
    }
}
