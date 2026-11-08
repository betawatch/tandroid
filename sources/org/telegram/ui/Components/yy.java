package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
