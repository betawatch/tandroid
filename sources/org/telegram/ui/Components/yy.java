package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz b;

    public /* synthetic */ yy(dz dzVar, int i7) {
        this.a = i7;
        this.b = dzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz dzVar = this.b;
                dzVar.y = floatValue;
                dzVar.invalidate();
                break;
            default:
                dz dzVar2 = this.b;
                dzVar2.getClass();
                dzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dzVar2.invalidate();
                break;
        }
    }
}
