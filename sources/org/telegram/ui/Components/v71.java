package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class v71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h81 b;

    public /* synthetic */ v71(h81 h81Var, int i10) {
        this.a = i10;
        this.b = h81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h81 h81Var = this.b;
                h81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = h81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (h81Var.y) {
                        h81Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        h81Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        h81Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        h81Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    h81Var.c = floatValue;
                    h81Var.w(true);
                    x71 x71Var = h81Var.M;
                    if (x71Var != null) {
                        x71Var.v.invalidate();
                        h81Var.M.v.f1();
                        h81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                h81 h81Var2 = this.b;
                h81Var2.getClass();
                h81Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                h81 h81Var3 = this.b;
                h81Var3.N.onAnimationUpdate(valueAnimator);
                h81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h81Var3.M.v.f1();
                h81Var3.M.invalidate();
                break;
            default:
                h81 h81Var4 = this.b;
                h81Var4.getClass();
                h81Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
