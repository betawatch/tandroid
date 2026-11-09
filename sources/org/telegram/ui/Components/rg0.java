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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rg0 {
    public final View a;
    public final int b;
    public final int c;
    public final int d;
    public final vg0 e;
    public final TextPaint f;
    public RectF g;

    public rg0(dt dtVar, Layout layout, Spanned spanned, vg0 vg0Var) {
        int i7;
        int i10;
        this.a = dtVar;
        this.e = vg0Var;
        this.f = layout.getPaint();
        vg0Var.c = spanned.getSpanStart(vg0Var);
        boolean z9 = vg0Var.a;
        int spanEnd = spanned.getSpanEnd(vg0Var);
        vg0Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(vg0Var.d) != '\n' && spanned.charAt(vg0Var.d - 1) == '\n') {
            vg0Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(vg0Var.c);
        int lineForOffset2 = layout.getLineForOffset(vg0Var.d);
        vg0Var.f = lineForOffset2 - lineForOffset < 1;
        vg0Var.h = lineForOffset <= 0;
        vg0Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z9) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (vg0Var.f) {
                i7 = 0;
            } else {
                i7 = (vg0Var.h ? 2 : 0) + 3;
            }
            this.b = org.telegram.messenger.g0.L(3 - i7) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (vg0Var.f) {
                i10 = 0;
            } else {
                i10 = (vg0Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - org.telegram.messenger.g0.L(2 - i10);
        } else {
            this.b = org.telegram.messenger.g0.L(3 - (vg0Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - org.telegram.messenger.g0.L(2 - (vg0Var.f ? 1 : 2));
        }
        vg0Var.r = false;
        float f10 = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f10 = Math.max(f10, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                vg0Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f10);
        if (z9 && dtVar != null && vg0Var.J == null) {
            vg0Var.J = new e0.g(dtVar);
        }
    }

    public final void a(Canvas canvas, int i7, int i10) {
        RectF rectF;
        int i11;
        int i12;
        Path.Direction direction;
        vg0 vg0Var = this.e;
        int i13 = vg0Var.I;
        float[] fArr = vg0Var.D;
        boolean z9 = vg0Var.a;
        Paint paint = vg0Var.y;
        Paint paint2 = vg0Var.F;
        Path path = vg0Var.H;
        float[] fArr2 = vg0Var.G;
        Path path2 = vg0Var.E;
        Drawable drawable = vg0Var.x;
        if (i13 != i10) {
            vg0Var.I = i10;
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i10);
            paint.setColor(i0.a.o(i10, 30));
        }
        int L = z9 ? i7 : org.telegram.messenger.g0.L(32.0f) + this.d;
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
        if (!z9 || this.a == null || vg0Var.J == null) {
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
            vg0Var.J.d(canvas, this.g, i16 - L3, i17 - L3, i10, vg0Var.e, b());
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
        if (!vg0Var.r) {
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
