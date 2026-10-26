package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ f2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.getClass();
                p2Var.V3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.b;
                p2Var2.getClass();
                p2Var2.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var2.invalidate();
                break;
            default:
                p2 p2Var3 = this.b;
                p2Var3.getClass();
                p2Var3.y4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var3.invalidate();
                break;
        }
    }
}
