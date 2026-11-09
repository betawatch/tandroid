package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
