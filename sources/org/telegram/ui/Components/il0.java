package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class il0 extends Drawable {
    public final RectF a = new RectF();
    public final Paint b;
    public final TextPaint c;
    public int d;
    public String e;
    public final int f;
    public int g;
    public final int h;

    public il0(int i9) {
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.g = 255;
        this.h = 255;
        this.f = i9;
        textPaint.setTextSize(AndroidUtilities.dp(11));
        textPaint.setTypeface(AndroidUtilities.bold());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (i9 == 0) {
            this.e = LocaleController.getString(R.string.ScamMessage);
        } else {
            this.e = LocaleController.getString(R.string.FakeMessage);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.e));
    }

    public final void a() {
        String string = this.f == 0 ? LocaleController.getString(R.string.ScamMessage) : LocaleController.getString(R.string.FakeMessage);
        if (string.equals(this.e)) {
            return;
        }
        this.e = string;
        this.d = (int) Math.ceil(this.c.measureText(string));
    }

    public final void b(int i9) {
        this.c.setColor(i9);
        this.b.setColor(i9);
        this.g = Color.alpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.b);
        canvas.drawText(this.e, rectF.left + AndroidUtilities.dp(5.0f), rectF.top + AndroidUtilities.dp(12.0f), this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(10.0f) + this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.h != i9) {
            int i10 = (int) ((i9 / 255.0f) * this.g);
            this.b.setAlpha(i10);
            this.c.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
