package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n61 b;

    public /* synthetic */ b61(n61 n61Var, int i3) {
        this.a = i3;
        this.b = n61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n61 n61Var = this.b;
                n61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = n61Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (n61Var.E) {
                        n61Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        n61Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        n61Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        n61Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    n61Var.c = floatValue;
                    n61Var.v(true);
                    d61 d61Var = n61Var.N;
                    if (d61Var != null) {
                        d61Var.w.invalidate();
                        n61Var.N.w.g1();
                        n61Var.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                n61 n61Var2 = this.b;
                n61Var2.getClass();
                n61Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                n61 n61Var3 = this.b;
                n61Var3.O.onAnimationUpdate(valueAnimator);
                n61Var3.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n61Var3.N.w.g1();
                n61Var3.N.invalidate();
                break;
            default:
                n61 n61Var4 = this.b;
                n61Var4.getClass();
                n61Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
