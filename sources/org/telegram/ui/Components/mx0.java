package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ mx0(FrameLayout frameLayout, View view, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nx0 nx0Var = (nx0) this.c;
                nx0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.invalidate();
                ((um0) this.b).invalidate();
                break;
            default:
                ((w81) this.c).E(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
