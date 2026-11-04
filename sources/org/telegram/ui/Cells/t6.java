package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t6 extends ImageSpan {
    public static l11 b;
    public final /* synthetic */ int a = 1;

    public /* synthetic */ t6(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                int i14 = paint.getFontMetricsInt().descent;
                canvas.translate(f10, ((i12 + i14) - ((i14 - r4.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (bd.a0) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
                break;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i11 = fontMetricsInt2.descent;
                    int i12 = fontMetricsInt2.ascent;
                    int i13 = ((i11 - i12) / 2) + i12;
                    int i14 = (bounds.bottom - bounds.top) / 2;
                    int i15 = i13 - i14;
                    fontMetricsInt.ascent = i15;
                    fontMetricsInt.top = i15;
                    int i16 = i13 + i14;
                    fontMetricsInt.bottom = i16;
                    fontMetricsInt.descent = i16;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i3, i10, fontMetricsInt);
        }
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i3 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i3, (int) textSize, ((int) (textSize * 1.25f)) + i3);
                super.updateDrawState(textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t6() {
        super(r0, 0);
        l11 l11Var = b;
        if (l11Var == null) {
            l11Var = new l11(org.telegram.ui.ActionBar.k6.o2);
            b = l11Var;
        }
        float textSize = org.telegram.ui.ActionBar.k6.o2.getTextSize() * 0.89f;
        int i3 = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i3, (int) textSize, ((int) (textSize * 1.25f)) + i3);
    }
}
