package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ x61(j71 j71Var, int i7) {
        this.a = i7;
        this.b = j71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j71 j71Var = this.b;
                j71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = j71Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (j71Var.E) {
                        j71Var.B(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        j71Var.B(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        j71Var.B(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        j71Var.B(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    j71Var.c = floatValue;
                    j71Var.t(true);
                    z61 z61Var = j71Var.N;
                    if (z61Var != null) {
                        z61Var.w.invalidate();
                        j71Var.N.w.g1();
                        j71Var.N.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                j71 j71Var2 = this.b;
                j71Var2.getClass();
                j71Var2.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                j71 j71Var3 = this.b;
                j71Var3.O.onAnimationUpdate(valueAnimator);
                j71Var3.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j71Var3.N.w.g1();
                j71Var3.N.invalidate();
                break;
            default:
                j71 j71Var4 = this.b;
                j71Var4.getClass();
                j71Var4.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
