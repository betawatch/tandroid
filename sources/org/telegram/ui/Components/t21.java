package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t21 extends Drawable {
    public final bi0 a;
    public int b;
    public final TextPaint c;

    public t21(TextPaint textPaint) {
        bi.s0 s0Var = new bi.s0(this, 5);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        bi0 bi0Var = new bi0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = bi0Var;
        bi0Var.setCallback(s0Var);
        bi0Var.K(1);
        bi0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        bi0Var.J(true);
        bi0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        bi0 bi0Var = this.a;
        if (color != i10) {
            bi0Var.Z = true;
            bi0Var.Q(color, "Comp 1");
            bi0Var.o();
            bi0Var.J(true);
            bi0Var.V(0L);
            this.b = color;
        }
        bi0Var.draw(canvas);
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
