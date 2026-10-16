package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ fh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.f2();
                break;
            case 1:
                this.b.G0.invalidate();
                break;
            case 2:
                vi.n(this.b, valueAnimator);
                break;
            case 3:
                vi viVar = this.b;
                viVar.getClass();
                viVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                vi viVar2 = this.b;
                ni niVar = viVar2.B0;
                cl clVar = viVar2.w0;
                if (niVar == clVar && clVar != null) {
                    clVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.f2();
                break;
        }
    }
}
