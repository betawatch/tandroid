package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class w5 extends xq {
    public final /* synthetic */ x5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(x5 x5Var, int i10) {
        super(i10, 0);
        this.a = x5Var;
    }

    @Override // org.telegram.ui.Components.xq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        x5 x5Var = this.a;
        FrameLayout.LayoutParams layoutParams = x5Var.P;
        if (x5Var.i0) {
            return;
        }
        setAlpha(1.0f);
        if (x5Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, x5Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.drawable.getIntrinsicWidth() * x5Var.b;
                float intrinsicHeight = this.drawable.getIntrinsicHeight();
                float f10 = x5Var.b;
                float f11 = intrinsicHeight * f10;
                float f12 = (f10 * f7) + layoutParams.leftMargin;
                float height = ((x5Var.N.getHeight() / 2.0f) - (f11 / 2.0f)) + layoutParams.topMargin;
                x5Var.f.set(f12, height, intrinsicWidth + f12, f11 + height);
            }
            if (max < 1.0f) {
                if (x5Var.h0 == null) {
                    x5Var.h0 = new f6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                    x5Var.m();
                }
                Drawable drawable = this.drawable;
                x5Var.h0.setBounds(drawable.getBounds());
                f6 f6Var = x5Var.h0;
                f6Var.i = x5Var.f0.c;
                this.drawable = f6Var;
                this.recolorDrawable = false;
                setAlpha(1.0f - max);
                super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                this.drawable = drawable;
                this.recolorDrawable = true;
            }
            setAlpha(max);
            if (max == 0.0f) {
                return;
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
