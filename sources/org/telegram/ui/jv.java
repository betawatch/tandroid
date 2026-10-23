package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
