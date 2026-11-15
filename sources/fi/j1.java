package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ j1(l1 l1Var, int i7) {
        this.a = i7;
        this.b = l1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l1 l1Var = this.b;
                l1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.n = floatValue;
                View view = l1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - l1Var.n);
                view.setScaleY(1.0f - l1Var.n);
                l1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(l1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                l1Var.a.invalidate();
                break;
        }
    }
}
