package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zl b;

    public /* synthetic */ vl(zl zlVar, int i3) {
        this.a = i3;
        this.b = zlVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zl zlVar = this.b;
                zlVar.getClass();
                zlVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar.invalidate();
                break;
            default:
                zl zlVar2 = this.b;
                zlVar2.getClass();
                zlVar2.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zlVar2.invalidate();
                break;
        }
    }
}
