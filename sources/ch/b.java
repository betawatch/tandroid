package ch;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public final TextPaint a;
    public final TextPaint b;
    public RadialProgress2 c;
    public StaticLayout f;
    public StaticLayout g;
    public CharSequence d = "";
    public CharSequence e = "";
    public int l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int i = AndroidUtilities.dp(10.66f);
    public final int j = AndroidUtilities.dp(12.0f);
    public final int k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.l || this.f == null || this.g == null)) {
            this.l = width;
            int i11 = (width - i10) - this.j;
            if (i11 <= 0) {
                this.f = null;
                this.g = null;
            } else {
                CharSequence charSequence = this.d;
                float f9 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f9, truncateAt);
                CharSequence charSequence2 = this.e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f9, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f == null || this.g == null) {
            return;
        }
        Rect bounds = getBounds();
        float f10 = bounds.left + i10;
        float f11 = bounds.top + this.i;
        this.c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
        canvas.save();
        canvas.translate(f10, f11);
        this.f.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, this.f.getHeight() + f11 + this.k);
        this.g.draw(canvas);
        canvas.restore();
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.i;
        int i12 = i10 + i11 + this.k;
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
        this.l = -1;
        this.f = null;
        this.g = null;
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
