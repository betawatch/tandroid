package ji;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class t extends ReplacementSpan {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final int e;
    public final Paint f;

    public t(String str, Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(3);
        this.f = paint;
        this.a = str;
        this.b = bitmap;
        this.c = i10;
        this.d = i11;
        this.e = i13;
        paint.setColor(i12);
    }

    public static t a(String str, int i10, float f7) {
        s a2;
        if (str == null || str.isEmpty() || (a2 = s.a(str, f7, true)) == null) {
            return null;
        }
        return new t(str, a2.a, a2.b, a2.c, i10, a2.d);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        int color = paint.getColor();
        Paint paint2 = this.f;
        paint2.setColor(color);
        canvas.drawBitmap(bitmap, f7, i13 - (this.d - this.e), paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = this.d;
            int i13 = this.e;
            int i14 = -(i12 - i13);
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i13;
        }
        return this.c;
    }
}
