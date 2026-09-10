package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class j81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ j81(v81 v81Var, int i10) {
        this.a = i10;
        this.b = v81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v81 v81Var = this.b;
                v81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = v81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (v81Var.y) {
                        v81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        v81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        v81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        v81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    v81Var.c = floatValue;
                    v81Var.w(true);
                    l81 l81Var = v81Var.M;
                    if (l81Var != null) {
                        l81Var.v.invalidate();
                        v81Var.M.v.e1();
                        v81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                v81 v81Var2 = this.b;
                v81Var2.getClass();
                v81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                v81 v81Var3 = this.b;
                v81Var3.N.onAnimationUpdate(valueAnimator);
                v81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v81Var3.M.v.e1();
                v81Var3.M.invalidate();
                break;
            default:
                v81 v81Var4 = this.b;
                v81Var4.getClass();
                v81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
