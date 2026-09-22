package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ cx0(FrameLayout frameLayout, View view, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dx0 dx0Var = (dx0) this.c;
                dx0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                ((im0) this.b).invalidate();
                break;
            default:
                ((i81) this.c).E(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
