package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ d3 f;

    public q2(d3 d3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = d3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d3 d3Var = this.f;
        v2 v2Var = d3Var.y;
        a3 a3Var = d3Var.X;
        u2 u2Var = d3Var.w;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d3Var.h0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        d3Var.g0 = floatValue;
        a3Var.setAlpha(1.0f - floatValue);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.g0);
        float f7 = this.b;
        float f10 = d3Var.h0;
        float f11 = this.c;
        u2Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        u2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, d3Var.h0));
        d3Var.m0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, d3Var.h0));
        d3Var.n0.setAlpha(d3Var.g0);
        d3Var.f.invalidate();
        v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f11);
        v2Var.n(false, false);
        d3Var.D();
    }
}
