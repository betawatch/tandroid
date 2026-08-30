package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ ug(li liVar, int i10) {
        this.a = i10;
        this.b = liVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.b2();
                break;
            case 1:
                this.b.A0.invalidate();
                break;
            case 2:
                li.m(this.b, valueAnimator);
                break;
            case 3:
                li liVar = this.b;
                liVar.getClass();
                liVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.b2();
                break;
        }
    }
}
