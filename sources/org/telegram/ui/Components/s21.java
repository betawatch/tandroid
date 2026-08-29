package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s21 extends Drawable {
    public final xi0 a;
    public int b;
    public final TextPaint c;

    public s21(TextPaint textPaint) {
        hg.a aVar = new hg.a(this, 9);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xi0 xi0Var = new xi0(R.raw.dots_loading, (int) textSize, "dots_loading", (int) (textSize * 1.25f));
        this.a = xi0Var;
        xi0Var.setCallback(aVar);
        xi0Var.I(1);
        xi0Var.K((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        xi0Var.H(true);
        xi0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        xi0 xi0Var = this.a;
        if (color != i10) {
            xi0Var.W = true;
            xi0Var.O(color, "Comp 1");
            xi0Var.m();
            xi0Var.H(true);
            xi0Var.S(0L);
            this.b = color;
        }
        xi0Var.draw(canvas);
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
