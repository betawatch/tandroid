package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r31 extends Drawable {
    public final hj0 a;
    public int b;
    public final TextPaint c;

    public r31(TextPaint textPaint) {
        ah.d dVar = new ah.d(this, 6);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        hj0 hj0Var = new hj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = hj0Var;
        hj0Var.setCallback(dVar);
        hj0Var.K(1);
        hj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        hj0Var.J(true);
        hj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        hj0 hj0Var = this.a;
        if (color != i10) {
            hj0Var.Z = true;
            hj0Var.Q(color, "Comp 1");
            hj0Var.o();
            hj0Var.J(true);
            hj0Var.V(0L);
            this.b = color;
        }
        hj0Var.draw(canvas);
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
