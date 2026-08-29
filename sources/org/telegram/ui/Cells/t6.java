package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.s21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t6 extends ImageSpan {
    public static s21 b;
    public final /* synthetic */ int a = 1;

    public /* synthetic */ t6(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                int i15 = paint.getFontMetricsInt().descent;
                canvas.translate(f9, ((i13 + i15) - ((i15 - r4.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (LocaleController.isRTL) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i10, i11, f9, i12, i13, i14, paint);
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
    public t6() {
        super(r0, 0);
        s21 s21Var = b;
        if (s21Var == null) {
            s21Var = new s21(org.telegram.ui.ActionBar.g6.o2);
            b = s21Var;
        }
        float textSize = org.telegram.ui.ActionBar.g6.o2.getTextSize() * 0.89f;
        int i10 = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i10, (int) textSize, ((int) (textSize * 1.25f)) + i10);
    }
}
