package eg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y0 extends org.telegram.ui.Cells.q {
    public p2 e;
    public Paint f;
    public float h;

    @Override // org.telegram.ui.Cells.q, android.view.View
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        p2 p2Var = this.e;
        p2Var.c.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
        float f10 = -dp;
        p2Var.a.set(f10, f10, getWidth() + dp, getHeight() + dp);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        p2Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f);
        super.draw(canvas);
    }
}
