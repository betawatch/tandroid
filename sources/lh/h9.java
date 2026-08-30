package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h9 extends ReplacementSpan {
    public final Paint a;
    public final k01 b;
    public final /* synthetic */ int c;

    public h9(int i10, String str) {
        this.c = i10;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
        this.b = new k01(str, 13.0f, AndroidUtilities.bold());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, (r12 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f10 + this.b.c, (AndroidUtilities.dp(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.a);
        int i15 = this.c;
        this.b.c(f10 + AndroidUtilities.dp(6.0f), (i12 + i14) / 2.0f, 1.0f, i15, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.b.c);
    }
}
