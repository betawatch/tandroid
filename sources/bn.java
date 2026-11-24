// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bn(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                gn gnVar = (gn) obj;
                gnVar.getClass();
                gnVar.u(bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                gnVar.invalidateSelf();
                break;
            case 1:
                int R0 = gl.R0(valueAnimator.getAnimatedFraction(), 1.0f, i2, i);
                ry8 ry8Var = ((y95) obj).f;
                ry8Var.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.SRC_IN));
                bkb.F1(ry8Var.getDrawable(), R0 & 620756991, true);
                break;
            case 2:
                rw5 rw5Var = (rw5) obj;
                rw5Var.A1.a = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                rw5Var.S0.invalidate();
                break;
            case 3:
                wt7 wt7Var = (wt7) obj;
                wt7Var.q1.a = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                wt7Var.J0.invalidate();
                break;
            case 4:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i3 = ScrollSlidingTextTabStrip.p0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.a0 = i2 * floatValue;
                scrollSlidingTextTabStrip.b0 = i * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                u0b u0bVar = (u0b) ((u88) obj).b;
                u0bVar.m1.setAlpha(animatedFraction);
                u0bVar.q1.setAlpha(animatedFraction);
                if (i2 != 0) {
                    int i4 = (int) ((1.0f - animatedFraction) * i2);
                    u0bVar.Q0(i + i4);
                    u0bVar.m1.setTranslationY(i4);
                    break;
                }
                break;
        }
    }
}
