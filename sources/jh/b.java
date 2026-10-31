package jh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public final TextPaint a;
    public final TextPaint b;
    public RadialProgress2 c;
    public boolean d;
    public StaticLayout g;
    public StaticLayout h;
    public CharSequence e = "";
    public CharSequence f = "";
    public int m = -1;
    public final int i = i0.L(64.0f);
    public final int j = i0.L(10.66f);
    public final int k = i0.L(12.0f);
    public final int l = i0.L(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(i0.L(15.0f));
        textPaint.setTypeface(i0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        textPaint2.setTextSize(i0.L(13.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(t6.x0(null, t6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(t6.x0(null, t6.y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i10 = this.i;
        if (width > 0 && (width != this.m || this.g == null || this.h == null)) {
            this.m = width;
            int i11 = (width - i10) - this.k;
            if (i11 <= 0) {
                this.g = null;
                this.h = null;
            } else {
                float f7 = i11;
                CharSequence ellipsize = TextUtils.ellipsize(this.e, textPaint2, f7, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f, textPaint, f7, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.g = new StaticLayout(ellipsize, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.g == null || this.h == null) {
            return;
        }
        Rect bounds = getBounds();
        float f10 = bounds.left + i10;
        float f11 = bounds.top + this.j;
        this.c.r(i0.L(10.0f) + bounds.left, i0.L(9.0f) + bounds.top, i0.L(42.0f) + i0.L(10.0f) + bounds.left, i0.L(42.0f) + i0.L(9.0f) + bounds.top);
        canvas.save();
        canvas.translate(f10, f11);
        this.g.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, this.g.getHeight() + f11 + this.l);
        this.h.draw(canvas);
        canvas.restore();
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.j;
        int i12 = i10 + i11 + this.l;
        Paint.FontMetricsInt fontMetricsInt2 = this.b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = -1;
        this.g = null;
        this.h = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.c.E = i10 / 255.0f;
        this.a.setAlpha(i10);
        this.b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
