package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mp implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ c31 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zp e;

    public mp(zp zpVar, c31 c31Var, float f7, boolean z10) {
        this.e = zpVar;
        this.b = c31Var;
        this.c = f7;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zp zpVar = this.e;
        zpVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || zpVar.R <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
