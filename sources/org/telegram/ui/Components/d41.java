package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d41 extends Drawable {
    public final yj0 a;
    public int b;
    public final TextPaint c;

    public d41(TextPaint textPaint) {
        ah.f1 f1Var = new ah.f1(this, 7);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        yj0 yj0Var = new yj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = yj0Var;
        yj0Var.setCallback(f1Var);
        yj0Var.K(1);
        yj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        yj0Var.J(true);
        yj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        yj0 yj0Var = this.a;
        if (color != i10) {
            yj0Var.Z = true;
            yj0Var.Q(color, "Comp 1");
            yj0Var.o();
            yj0Var.J(true);
            yj0Var.V(0L);
            this.b = color;
        }
        yj0Var.draw(canvas);
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
