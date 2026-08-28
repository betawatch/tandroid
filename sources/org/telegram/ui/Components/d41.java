package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public d41(org.telegram.ui.su suVar, int i9, int i10) {
        this.a = 1;
        this.d = suVar;
        this.b = i9;
        this.c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                h41 h41Var = (h41) this.d;
                h41Var.J = true;
                h41Var.n.scrollBy(0, floatValue - this.b);
                h41Var.J = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.su) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public d41(h41 h41Var, int i9) {
        this.a = 0;
        this.d = h41Var;
        this.c = i9;
        this.b = 0;
    }
}
