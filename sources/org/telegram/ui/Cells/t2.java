package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ t2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.getClass();
                v2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.requestLayout();
                q0.a aVar = v2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(v2Var.a));
                    break;
                }
                break;
            default:
                v2 v2Var2 = this.b;
                v2Var2.getClass();
                v2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.requestLayout();
                q0.a aVar2 = v2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(v2Var2.a));
                    break;
                }
                break;
        }
    }
}
