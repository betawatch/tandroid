package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ b00(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00 i00Var = this.b;
                i00Var.x = floatValue;
                i00Var.invalidate();
                break;
            default:
                i00 i00Var2 = this.b;
                i00Var2.getClass();
                i00Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i00Var2.invalidate();
                break;
        }
    }
}
