package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cc extends ReplacementSpan {
    public final Paint a;
    public final ly0 b;
    public final /* synthetic */ int c;

    public cc(int i7, String str) {
        this.c = i7;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i7));
        this.b = new ly0(str, 13.0f, org.telegram.messenger.g0.o());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, (r12 - org.telegram.messenger.g0.L(20.0f)) / 2.0f, org.telegram.messenger.g0.L(12.0f) + f10 + this.b.c, (org.telegram.messenger.g0.L(20.0f) + r12) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.a);
        int i14 = this.c;
        this.b.c(f10 + org.telegram.messenger.g0.L(6.0f), (i11 + i13) / 2.0f, 1.0f, i14, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (org.telegram.messenger.g0.L(12.0f) + this.b.c);
    }
}
