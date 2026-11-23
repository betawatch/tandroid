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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class eh0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final ih0 e;
    public final TextPaint f;
    public RectF g;

    public eh0(pt ptVar, Layout layout, Spanned spanned, ih0 ih0Var) {
        int i7;
        int i10;
        this.a = ptVar;
        this.e = ih0Var;
        this.f = layout.getPaint();
        ih0Var.c = spanned.getSpanStart(ih0Var);
        boolean z10 = ih0Var.a;
        int spanEnd = spanned.getSpanEnd(ih0Var);
        ih0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(ih0Var.d) != '\n' && spanned.charAt(ih0Var.d - 1) == '\n') {
            ih0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(ih0Var.c);
        int lineForOffset2 = layout.getLineForOffset(ih0Var.d);
        ih0Var.f = lineForOffset2 - lineForOffset < 1;
        ih0Var.h = lineForOffset <= 0;
        ih0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z10) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (ih0Var.f) {
                i7 = 0;
            } else {
                i7 = (ih0Var.h ? 2 : 0) + 3;
            }
            this.b = org.telegram.messenger.g0.L(3 - i7) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (ih0Var.f) {
                i10 = 0;
            } else {
                i10 = (ih0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - org.telegram.messenger.g0.L(2 - i10);
        } else {
            this.b = org.telegram.messenger.g0.L(3 - (ih0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - org.telegram.messenger.g0.L(2 - (ih0Var.f ? 1 : 2));
        }
        ih0Var.r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                ih0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z10 && ptVar != null && ih0Var.K == null) {
            ih0Var.K = new e0.g(ptVar);
        }
    }

    public final void a(Canvas canvas, int i7, int i10) {
        RectF rectF;
        int i11;
        int i12;
        Path.Direction direction;
        ih0 ih0Var = this.e;
        int i13 = ih0Var.J;
        float[] fArr = ih0Var.E;
        boolean z10 = ih0Var.a;
        Paint paint = ih0Var.y;
        Paint paint2 = ih0Var.G;
        Path path = ih0Var.I;
        float[] fArr2 = ih0Var.H;
        Path path2 = ih0Var.F;
        Drawable drawable = ih0Var.x;
        if (i13 != i10) {
            ih0Var.J = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.o(i10, 30));
        }
        int L = z10 ? i7 : org.telegram.messenger.g0.L(32.0f) + this.d;
        int i14 = ((double) L) >= ((double) i7) * 0.95d ? i7 : L;
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF2 = org.telegram.messenger.g0.P;
        int i15 = this.b;
        float f10 = i15;
        float f11 = i14;
        int i16 = i14;
        int i17 = this.c;
        float f12 = i17;
        rectF2.set(0.0f, f10, f11, f12);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = org.telegram.messenger.g0.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (!z10 || this.a == null || ih0Var.K == null) {
            rectF = rectF2;
            i11 = i15;
            i12 = i17;
            direction = direction2;
        } else {
            if (this.g == null) {
                this.g = new RectF();
            }
            int L3 = org.telegram.messenger.g0.L(3.333f);
            i11 = i15;
            i12 = i17;
            direction = direction2;
            rectF = rectF2;
            ih0Var.K.d(canvas, this.g, i16 - L3, i17 - L3, i10, ih0Var.e, b());
        }
        rectF.set(-org.telegram.messenger.g0.L(3.0f), f10, 0.0f, f12);
        float L4 = org.telegram.messenger.g0.L(4.0f);
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
        if (!ih0Var.r) {
            int intrinsicHeight = (int) (((i11 + i12) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > org.telegram.messenger.g0.L(8.0f) + i11) {
                intrinsicHeight = org.telegram.messenger.g0.L(4.0f) + i11;
            }
            drawable.setBounds((i16 - drawable.getIntrinsicWidth()) - org.telegram.messenger.g0.L(4.0f), intrinsicHeight, i16 - org.telegram.messenger.g0.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha((int) 255.0f);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.e.a && ((float) (this.c - this.b)) > (this.f.getTextSize() * 1.3f) * ((float) 3);
    }
}
