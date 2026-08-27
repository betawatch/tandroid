package lh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t4(Object obj, int i10, int i11, int i12) {
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
                f6 f6Var = (f6) obj;
                f6Var.w1.a = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                f6Var.P0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) obj;
                b4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                ri0 ri0Var = b4Var.f;
                ri0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.g6.B1(ri0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.r(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                i6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.k0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i12 * floatValue;
                scrollSlidingTextTabStrip.T = i11 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ex0 ex0Var = (ex0) ((sl0) obj).b;
                ex0Var.c.setAlpha(animatedFraction);
                ex0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ex0Var.y0(i11 + i14);
                    ex0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) obj;
                l0Var.G1.a = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                l0Var.Y0.invalidate();
                break;
        }
    }
}
