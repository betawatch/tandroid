package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lp implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ b31 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yp e;

    public lp(yp ypVar, b31 b31Var, float f7, boolean z10) {
        this.e = ypVar;
        this.b = b31Var;
        this.c = f7;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yp ypVar = this.e;
        ypVar.R = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || ypVar.R <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
