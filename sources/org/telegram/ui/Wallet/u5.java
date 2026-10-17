package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class u5 extends yq {
    public final /* synthetic */ v5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(v5 v5Var, int i10) {
        super(i10, 0);
        this.a = v5Var;
    }

    @Override // org.telegram.ui.Components.yq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        v5 v5Var = this.a;
        t5 t5Var = v5Var.R;
        RectF rectF = v5Var.f;
        if (v5Var.o0) {
            return;
        }
        setAlpha(1.0f);
        if (v5Var.a && (v5Var.G instanceof c6) && v5Var.H.getWidth() > 0) {
            c6 c6Var = (c6) v5Var.G;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * v5Var.b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight();
            float f10 = v5Var.b;
            float f11 = intrinsicHeight * f10;
            float f12 = f10 * f7;
            float height = (t5Var.getHeight() / 2.0f) - (f11 / 2.0f);
            rectF.set(f12, height, intrinsicWidth + f12, f11 + height);
            if (!v5Var.r || v5Var.a0 <= 0.0f) {
                FrameLayout.LayoutParams layoutParams = v5Var.T;
                rectF.offset(layoutParams.leftMargin, layoutParams.topMargin);
                v5Var.h.set(rectF);
            } else {
                v5Var.c.mapRect(rectF);
            }
            c6Var.c(rectF.left / v5Var.H.getWidth(), rectF.top / v5Var.H.getHeight(), rectF.width() / v5Var.H.getWidth(), rectF.height() / v5Var.H.getHeight());
            if (c6Var.c) {
                t5Var.postInvalidateOnAnimation();
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, v5Var.a0));
                v5Var.m0 = v5Var.l0.d(v5Var.n, false);
                c6Var.setDiamondAlpha(v5Var.c());
                float f13 = (1.0f - max) * v5Var.m0;
                if (f13 > 0.0f) {
                    if (v5Var.n0 == null) {
                        v5Var.n0 = new i6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                        v5Var.o();
                    }
                    Drawable drawable = this.drawable;
                    v5Var.n0.setBounds(drawable.getBounds());
                    i6 i6Var = v5Var.n0;
                    float f14 = v5Var.m0;
                    i6Var.j = f14 > 0.0f ? Math.min(1.0f, v5Var.j0.c / f14) : 0.0f;
                    this.drawable = v5Var.n0;
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
