package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class x51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public x51(org.telegram.ui.ru ruVar, int i10, int i11) {
        this.a = 1;
        this.d = ruVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                b61 b61Var = (b61) this.d;
                b61Var.N = true;
                b61Var.n.scrollBy(0, floatValue - this.b);
                b61Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.ru) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public x51(b61 b61Var, int i10) {
        this.a = 0;
        this.d = b61Var;
        this.c = i10;
        this.b = 0;
    }
}
