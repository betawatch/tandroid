package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jp implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ t21 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wp e;

    public jp(wp wpVar, t21 t21Var, float f7, boolean z10) {
        this.e = wpVar;
        this.b = t21Var;
        this.c = f7;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wp wpVar = this.e;
        wpVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || wpVar.R <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
