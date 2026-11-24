// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class boa extends CharacterStyle {
    public final Paint a;
    public final Path b;

    public boa() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void a(Canvas canvas, Layout layout) {
        CharSequence text;
        Layout layout2 = layout;
        if (layout2 == null || (text = layout2.getText()) == null || !(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        boa[] boaVarArr = (boa[]) spanned.getSpans(0, spanned.length(), boa.class);
        if (boaVarArr == null || boaVarArr.length == 0) {
            return;
        }
        int i = 0;
        while (i < boaVarArr.length) {
            boa boaVar = boaVarArr[i];
            int spanStart = spanned.getSpanStart(boaVar);
            int spanEnd = spanned.getSpanEnd(boaVar);
            int lineForOffset = layout2.getLineForOffset(spanStart);
            int lineForOffset2 = layout2.getLineForOffset(spanEnd);
            int i2 = lineForOffset;
            while (i2 <= lineForOffset2) {
                float lineBottom = layout2.getLineBottom(i2) - gm.L(1.0f);
                float primaryHorizontal = layout2.getPrimaryHorizontal(i2 == lineForOffset ? spanStart : layout2.getLineStart(i2));
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(i2 == lineForOffset2 ? spanEnd : layout2.getLineEnd(i2) - 1);
                boaVar.getClass();
                float L = gm.L(1.33f);
                float L2 = gm.L(10.0f);
                float L3 = gm.L(2.0f);
                Paint paint = boaVar.a;
                Spanned spanned2 = spanned;
                boa[] boaVarArr2 = boaVarArr;
                int i3 = i;
                paint.setColor(cmb.w0(null, cmb.Ei, false));
                paint.setStrokeWidth(L);
                Path path = boaVar.b;
                path.rewind();
                path.moveTo(primaryHorizontal, lineBottom);
                float f = primaryHorizontal;
                while (f < primaryHorizontal2) {
                    float f2 = f;
                    float f3 = L2;
                    path.quadTo((L2 / 4.0f) + f, lineBottom - L3, (L2 / 2.0f) + f2, lineBottom);
                    float f4 = f2 + f3;
                    path.quadTo(((f3 * 3.0f) / 4.0f) + f2, lineBottom + L3, f4, lineBottom);
                    f = f4;
                    L2 = f3;
                }
                if (f > primaryHorizontal2) {
                    canvas.save();
                    float f5 = L / 2.0f;
                    canvas.clipRect(primaryHorizontal - f5, (lineBottom - L3) - f5, primaryHorizontal2 + f5, lineBottom + L3 + f5);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawPath(path, paint);
                }
                i2++;
                layout2 = layout;
                spanned = spanned2;
                boaVarArr = boaVarArr2;
                i = i3;
            }
            i++;
            layout2 = layout;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
