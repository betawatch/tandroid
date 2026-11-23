package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ ku(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                bx bxVar = this.b;
                bxVar.getClass();
                bxVar.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                bx bxVar2 = this.b;
                bxVar2.getClass();
                bxVar2.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
