package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class h6 extends wp {
    public final /* synthetic */ i6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(i6 i6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.L = i6Var;
    }

    @Override // org.telegram.ui.Components.wp, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        i6 i6Var = this.L;
        FrameLayout.LayoutParams layoutParams = i6Var.P;
        if (i6Var.i0) {
            return;
        }
        this.x = 1.0f;
        if (i6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, i6Var.T));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * i6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = i6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((i6Var.N.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                i6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (i6Var.h0 == null) {
                    i6Var.h0 = new q6(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    i6Var.m();
                }
                Drawable drawable = this.c;
                i6Var.h0.setBounds(drawable.getBounds());
                q6 q6Var = i6Var.h0;
                q6Var.i = i6Var.f0.c;
                this.c = q6Var;
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
