package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ev0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ev0(FrameLayout frameLayout, View view, int i7) {
        this.a = i7;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fv0 fv0Var = (fv0) this.c;
                fv0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                ((rk0) this.b).invalidate();
                break;
            default:
                ((v61) this.c).F(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
