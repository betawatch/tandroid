package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ux0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        int i11 = this.c;
        int i12 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj;
                q6Var.A1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                q6Var.T0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) obj;
                d4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = d4Var.f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.j6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) obj;
                p6Var.getClass();
                p6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                p6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.o0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue;
                scrollSlidingTextTabStrip.a0 = i11 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ux0 ux0Var = (ux0) ((em0) obj).b;
                ux0Var.c.setAlpha(animatedFraction);
                ux0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ux0Var.y0(i11 + i14);
                    ux0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                rg.o0 o0Var = (rg.o0) obj;
                o0Var.K1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                o0Var.c1.invalidate();
                break;
        }
    }
}
