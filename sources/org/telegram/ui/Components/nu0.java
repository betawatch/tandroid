package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class nu0 extends CharacterStyle {
    public final Paint a;
    public final Path b;

    public nu0() {
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
        nu0[] nu0VarArr = (nu0[]) spanned.getSpans(0, spanned.length(), nu0.class);
        if (nu0VarArr == null || nu0VarArr.length == 0) {
            return;
        }
        int i7 = 0;
        while (i7 < nu0VarArr.length) {
            nu0 nu0Var = nu0VarArr[i7];
            int spanStart = spanned.getSpanStart(nu0Var);
            int spanEnd = spanned.getSpanEnd(nu0Var);
            int lineForOffset = layout2.getLineForOffset(spanStart);
            int lineForOffset2 = layout2.getLineForOffset(spanEnd);
            int i10 = lineForOffset;
            while (i10 <= lineForOffset2) {
                float lineBottom = layout2.getLineBottom(i10) - org.telegram.messenger.g0.L(1.0f);
                float primaryHorizontal = layout2.getPrimaryHorizontal(i10 == lineForOffset ? spanStart : layout2.getLineStart(i10));
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(i10 == lineForOffset2 ? spanEnd : layout2.getLineEnd(i10) - 1);
                nu0Var.getClass();
                float L = org.telegram.messenger.g0.L(1.33f);
                float L2 = org.telegram.messenger.g0.L(10.0f);
                float L3 = org.telegram.messenger.g0.L(2.0f);
                Paint paint = nu0Var.a;
                Spanned spanned2 = spanned;
                nu0[] nu0VarArr2 = nu0VarArr;
                int i11 = i7;
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
                paint.setStrokeWidth(L);
                Path path = nu0Var.b;
                path.rewind();
                path.moveTo(primaryHorizontal, lineBottom);
                float f10 = primaryHorizontal;
                while (f10 < primaryHorizontal2) {
                    float f11 = f10;
                    float f12 = L2;
                    path.quadTo((L2 / 4.0f) + f10, lineBottom - L3, (L2 / 2.0f) + f11, lineBottom);
                    float f13 = f11 + f12;
                    path.quadTo(((f12 * 3.0f) / 4.0f) + f11, lineBottom + L3, f13, lineBottom);
                    f10 = f13;
                    L2 = f12;
                }
                if (f10 > primaryHorizontal2) {
                    canvas.save();
                    float f14 = L / 2.0f;
                    canvas.clipRect(primaryHorizontal - f14, (lineBottom - L3) - f14, primaryHorizontal2 + f14, lineBottom + L3 + f14);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawPath(path, paint);
                }
                i10++;
                layout2 = layout;
                spanned = spanned2;
                nu0VarArr = nu0VarArr2;
                i7 = i11;
            }
            i7++;
            layout2 = layout;
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
