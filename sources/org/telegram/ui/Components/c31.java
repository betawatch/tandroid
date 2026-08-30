package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c31 extends Drawable {
    public final gj0 a;
    public int b;
    public final TextPaint c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        gj0 gj0Var = new gj0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.a = gj0Var;
        gj0Var.setCallback(fVar);
        gj0Var.I(1);
        gj0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        gj0Var.H(true);
        gj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        gj0 gj0Var = this.a;
        if (color != i10) {
            gj0Var.X = true;
            gj0Var.O(color, "Comp 1");
            gj0Var.m();
            gj0Var.H(true);
            gj0Var.S(0L);
            this.b = color;
        }
        gj0Var.draw(canvas);
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
