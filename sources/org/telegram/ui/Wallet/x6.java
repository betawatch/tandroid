package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class x6 extends kq {
    public final /* synthetic */ y6 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = y6Var;
    }

    @Override // org.telegram.ui.Components.kq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        y6 y6Var = this.M;
        FrameLayout.LayoutParams layoutParams = y6Var.Q;
        if (y6Var.j0) {
            return;
        }
        this.x = 1.0f;
        if (y6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, y6Var.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * y6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = y6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((y6Var.O.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                y6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (y6Var.i0 == null) {
                    y6Var.i0 = new g7(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    y6Var.m();
                }
                Drawable drawable = this.c;
                y6Var.i0.setBounds(drawable.getBounds());
                g7 g7Var = y6Var.i0;
                g7Var.i = y6Var.g0.c;
                this.c = g7Var;
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
