package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l11 extends Drawable {
    public final ch0 a;
    public int b;
    public final TextPaint c;

    public l11(TextPaint textPaint) {
        ah.a aVar = new ah.a(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ch0 ch0Var = new ch0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ch0Var;
        ch0Var.setCallback(aVar);
        ch0Var.K(1);
        ch0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ch0Var.J(true);
        ch0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i3 = this.b;
        ch0 ch0Var = this.a;
        if (color != i3) {
            ch0Var.a0 = true;
            ch0Var.Q(color, "Comp 1");
            ch0Var.o();
            ch0Var.J(true);
            ch0Var.V(0L);
            this.b = color;
        }
        ch0Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
