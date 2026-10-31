package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k6 extends dq {
    public final /* synthetic */ l6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.L = l6Var;
    }

    @Override // org.telegram.ui.Components.dq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        l6 l6Var = this.L;
        FrameLayout.LayoutParams layoutParams = l6Var.P;
        if (l6Var.i0) {
            return;
        }
        this.x = 1.0f;
        if (l6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, l6Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * l6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f10 = l6Var.b;
                float f11 = intrinsicHeight * f10;
                float f12 = (f10 * f7) + layoutParams.leftMargin;
                float height = ((l6Var.N.getHeight() / 2.0f) - (f11 / 2.0f)) + layoutParams.topMargin;
                l6Var.f.set(f12, height, intrinsicWidth + f12, f11 + height);
            }
            if (max < 1.0f) {
                if (l6Var.h0 == null) {
                    l6Var.h0 = new t6(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    l6Var.m();
                }
                Drawable drawable = this.c;
                l6Var.h0.setBounds(drawable.getBounds());
                t6 t6Var = l6Var.h0;
                t6Var.i = l6Var.f0.c;
                this.c = t6Var;
                this.d = false;
                this.x = 1.0f - max;
                super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
                this.c = drawable;
                this.d = true;
            }
            this.x = max;
            if (max == 0.0f) {
                return;
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
