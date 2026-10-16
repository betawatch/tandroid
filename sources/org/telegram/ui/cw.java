package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                yy.C0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
