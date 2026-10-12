package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ float c;

    public /* synthetic */ cw(yy yyVar, float f7, int i10) {
        this.a = i10;
        this.b = yyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yy.V(this.b, this.c, valueAnimator);
                break;
            default:
                yy.B0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
