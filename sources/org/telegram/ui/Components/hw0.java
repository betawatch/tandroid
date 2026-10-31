package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ hw0(FrameLayout frameLayout, View view, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                jw0 jw0Var = (jw0) this.c;
                jw0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.invalidate();
                ((ul0) this.b).invalidate();
                break;
            default:
                ((w71) this.c).F(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
