package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zo implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ g01 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ lp e;

    public zo(lp lpVar, g01 g01Var, float f10, boolean z10) {
        this.e = lpVar;
        this.b = g01Var;
        this.c = f10;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lp lpVar = this.e;
        lpVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || lpVar.M1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
