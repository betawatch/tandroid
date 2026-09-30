package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;

    public /* synthetic */ fh(wi wiVar, int i10) {
        this.a = i10;
        this.b = wiVar;
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
                wi.m(this.b, valueAnimator);
                break;
            case 3:
                wi wiVar = this.b;
                wiVar.getClass();
                wiVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.b2();
                break;
        }
    }
}
