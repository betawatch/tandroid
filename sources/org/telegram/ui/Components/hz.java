package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ hz(nz nzVar, int i7) {
        this.a = i7;
        this.b = nzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz nzVar = this.b;
                nzVar.y = floatValue;
                nzVar.invalidate();
                break;
            default:
                nz nzVar2 = this.b;
                nzVar2.getClass();
                nzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar2.invalidate();
                break;
        }
    }
}
