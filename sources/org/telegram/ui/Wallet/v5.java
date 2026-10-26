package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v5 extends zq {
    public final /* synthetic */ w5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(w5 w5Var, int i10) {
        super(i10, 0);
        this.a = w5Var;
    }

    @Override // org.telegram.ui.Components.zq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        w5 w5Var = this.a;
        FrameLayout.LayoutParams layoutParams = w5Var.P;
        if (w5Var.i0) {
            return;
        }
        setAlpha(1.0f);
        if (w5Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, w5Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.drawable.getIntrinsicWidth() * w5Var.b;
                float intrinsicHeight = this.drawable.getIntrinsicHeight();
                float f10 = w5Var.b;
                float f11 = intrinsicHeight * f10;
                float f12 = (f10 * f7) + layoutParams.leftMargin;
                float height = ((w5Var.N.getHeight() / 2.0f) - (f11 / 2.0f)) + layoutParams.topMargin;
                w5Var.f.set(f12, height, intrinsicWidth + f12, f11 + height);
            }
            if (max < 1.0f) {
                if (w5Var.h0 == null) {
                    w5Var.h0 = new e6(this.drawable.getIntrinsicWidth(), this.drawable.getIntrinsicHeight());
                    w5Var.m();
                }
                Drawable drawable = this.drawable;
                w5Var.h0.setBounds(drawable.getBounds());
                e6 e6Var = w5Var.h0;
                e6Var.i = w5Var.f0.c;
                this.drawable = e6Var;
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
