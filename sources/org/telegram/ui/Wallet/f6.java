package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class f6 extends wp {
    public final /* synthetic */ g6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.L = g6Var;
    }

    @Override // org.telegram.ui.Components.wp, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        g6 g6Var = this.L;
        FrameLayout.LayoutParams layoutParams = g6Var.P;
        if (g6Var.i0) {
            return;
        }
        this.x = 1.0f;
        if (g6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, g6Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * g6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = g6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((g6Var.N.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                g6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (g6Var.h0 == null) {
                    g6Var.h0 = new o6(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    g6Var.m();
                }
                Drawable drawable = this.c;
                g6Var.h0.setBounds(drawable.getBounds());
                o6 o6Var = g6Var.h0;
                o6Var.i = g6Var.f0.c;
                this.c = o6Var;
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
