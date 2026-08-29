package bg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ka;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.Cells.v0 {
    public final ka g2;
    public final TextPaint h2;
    public final /* synthetic */ y1 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Context context, c2 c2Var) {
        super(context, c2Var, false);
        this.i2 = y1Var;
        this.g2 = new ka(y1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override // org.telegram.ui.Cells.v0
    public final Paint G(String str) {
        if ("paintChatActionText".equals(str) || "paintChatActionText2".equals(str)) {
            return this.h2;
        }
        if ("paintChatActionBackground".equals(str)) {
            f5 f5Var = this.i2.h;
            f5Var.r0 = true;
            boolean z10 = f5Var.x0;
            ka kaVar = this.g2;
            if (kaVar.r != z10) {
                kaVar.r = z10;
                if (kaVar.i == 10) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, kaVar.r ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, kaVar.r ? 0.12f : -0.06f);
                    kaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    kaVar.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
            }
            Paint c3 = kaVar.c(1.0f);
            if (c3 != null) {
                return c3;
            }
        }
        return super.G(str);
    }
}
