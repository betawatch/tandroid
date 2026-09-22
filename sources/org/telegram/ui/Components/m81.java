package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z81 b;

    public /* synthetic */ m81(z81 z81Var, int i10) {
        this.a = i10;
        this.b = z81Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z81 z81Var = this.b;
                z81Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = z81Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (z81Var.y) {
                        z81Var.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        z81Var.F(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        z81Var.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        z81Var.F(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    z81Var.c = floatValue;
                    z81Var.x(true);
                    o81 o81Var = z81Var.M;
                    if (o81Var != null) {
                        o81Var.v.invalidate();
                        z81Var.M.v.g1();
                        z81Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                z81 z81Var2 = this.b;
                z81Var2.getClass();
                z81Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                z81 z81Var3 = this.b;
                z81Var3.N.onAnimationUpdate(valueAnimator);
                z81Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z81Var3.M.v.g1();
                z81Var3.M.invalidate();
                break;
            default:
                z81 z81Var4 = this.b;
                z81Var4.getClass();
                z81Var4.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
