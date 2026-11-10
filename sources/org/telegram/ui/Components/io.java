package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class io implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ xz0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vo e;

    public io(vo voVar, xz0 xz0Var, float f10, boolean z9) {
        this.e = voVar;
        this.b = xz0Var;
        this.c = f10;
        this.d = z9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        vo voVar = this.e;
        voVar.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || voVar.L1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
