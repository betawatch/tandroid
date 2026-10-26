package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k41 extends Drawable {
    public final xj0 a;
    public int b;
    public final TextPaint c;

    public k41(TextPaint textPaint) {
        bh.u0 u0Var = new bh.u0(this, 8);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        xj0 xj0Var = new xj0(R.raw.dots_loading, (int) textSize, (int) (textSize * 1.25f));
        this.a = xj0Var;
        xj0Var.setCallback(u0Var);
        xj0Var.K(1);
        xj0Var.M((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
        xj0Var.J(true);
        xj0Var.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i10 = this.b;
        xj0 xj0Var = this.a;
        if (color != i10) {
            xj0Var.Z = true;
            xj0Var.Q(color, "Comp 1");
            xj0Var.o();
            xj0Var.J(true);
            xj0Var.V(0L);
            this.b = color;
        }
        xj0Var.draw(canvas);
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
