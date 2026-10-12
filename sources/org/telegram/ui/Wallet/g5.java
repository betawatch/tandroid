package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.br;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g5 extends br {
    public final /* synthetic */ h5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(m4 m4Var, int i10) {
        super(i10, 0);
        this.a = m4Var;
    }

    @Override // org.telegram.ui.Components.br, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        h5 h5Var = this.a;
        boolean z10 = h5Var.a;
        f5 f5Var = h5Var.L;
        RectF rectF = h5Var.f;
        if (z10 && (h5Var.E instanceof p5) && h5Var.F.getWidth() > 0) {
            p5 p5Var = (p5) h5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * h5Var.b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight();
            float f10 = h5Var.b;
            float f11 = intrinsicHeight * f10;
            float f12 = f10 * f7;
            float height = (f5Var.getHeight() / 2.0f) - (f11 / 2.0f);
            rectF.set(f12, height, intrinsicWidth + f12, f11 + height);
            if (!h5Var.h || h5Var.R <= 0.0f) {
                rectF.offset(h5Var.N.leftMargin, (h5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            } else {
                h5Var.c.mapRect(rectF);
            }
            p5Var.c(rectF.left / h5Var.F.getWidth(), rectF.top / h5Var.F.getHeight(), rectF.width() / h5Var.F.getWidth(), rectF.height() / h5Var.F.getHeight());
            if (p5Var.d || !p5Var.c) {
                float max = Math.max(0.0f, Math.min(1.0f, h5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            } else {
                f5Var.postInvalidateOnAnimation();
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
