package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l9 extends ReplacementSpan {
    public final Paint a;
    public final nz0 b;
    public final /* synthetic */ int c;

    public l9(int i9, String str) {
        this.c = i9;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
        this.b = new nz0(str, 13.0f, AndroidUtilities.bold());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, (r12 - AndroidUtilities.dp(20.0f)) / 2.0f, AndroidUtilities.dp(12.0f) + f10 + this.b.c, (AndroidUtilities.dp(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.a);
        int i14 = this.c;
        this.b.c(f10 + AndroidUtilities.dp(6.0f), (i11 + i13) / 2.0f, 1.0f, i14, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (AndroidUtilities.dp(12.0f) + this.b.c);
    }
}
