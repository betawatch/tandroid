package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ cj(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.b;
                boVar.la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boVar.X0.invalidate();
                break;
            case 1:
                uy uyVar = (uy) this.b;
                uyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((wd1) this.b).x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
