package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ii implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ ii(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                an anVar = (an) this.b;
                anVar.Ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.m1.invalidate();
                break;
            case 1:
                yw ywVar = (yw) this.b;
                ywVar.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ywVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((t71) this.b).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
