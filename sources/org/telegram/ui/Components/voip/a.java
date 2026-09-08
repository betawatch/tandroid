package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = this.b;
                eVar.J = floatValue;
                eVar.invalidate();
                eVar.O = null;
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar2 = this.b;
                eVar2.K = floatValue2;
                eVar2.invalidate();
                eVar2.P = null;
                break;
            default:
                this.b.W.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
