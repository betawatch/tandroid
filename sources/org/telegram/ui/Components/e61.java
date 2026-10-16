package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public e61(org.telegram.ui.iv ivVar, int i10, int i11) {
        this.a = 1;
        this.d = ivVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                i61 i61Var = (i61) this.d;
                i61Var.N = true;
                i61Var.n.scrollBy(0, floatValue - this.b);
                i61Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.iv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public e61(i61 i61Var, int i10) {
        this.a = 0;
        this.d = i61Var;
        this.c = i10;
        this.b = 0;
    }
}
