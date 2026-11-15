package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz b;

    public /* synthetic */ tz(vz vzVar, int i7) {
        this.a = i7;
        this.b = vzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vz vzVar = this.b;
                vzVar.getClass();
                vzVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar.invalidate();
                break;
            case 1:
                vz vzVar2 = this.b;
                vzVar2.getClass();
                vzVar2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                vzVar2.invalidate();
                break;
            default:
                vz vzVar3 = this.b;
                vzVar3.getClass();
                vzVar3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vzVar3.invalidate();
                break;
        }
    }
}
