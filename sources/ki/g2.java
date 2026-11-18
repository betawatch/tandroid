package ki;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ t2 f;

    public g2(t2 t2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = t2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var = this.f;
        l2 l2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        k2 k2Var = t2Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t2Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        t2Var.h0 = floatValue;
        q2Var.setAlpha(1.0f - floatValue);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.h0);
        float f10 = this.b;
        float f11 = t2Var.i0;
        float f12 = this.c;
        k2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        k2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, t2Var.i0));
        t2Var.n0.setTranslationX(org.telegram.messenger.g0.T1(this.e, 0.0f, t2Var.i0));
        t2Var.o0.setAlpha(t2Var.h0);
        t2Var.f.invalidate();
        l2Var.setViewPortHeightOffset(k2Var.getTranslationY() - f12);
        l2Var.n(false, false);
        t2Var.H();
    }
}
