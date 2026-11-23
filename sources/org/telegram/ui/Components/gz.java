package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz b;

    public /* synthetic */ gz(mz mzVar, int i7) {
        this.a = i7;
        this.b = mzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mz mzVar = this.b;
                mzVar.y = floatValue;
                mzVar.invalidate();
                break;
            default:
                mz mzVar2 = this.b;
                mzVar2.getClass();
                mzVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mzVar2.invalidate();
                break;
        }
    }
}
