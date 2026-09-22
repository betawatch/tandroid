package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.vx0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                r6 r6Var = (r6) obj;
                r6Var.A1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r6Var.T0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = e4Var.f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.i6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) obj;
                m6Var.getClass();
                m6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                m6Var.invalidateSelf();
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
                vx0 vx0Var = (vx0) ((em0) obj).b;
                vx0Var.c.setAlpha(animatedFraction);
                vx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    vx0Var.y0(i11 + i14);
                    vx0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                qg.p0 p0Var = (qg.p0) obj;
                p0Var.K1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                p0Var.c1.invalidate();
                break;
        }
    }
}
