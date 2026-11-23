package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;
    public final /* synthetic */ float c;

    public /* synthetic */ ju(bx bxVar, float f10, int i7) {
        this.a = i7;
        this.b = bxVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bx.o0(this.b, this.c, valueAnimator);
                break;
            default:
                bx.H0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
