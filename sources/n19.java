// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n19 {
    public final cu3 a;
    public final int b;
    public final int c;
    public final int d;
    public final r19 e;
    public final TextPaint f;
    public RectF g;

    public n19(cu3 cu3Var, Layout layout, Spanned spanned, r19 r19Var) {
        int i;
        int i2;
        this.a = cu3Var;
        this.e = r19Var;
        this.f = layout.getPaint();
        r19Var.c = spanned.getSpanStart(r19Var);
        boolean z = r19Var.a;
        int spanEnd = spanned.getSpanEnd(r19Var);
        r19Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(r19Var.d) != '\n' && spanned.charAt(r19Var.d - 1) == '\n') {
            r19Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(r19Var.c);
        int lineForOffset2 = layout.getLineForOffset(r19Var.d);
        r19Var.f = lineForOffset2 - lineForOffset < 1;
        r19Var.h = lineForOffset <= 0;
        r19Var.n = lineForOffset2 + 1 >= layout.getLineCount();
        if (z) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (r19Var.f) {
                i = 0;
            } else {
                i = (r19Var.h ? 2 : 0) + 3;
            }
            this.b = hl.L(3 - i) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (r19Var.f) {
                i2 = 0;
            } else {
                i2 = (r19Var.n ? 2 : 0) + 3;
            }
            this.c = lineBottom - hl.L(2 - i2);
        } else {
            this.b = hl.L(3 - (r19Var.f ? 1 : 2)) + layout.getLineTop(lineForOffset);
            this.c = layout.getLineBottom(lineForOffset2) - hl.L(2 - (r19Var.f ? 1 : 2));
        }
        r19Var.r = false;
        float f = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f = Math.max(f, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                r19Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f);
        if (z && cu3Var != null && r19Var.K == null) {
            r19Var.K = new zb4(cu3Var);
        }
    }

    public final void a(Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Path.Direction direction;
        r19 r19Var = this.e;
        int i5 = r19Var.J;
        float[] fArr = r19Var.E;
        boolean z = r19Var.a;
        Paint paint = r19Var.y;
        Paint paint2 = r19Var.G;
        Path path = r19Var.I;
        float[] fArr2 = r19Var.H;
        Path path2 = r19Var.F;
        Drawable drawable = r19Var.x;
        if (i5 != i2) {
            r19Var.J = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i2);
            paint.setColor(vm2.o(i2, 30));
        }
        int L = z ? i : hl.L(32.0f) + this.d;
        int i6 = i;
        if (L < i6 * 0.95d) {
            i6 = L;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF = hl.P;
        int i7 = this.b;
        float f2 = i7;
        float f3 = i6;
        int i8 = i6;
        int i9 = this.c;
        float f4 = i9;
        rectF.set(0.0f, f2, f3, f4);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = hl.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (!z || this.a == null || r19Var.K == null) {
            i3 = i7;
            f = f2;
            i4 = i9;
            direction = direction2;
        } else {
            if (this.g == null) {
                this.g = new RectF();
            }
            int L3 = hl.L(3.333f);
            f = f2;
            i3 = i7;
            i4 = i9;
            direction = direction2;
            r19Var.K.c(canvas, this.g, i8 - L3, i9 - L3, i2, r19Var.e, b());
        }
        rectF.set(-hl.L(3.0f), f, 0.0f, f4);
        float L4 = hl.L(4.0f);
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
        if (!r19Var.r) {
            int intrinsicHeight = (int) (((i3 + i4) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > hl.L(8.0f) + i3) {
                intrinsicHeight = hl.L(4.0f) + i3;
            }
            drawable.setBounds((i8 - drawable.getIntrinsicWidth()) - hl.L(4.0f), intrinsicHeight, i8 - hl.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha(jn7.d4);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.e.a && ((float) (this.c - this.b)) > (this.f.getTextSize() * 1.3f) * 3.0f;
    }
}
