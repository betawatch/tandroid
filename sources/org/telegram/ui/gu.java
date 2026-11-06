package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ float c;

    public /* synthetic */ gu(ww wwVar, float f10, int i7) {
        this.a = i7;
        this.b = wwVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ww.a0(this.b, this.c, valueAnimator);
                break;
            default:
                ww.G0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
