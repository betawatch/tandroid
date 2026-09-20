package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public o51(org.telegram.ui.ev evVar, int i10, int i11) {
        this.a = 1;
        this.d = evVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                s51 s51Var = (s51) this.d;
                s51Var.N = true;
                s51Var.n.scrollBy(0, floatValue - this.b);
                s51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.ev) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public o51(s51 s51Var, int i10) {
        this.a = 0;
        this.d = s51Var;
        this.c = i10;
        this.b = 0;
    }
}
