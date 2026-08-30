package dg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fa;
import ph.o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u1 extends org.telegram.ui.Cells.v0 {
    public final fa h2;
    public final TextPaint i2;
    public final /* synthetic */ w1 j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, Context context, a9.a aVar) {
        super(context, aVar, false);
        this.j2 = w1Var;
        this.h2 = new fa(w1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.i2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint G(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.i2;
        }
        if ("paintChatActionBackground".equals(str)) {
            o4 o4Var = this.j2.h;
            o4Var.s0 = true;
            boolean z4 = o4Var.y0;
            fa faVar = this.h2;
            if (faVar.r != z4) {
                faVar.r = z4;
                if (faVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, faVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, faVar.r ? 0.12f : -0.06f);
                    faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    faVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c3 = faVar.c(1.0f);
            if (c3 != null) {
                return c3;
            }
        }
        return super.G(str);
    }
}
