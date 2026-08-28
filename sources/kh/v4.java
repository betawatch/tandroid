package kh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(Object obj, int i9, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i9;
        this.c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                g6 g6Var = (g6) obj;
                g6Var.w1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                g6Var.P0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i11, i10, valueAnimator.getAnimatedFraction(), 1.0f);
                pi0 pi0Var = e4Var.f;
                pi0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.f6.B1(pi0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                i6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.k0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i11 * floatValue;
                scrollSlidingTextTabStrip.T = i10 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cx0 cx0Var = (cx0) ((pl0) obj).b;
                cx0Var.c.setAlpha(animatedFraction);
                cx0Var.h.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    cx0Var.x0(i10 + i13);
                    cx0Var.c.setTranslationY(i13);
                    break;
                }
                break;
            default:
                yf.l0 l0Var = (yf.l0) obj;
                l0Var.G1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                l0Var.Y0.invalidate();
                break;
        }
    }
}
