package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class p51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public p51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.a = 1;
        this.d = zuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                t51 t51Var = (t51) this.d;
                t51Var.N = true;
                t51Var.n.scrollBy(0, floatValue - this.b);
                t51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.zu) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public p51(t51 t51Var, int i10) {
        this.a = 0;
        this.d = t51Var;
        this.c = i10;
        this.b = 0;
    }
}
