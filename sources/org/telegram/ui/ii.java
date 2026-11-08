package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ii implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ ii(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.b;
                anVar.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.l1.invalidate();
                break;
            case 1:
                ww wwVar = (ww) this.b;
                wwVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wwVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((v71) this.b).y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
