package jg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.w9;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 extends org.telegram.ui.Cells.s0 {
    public final w9 t2;
    public final TextPaint u2;
    public final /* synthetic */ f1 v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, Context context, i1 i1Var) {
        super(context, i1Var, false);
        this.v2 = f1Var;
        this.t2 = new w9(f1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.u2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.s0
    public final Paint P(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.u2;
        }
        if ("paintChatActionBackground".equals(str)) {
            s3 s3Var = this.v2.h;
            s3Var.v0 = true;
            boolean z10 = s3Var.B0;
            w9 w9Var = this.t2;
            if (w9Var.r != z10) {
                w9Var.r = z10;
                if (w9Var.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    org.telegram.messenger.i0.n2(colorMatrix, w9Var.r ? 0.97f : 0.92f);
                    org.telegram.messenger.i0.h(colorMatrix, w9Var.r ? 0.12f : -0.06f);
                    w9Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    w9Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c10 = w9Var.c(1.0f);
            if (c10 != null) {
                return c10;
            }
        }
        return super.P(str);
    }
}
