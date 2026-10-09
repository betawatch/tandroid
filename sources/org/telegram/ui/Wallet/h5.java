package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h5 extends er {
    public final /* synthetic */ i5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(m4 m4Var, int i10) {
        super(i10, 0);
        this.a = m4Var;
    }

    @Override // org.telegram.ui.Components.er, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        setAlpha(1.0f);
        i5 i5Var = this.a;
        boolean z10 = i5Var.a;
        g5 g5Var = i5Var.L;
        RectF rectF = i5Var.f;
        if (z10 && (i5Var.E instanceof q5) && i5Var.F.getWidth() > 0) {
            q5 q5Var = (q5) i5Var.E;
            float intrinsicWidth = this.drawable.getIntrinsicWidth() * i5Var.b;
            float intrinsicHeight = this.drawable.getIntrinsicHeight();
            float f10 = i5Var.b;
            float f11 = intrinsicHeight * f10;
            float f12 = f10 * f7;
            float height = (g5Var.getHeight() / 2.0f) - (f11 / 2.0f);
            rectF.set(f12, height, intrinsicWidth + f12, f11 + height);
            if (!i5Var.h || i5Var.R <= 0.0f) {
                rectF.offset(i5Var.N.leftMargin, (i5Var.F.getHeight() / 2.0f) - AndroidUtilities.dp(22.0f));
            } else {
                i5Var.c.mapRect(rectF);
            }
            q5Var.c(rectF.left / i5Var.F.getWidth(), rectF.top / i5Var.F.getHeight(), rectF.width() / i5Var.F.getWidth(), rectF.height() / i5Var.F.getHeight());
            if (q5Var.d || !q5Var.c) {
                float max = Math.max(0.0f, Math.min(1.0f, i5Var.R));
                setAlpha(max);
                if (max == 0.0f) {
                    return;
                }
            } else {
                g5Var.postInvalidateOnAnimation();
            }
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }
}
