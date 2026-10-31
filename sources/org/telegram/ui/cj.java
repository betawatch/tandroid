package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ cj(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                un unVar = (un) this.b;
                unVar.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.l1.invalidate();
                break;
            case 1:
                ay ayVar = (ay) this.b;
                ayVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ayVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((m91) this.b).y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
