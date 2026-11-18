package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.f21;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v6 extends ImageSpan {
    public static f21 b;
    public final /* synthetic */ int a = 1;

    public /* synthetic */ v6(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        switch (this.a) {
            case 0:
                Drawable drawable = getDrawable();
                canvas.save();
                int i14 = paint.getFontMetricsInt().descent;
                canvas.translate(f10, ((i12 + i14) - ((i14 - r4.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
                if (gd.a0) {
                    canvas.scale(-1.0f, 1.0f, drawable.getIntrinsicWidth() / 2, drawable.getIntrinsicHeight() / 2);
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
                break;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
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
                return super.getSize(paint, charSequence, i7, i10, fontMetricsInt);
        }
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 1:
                float textSize = textPaint.getTextSize() * 0.89f;
                int i7 = (int) (0.02f * textSize);
                getDrawable().setBounds(0, i7, (int) textSize, ((int) (textSize * 1.25f)) + i7);
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
        f21 f21Var = b;
        if (f21Var == null) {
            f21Var = new f21(org.telegram.ui.ActionBar.n6.o2);
            b = f21Var;
        }
        float textSize = org.telegram.ui.ActionBar.n6.o2.getTextSize() * 0.89f;
        int i7 = (int) (0.02f * textSize);
        getDrawable().setBounds(0, i7, (int) textSize, ((int) (textSize * 1.25f)) + i7);
    }
}
