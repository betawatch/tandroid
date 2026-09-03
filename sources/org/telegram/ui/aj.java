package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class aj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ aj(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                znVar.ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                znVar.U0.invalidate();
                break;
            case 1:
                qy qyVar = (qy) this.b;
                qyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((jd1) this.b).u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
