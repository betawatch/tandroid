package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w11 extends Drawable {
    public final ch0 a;
    public int b;
    public final TextPaint c;

    public w11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ch0 ch0Var = new ch0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ch0Var;
        ch0Var.setCallback(bVar);
        ch0Var.K(1);
        ch0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ch0Var.J(true);
        ch0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        ch0 ch0Var = this.a;
        if (color != i7) {
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
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
