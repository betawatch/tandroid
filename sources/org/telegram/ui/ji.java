package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ji implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ ji(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.b;
                bnVar.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.m1.invalidate();
                break;
            case 1:
                cx cxVar = (cx) this.b;
                cxVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cxVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((x71) this.b).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
