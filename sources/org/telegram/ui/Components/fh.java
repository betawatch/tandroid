package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                dl dlVar = viVar2.w0;
                if (niVar == dlVar && dlVar != null) {
                    dlVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.f2();
                break;
        }
    }
}
