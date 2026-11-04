package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ hu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                uw uwVar = this.b;
                uwVar.getClass();
                uwVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uw uwVar2 = this.b;
                uwVar2.getClass();
                uwVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
