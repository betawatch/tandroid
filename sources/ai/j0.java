package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j0 extends ReplacementSpan {
    public final Paint a;
    public final Path b;
    public final float c;

    public j0() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        this.c = 3.25f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float L = f10 + org.telegram.messenger.g0.L(3.0f);
        float textSize = i12 - (paint.getTextSize() * 0.36f);
        int color = paint.getColor();
        Paint paint2 = this.a;
        paint2.setColor(color);
        Path path = this.b;
        path.rewind();
        float f11 = this.c;
        path.moveTo(L, textSize - org.telegram.messenger.g0.L(f11));
        path.lineTo(org.telegram.messenger.g0.L(f11) + L, textSize);
        path.lineTo(L, textSize + org.telegram.messenger.g0.L(f11));
        canvas.drawPath(path, paint2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.c + 3.0f + 1.0f);
    }
}
