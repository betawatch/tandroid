package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class so implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ zz0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ep e;

    public so(ep epVar, zz0 zz0Var, float f10, boolean z10) {
        this.e = epVar;
        this.b = zz0Var;
        this.c = f10;
        this.d = z10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ep epVar = this.e;
        epVar.M1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || epVar.M1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
