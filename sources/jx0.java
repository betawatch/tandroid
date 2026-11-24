// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ wx0 f;

    public jx0(wx0 wx0Var, boolean z, float f, float f2, float f3, float f4) {
        this.f = wx0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        wx0 wx0Var = this.f;
        ox0 ox0Var = wx0Var.E;
        tx0 tx0Var = wx0Var.Y;
        nx0 nx0Var = wx0Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wx0Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        wx0Var.h0 = floatValue;
        tx0Var.setAlpha(1.0f - floatValue);
        tx0Var.setTranslationY((-a.getCurrentActionBarHeight()) * wx0Var.h0);
        float f = this.b;
        float f2 = wx0Var.i0;
        float f3 = this.c;
        nx0Var.setTranslationY(gm.R1(f, f3, f2));
        nx0Var.setTranslationX(gm.R1(this.d, 0.0f, wx0Var.i0));
        wx0Var.n0.setTranslationX(gm.R1(this.e, 0.0f, wx0Var.i0));
        wx0Var.o0.setAlpha(wx0Var.h0);
        wx0Var.f.invalidate();
        ox0Var.setViewPortHeightOffset(nx0Var.getTranslationY() - f3);
        ox0Var.l(false, false);
        wx0Var.H();
    }
}
