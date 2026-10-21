package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                cy.V(this.b, this.c, valueAnimator);
                break;
            default:
                cy.C0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
