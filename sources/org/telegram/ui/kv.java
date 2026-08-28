package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;
    public final /* synthetic */ float c;

    public /* synthetic */ kv(dy dyVar, float f10, int i9) {
        this.a = i9;
        this.b = dyVar;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dy.U(this.b, this.c, valueAnimator);
                break;
            default:
                dy.D0(this.b, this.c, valueAnimator);
                break;
        }
    }
}
