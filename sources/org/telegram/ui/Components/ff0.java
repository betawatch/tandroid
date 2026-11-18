package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ ff0(if0 if0Var, int i7) {
        this.a = i7;
        this.b = if0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if0Var.getClass();
                if0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var.c(true);
                break;
            default:
                if0 if0Var2 = this.b;
                if0Var2.getClass();
                if0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var2.c(true);
                break;
        }
    }
}
