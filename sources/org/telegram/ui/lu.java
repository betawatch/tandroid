package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ lu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                yw ywVar = this.b;
                ywVar.getClass();
                ywVar.R4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.getClass();
                ywVar2.L4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
