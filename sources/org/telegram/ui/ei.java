package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ei implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ ei(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.b;
                wmVar.Fa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.m1.invalidate();
                break;
            case 1:
                uw uwVar = (uw) this.b;
                uwVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uwVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((l71) this.b).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
