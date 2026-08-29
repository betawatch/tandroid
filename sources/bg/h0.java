package bg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(Object obj, int i10, int i11, int i12) {
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
                g1 g1Var = (g1) obj;
                g1Var.G1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                g1Var.Y0.invalidate();
                break;
            case 1:
                t5 t5Var = (t5) obj;
                t5Var.w1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                t5Var.P0.invalidate();
                break;
            case 2:
                org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) obj;
                c4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                aj0 aj0Var = c4Var.f;
                aj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                g6.B1(aj0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 3:
                n6 n6Var = (n6) obj;
                n6Var.getClass();
                n6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                n6Var.invalidateSelf();
                break;
            case 4:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.k0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i12 * floatValue;
                scrollSlidingTextTabStrip.T = i11 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                nx0 nx0Var = (nx0) ((cm0) obj).b;
                nx0Var.c.setAlpha(animatedFraction);
                nx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    nx0Var.y0(i11 + i14);
                    nx0Var.c.setTranslationY(i14);
                    break;
                }
                break;
        }
    }
}
