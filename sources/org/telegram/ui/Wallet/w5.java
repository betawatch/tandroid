package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w5 extends yq {
    public final /* synthetic */ x5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(x5 x5Var, int i10) {
        super(i10, 0);
        this.a = x5Var;
    }

    @Override // org.telegram.ui.Components.yq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        x5 x5Var = this.a;
        v5 v5Var = x5Var.R;
        RectF rectF = x5Var.f;
        if (x5Var.o0) {
            return;
        }
        setAlpha(1.0f);
        if (x5Var.a && (x5Var.G instanceof f6) && x5Var.H.getWidth() > 0) {
            f6 f6Var = (f6) x5Var.G;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * x5Var.b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight();
            float f10 = x5Var.b;
            float f11 = intrinsicHeight * f10;
            float f12 = f10 * f7;
            float height = (v5Var.getHeight() / 2.0f) - (f11 / 2.0f);
            rectF.set(f12, height, intrinsicWidth + f12, f11 + height);
            if (!x5Var.r || x5Var.a0 <= 0.0f) {
                FrameLayout.LayoutParams layoutParams = x5Var.T;
                rectF.offset(layoutParams.leftMargin, layoutParams.topMargin);
                x5Var.h.set(rectF);
            } else {
                x5Var.c.mapRect(rectF);
            }
            f6Var.c(rectF.left / x5Var.H.getWidth(), rectF.top / x5Var.H.getHeight(), rectF.width() / x5Var.H.getWidth(), rectF.height() / x5Var.H.getHeight());
            if (f6Var.c) {
                v5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, x5Var.a0));
                x5Var.m0 = x5Var.l0.d(x5Var.n, false);
                f6Var.setDiamondAlpha(x5Var.c());
                float f13 = (1.0f - max) * x5Var.m0;
                if (f13 > 0.0f) {
                    if (x5Var.n0 == null) {
                        x5Var.n0 = new l6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                        x5Var.o();
                    }
                    Drawable drawable = this.drawable;
                    x5Var.n0.setBounds(drawable.getBounds());
                    l6 l6Var = x5Var.n0;
                    float f14 = x5Var.m0;
                    l6Var.j = f14 > 0.0f ? Math.min(1.0f, x5Var.j0.c / f14) : 0.0f;
                    this.drawable = x5Var.n0;
                    this.recolorDrawable = false;
                    setAlpha(f13);
                    super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                    this.drawable = drawable;
                    this.recolorDrawable = true;
                }
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
