package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class e6 extends wp {
    public final /* synthetic */ f6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(f6 f6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.L = f6Var;
    }

    @Override // org.telegram.ui.Components.wp, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        f6 f6Var = this.L;
        FrameLayout.LayoutParams layoutParams = f6Var.P;
        if (f6Var.i0) {
            return;
        }
        this.x = 1.0f;
        if (f6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, f6Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * f6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = f6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((f6Var.N.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                f6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (f6Var.h0 == null) {
                    f6Var.h0 = new n6(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    f6Var.m();
                }
                Drawable drawable = this.c;
                f6Var.h0.setBounds(drawable.getBounds());
                n6 n6Var = f6Var.h0;
                n6Var.i = f6Var.f0.c;
                this.c = n6Var;
                this.d = false;
                this.x = 1.0f - max;
                super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                this.c = drawable;
                this.d = true;
            }
            this.x = max;
            if (max == 0.0f) {
                return;
            }
        }
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
    }
}
