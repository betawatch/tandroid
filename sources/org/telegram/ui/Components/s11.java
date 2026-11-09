package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s11 extends Drawable {
    public final ah0 a;
    public int b;
    public final TextPaint c;

    public s11(TextPaint textPaint) {
        a5.b bVar = new a5.b(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        ah0 ah0Var = new ah0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = ah0Var;
        ah0Var.setCallback(bVar);
        ah0Var.K(1);
        ah0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        ah0Var.J(true);
        ah0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i7 = this.b;
        ah0 ah0Var = this.a;
        if (color != i7) {
            ah0Var.Z = true;
            ah0Var.Q(color, "Comp 1");
            ah0Var.o();
            ah0Var.J(true);
            ah0Var.V(0L);
            this.b = color;
        }
        ah0Var.draw(canvas);
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
