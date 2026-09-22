package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ dh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.b2();
                break;
            case 1:
                this.b.D0.invalidate();
                break;
            case 2:
                vi.m(this.b, valueAnimator);
                break;
            case 3:
                vi viVar = this.b;
                viVar.getClass();
                viVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.b2();
                break;
        }
    }
}
