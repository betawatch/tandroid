package ii;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ a3 f;

    public n2(a3 a3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = a3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a3 a3Var = this.f;
        s2 s2Var = a3Var.E;
        x2 x2Var = a3Var.Y;
        r2 r2Var = a3Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a3Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        a3Var.h0 = floatValue;
        x2Var.setAlpha(1.0f - floatValue);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.h0);
        float f10 = this.b;
        float f11 = a3Var.i0;
        float f12 = this.c;
        r2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, a3Var.i0));
        a3Var.n0.setTranslationX(org.telegram.messenger.g0.T1(this.e, 0.0f, a3Var.i0));
        a3Var.o0.setAlpha(a3Var.h0);
        a3Var.f.invalidate();
        s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - f12);
        s2Var.n(false, false);
        a3Var.H();
    }
}
