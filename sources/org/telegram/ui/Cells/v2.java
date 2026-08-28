package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ v2(x2 x2Var, int i9) {
        this.a = i9;
        this.b = x2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                x2Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.requestLayout();
                q0.a aVar = x2Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(x2Var.a));
                    break;
                }
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                x2Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var2.requestLayout();
                q0.a aVar2 = x2Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(x2Var2.a));
                    break;
                }
                break;
        }
    }
}
