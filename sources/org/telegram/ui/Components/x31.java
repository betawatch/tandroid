package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x31 extends Drawable {
    public final uj0 a;
    public int b;
    public final TextPaint c;

    public x31(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        uj0 uj0Var = new uj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = uj0Var;
        uj0Var.setCallback(f1Var);
        uj0Var.K(1);
        uj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        uj0Var.J(true);
        uj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        uj0 uj0Var = this.a;
        if (color != i10) {
            uj0Var.Z = true;
            uj0Var.Q(color, "Comp 1");
            uj0Var.o();
            uj0Var.J(true);
            uj0Var.V(0L);
            this.b = color;
        }
        uj0Var.draw(canvas);
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
