package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;
    public final /* synthetic */ float c;

    public /* synthetic */ jv(cy cyVar, float f7, int i10) {
        this.a = i10;
        this.b = cyVar;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cy.W(this.b, this.c, valueAnimator);
                break;
            default:
                cy.D0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
