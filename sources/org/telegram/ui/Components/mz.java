package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nz b;

    public /* synthetic */ mz(nz nzVar, int i3) {
        this.a = i3;
        this.b = nzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nz nzVar = this.b;
                nzVar.getClass();
                nzVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar.invalidate();
                break;
            case 1:
                nz nzVar2 = this.b;
                nzVar2.getClass();
                nzVar2.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                nzVar2.invalidate();
                break;
            default:
                nz nzVar3 = this.b;
                nzVar3.getClass();
                nzVar3.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nzVar3.invalidate();
                break;
        }
    }
}
