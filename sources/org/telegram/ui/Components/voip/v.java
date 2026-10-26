package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.ui.r40;
import org.telegram.ui.v50;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ v(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                l0Var.getClass();
                l0Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var2.c = floatValue;
                v50 v50Var = l0Var2.j0;
                v50Var.z1.setAlpha(1.0f - floatValue);
                r40 r40Var = v50Var.O;
                r40Var.setAlpha((1.0f - v50Var.a2.c) * (r40Var.getTag() != null ? 1.0f : 0.0f));
                v50Var.E1(v50Var.y0);
                l0Var2.l();
                break;
        }
    }
}
