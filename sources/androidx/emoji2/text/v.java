package androidx.emoji2.text;

import ab.b0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import c8.pb;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v extends ReplacementSpan {
    public final o b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public v(o oVar) {
        pb.a(oVar, "metadata cannot be null");
        this.b = oVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        l.a().getClass();
        o oVar = this.b;
        b0 b0Var = oVar.b;
        Typeface typeface = (Typeface) b0Var.e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) b0Var.c, oVar.a * 2, 2, f10, i12, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        o oVar = this.b;
        this.c = abs / (oVar.b().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.a) : (short) 0);
        s1.a b10 = oVar.b();
        int a10 = b10.a(14);
        if (a10 != 0) {
            ((ByteBuffer) b10.d).getShort(a10 + b10.a);
        }
        short s5 = (short) ((oVar.b().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
