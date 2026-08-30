package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm b;

    public /* synthetic */ im(nm nmVar, int i10) {
        this.a = i10;
        this.b = nmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nm nmVar = this.b;
                nmVar.getClass();
                nmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar.invalidate();
                break;
            default:
                nm nmVar2 = this.b;
                nmVar2.getClass();
                nmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nmVar2.invalidate();
                break;
        }
    }
}
