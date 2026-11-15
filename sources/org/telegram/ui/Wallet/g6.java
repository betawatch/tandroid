package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g6 extends eq {
    public final /* synthetic */ h6 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(h6 h6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = h6Var;
    }

    @Override // org.telegram.ui.Components.eq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h6 h6Var = this.M;
        FrameLayout.LayoutParams layoutParams = h6Var.Q;
        if (h6Var.j0) {
            return;
        }
        this.x = 1.0f;
        if (h6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, h6Var.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * h6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = h6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((h6Var.O.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                h6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (h6Var.i0 == null) {
                    h6Var.i0 = new p6(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    h6Var.m();
                }
                Drawable drawable = this.c;
                h6Var.i0.setBounds(drawable.getBounds());
                p6 p6Var = h6Var.i0;
                p6Var.i = h6Var.g0.c;
                this.c = p6Var;
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
