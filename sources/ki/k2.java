package ki;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ x2 f;

    public k2(x2 x2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = x2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        x2 x2Var = this.f;
        p2 p2Var = x2Var.E;
        u2 u2Var = x2Var.Y;
        o2 o2Var = x2Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x2Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        x2Var.h0 = floatValue;
        u2Var.setAlpha(1.0f - floatValue);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * x2Var.h0);
        float f10 = this.b;
        float f11 = x2Var.i0;
        float f12 = this.c;
        o2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, x2Var.i0));
        x2Var.n0.setTranslationX(org.telegram.messenger.g0.T1(this.e, 0.0f, x2Var.i0));
        x2Var.o0.setAlpha(x2Var.h0);
        x2Var.f.invalidate();
        p2Var.setViewPortHeightOffset(o2Var.getTranslationY() - f12);
        p2Var.n(false, false);
        x2Var.H();
    }
}
