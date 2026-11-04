package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l10 b;

    public /* synthetic */ h10(l10 l10Var, int i3) {
        this.a = i3;
        this.b = l10Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l10 l10Var = this.b;
                l10Var.r.x = (int) floatValue;
                l10Var.h();
                j10 j10Var = l10Var.a;
                if (j10Var.getParent() != null) {
                    l10Var.n.updateViewLayout(j10Var, l10Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l10 l10Var2 = this.b;
                l10Var2.r.y = (int) floatValue2;
                j10 j10Var2 = l10Var2.a;
                if (j10Var2.getParent() != null) {
                    l10Var2.n.updateViewLayout(j10Var2, l10Var2.r);
                    break;
                }
                break;
        }
    }
}
