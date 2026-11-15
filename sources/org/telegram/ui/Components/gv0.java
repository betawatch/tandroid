package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ gv0(FrameLayout frameLayout, View view, int i7) {
        this.a = i7;
        this.c = frameLayout;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hv0 hv0Var = (hv0) this.c;
                hv0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.invalidate();
                ((wk0) this.b).invalidate();
                break;
            default:
                ((w61) this.c).D(this.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
