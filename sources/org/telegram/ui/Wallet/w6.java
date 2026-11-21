package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.nq;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class w6 extends nq {
    public final /* synthetic */ x6 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var) {
        super(R.drawable.wallet_gram_large, 0);
        this.M = x6Var;
    }

    @Override // org.telegram.ui.Components.nq, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        x6 x6Var = this.M;
        FrameLayout.LayoutParams layoutParams = x6Var.Q;
        if (x6Var.j0) {
            return;
        }
        this.x = 1.0f;
        if (x6Var.a) {
            float max = Math.max(0.0f, Math.min(1.0f, x6Var.U));
            if (max == 0.0f) {
                float intrinsicWidth = this.c.getIntrinsicWidth() * x6Var.b;
                float intrinsicHeight = this.c.getIntrinsicHeight();
                float f11 = x6Var.b;
                float f12 = intrinsicHeight * f11;
                float f13 = (f11 * f10) + layoutParams.leftMargin;
                float height = ((x6Var.O.getHeight() / 2.0f) - (f12 / 2.0f)) + layoutParams.topMargin;
                x6Var.f.set(f13, height, intrinsicWidth + f13, f12 + height);
            }
            if (max < 1.0f) {
                if (x6Var.i0 == null) {
                    x6Var.i0 = new f7(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
                    x6Var.m();
                }
                Drawable drawable = this.c;
                x6Var.i0.setBounds(drawable.getBounds());
                f7 f7Var = x6Var.i0;
                f7Var.i = x6Var.g0.c;
                this.c = f7Var;
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
