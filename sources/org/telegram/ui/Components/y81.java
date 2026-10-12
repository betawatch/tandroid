package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ y81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                k91Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = k91Var.e;
                View view = viewArr[1];
                if (view != null) {
                    if (k91Var.y) {
                        k91Var.E(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        k91Var.E(viewArr[0], (-r1.getMeasuredWidth()) * floatValue);
                    } else {
                        k91Var.E(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        k91Var.E(viewArr[0], r1.getMeasuredWidth() * floatValue);
                    }
                    k91Var.c = floatValue;
                    k91Var.w(true);
                    a91 a91Var = k91Var.M;
                    if (a91Var != null) {
                        a91Var.v.invalidate();
                        k91Var.M.v.f1();
                        k91Var.M.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                k91 k91Var2 = this.b;
                k91Var2.getClass();
                k91Var2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                k91 k91Var3 = this.b;
                k91Var3.N.onAnimationUpdate(valueAnimator);
                k91Var3.M.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var3.M.v.f1();
                k91Var3.M.invalidate();
                break;
            default:
                k91 k91Var4 = this.b;
                k91Var4.getClass();
                k91Var4.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
