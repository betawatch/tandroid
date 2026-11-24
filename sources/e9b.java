// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class e9b extends ImageSpan {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9b(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.a = drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, gm.L(1.0f) + ((i5 - i3) / 2));
        this.a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i, i2, fontMetricsInt) / 3) << 1;
    }
}
