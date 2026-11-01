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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class th0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final xh0 e;
    public final TextPaint f;
    public RectF g;

    public th0(qt qtVar, Layout layout, Spanned spanned, xh0 xh0Var) {
        int i10;
        int i11;
        this.a = qtVar;
        this.e = xh0Var;
        this.f = layout.getPaint();
        xh0Var.c = spanned.getSpanStart(xh0Var);
        boolean z10 = xh0Var.a;
        int spanEnd = spanned.getSpanEnd(xh0Var);
        xh0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(xh0Var.d) != '\n' && spanned.charAt(xh0Var.d - 1) == '\n') {
            xh0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(xh0Var.c);
        int lineForOffset2 = layout.getLineForOffset(xh0Var.d);
        xh0Var.f = lineForOffset2 - lineForOffset < 1;
        xh0Var.h = lineForOffset <= 0;
        xh0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z10) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (xh0Var.f) {
                i10 = 0;
            } else {
                i10 = (xh0Var.h ? 2 : 0) + 3;
            }
            this.b = org.telegram.messenger.i0.L(3 - i10) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (xh0Var.f) {
                i11 = 0;
            } else {
                i11 = (xh0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - org.telegram.messenger.i0.L(2 - i11);
        } else {
            this.b = org.telegram.messenger.i0.L(3 - (xh0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - org.telegram.messenger.i0.L(2 - (xh0Var.f ? 1 : 2));
        }
        xh0Var.r = false;
        float f7 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f7 = Math.max(f7, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                xh0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f7);
        if (z10 && qtVar != null && xh0Var.J == null) {
            xh0Var.J = new e0.h(qtVar);
        }
    }

    public final void a(Canvas canvas, int i10, int i11) {
        RectF rectF;
        int i12;
        int i13;
        Path.Direction direction;
        xh0 xh0Var = this.e;
        int i14 = xh0Var.I;
        float[] fArr = xh0Var.D;
        boolean z10 = xh0Var.a;
        Paint paint = xh0Var.y;
        Paint paint2 = xh0Var.F;
        Path path = xh0Var.H;
        float[] fArr2 = xh0Var.G;
        Path path2 = xh0Var.E;
        Drawable drawable = xh0Var.x;
        if (i14 != i11) {
            xh0Var.I = i11;
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
        if (!z10 || this.a == null || xh0Var.J == null) {
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
            xh0Var.J.d(canvas, this.g, i17 - L3, i18 - L3, i11, xh0Var.e, b());
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
        if (!xh0Var.r) {
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
