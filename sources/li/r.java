package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class r extends ReplacementSpan {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final Paint f;

    public r(String str, Bitmap bitmap, int i7, int i10, int i11, int i12) {
        Paint paint = new Paint(3);
        this.f = paint;
        this.a = str;
        this.b = bitmap;
        this.c = i7;
        this.d = i10;
        this.e = i12;
        paint.setColor(i11);
    }

    public static r a(String str, int i7, float f10) {
        q a10;
        if (str == null || str.isEmpty() || (a10 = q.a(str, f10, true)) == null) {
            return null;
        }
        return new r(str, a10.a, a10.b, a10.c, i7, a10.d);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f10, i12 - (this.d - this.e), paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i11 = this.d;
            int i12 = this.e;
            int i13 = -(i11 - i12);
            fontMetricsInt.ascent = i13;
            fontMetricsInt.top = i13;
            fontMetricsInt.descent = i12;
            fontMetricsInt.bottom = i12;
        }
        return this.c;
    }
}
