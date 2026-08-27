package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j21 extends Drawable {
    public final oi0 a;
    public int b;
    public final TextPaint c;

    public j21(TextPaint textPaint) {
        fg.a aVar = new fg.a(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        oi0 oi0Var = new oi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.a = oi0Var;
        oi0Var.setCallback(aVar);
        oi0Var.I(1);
        oi0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        oi0Var.H(true);
        oi0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        oi0 oi0Var = this.a;
        if (color != i10) {
            oi0Var.W = true;
            oi0Var.O(color, "Comp 1");
            oi0Var.m();
            oi0Var.H(true);
            oi0Var.S(0L);
            this.b = color;
        }
        oi0Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
