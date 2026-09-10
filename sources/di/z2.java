package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ n3 f;

    public z2(n3 n3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = n3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n3 n3Var = this.f;
        e3 e3Var = n3Var.x;
        k3 k3Var = n3Var.W;
        d3 d3Var = n3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n3Var.g0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        n3Var.f0 = floatValue;
        k3Var.setAlpha(1.0f - floatValue);
        k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * n3Var.f0);
        float f7 = this.b;
        float f10 = n3Var.g0;
        float f11 = this.c;
        d3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        d3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, n3Var.g0));
        n3Var.l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, n3Var.g0));
        n3Var.m0.setAlpha(n3Var.f0);
        n3Var.e.invalidate();
        e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f11);
        e3Var.o(false, false);
        n3Var.C();
    }
}
