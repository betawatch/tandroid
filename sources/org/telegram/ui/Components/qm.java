package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ qm(wm wmVar, int i10) {
        this.a = i10;
        this.b = wmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                wmVar.getClass();
                wmVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.invalidate();
                break;
            default:
                wm wmVar2 = this.b;
                wmVar2.getClass();
                wmVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.invalidate();
                break;
        }
    }
}
