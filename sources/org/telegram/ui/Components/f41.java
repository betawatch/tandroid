package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public f41(org.telegram.ui.vu vuVar, int i10, int i11) {
        this.a = 1;
        this.d = vuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                j41 j41Var = (j41) this.d;
                j41Var.J = true;
                j41Var.n.scrollBy(0, floatValue - this.b);
                j41Var.J = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.vu) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public f41(j41 j41Var, int i10) {
        this.a = 0;
        this.d = j41Var;
        this.c = i10;
        this.b = 0;
    }
}
