package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d31 extends Drawable {
    public final ij0 a;
    public int b;
    public final TextPaint c;

    public d31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ij0 ij0Var = new ij0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.a = ij0Var;
        ij0Var.setCallback(fVar);
        ij0Var.I(1);
        ij0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ij0Var.H(true);
        ij0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        ij0 ij0Var = this.a;
        if (color != i10) {
            ij0Var.X = true;
            ij0Var.O(color, "Comp 1");
            ij0Var.m();
            ij0Var.H(true);
            ij0Var.S(0L);
            this.b = color;
        }
        ij0Var.draw(canvas);
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
