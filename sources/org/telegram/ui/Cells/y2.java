package org.telegram.ui.Cells;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ y2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.getClass();
                a3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.requestLayout();
                q0.a aVar = a3Var.c;
                if (aVar != null) {
                    aVar.accept(Float.valueOf(a3Var.a));
                    break;
                }
                break;
            default:
                a3 a3Var2 = this.b;
                a3Var2.getClass();
                a3Var2.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var2.requestLayout();
                q0.a aVar2 = a3Var2.c;
                if (aVar2 != null) {
                    aVar2.accept(Float.valueOf(a3Var2.a));
                    break;
                }
                break;
        }
    }
}
