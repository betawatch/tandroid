package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz b;

    public /* synthetic */ qz(sz szVar, int i7) {
        this.a = i7;
        this.b = szVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sz szVar = this.b;
                szVar.getClass();
                szVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                szVar.invalidate();
                break;
            case 1:
                sz szVar2 = this.b;
                szVar2.getClass();
                szVar2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                szVar2.invalidate();
                break;
            default:
                sz szVar3 = this.b;
                szVar3.getClass();
                szVar3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                szVar3.invalidate();
                break;
        }
    }
}
