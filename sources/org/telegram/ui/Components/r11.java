package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r11 extends Drawable {
    public final zg0 a;
    public int b;
    public final TextPaint c;

    public r11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        zg0 zg0Var = new zg0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = zg0Var;
        zg0Var.setCallback(bVar);
        zg0Var.K(1);
        zg0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        zg0Var.J(true);
        zg0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        zg0 zg0Var = this.a;
        if (color != i7) {
            zg0Var.Z = true;
            zg0Var.Q(color, "Comp 1");
            zg0Var.o();
            zg0Var.J(true);
            zg0Var.V(0L);
            this.b = color;
        }
        zg0Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
