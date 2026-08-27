package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ b3 f;

    public o2(b3 b3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = b3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b3 b3Var = this.f;
        t2 t2Var = b3Var.x;
        y2 y2Var = b3Var.S;
        s2 s2Var = b3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b3Var.c0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        b3Var.b0 = floatValue;
        y2Var.setAlpha(1.0f - floatValue);
        y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * b3Var.b0);
        float f10 = this.b;
        float f11 = b3Var.c0;
        float f12 = this.c;
        s2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        s2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, b3Var.c0));
        b3Var.h0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, b3Var.c0));
        b3Var.i0.setAlpha(b3Var.b0);
        b3Var.e.invalidate();
        t2Var.setViewPortHeightOffset(s2Var.getTranslationY() - f12);
        t2Var.n(false, false);
        b3Var.C();
    }
}
