package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u21 extends Drawable {
    public final ci0 a;
    public int b;
    public final TextPaint c;

    public u21(TextPaint textPaint) {
        bi.s0 s0Var = new bi.s0(this, 5);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ci0 ci0Var = new ci0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ci0Var;
        ci0Var.setCallback(s0Var);
        ci0Var.K(1);
        ci0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ci0Var.J(true);
        ci0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        ci0 ci0Var = this.a;
        if (color != i10) {
            ci0Var.Z = true;
            ci0Var.Q(color, "Comp 1");
            ci0Var.o();
            ci0Var.J(true);
            ci0Var.V(0L);
            this.b = color;
        }
        ci0Var.draw(canvas);
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
