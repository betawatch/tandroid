// default package

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class bw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ow0 f;

    public bw0(ow0 ow0Var, boolean z, float f, float f2, float f3, float f4) {
        this.f = ow0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ow0 ow0Var = this.f;
        gw0 gw0Var = ow0Var.E;
        lw0 lw0Var = ow0Var.Y;
        fw0 fw0Var = ow0Var.x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ow0Var.i0 = floatValue;
        if (!this.a) {
            floatValue = 1.0f - floatValue;
        }
        ow0Var.h0 = floatValue;
        lw0Var.setAlpha(1.0f - floatValue);
        lw0Var.setTranslationY((-a.getCurrentActionBarHeight()) * ow0Var.h0);
        float f = this.b;
        float f2 = ow0Var.i0;
        float f3 = this.c;
        fw0Var.setTranslationY(gl.R1(f, f3, f2));
        fw0Var.setTranslationX(gl.R1(this.d, 0.0f, ow0Var.i0));
        ow0Var.n0.setTranslationX(gl.R1(this.e, 0.0f, ow0Var.i0));
        ow0Var.o0.setAlpha(ow0Var.h0);
        ow0Var.f.invalidate();
        gw0Var.setViewPortHeightOffset(fw0Var.getTranslationY() - f3);
        gw0Var.l(false, false);
        ow0Var.H();
    }
}
