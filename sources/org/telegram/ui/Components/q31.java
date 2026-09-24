package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q31 extends Drawable {
    public final ij0 a;
    public int b;
    public final TextPaint c;

    public q31(TextPaint textPaint) {
        i.f fVar = new i.f(this, 5);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ij0 ij0Var = new ij0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ij0Var;
        ij0Var.setCallback(fVar);
        ij0Var.K(1);
        ij0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ij0Var.J(true);
        ij0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        ij0 ij0Var = this.a;
        if (color != i10) {
            ij0Var.Z = true;
            ij0Var.Q(color, "Comp 1");
            ij0Var.o();
            ij0Var.J(true);
            ij0Var.V(0L);
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
