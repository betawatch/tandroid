package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kl0 extends Drawable {
    public final RectF a = new RectF();
    public final Paint b;
    public final TextPaint c;
    public int d;
    public String e;
    public final int f;
    public int g;
    public final int h;

    public kl0(int i10) {
        Paint paint = new Paint(1);
        this.b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.g = org.telegram.messenger.zs.e4;
        this.h = org.telegram.messenger.zs.e4;
        this.f = i10;
        textPaint.setTextSize(org.telegram.messenger.i0.L(11));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        if (i10 == 0) {
            this.e = org.telegram.messenger.cd.L0(2131745879, null);
        } else {
            this.e = org.telegram.messenger.cd.L0(2131750844, null);
        }
        this.d = (int) Math.ceil(textPaint.measureText(this.e));
    }

    public final void a() {
        String L0 = this.f == 0 ? org.telegram.messenger.cd.L0(2131745879, null) : org.telegram.messenger.cd.L0(2131750844, null);
        if (L0.equals(this.e)) {
            return;
        }
        this.e = L0;
        this.d = (int) Math.ceil(this.c.measureText(L0));
    }

    public final void b(int i10) {
        this.c.setColor(i10);
        this.b.setColor(i10);
        this.g = Color.alpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), this.b);
        canvas.drawText(this.e, rectF.left + org.telegram.messenger.i0.L(5.0f), rectF.top + org.telegram.messenger.i0.L(12.0f), this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(16.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(10.0f) + this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.h != i10) {
            int i11 = (int) ((i10 / 255.0f) * this.g);
            this.b.setAlpha(i11);
            this.c.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
