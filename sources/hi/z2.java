package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m3 f;

    public z2(m3 m3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = m3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        m3 m3Var = this.f;
        e3 e3Var = m3Var.y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.w;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m3Var.h0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        m3Var.g0 = floatValue;
        j3Var.setAlpha(1.0f - floatValue);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.g0);
        float f7 = this.b;
        float f10 = m3Var.h0;
        float f11 = this.c;
        d3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        d3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, m3Var.h0));
        m3Var.m0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, m3Var.h0));
        m3Var.n0.setAlpha(m3Var.g0);
        m3Var.f.invalidate();
        e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f11);
        e3Var.n(false, false);
        m3Var.D();
    }
}
