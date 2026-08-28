package kh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class db extends ImageSpan {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(Drawable drawable, Drawable drawable2) {
        super(drawable);
        this.a = drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(1.0f) + ((i13 - i11) / 2));
        this.a.setAlpha(paint.getAlpha());
        super.draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (super.getSize(paint, charSequence, i9, i10, fontMetricsInt) / 3) * 2;
    }
}
