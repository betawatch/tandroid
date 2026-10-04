package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class x2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ l3 f;

    public x2(l3 l3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = l3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l3 l3Var = this.f;
        c3 c3Var = l3Var.x;
        i3 i3Var = l3Var.W;
        b3 b3Var = l3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l3Var.g0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        l3Var.f0 = floatValue;
        i3Var.setAlpha(1.0f - floatValue);
        i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * l3Var.f0);
        float f7 = this.b;
        float f10 = l3Var.g0;
        float f11 = this.c;
        b3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        b3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, l3Var.g0));
        l3Var.l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, l3Var.g0));
        l3Var.m0.setAlpha(l3Var.f0);
        l3Var.e.invalidate();
        c3Var.setViewPortHeightOffset(b3Var.getTranslationY() - f11);
        c3Var.o(false, false);
        l3Var.C();
    }
}
