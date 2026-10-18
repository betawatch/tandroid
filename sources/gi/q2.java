package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        v2 v2Var = d3Var.x;
        a3 a3Var = d3Var.W;
        u2 u2Var = d3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d3Var.g0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        d3Var.f0 = floatValue;
        a3Var.setAlpha(1.0f - floatValue);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.f0);
        float f7 = this.b;
        float f10 = d3Var.g0;
        float f11 = this.c;
        u2Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        u2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, d3Var.g0));
        d3Var.l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, d3Var.g0));
        d3Var.m0.setAlpha(d3Var.f0);
        d3Var.e.invalidate();
        v2Var.setViewPortHeightOffset(u2Var.getTranslationY() - f11);
        v2Var.n(false, false);
        d3Var.D();
    }
}
