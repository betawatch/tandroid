package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h21 extends Drawable {
    public final mi0 a;
    public int b;
    public final TextPaint c;

    public h21(TextPaint textPaint) {
        eg.a aVar = new eg.a(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        mi0 mi0Var = new mi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.a = mi0Var;
        mi0Var.setCallback(aVar);
        mi0Var.I(1);
        mi0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        mi0Var.H(true);
        mi0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i9 = this.b;
        mi0 mi0Var = this.a;
        if (color != i9) {
            mi0Var.W = true;
            mi0Var.O(color, "Comp 1");
            mi0Var.m();
            mi0Var.H(true);
            mi0Var.S(0L);
            this.b = color;
        }
        mi0Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
