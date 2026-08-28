package mh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ c3 f;

    public p2(c3 c3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = c3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c3 c3Var = this.f;
        u2 u2Var = c3Var.x;
        z2 z2Var = c3Var.S;
        t2 t2Var = c3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c3Var.c0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        c3Var.b0 = floatValue;
        z2Var.setAlpha(1.0f - floatValue);
        z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * c3Var.b0);
        float f10 = this.b;
        float f11 = c3Var.c0;
        float f12 = this.c;
        t2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        t2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, c3Var.c0));
        c3Var.h0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, c3Var.c0));
        c3Var.i0.setAlpha(c3Var.b0);
        c3Var.e.invalidate();
        u2Var.setViewPortHeightOffset(t2Var.getTranslationY() - f12);
        u2Var.n(false, false);
        c3Var.C();
    }
}
