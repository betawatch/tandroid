package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c31 extends Drawable {
    public final hj0 a;
    public int b;
    public final TextPaint c;

    public c31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        hj0 hj0Var = new hj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = hj0Var;
        hj0Var.setCallback(fVar);
        hj0Var.I(1);
        hj0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        hj0Var.H(true);
        hj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        hj0 hj0Var = this.a;
        if (color != i10) {
            hj0Var.X = true;
            hj0Var.O(color, "Comp 1");
            hj0Var.m();
            hj0Var.H(true);
            hj0Var.S(0L);
            this.b = color;
        }
        hj0Var.draw(canvas);
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
