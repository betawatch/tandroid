package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t31 extends Drawable {
    public final kj0 a;
    public int b;
    public final TextPaint c;

    public t31(TextPaint textPaint) {
        ah.d dVar = new ah.d(this, 6);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        kj0 kj0Var = new kj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = kj0Var;
        kj0Var.setCallback(dVar);
        kj0Var.K(1);
        kj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        kj0Var.J(true);
        kj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        kj0 kj0Var = this.a;
        if (color != i10) {
            kj0Var.Z = true;
            kj0Var.Q(color, "Comp 1");
            kj0Var.o();
            kj0Var.J(true);
            kj0Var.V(0L);
            this.b = color;
        }
        kj0Var.draw(canvas);
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
