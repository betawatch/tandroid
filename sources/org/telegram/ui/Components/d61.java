package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p61 b;

    public /* synthetic */ d61(p61 p61Var, int i7) {
        this.a = i7;
        this.b = p61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p61 p61Var = this.b;
                p61Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = p61Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (p61Var.D) {
                        p61Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        p61Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        p61Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        p61Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    p61Var.c = floatValue;
                    p61Var.x(true);
                    f61 f61Var = p61Var.M;
                    if (f61Var != null) {
                        f61Var.w.invalidate();
                        p61Var.M.w.g1();
                        p61Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                p61 p61Var2 = this.b;
                p61Var2.getClass();
                p61Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                p61 p61Var3 = this.b;
                p61Var3.N.onAnimationUpdate(valueAnimator);
                p61Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p61Var3.M.w.g1();
                p61Var3.M.invalidate();
                break;
            default:
                p61 p61Var4 = this.b;
                p61Var4.getClass();
                p61Var4.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
