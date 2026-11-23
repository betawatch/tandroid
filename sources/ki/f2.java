package ki;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ s2 f;

    public f2(s2 s2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = s2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s2 s2Var = this.f;
        k2 k2Var = s2Var.E;
        p2 p2Var = s2Var.Y;
        j2 j2Var = s2Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s2Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        s2Var.h0 = floatValue;
        p2Var.setAlpha(1.0f - floatValue);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * s2Var.h0);
        float f10 = this.b;
        float f11 = s2Var.i0;
        float f12 = this.c;
        j2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, s2Var.i0));
        s2Var.n0.setTranslationX(org.telegram.messenger.g0.T1(this.e, 0.0f, s2Var.i0));
        s2Var.o0.setAlpha(s2Var.h0);
        s2Var.f.invalidate();
        k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f12);
        k2Var.n(false, false);
        s2Var.H();
    }
}
