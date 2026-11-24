// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n8a extends ImageSpan {
    public static tyb b;
    public final /* synthetic */ byte a = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n8a() {
        super(r0, 0);
        tyb tybVar = b;
        if (tybVar == null) {
            tybVar = new tyb(bkb.n2);
            b = tybVar;
        }
        float textSize = bkb.n2.getTextSize() * 0.89f;
        int i = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                int i6 = paint.getFontMetricsInt().descent;
                canvas.translate(f, ((i4 + i6) - ((i6 - r3.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (k96.a0) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                break;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i3 = fontMetricsInt2.descent;
                    int i4 = fontMetricsInt2.ascent;
                    int i5 = ((i3 - i4) / 2) + i4;
                    int i6 = (bounds.bottom - bounds.top) / 2;
                    int i7 = i5 - i6;
                    fontMetricsInt.ascent = i7;
                    fontMetricsInt.top = i7;
                    int i8 = i5 + i6;
                    fontMetricsInt.bottom = i8;
                    fontMetricsInt.descent = i8;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
                super.updateDrawState(textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public /* synthetic */ n8a(Drawable drawable) {
        super(drawable);
    }
}
