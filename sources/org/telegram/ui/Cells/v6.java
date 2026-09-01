package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.d31;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v6 extends ImageSpan {
    public static d31 b;
    public final /* synthetic */ int a = 1;

    public /* synthetic */ v6(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                int i15 = paint.getFontMetricsInt().descent;
                canvas.translate(f10, ((i13 + i15) - ((i15 - r4.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (LocaleController.isRTL) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
                break;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                Rect bounds = getDrawable().getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                    int i12 = fontMetricsInt2.descent;
                    int i13 = fontMetricsInt2.ascent;
                    int i14 = ((i12 - i13) / 2) + i13;
                    int i15 = (bounds.bottom - bounds.top) / 2;
                    int i16 = i14 - i15;
                    fontMetricsInt.ascent = i16;
                    fontMetricsInt.top = i16;
                    int i17 = i14 + i15;
                    fontMetricsInt.bottom = i17;
                    fontMetricsInt.descent = i17;
                }
                return bounds.right;
            default:
                return super.getSize(paint, charSequence, i10, i11, fontMetricsInt);
        }
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i10 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
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
    public v6() {
        super(r0, 0);
        d31 d31Var = b;
        if (d31Var == null) {
            d31Var = new d31(org.telegram.ui.ActionBar.k6.o2);
            b = d31Var;
        }
        float textSize = org.telegram.ui.ActionBar.k6.o2.getTextSize() * 0.89f;
        int i10 = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
    }
}
