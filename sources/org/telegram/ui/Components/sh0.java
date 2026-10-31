package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sh0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final wh0 e;
    public final TextPaint f;
    public RectF g;

    public sh0(qt qtVar, Layout layout, Spanned spanned, wh0 wh0Var) {
        int i10;
        int i11;
        this.a = qtVar;
        this.e = wh0Var;
        this.f = layout.getPaint();
        wh0Var.c = spanned.getSpanStart(wh0Var);
        boolean z10 = wh0Var.a;
        int spanEnd = spanned.getSpanEnd(wh0Var);
        wh0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(wh0Var.d) != '\n' && spanned.charAt(wh0Var.d - 1) == '\n') {
            wh0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(wh0Var.c);
        int lineForOffset2 = layout.getLineForOffset(wh0Var.d);
        wh0Var.f = lineForOffset2 - lineForOffset < 1;
        wh0Var.h = lineForOffset <= 0;
        wh0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z10) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (wh0Var.f) {
                i10 = 0;
            } else {
                i10 = (wh0Var.h ? 2 : 0) + 3;
            }
            this.b = org.telegram.messenger.i0.L(3 - i10) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (wh0Var.f) {
                i11 = 0;
            } else {
                i11 = (wh0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - org.telegram.messenger.i0.L(2 - i11);
        } else {
            this.b = org.telegram.messenger.i0.L(3 - (wh0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - org.telegram.messenger.i0.L(2 - (wh0Var.f ? 1 : 2));
        }
        wh0Var.r = false;
        float f7 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f7 = Math.max(f7, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                wh0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f7);
        if (z10 && qtVar != null && wh0Var.J == null) {
            wh0Var.J = new e0.h(qtVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        wh0 wh0Var = this.e;
        int i14 = wh0Var.I;
        float[] fArr = wh0Var.D;
        boolean z10 = wh0Var.a;
        Paint paint = wh0Var.y;
        Paint paint2 = wh0Var.F;
        Path path = wh0Var.H;
        float[] fArr2 = wh0Var.G;
        Path path2 = wh0Var.E;
        Drawable drawable = wh0Var.x;
        if (i14 != i11) {
            wh0Var.I = i11;
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i11);
            paint.setColor(i0.b.o(i11, 30));
        }
        int L = z10 ? i10 : org.telegram.messenger.i0.L(32.0f) + this.d;
        int i15 = ((double) L) >= ((double) i10) * 0.95d ? i10 : L;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = org.telegram.messenger.i0.P;
        int i16 = this.b;
        float f7 = i16;
        float f10 = i15;
        int i17 = i15;
        int i18 = this.c;
        float f11 = i18;
        rectF2.set(0.0f, f7, f10, f11);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = org.telegram.messenger.i0.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (!z10 || this.a == null || wh0Var.J == null) {
            rectF = rectF2;
            i12 = i16;
            i13 = i18;
            direction = direction2;
        } else {
            if (this.g == null) {
                this.g = new RectF();
            }
            int L3 = org.telegram.messenger.i0.L(3.333f);
            i12 = i16;
            i13 = i18;
            direction = direction2;
            rectF = rectF2;
            wh0Var.J.d(canvas, this.g, i17 - L3, i18 - L3, i11, wh0Var.e, b());
        }
        rectF.set(-org.telegram.messenger.i0.L(3.0f), f7, 0.0f, f11);
        float L4 = org.telegram.messenger.i0.L(4.0f);
        fArr2[7] = L4;
        fArr2[6] = L4;
        fArr2[1] = L4;
        fArr2[0] = L4;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!wh0Var.r) {
            int intrinsicHeight = (int) (((i12 + i13) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > org.telegram.messenger.i0.L(8.0f) + i12) {
                intrinsicHeight = org.telegram.messenger.i0.L(4.0f) + i12;
            }
            drawable.setBounds((i17 - drawable.getIntrinsicWidth()) - org.telegram.messenger.i0.L(4.0f), intrinsicHeight, i17 - org.telegram.messenger.i0.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.e.a && ((float) (this.c - this.b)) > (this.f.getTextSize() * 1.3f) * ((float) 3);
    }
}
