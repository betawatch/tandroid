package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ if0 b;

    public /* synthetic */ gf0(if0 if0Var, int i10) {
        this.a = i10;
        this.b = if0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                if0 if0Var = this.b;
                if0Var.getClass();
                if0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var.invalidate();
                break;
            default:
                if0 if0Var2 = this.b;
                if0Var2.getClass();
                if0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if0Var2.invalidate();
                break;
        }
    }
}
